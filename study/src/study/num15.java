package study;

public class num15 {

	public static void main(String[] args) {
		int total = 0;
		int num;
		
		for(num =1; num <= 100; num++) {
			if(num % 2 ==0) //반대로 홀수로는 ==1 또는 !=0 을 사용하면 됨
			   continue;
			total += num;
		}
		System.out.println("1부터 100까지의 홀수의 합은 " + total + "입니다");
	}

}
