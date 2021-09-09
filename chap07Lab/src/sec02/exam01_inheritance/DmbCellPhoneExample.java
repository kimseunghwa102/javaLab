package sec02.exam01_inheritance;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		//DmbCellPhone 객체 생성
		DebCellPhone dmbCellphone = new DebCellPhone("자바폰","검정",10);
	
		//CellPhone으로 부터 상속 받은 필드
		System.out.println("모델:"+ dmbCellphone.model);
		System.out.println("색상:"+dmbCellphone.color);
	
		//DmbCellphone의 필드
		System.out.println("채널:"+dmbCellphone.channel);
		
		///CellPhone으로부터 상속 받은 메소드 호출
		dmbCellphone.powrOn();
		dmbCellphone.bell();
		dmbCellphone.sendVoice("여보세요");
		dmbCellphone.receiveVoive("안녕하세요! 저는 얼렁마스크입니다");
		dmbCellphone.sendVoice("반가워요");
		dmbCellphone.hangUp();
		
		///dmbCellphone의 메소드 호출
		dmbCellphone.turnOnDmb();
		dmbCellphone.changeChannelDmb(12);
		dmbCellphone.turnOffDmb();
		
	}

}
