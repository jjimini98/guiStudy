package gamejava04;

import java.io.*;
import java.util.*;

public class prac03 {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Random r = new Random();
		int ran = Math.abs(r.nextInt()%10)+1;
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(isr);
		String userInput = in.readLine(); //구구단 중 몇 단을 선택 
		
		Integer wrapInteger = Integer.valueOf(userInput);
		int myInt = wrapInteger.intValue();
		System.out.println("뀨단"+myInt +"단에 대한 문제입니다");
		
		int comcal = myInt * ran;
		System.out.println(ran +"x" + myInt);
		
		InputStreamReader isr2 = new InputStreamReader(System.in);
		BufferedReader in2 = new BufferedReader(isr);
		String userInput2 = in.readLine(); //곱하기에 대한 답을 입력 
		
		Integer wrapInteger2 = Integer.valueOf(userInput2);
		int myInt2 = wrapInteger2.intValue();
		
		if (comcal == myInt2) {
			System.out.println("정답이에요!");
		}else {
				System.out.println("오답입니다. 정답은 "+comcal +"입니다"); 
			}
	
		
	}

}
