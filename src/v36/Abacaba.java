package v36;

public class Abacaba {

	public static void main(String[] args) {
		
		
		
		System.out.println(abacaba(1));
		
	}
	
	public static String abacaba(int n) {
		
		String[] alfabeth = {
				"a", "b", "c", "d", "e", "f", 
				"g", "h", "i", "j", "k", "l", 
				"m", "n", "o", "p", "q", "r", 
				"s", "t", "u", "v", "w", "x", 
				"y", "z"};
		
		if (n == 1) {
			return alfabeth[n-1];
		}
		
		return abacaba(n-1) + alfabeth[n-1] + abacaba(n-1);
		
	}
	
}
