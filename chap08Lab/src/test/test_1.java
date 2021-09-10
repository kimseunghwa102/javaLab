package test;

public class test_1 {
     
	//메소드:리턴타임 메소드명(타입 매개변수){ 실행문;}
	public static void main(String[] args) {

		
		
		///객체생성방법: new 연산자 클래스 생성자();
		String strVar3=new String("신민철");
		String strVar4=new String("신민철");
		////서로 다른 객체이기 때문에 참조가 다름.
		System.out.println(System.identityHashCode(strVar4));
		System.out.println(System.identityHashCode(strVar3));
	
	//로컬 변수 : 메소드안에 정의된 변수
		int[][]mathScores=new int[2][3];
		for(int i = 0; i<mathScores.length; i++) {
			for(int k =0; k < mathScores[i].length; k++) {
				System.out.println("englishshScores["+i+"]["+k+"]"+mathScores);
			}
		}
		int[][] englishScores = new int[2][];
		englishScores[0] = new int[2];
		englishScores[1] = new int[3];
		for (int i = 0; i < englishScores.length; i++) {
		for (int k = 0; k < englishScores[i].length; k++) {
		System.out.println("englishScores[" + i + "][" + k + "]=" + 
		englishScores[i][k]);
		}
		}
	
	
	}////main

}//////class
