package com.kitri.chat.client;

import java.awt.event.*;
import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.StringTokenizer;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import com.kitri.chat.server.ChatServer;

import com.kitri.chat.util.ChatConstance;

public class Login extends JFrame implements ActionListener, ListSelectionListener, Runnable {

	Socket socket;
	String myid;
	BufferedReader in;
	OutputStream out;

	JLabel ip;
	JLabel name;
	JTextField ipTf;
	JTextField nameTf;
	JButton cancel;
	JButton ok;

	Chat chat;
	Paper paper;
	Rename rename;

	public Login() {
		super("Login!!");
		initGUI();

		chat = new Chat();
		paper = new Paper();
		rename = new Rename();

//		login창 event 등록
		nameTf.addActionListener(this);
		ok.addActionListener(this);
		cancel.addActionListener(this);

//		Chat창 event 등록
		chat.globalsend.addActionListener(this);

		chat.whomsend.addActionListener(this);
//		Paper창 event 등록
		chat.paper.addActionListener(this);
		paper.ok.addActionListener(this);
		paper.answer.addActionListener(this);
//		Rename창 event 등록
		chat.rename.addActionListener(this);

		chat.exit.addActionListener(this);

		chat.list.addListSelectionListener(this);

		chat.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {

				closeProcess();
			}

		});
	}

	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			getContentPane().setBackground(new java.awt.Color(244, 243, 242));
			{
				ip = new JLabel();
				getContentPane().add(ip);
				ip.setText("\uc544\uc774\ud53c");
				ip.setBounds(12, 12, 60, 30);
				ip.setBorder(BorderFactory.createEtchedBorder(BevelBorder.LOWERED));
				ip.setFocusable(false);
				ip.setRequestFocusEnabled(false);
				ip.setHorizontalAlignment(SwingConstants.CENTER);
			}
			{
				name = new JLabel();
				getContentPane().add(name);
				name.setText("\ub300\ud654\uba85");
				name.setBounds(12, 47, 60, 30);
				name.setBorder(BorderFactory.createEtchedBorder(BevelBorder.LOWERED));
				name.setFocusable(false);
				name.setRequestFocusEnabled(false);
				name.setHorizontalAlignment(SwingConstants.CENTER);
			}
			{
				ipTf = new JTextField();
				getContentPane().add(ipTf);
				ipTf.setBounds(78, 12, 209, 30);
			}
			{
				nameTf = new JTextField();
				getContentPane().add(nameTf);
				nameTf.setBounds(78, 47, 209, 30);
			}
			{
				ok = new JButton();
				getContentPane().add(ok);
				ok.setText("\ub85c\uadf8\uc778");
				ok.setBounds(83, 83, 61, 32);
				ok.setBackground(new java.awt.Color(237, 236, 233));
				ok.setBorder(new LineBorder(new java.awt.Color(0, 0, 0), 1, false));
			}
			{
				cancel = new JButton();
				getContentPane().add(cancel);
				cancel.setText("\ucde8 \uc18c");
				cancel.setBounds(153, 83, 59, 32);
				cancel.setBackground(new java.awt.Color(237, 236, 233));
				cancel.setBorder(new LineBorder(new java.awt.Color(0, 0, 0), 1, false));
			}
			pack();
			this.setSize(303, 150);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				Login inst = new Login();
				inst.setLocationRelativeTo(null);
				inst.setResizable(false);
				inst.setVisible(true);
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object ob = e.getSource();
//		nameTf에서 엔터가 눌리거나 ok버튼이 눌리면 같은 동작을 실행하기때문
		if (ob == nameTf || ob == ok) {
			connextProcess();
		} else if (ob == cancel) {
			System.exit(0);
		} else if (ob == chat.globalsend) {
			globalsendProcess();
		} else if (ob == chat.whomsend) {
			whomsendProcess();
		} else if (ob == chat.paper) {
			PaperProcess();
		} else if (ob == chat.rename) {
			nameChange();
		} else if (ob == chat.exit) {
//			1.closeProcess() 메소드 생성. 및 실행
			closeProcess();
		} else if (ob == paper.ok) {
			sendpaper();
			paperReset();
		} else if (ob == paper.answer) {
			replyProcess();

		} else if (ob == paper.cancel) {
			paper.setVisible(false);
			paperReset();
		}
	}

	private void nameChange() {
		String newName = JOptionPane.showInputDialog(this, "변경할 대화명 입력 : ");
		if (newName.length() < 3) {
			JOptionPane.showMessageDialog(chat, "최소 3자 이상의 이름을 해주세요.", "네임조건오류", JOptionPane.ERROR_MESSAGE);
			return;
		}

//		int size = chat.listData.size();
//		for (int i = 0; i < size; i++) {
//			if (newName.equals(Chat.list.get(i).myid)) {
//				JOptionPane.showMessageDialog(chat, "동일한 대화명이 존재합니다.", "네임조건오류", JOptionPane.ERROR_MESSAGE);
//				return;
//			}
//		}
//		
		sendMessage(ChatConstance.CS_RENAME+"|"+newName);

	}

	private void replyProcess() {
		
		paper.card.show(paper.cardp, "ok");
		String to = paper.from.getText();// 보낼사람
		paper.to.setText(to);
		paper.from.setText(myid);
		String tmp = "받은내용 : \n" + paper.letter.getText() + "\n" + "보낼 내용 : \n";
		paper.letter.setText(tmp);// 내용
		

		
	}

	private void paperReset() {
		paper.from.setText("");
		paper.to.setText("");
		paper.letter.setText("");
		paper.setVisible(false);
	}
	
	private void sendpaper() {
//	300|보낸사람대화명|메세지
		String tmp = paper.letter.getText().trim();
		sendMessage(ChatConstance.CS_PAPER + "|" + paper.to.getText() + "|" + tmp);
		viewMessage(paper.to.getText() + "님에게 쪽지를 보냈습니다.");
		
	}

	private void PaperProcess() {
		paper.setVisible(true);
		String to = chat.whom.getText();
		if (to.isEmpty()) {
			JOptionPane.showMessageDialog(chat, "대상자를 선택하세요", "대상자오류", JOptionPane.ERROR_MESSAGE);
			return;
		}
		if (to.equals(myid)) {
			JOptionPane.showMessageDialog(chat, "자기자신에게 쪽지를??", "대상자오류", JOptionPane.ERROR_MESSAGE);
			return;
		}
		paper.from.setText(myid);
		paper.to.setText(to);

	}

	private void closeProcess() {
		sendMessage(ChatConstance.CS_DISCONNECT + "|");
	}

//	1.내가 메세지 보낼 대상자, 메세지 get(유효성 검사 대상자, 자신, 메세지)
//	2.서버에 귓속말 형식으로 보내줌.
	private void whomsendProcess() {
		String msg = chat.whomsend.getText().trim();
		chat.whomsend.setText("");
		if (msg.isEmpty()) {
			return;
		}

		String to = chat.whom.getText();
		if (to.isEmpty()) {
			JOptionPane.showMessageDialog(chat, "대상자를 선택하세요.", "대상자오류", JOptionPane.ERROR_MESSAGE);
			return;
		}

		if (to.equals(myid)) {
			JOptionPane.showMessageDialog(chat, "자신에게 귓속말??", "대상자오류", JOptionPane.ERROR_MESSAGE);
			return;
		}

		sendMessage(ChatConstance.CS_TO + "|" + to + "|" + msg);
		viewMessage("★" + to + "★" + msg);
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		String selName = chat.list.getSelectedValue();
		chat.whom.setText(selName);
	}

//	1.메세지get(유효성검사:입력:미입력)
//	2.server로 메세지 전송.
	private void globalsendProcess() {
		String msg = chat.globalsend.getText().trim();
//		얻어냈으니까 입력한 tf에서는 바로지워주자
		chat.globalsend.setText("");
		if (msg.isEmpty()) {
			return;
		}
		sendMessage(ChatConstance.CS_ALL + "|" + msg);

	}

//	1.ip, 대화명 get(유효성검사(대화명 3자 이상.))
//	2.1의 ip를 이용해서 Socket 생성.
//	3.IO(BufferedReader, OutputStream) 생성.
//	지금 이 창은 로그인하는 사람 창. 즉, 내 창이다.
//	4.login창 닫고, chat창 열기.
//	5.server로 메세지 전송.(내가 들어왔다라고 알림. 다른 사람들한테도 내가 들어온것을 알림.<= 프로토콜 정의(ChatConstance))
//	6.Thread 실행.(챗창이 열렸다는건 상대가 나에게 쪽지를 보낼 수 있는 상태여야한다는 것.)
	private void connextProcess() {
		String ip = ipTf.getText().trim();
		myid = nameTf.getText().trim();

		if (myid.length() < 3) {
			JOptionPane.showMessageDialog(this, "대화명은 3자이상입니다.", "대화명오류", JOptionPane.WARNING_MESSAGE);
			return;
		}

		try {
			socket = new Socket(ip, ChatConstance.PORT);
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = socket.getOutputStream();
			this.setVisible(false);
			chat.setVisible(true);
			sendMessage(ChatConstance.CS_CONNECT + "|" + myid);

			new Thread(this).start();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private void sendMessage(String msg) {
		try {
			out.write((msg + "\n").getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void run() {
		boolean flag = true;
		while (flag) {

			String msg;
			try {
				msg = in.readLine();
				System.out.println("서버가 보낸 메세지 : " + msg); // protocol|메세지형식...
				StringTokenizer st = new StringTokenizer(msg, "|");
				int protocol = Integer.parseInt(st.nextToken());
				switch (protocol) {
				case ChatConstance.SC_CONNECT: {
					String tmp = st.nextToken();
					viewMessage("[알림] " + tmp + "님이 접속하였습니다.\n");
//			awt의 list는 chat.list.add(tmp);를 사용해도 되지만 Jlist는 vector(listData)로 추가해줘야한다. 
					chat.listData.add(tmp);
					chat.list.setListData(chat.listData);

				}
					break;
				case ChatConstance.SC_MESSAGE: {
//					200|[노정탁] 안녕하세요..
//					250|☆노정탁☆ 안녕??
					String tmp = st.nextToken();// [노정탁] 안녕하세요..
					viewMessage(tmp);
				}
					break;
				case ChatConstance.SC_PAPER: {
					String from = st.nextToken();// 보낸사람
					String tmp = st.nextToken();// 내용
					paper.card.show(paper.cardp, "answer");
					
					paper.from.setText(from);
					paper.to.setText(myid);
					paper.letter.setText(tmp);
					paper.setTitle("쪽지");
					paper.setVisible(true);
				}
					break;
				case ChatConstance.SC_RENAME: {
					String tmp = st.nextToken();// 변경전 대화명.
					String newTmp = st.nextToken();// 변경후 대화명.
					if (!tmp.equals(myid)) {
						viewMessage("[알림] " + tmp + "님이 대화명을 " + newTmp + "으로 변경하셨습니다.");//전체에게 공지
						chat.listData.remove(tmp);//기존 이름삭제
						tmp = newTmp;//변경된 대화명을 받아옴
						chat.listData.add(tmp);//추가
//						위와 마찬가지로 지우고 끝이 아니고 적용을 시켜줘야한다.
						chat.list.setListData(chat.listData);//적용
					}else {
						
						chat.listData.remove(tmp);//기존 이름삭제						
						tmp = newTmp;		//변경된 대화명을 받아옴				
						viewMessage("[알림] 대화명이 " + tmp + "으로 변경되었습니다.");//전체에게 공지
						chat.listData.add(tmp);//추가
//						위와 마찬가지로 지우고 끝이 아니고 적용을 시켜줘야한다.
						chat.list.setListData(chat.listData);//적용
					}
				}
					break;
				case ChatConstance.SC_DISCONNECT: {
//					900|나가는 사람 대화명
					String tmp = st.nextToken();// 나가는 사람 대화명.
					if (!tmp.equals(myid)) {
						viewMessage("[알림] " + tmp + "님이 접속을 종료하였습니다.");
						chat.listData.remove(tmp);
//						위와 마찬가지로 지우고 끝이 아니고 적용을 시켜줘야한다.
						chat.list.setListData(chat.listData);
					} else {
//						3.in, out, socket을 닫아준다.
//						if문을 안돌려도 되는 이유는 하나라도 null이였다면 여기까지 프로그램이 진행될 수도 없기 때문
						flag = false;
						in.close();
						out.close();
						socket.close();
//						chat.setVisible(false);
						System.out.println("종료합니다.");
						System.exit(0);
					}
				}
					break;

				}

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	private void viewMessage(String msg) {
		chat.area.append(msg + "\n");
		chat.area.setCaretPosition(chat.area.getDocument().getLength());

	}
}

/////////////////////////////////////////////////
//god
//package com.kitri.chat.client;
//
//import java.awt.event.*;
//import java.io.*;
//import java.net.Socket;
//import java.net.UnknownHostException;
//import java.util.StringTokenizer;
//
//import javax.swing.*;
//import javax.swing.border.BevelBorder;
//import javax.swing.border.LineBorder;
//import javax.swing.event.ListSelectionEvent;
//import javax.swing.event.ListSelectionListener;
//
//import com.kitri.chat.util.ChatConstance;
//
//// 지금 로그인하는 사람의 창
//// 각 클라이언트에 띄워지는 창
//public class Login extends JFrame implements ActionListener, ListSelectionListener, Runnable  {
//	
//	// [필드]
//	Socket socket;
//	
//	String myid;          // 대화명
//	BufferedReader in;
//	OutputStream out;
//	
//	JLabel ip;
//	JLabel name;
//	JTextField ipTf;
//	JTextField nameTf; // event source 1
//	JButton cancel;     // event source 2
//	JButton ok;          // event source 3
//	 
//	Chat chat;
//	Paper paper;
//	Rename rename;
//
//	// [생성자]
//	public Login() {
//		super("Login!!");
//		initGUI();
//		
//		chat = new Chat();
//		paper = new Paper();
//		rename = new Rename();
//		
//		// login창 event 등록
//		nameTf.addActionListener(this);
//		ok.addActionListener(this);
//		cancel.addActionListener(this);
//		
//		// Chat창 event 등록
//		chat.globalsend.addActionListener(this);
//		chat.whomsend.addActionListener(this);
//		chat.paper.addActionListener(this);
//		chat.rename.addActionListener(this);
//		chat.exit.addActionListener(this);
//		chat.list.addListSelectionListener(this);
//		
//		// 창 닫기 이벤트
//		chat.addWindowListener(new WindowAdapter() {
//			@Override
//			public void windowClosing(WindowEvent e) {
//				closeProcess();
//			}
//		});
//		
//		// Paper창 event 등록
//		
//		// Rename창 event 등록
//		
//	}
//	
//	// [메소드]
//	// <디자인 구성> 메소드
//	private void initGUI() {
//		try {
//			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
//			getContentPane().setLayout(null);
//			getContentPane().setBackground(new java.awt.Color(244,243,242));
//			{
//				ip = new JLabel();
//				getContentPane().add(ip);
//				ip.setText("\uc544\uc774\ud53c");
//				ip.setBounds(12, 12, 60, 30);
//				ip.setBorder(BorderFactory.createEtchedBorder(BevelBorder.LOWERED));
//				ip.setFocusable(false);
//				ip.setRequestFocusEnabled(false);
//				ip.setHorizontalAlignment(SwingConstants.CENTER);
//			}
//			{
//				name = new JLabel();
//				getContentPane().add(name);
//				name.setText("\ub300\ud654\uba85");
//				name.setBounds(12, 47, 60, 30);
//				name.setBorder(BorderFactory.createEtchedBorder(BevelBorder.LOWERED));
//				name.setFocusable(false);
//				name.setRequestFocusEnabled(false);
//				name.setHorizontalAlignment(SwingConstants.CENTER);
//			}
//			{
//				ipTf = new JTextField();
//				getContentPane().add(ipTf);
//				ipTf.setBounds(78, 12, 209, 30);
//			}
//			{
//				nameTf = new JTextField();
//				getContentPane().add(nameTf);
//				nameTf.setBounds(78, 47, 209, 30);
//			}
//			{
//				ok = new JButton();
//				getContentPane().add(ok);
//				ok.setText("\ub85c\uadf8\uc778");
//				ok.setBounds(83, 83, 61, 32);
//				ok.setBackground(new java.awt.Color(237,236,233));
//				ok.setBorder(new LineBorder(new java.awt.Color(0,0,0), 1, false));
//			}
//			{
//				cancel = new JButton();
//				getContentPane().add(cancel);
//				cancel.setText("\ucde8 \uc18c");
//				cancel.setBounds(153, 83, 59, 32);
//				cancel.setBackground(new java.awt.Color(237,236,233));
//				cancel.setBorder(new LineBorder(new java.awt.Color(0,0,0), 1, false));
//			}
//			pack();
//			this.setSize(303, 150);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//	
//	// [실행 메소드]
//	public static void main(String[] args) {
//		SwingUtilities.invokeLater(new Runnable() {
//			public void run() {
//				Login inst = new Login();
//				inst.setLocationRelativeTo(null);
//				inst.setResizable(false);
//				inst.setVisible(true);
//			}
//		});
//	}
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//	// [ActionListener override]
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		
//		Object ob = e.getSource();
//		
//		if( ob == nameTf || ob == ok) {  //필드에서 엔터 + ok버튼 : 로그인(같은 이벤트)
//			connectProcess();
//		} else if(ob == cancel) {
//			System.exit(0);
//		} else if(ob == chat.globalsend) {
//			globalsendProcess();
//		} else if(ob == chat.whomsend) {
//			whomsendProcess();
//		} else if(ob == chat.paper) {
//			// ****************Paper창 띄우기
//		} else if(ob == chat.rename) {
//
//		} else if(ob == chat.exit) {
//			closeProcess();
//		}
//	}
//
//	// [ListSelectionListener override]
//	@Override
//	public void valueChanged(ListSelectionEvent e) {
//		String selName = chat.list.getSelectedValue();
//		chat.whom.setText(selName);
//	}
//	
//	//***************************************************************************************************************
//	// 1. 쪽지 보내기 메소드
//	
//	// 2. 대화명 변경 메소드
//	
//	//***************************************************************************************************************
//	
//	
//	// <로그인> 메소드
//	// 1) ip, 대화명 get(유효성검사);   // ip는 코드에 박을거니까 제외하고, 대화명은 3글자 이상만 처리함
//	// 2) 1의 ip로 Socket 생성          // Socket이 생성 = 서버와 연결이 되었다는 뜻
//	// 3) IO(BufferedReader, OutputStream) 생성
//	// 4) login창 닫고, chat창 열기
//	// 5) server로 메세지 전송           // 정의해 놓은 프로토콜대로 내 대화명, 메세지 전송 (서버에 '내'가 들어왔음을 알림)
//	// 6) Thread 실행                     // 다른 사람과의 대화가 준비가 된 시점이므로, 스레드 실행
//	private void connectProcess() {
//		
//		String ip = ipTf.getText().trim();
//		myid = nameTf.getText().trim();
//		
//		if(myid.length() < 3) {
//			JOptionPane.showMessageDialog(this, "대화명은 3자 이상입니다.", "대화명 오류", JOptionPane.WARNING_MESSAGE);
//			return;
//		}
//		
//		try {
//			// 2)
//			socket = new Socket(ip, ChatConstance.PORT);
//			
//			// 3)
//			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//			out = socket.getOutputStream();
//			
//			// 4)
//			this.setVisible(false);
//			chat.setVisible(true);
//			
//			// 5)
//			sendMessage(ChatConstance.CS_CONNECT + "|" + myid);
//			
//			// 6)
//			new Thread(this).start(); //**
//			
//		} catch (UnknownHostException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		
//	}
//	
//	// <모든사람 메세지 전송> 메소드
//	// 1) 메세지 get (유효성검사)
//	// 2) server로 메세지 전송
//	private void globalsendProcess() {
//		// 1)
//		String msg = chat.globalsend.getText().trim();
//		chat.globalsend.setText("");
//		if(msg.isEmpty()) {
//			return;
//		}
//		
//		// 2)
//		sendMessage(ChatConstance.CS_ALL + "|" + msg);
//	}
//	
//	// <귓속말> 메소드
//	// 1) 메세지, 보낼 대상 get (유효성검사)  - 대상자 선택여부, 자기 자신에게 귓속말 X
//	// 2) server로 메세지 전송
//	private void whomsendProcess() {
//		// 1)
//		String msg = chat.whomsend.getText().trim();
//		chat.whomsend.setText("");
//		if(msg.isEmpty()) {
//			return;
//		}
//		
//		String to = chat.whom.getText();
//		
//		if(to.isEmpty()) {
//			JOptionPane.showMessageDialog(chat, "대상자를 선택하세요.", "대상자 오류", JOptionPane.ERROR_MESSAGE);
//			return;
//		}
//		if(to.equals(myid)){
//			JOptionPane.showMessageDialog(chat, "자신에게 귓속말을...?", "대상자 오류", JOptionPane.INFORMATION_MESSAGE);
//			return;	
//		}
//		
//		// 2)
//		sendMessage(ChatConstance.CS_TO + "|" + to + "|" + msg);
//		viewMessage("★" + to + "★" + msg);   // 보낸 귓속말       //////////////////////////////////////////////////////###나한테도 보여야 함### (함정)
//	}
//	
//	// <종료> 메소드
//	// 1) 서버에게 나간다고 알림
//	private void closeProcess() {
//		sendMessage(ChatConstance.CS_DISCONNECT + "|");   // 900|
//	}
//	
//	// <서버에 메세지 전송> 메소드
//	private void sendMessage(String msg) {
//		try {
//			out.write((msg + "\n").getBytes()); // byte[]로 전송하는데, server에선 이를 BufferedReader로 받음. 따라서 마지막에 "\n"을 보내야, 버퍼가 입력을 인식할 수 있음
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
//
//	// <Chat창의 대화창에 메세지 띄우기) 메소드
//	private void viewMessage(String msg) {
//		chat.area.append(msg + "\n");
//		chat.area.setCaretPosition(chat.area.getDocument().getLength());  // TextArea의 포커스를 맨 밑으로 둠 (새로운 채팅이 생겼을 때, 포커스를 맞춤)
//	}
//	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//	
//	//나를 포함한 각자의 창
//	// Runnable Interface override //**
//	@Override
//	public void run() {
//		boolean flag = true;
//		while(flag) {
//			try {
//				String msg = in.readLine();
//				System.out.println("서버가 보낸 메세지 : " + msg); //프로토콜|메세지형식...
//				StringTokenizer st = new StringTokenizer(msg, "|");
//				int protocol = Integer.parseInt(st.nextToken());
//				
//				switch(protocol) {
//					case ChatConstance.SC_CONNECT : {
//						//100|접속자대화명
//						String tmp = st.nextToken();   // myip에 받으면, 모든 사람의 대화명이 방금 받은걸로 바뀌어버림. 임시 tmp에 받자
//						viewMessage("[알림] " + tmp + "님이 접속하셨습니다.");
//						chat.listData.add(tmp);                //Chat 클래스의 Vector객체인 'listData'에 대화명을 저장
//						chat.list.setListData(chat.listData);   //Chat 클래스의 List객체인 'list'에 대화명이 저장되어 있는 Vector객체인 'listData'를 세팅함
//					} break;
//					
//					case ChatConstance.SC_MESSAGE : {
//						//200|[접속자대화명] 안녕하세요..
//						String tmp = st.nextToken();  //[접속자대화명] 안녕하세요..
//						viewMessage(tmp);
//					} break;
//					
//					case ChatConstance.SC_PAPER : {
//						
//					} break;
//					
//					case ChatConstance.SC_RENAME : {
//						
//					} break;
//					
//					case ChatConstance.SC_DISCONNECT : {
//						//900|나가는사람
//						String tmp = st.nextToken(); //나가는사람
//						if(!tmp.equals(myid)) {      // 나가는 사람이 내가 아니라면
//							viewMessage("[알림] " + tmp + "님이 접속을 종료하였습니다.");  // ① 누가 나갔는지 알리기
//							chat.listData.remove(tmp);                                                // ② 리스트의 값을 가진 Vector에서 나간 사람 빼기
//							chat.list.setListData(chat.listData);                                        // ③ 변경된 Vector를 리스트에 세팅함
//						}else {                          // 나가는 사람이 나라면
//							flag = false;                                                         // ① 스레드를 종료한다고 명시
//							in.close();                                                             // ② 입출력, 소켓을 닫음         //if(in, out, socket==null)안하는 이유는 null이었음 일로 오지도 못했기 때문. 안 해도 됨!
//							out.close();
//							socket.close();
////							chat.setVisible(false);                                              // ③ 창을 안 보이게 함
//							System.exit(0);                                                      // ③ 프로그램 종료함
//						}
//					} break;
//				}
//				
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
//	}
//}
