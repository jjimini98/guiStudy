package guistudy;

import java.awt.*;
import javax.swing.*;

public class GuiStudy06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dimension dim = new Dimension(400,100);
		
		JFrame frame = new JFrame("Jimin's House");
		frame.setLocation(200,400);
		frame.setPreferredSize(dim);
		
		/*GridLayOut으로 배치하면 레이아웃 내의 모든 UI들을 
		모두 같은 사이즈로 할당 받아서 배치된다는 점 이 특이함.*/
		GridLayout layout = new GridLayout(2,3); //여기서 2,3은 2행 3열을 의미. 레이아웃의 사이즈 설정 
		frame.setLayout(layout); //만든 layout 객체를 사용하려면 setLayout 메소드를 사용 
		
		JLabel label1 = new JLabel();
		label1.setText("Jimin 지민");
		label1.setOpaque(true); //뭐더라 이게 
		label1.setBackground(Color.YELLOW);
		
		JLabel label2 = new JLabel();
		label2.setText("Jimin 지민");
		label2.setOpaque(true); 
		label2.setBackground(Color.RED);
		
		JLabel label3 = new JLabel();
		label3.setText("Jimin 지민");
		label3.setOpaque(true); 
		label3.setBackground(Color.BLUE);
		
		JLabel label4 = new JLabel();
		label4.setText("Jimin 지민");
		label4.setOpaque(true); 
		label4.setBackground(Color.ORANGE);
	
		JLabel label5 = new JLabel();
		label5.setText("Jimin 지민");
		label5.setOpaque(true); 
		label5.setBackground(Color.GREEN);
		
		JLabel label6 = new JLabel();
		label6.setText("Jimin 지민");
		label6.setOpaque(true); 
		label6.setBackground(Color.PINK);
		
		frame.add(label1);
		frame.add(label2);
		frame.add(label3);
		frame.add(label4);
		frame.add(label5);
		frame.add(label6);
		
		frame.pack();
		frame.setVisible(true);
	
	}

}
