package study;

public class num11 {

	public static void main(String[] args) {
		int month = 15;
		int day = switch(month) {
		case  1, 3, 5, 7, 8, 10, 12 -> 31;
		// "->" 는 break 없이 쓸 수 있게 해주는 부호임
		case  4, 6, 9, 11 -> 30;
		case  2 -> 28;
		default -> {
			if (month < 1 || month > 12) {
				System.out.println("없는 달입니다.");
			}else {
				System.out.println("알 수 없는 오류입니다.");
			}
			yield 0; // 위 if문에 해당하지 않는 숫자를 쓰면 ex)"(작성숫자)월의 날짜는0일까지 있습니다."로 입력되어 나옴
		  }
		};
		System.out.println(month + "월의 날짜는" + day + "일까지 있습니다." );
	}

}
