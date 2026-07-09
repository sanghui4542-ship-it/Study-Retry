package study;

public class num14 {

	public static void main(String[] args) {
		int dan;
		int times;
		
		for(dan = 2; dan <= 9; dan++) {//바깥에 해당
			for(times = 1; times <= 9; times++ ) {//안쪽에 해당
				System.out.println(dan + "X" + times + "=" + (dan*times));
			}
			System.out.println();
		}

	}

}
//바깥 반복문 → 줄(행)을 결정
//안쪽 반복문 → 한 줄 안에서 가로(열)를 출력