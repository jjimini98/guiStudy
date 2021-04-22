package guistudy;

import javax.swing.*;
import java.awt.*;

/*GridLayOut으로 배치하면 레이아웃 내의 모든 UI들을 모두 같은 사이즈로 
할당 받아서 배치된다는 점 이 특이함. */


//GridLayout을 사용하지 않은 코드 
public class GuiStudy05 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dimension dim = new Dimension(400,100);
		
		JFrame frame = new JFrame("Jimin's House");
		frame.setLocation(200,400);
		frame.setPreferredSize(dim);
		
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
	
	
	/*코드를 실행해보면 맨 마지막으로 add한 label6만 보여짐.
	왜냐하면 나머지 레이블들은 밑에 다 깔려있기 때문. */
	}

}
