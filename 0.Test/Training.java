public class Training {

	public static void main(String[] args) {
		
		
		Weight wb = new Weight("benchpress", "push");
		Weight ws = new Weight("squat", "push");
		Weight wd = new Weight("deadlift", "pull");
		wb.calcValues("benchpress", "push", 30, 10, 5);
		System.out.println(wb.toString());
		ws.calcValues("squat", "push", 40, 12, 5);
		System.out.println(ws.toString());
		wd.calcValues("deadlift", "pull", 40, 10, 5);
		System.out.println(wd.toString());
		

	}
}
