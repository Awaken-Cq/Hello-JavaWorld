package com.kitri.util.jcf;

public class jcf {

}
//
//
//** JCF(Java collection Framework) : 
//	크기가 유동적(배열의 가장큰 단점은 크기를 바꿀수 없다. 그것을 보안할 수 있음. 고로 배열보다 많이씀)	
//
//Interface
//
//	Collection모음							Map
//
//중요한 2가지 :
//list목록				set집합
//순서유지 O				순서유지 X
//중복data O			중복data X(덮어써버림)	//	순서유지가 되고 안되고에 따라  중복도 달라짐.
//ex)게시판				ex)장바구니
//
//add추가, remove제거, 꺼내기(get)는 list와 set이 다름. 고로 add,remove는 collection에 있지만
//꺼내기는 없다.
//
//list	E	get(int index)	리턴타입인 E는 String이면 String이고, int이면 int로 바뀜.
//Returns the element at the specified position in this list.
//set		Object[]	toArray()	//	하나하나씩 빼낼수 없고 배열로만 뽑아낼 수 있음. 고로 다 빼내라가됨.
//Returns an array containing all of the elements in this set.
//----------------------------------------------
//Class(구현클래스)
//
//ArrayList			Hashset			Hashmap	 Hashtable
//
//Vector										 -Properties(상속)
//

