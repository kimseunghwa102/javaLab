package sec08.exam01_method_declaration;

public class Computer {
	int sum1(int[] values) {//갯수를 마음대로 집어넣기 가능
		int sum = 0;
		for (int i=0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
	
	int sum2(int... values) {//갯수를 마음대로 집어넣기 가능
		int sum = 0;
		for (int i=0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
}
