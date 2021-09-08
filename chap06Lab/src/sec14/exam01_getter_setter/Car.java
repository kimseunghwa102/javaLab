package sec14.exam01_getter_setter;
//데이터 보호를위해 게터 세터는 퍼블릭으로 지정해둔것을 다른 클래스에서 사용하게 해준다.
public class Car {
	//필드
	int speed2;
	private int speed;
	private boolean stop;
	
	//생성자 
	
	//메소드
	//getter //게터로 불러온다
	public int getSpeed() {
		return speed;
	}
	
	//setter  //외부에서 사용못하게 브라이베트로 지저하고 사용하려면 세터로 지정하고 게터로 불러온다
	public void setSpeed(int speed) {
		if(speed < 0) {
			this.speed =0;
			return;// 종료
		}else {
			this.speed = speed;
		}
		}
	
	///getter 불러오기
	public boolean isStop() {
		return stop;
	}
	//setter 데이터지정
	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	}
}
