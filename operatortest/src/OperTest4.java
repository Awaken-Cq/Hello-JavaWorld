public class OperTest4 {

	public static void main(String[] args) {
		int jumin = 2;
		String gender = jumin % 2 == 0 ? "����" : "����";
		// ���� ? ��1 : ��2 ;
		System.out.println("�ֹι�ȣ�� " + jumin + "�� ����� " + gender + "�Դϴ�.");

		// ������ 80�̻��̸� �հ�, 80�̸��̸� ���հ�
		// ����� ������ ??�̹Ƿ� ??�Դϴ�.
		int score = 80;
		String result;
		result = score >= 80 ? "�հ�" : "���հ�";
		System.out.println("����� ������ " + score + "�̹Ƿ� " + result + "�Դϴ�.");

	}
}
