package Constructor;

/*
marine
1.field
체력 int hp d:100
공격력 int damage : 10 : 15
스팀 boolean weed false : 일반 true : 각성
생존유무 boolean survival false :생존 true :die



2.method
공격 attack()
	count를 받아서 횟수 공격을 한다.
	공격력 10으로 상대의 hp를 10 감소시킨다.
활성화 activation()
	체력이 40이상일때 가능.
	활성화를 하면 공격력이 10에서 15가 되고
	체력이 -25된다.
*/



public class Marine2 {
	
	int hp;
	int damage;
	boolean weed;
	

	public Marine2(){
		hp = 100;
		damage = 10;
		weed = false;
		
	}
	
	public void attack(Marine2 a, int count){
		a.hp -= damage * count;
	}
	
	public String status(){
		//return (hp<=0) ? "die" : hp+"";
		
		if(hp<=0){
			return "die";
		} else { 
			return hp+"";
		}
		
	}
	public void activation(boolean a){
		if(hp > 40){
			weed = true;
			damage = 15;
			hp -= 25;
		} else {
			System.out.println("체력이 낮아 모드변경 불가!");
		}
	}

}




/*

	public void attack(Marine2 a, int count){
			a.hp -= damage*count;	
			
	}

	public String status(){
		return (hp<0)? "die" : hp+"";
	}



	*/
