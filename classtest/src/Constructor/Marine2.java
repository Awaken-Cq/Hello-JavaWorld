package Constructor;

/*
marine
1.field
ü�� int hp d:100
���ݷ� int damage : 10 : 15
���� boolean weed false : �Ϲ� true : ����
�������� boolean survival false :���� true :die



2.method
���� attack()
	count�� �޾Ƽ� Ƚ�� ������ �Ѵ�.
	���ݷ� 10���� ����� hp�� 10 ���ҽ�Ų��.
Ȱ��ȭ activation()
	ü���� 40�̻��϶� ����.
	Ȱ��ȭ�� �ϸ� ���ݷ��� 10���� 15�� �ǰ�
	ü���� -25�ȴ�.
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
			System.out.println("ü���� ���� ��庯�� �Ұ�!");
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
