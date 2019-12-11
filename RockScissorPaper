package gamejava03;
// 가위 = 0 바위= 1 보= 2 
import java.util.*;
import java.io.*;

public class prac04 {
	public static void main(String[] args) throws IOException 
	{
		Random r = new Random();
		int com = Math.abs(r.nextInt()%3);
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(isr);
		String user = in.readLine();
		if (user.equals("가위")) {
			if (com==0) {
				System.out.println("user : 가위 / com : 가위     비겼네요!");
			} else if (com==1) {
				System.out.println("user : 가위 / com : 바위     졌어요ㅠㅠ ");
			} else {System.out.println("user : 가위 / com : 보     이겼어요! 야호~ ");}}			
		else if (user.equals("바위")) {
			if(com==0) {
				System.out.println("user : 바위 / com : 가위    이겼어요! 야호~");
			}else if(com==1) {
				System.out.println("user : 바위 / com : 바위     비겼네요!");
			}else { System.out.println("user : 바위 / com : 보     졌어요ㅠㅠ");}
		}else { 
			if(com==0) { System.out.println("user : 보 / com : 가위      졌어요ㅠㅠ");
				}else if(com==1) {System.out.println("user : 보 / com : 바위     이겼어요! 야호~");
			}else {System.out.println("user : 보 / com : 보        비겼네요!!");	}
			}
	}}
