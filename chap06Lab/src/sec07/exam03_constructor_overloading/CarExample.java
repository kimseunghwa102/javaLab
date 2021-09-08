package sec07.exam03_constructor_overloading;

public class CarExample {

	public static void main(String[] args) {
		
		Car Car1 = new Car();

		System.out.println("Car1.company?:"+Car1.company);
		System.out.println("Car1.maxseep?"+Car1.maxSpeed);
		
		Car car4 = new Car("테슬라","검정",200);
		System.out.println(car4.company + car4.color + car4.maxSpeed);

	}

}
