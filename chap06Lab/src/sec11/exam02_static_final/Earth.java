package sec11.exam02_static_final;

public class Earth { //상수
	//상수 상수는관례적으로 대문자 상수의 조건은 static + final
	static final double EARTH_RADIUS = 6400;
	static final double EARTH_SURFACE_AREA;
	
	static { //Math.PI는 정적필드 즉 스테틱필드
		EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
	}
	
	
	
}
