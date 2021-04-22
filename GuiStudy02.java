package guistudy;

import javax.swing.*;
import java.awt.*;

public class GuiStudy02 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dimension dim = new Dimension(500,500); //크기 지정, 500에 500이라고 지정 
		
		JFrame frame = new JFrame("Jimin's House"); //JFrame 생성, 타이틀은 Jimin's House
		frame.setLocation(1000,500); //Frame의 위치 x=1000, y=500의 좌표에 찍는다. 
		frame.setPreferredSize(dim);  //Frame의 크기를 아까 설정했던 dim ㅇ으로 설정 
		
		JLabel label = new JLabel(); //Label 의 객체를 생성 
		label.setText("하이 에브리원~!~!"); //setText: 표시된 텍스트를 지정된 텍스트로 설정하겠다. 
		label.setVerticalAlignment(SwingConstants.BOTTOM); //정렬에 관련된 속성을 사용하고 싶다면 SwingConstants 인터페이스를 사용하면됨. 
		label.setHorizontalAlignment(SwingConstants.CENTER);//RIGHT, LEFT 등등.. 다양함 
		//수직에서 옵션을 주려면 setVerticalAlignment()를 수평에서 옵션을 주려면 setHorizontalAlignment() 메소드를 사용하면 된다.
		
		frame.add(label); //label 컴포넌트를 frame에 부착! 
		frame.pack(); //컨테이너의 크기를 구성요소들의 크기로 설정 
		frame.setVisible(true);
		
		System.out.println(label.getText()); //setText의 값을 가져옴  
		System.out.println(label.getVerticalAlignment()); //3 :BOTTOM의 고유값 
		System.out.println(label.getHorizontalAlignment()); //0  : CENTER의 고유값 
 		
		}
	

}
