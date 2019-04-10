package com.kitri.chat.util;

public class ChatConstance {

	public static final int PORT = 9876;
	
//	Protocol 정의
//	client(내창) >> server
//	접속			100|대화명
//	모든사람메세지	200|메세지		대화명은 내가 접속하면서 새로생긴 내 서버가 저장하고있음.
//	특정사람메세지	250|대상자|메세지
//	쪽지보내기		300|대상자|메세지
//	대화명변경		400|변경할대화명
//	접속종료		900|
	
	public static final int CS_CONNECT = 100;
	public static final int CS_ALL = 200;
	public static final int CS_TO = 250;
	public static final int CS_PAPER = 300;
	public static final int CS_RENAME = 400;
	public static final int CS_DISCONNECT = 900;
	
//	server >> client(상대방창)
//	접속			100|접속자대화명
//	(모든사람)메세지	200|보낸사람대화명+메세지([보낸사람대화명]메세지) //굳이나눠서 보낼 이유가없음 보낸사람대화명은 따로 기능할게 없기때문.
//	(특정사람)메세지	250 => 200|보낸사람대화명+메세지(☆보낸사람대화명★메세지) // 둘다 프로토콜|보낸사람대화명+메세지이며,
//	전체는 포문, 특정은 조건을 클라이언트에서 정하면되기 때문에 굳이 200, 250으로 나눌 필요가없다. 
//	쪽지보내기 		300|보낸사람대화명|메세지
//	대화명변경		400|변경전대화명|변경할대화명
//	접속종료		900|접속종료자대화명
	
	public static final int SC_CONNECT = 100;
	public static final int SC_MESSAGE = 200;
	public static final int SC_PAPER = 300;
	public static final int SC_RENAME = 400;
	public static final int SC_DISCONNECT = 900;
	
}
