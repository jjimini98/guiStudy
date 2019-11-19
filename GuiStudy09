package guistudy;

import javax.swing.*;
import java.awt.*;

//버튼 타이틀의 폰트를 변경하거나 확인해보자!

public class GuiStudy09 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dimension dim = new Dimension(400,100);
		
		JFrame frame = new JFrame("Jimin's House");
		frame.setLocation(200,400);
		frame.setPreferredSize(dim);
		
		JButton button = new JButton("Test");
		button.setFont(new Font("고딕",Font.ITALIC,20));
		System.out.println("getFont : "+button.getFont());
		
		frame.add(button);
		frame.pack();
		frame.setVisible(true);
		
		
		/*결과를 출력해보면 
		getFont : java.awt.Font[family=Dialog,name=고딕,style=italic,size=20]
		라고 나오는데 여기서 family=Dialog는 '고딕'폰트가 속해져 있는 큰 font 집합이라고 생각하면 됨. 
		참고) The five logical font family names are as follows : Serif,SansSerif,Dialog,DialogInput,Monospace
		출처) http://www.java2s.com/Tutorials/Java/Java_Swing/1520__Java_Swing_Font.htm */
	}

}
