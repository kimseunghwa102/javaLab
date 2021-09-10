package sec05.exam03_casting;

public class VehicleExample {

	public static void main(String[] args) {
		Vehicle vehicle = new Bus(); //Bus라는 구현객체 // 자동형변환
		
		vehicle.run();
		//vehicle.chekFare(); //Bus안의 있는 메소드인데 비야클에는 없으므로 참조영역이 축소됨
		//즉 참조 영역의 축소로 사용불가
		
		Bus bus = (Bus)vehicle;//강제형변환
		bus.run();
		bus.checkFare();//참조영역의 확대로 체크페어 사용가능
	}

}
