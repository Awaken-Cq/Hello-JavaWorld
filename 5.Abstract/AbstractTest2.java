public class AbstractTest2 {

	public static void main(String[] args) throws Exception {
		
		//3. �ܺ�Ŭ���� ����.
		//
		//��Ÿ��Ŭ������ �����̺��̱� ������ new�� ��ü������ �� �� ����.
		//�׷��� ��Ÿ���� ��ȯ�ϴ� �޼ҵ带 ã�� ��Ÿ�� ��ȯ.
		Runtime r = Runtime.getRuntime();
		Process p = r.exec("calc");
		System.out.println("");

	}
}
