package study;

	class FruitSeller {

	    final int APPLE_PRICE = 1000;
	    int numOfApple;
	    int myMoney;

	    int saleApple(int money) {
	        int num = money / APPLE_PRICE;

	        numOfApple -= num;
	        myMoney += money;

	        return num;
	    }

	    public void showSaleResult() {
	        System.out.println("과일장수객체의 현재 남은 사과수 : " + numOfApple);
	        System.out.println("과일장수객체의 현재 잔고 : " + myMoney);
	    }
	}

	class FruitBuyer {

	    int myMoney = 5000;
	    int numOfApple = 0;

	    public void buyApple(FruitSeller seller, int money) {
	        numOfApple += seller.saleApple(money);
	        myMoney -= money;
	    }

	    public void showBuyResult() {
	        System.out.println("현재 잔액 : " + myMoney);
	        System.out.println("보유 사과 수 : " + numOfApple);
	    }
	}

	public class Ex1 {

	    public static void main(String[] args) {

	        FruitSeller seller = new FruitSeller();
	        seller.numOfApple = 20;
	        seller.myMoney = 0;

	        FruitBuyer buyer = new FruitBuyer();

	        buyer.buyApple(seller, 2000);

	        System.out.println("--과일 판매자의 현재상황--");
	        seller.showSaleResult();

	        System.out.println("--과일 구매자의 현재상황--");
	        buyer.showBuyResult();

	        buyer.buyApple(seller, 2000);

	        System.out.println("----------과일장수(판매자)객체의 현재 남은돈과 사과 수---------");
	        seller.showSaleResult();

	        System.out.println("----------과일구매자객체의 현재 남은돈과 사과 수--------");
	        buyer.showBuyResult();
	    }
	}

