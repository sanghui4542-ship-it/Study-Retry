package array;

public class CharArray {
	public static void main(String[] args) {
		char[] alpabets = new char[26];
		char ch = 'A';
		
		for(int i = 0; i < alpabets.length; i++, ch++) {
			alpabets[i] = ch;
			
		}

		for(int i = 0; i < alpabets.length; i++) {
			System.out.println(alpabets[i] + "," + (int)alpabets[i]);
		}
	}

}
