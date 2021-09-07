package sec06.exam01__field_declaration;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Car 객체 생성
		Car myCar = new Car();
		
		//필드 값 읽기
		System.out.println("제작회사:"+myCar.company);
		System.out.println("모델명:"+myCar.model);
		System.out.println("색갈:"+myCar.color);
		System.out.println("최고속도:"+myCar.maxSpeed);
		System.out.println("현재속도:"+myCar.speed);
		
		//필드 값 변경
		myCar.speed=300;
		System.out.println(myCar.speed);
	}

}
