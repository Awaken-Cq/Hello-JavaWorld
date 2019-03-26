



	/*한식, 중식을 정한다.
	 * 1~8 한식, 9 중식
	 * 한식 음식들을 나열한다.1~i(Random*i+1) 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
//한식, 중식, 일식 등을 번호를 입력받아서 출력하기.
	

	public class RandomFood {
		private static int k;
		private static int kf;
		
		//public Static String getKlis
		
		private static String kList[] = { "한식", "중식" };

		private static String kfList[] = { "직화구이", "돈까스", "닭칼국수", "밥볶이", "돼지고기김치찌개",
				"국밥", "문배동 육칼", "설렁탕", "뼈다귀해장국", "동태찌개", "부대찌개" };

		

		public static String kfRandom() {
			int len = kList.length;
			k = (int)(Math.random() * len);
			if (k == 9)
				return "오늘은 " + kList[k] + "을 먹겠습니다.";
			else {
				len = kfList.length;
				kf = (int)(Math.random() * len);
				return "오늘은 " + kList[k] + " " + kfList[kf] + "을(를) 먹겠습니다.";
			}
		}

		public static void main(String[] args) {
		
			System.out.println(kfRandom());

		}
	
	}

	

