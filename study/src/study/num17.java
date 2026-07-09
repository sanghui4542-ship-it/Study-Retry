package study;

public class num17 {

	public static void main(String[] args) {
		int i;
		int j;
		
		for(i=1; i<=9; i++) {
			for(j=2; j<=9; j++) {
				if((i*j) % 2 !=0) 
					   continue;
				System.out.println(j + "X" + i + "=" + j*i);
			}
			System.out.println();
			
		}

	}

}
