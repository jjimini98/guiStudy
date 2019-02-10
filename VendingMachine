package pracVendingMachine;
import java.util.Scanner;

public abstract class VendingMachine {//abstract 클래스
	public abstract void inputMoney();
}

class coffeeMachine extends VendingMachine{
	Scanner s = new Scanner(System.in);
	int money;
	
	public coffeeMachine() { //coffeeMachine 생성자 
		System.out.println("돈을 넣으세요");
		this.money=s.nextInt(); //돈을 입력받음
	}
	
	public void inputMoney() {	 //입력받은 돈으로 커피계산
		System.out.println("==메뉴== \n1.블랙커피 2.믹스커피 3.핫초코");
		int menuNo = s.nextInt(); //번호입력받기
		switch(menuNo) { 
		case 1:
			System.out.println("블랙커피");
			money-=300;
			System.out.println("거스름돈 : "+money);
			break;
		case 2: 
			System.out.println("믹스커피");
			money-=500;
			System.out.println("거스름돈 : "+money);
			break;
		case 3:
			System.out.println("핫초코");
			money-=500;
			System.out.println("거스름돈 : "+money);
			break;
		}
	}
}	
	class RamenMachine extends VendingMachine {
		Scanner s = new Scanner(System.in);
		int money;
		
		public RamenMachine() { //RamenMachine 생성자 
			System.out.println("돈을 넣으세요");
			this.money=s.nextInt(); //돈을 입력받음
		}
	
		public void inputMoney() {	
			System.out.println("==메뉴== \n1.김치라면 2.육개장 3.진라면");
			int MenuNo = s.nextInt();
			switch(MenuNo) {
			case 1:
				System.out.println("김치라면");
				money-=800;
				System.out.println("거스름돈:" +money);
				break;
			case 2:
				System.out.println("육개장");
				money-=800;
				System.out.println("거스름돈 : "+money);
				break;
			case 3:
				System.out.println("진라면");
				money-=1000;
				System.out.println("거스름돈 : "+money);
				}
		}
	

}
