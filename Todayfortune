
import java.util.Date;
import java.util.Random;
import java.text.SimpleDateFormat;

public class prac01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date today= new Date();
		SimpleDateFormat dateForm = new SimpleDateFormat("yyyy년 MM월 dd일의"); //데이터 포맷을 ()안의 내용으로 변경
		System.out.println(dateForm.format(today)); //오늘의 날짜를 dateForm으로 정한 방식대로 바꿔줘! 
		
		Random r = new Random();
		int randomNum= Math.abs(r.nextInt()%100)+1;
		/*nextInt() 메서드는 -2147483648~2147483647 사이의 정수를 하나 돌려줌
		만약에 -9~9 사이의 값을 만들고 싶다면 10으로 나눈 나머지를 출력하면됨. 
		근데 여기서는 0부터 100까지의 숫자를 만들고 싶어서 원래는 0~9까진데 여기다가 +1을 더한것 
		*/
		System.out.println("금전운은"+ randomNum +"% 네요!");
		
		
	}

}
