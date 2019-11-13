package guistudy;

import javax.swing.*;
import java.awt.*;

public class GuiStudy03 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dimension dim = new Dimension(400,100);
		//Dimension class는 import java.awt.* 패키지 소속임 그래서 꼭 먼저 import 해야함 
		JFrame frame = new JFrame("Jimin's House");
		frame.setLocation(200,400);
		frame.setPreferredSize(dim);

		JLabel label = new JLabel();
		label.setText("Jimin 지민");
		
		Font font = new Font("나눔바른펜", Font.BOLD,50);
		/*Font 클래스에서 객체 생성할 때 3개의 매개변수를 전달해준다.
		Font("종류",스타일,글자크기)  이렇게 생성된 Font 클래스의 객체를 
		setFont 메소드에 담아주면  끝!*/
		label.setFont(font);
		
		frame.add(label);
		frame.pack();
		frame.setVisible(true);
		
		System.out.println("font.getSize():"+ font.getSize()); //폰트의 크기
		System.out.println("font.getName():"+font.getName()); //폰트의 이름 
		System.out.println("font.getFontName():"+font.getFontName()); //폰트의 이름,종류? 
		System.out.println("font.getStyle():"+font.getStyle()); //폰트의 스타일 가져온다
		System.out.println("font.isBold():"+font.isBold()); //폰트가 볼드체인지? 
		System.out.println("font.isItalic():"+font.isItalic()); //폰트가 이태릭인지?
		System.out.println("font.isPlain():"+font.isPlain()); //폰트가  플레인인지 아닌지? 사실 폰트가 플레인인건 뭔지 모르겠음. 
		//System.out.println(label.getHorizontalAlignment());
		//System.out.println(label.getVerticalAlignment());
	}

}
