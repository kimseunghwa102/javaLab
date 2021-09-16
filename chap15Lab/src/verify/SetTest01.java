package verify;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
public class SetTest01 {
public static void main(String[] args) {
	
	
		int n;
		Set s = new HashSet();
		// TreeSet s = new TreeSet();
		Random r = new Random();
		
		while(s.size()<7) {
			 {
				System.out.print("["+(r.nextInt(45)+1)+"]");	
				
				}
			 System.out.println(s);
			 
			}
		
		//...
}
}