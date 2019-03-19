public class Weight {

	private String name;
	private int weight;
	private int reps;
	private int sets;
	private int values;
	public int pullValues;
	public int pushValues;
	private String var;



	public Weight(String name, String var){
		this.name = name;
		this.var = var;
		this.weight = weight;
		this.reps = reps;
		this.sets = sets;
	}

	public int calcValues(String name, String var, int weight, int reps, int sets){
		this.weight = weight;
		this.reps = reps;
		this.sets = sets;
		if(var == "push"){
		this.values = weight * reps * sets;
		this.pushValues += this.values;
		return this.values;
		} else {
		this.values = weight * reps * sets;
		this.pullValues += this.values;
		return this.values;
		}
	}
	

	public String toString(){
		String info = name + "운동을 " + weight + "KG으로 " + reps + "개씩 "
		+ sets + "세트하여 총 " + values + "볼륨의 운동량을 획득했습니다.";
		return info;
	}
}
