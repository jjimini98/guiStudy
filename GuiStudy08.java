package guistudy;

import javax.swing.*;
import java.awt.*;

//코드 중간에 버튼 타이틀 텍스트를 읽는 메소드는 getText() 메소드를 사용
//코드 중간에 버튼 타이틀을 변경할 때 쓰는 메소드는 setText() 메소드 사용
public class GuiStudy08 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dimension dim = new Dimension(400,100);
		
		JFrame frame = new JFrame("Jimin's House");
		frame.setLocation(200,400);
		frame.setPreferredSize(dim);
		
		JButton button = new JButton("Test"); 
		//JButton 객체는 매개변수로 버튼 이름(텍스트)를 받는다.
		button.setText("JIMIN"); 
		//원래 버튼의 매개변수는 Test 였는데 setText() 메소드를 활용해 버튼의 타이틀을 JIMIN으로 변경 
		System.out.println("getText : "+button.getText());
		//버튼의 타이틀 텍스트를 가져온다! 여기서는 위 코드로 인해 변경된 타이틀을 출력해줌.
		
		//System.out.println()은 너무 기니까 syso치고 ctrl + space 누르면 자동 완성된다. 
		
		frame.add(button);
		frame.pack();
		frame.setVisible(true);
	}

}
