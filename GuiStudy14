package guistudy;

import javax.swing.*;
import java.awt.event.*;

public class GuiStudy14 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame("하이요");
		f.setSize(300, 200);
		f.setLayout(null);
		
		JButton b = new JButton("호잇");
		//JButton b1 = new JButton ("호잇호잇");
		b.setBounds(10,10,100,30); //버튼의 크기 설정
		//b1.setBounds(50, 20, 200, 10);
		f.add(b);
		//f.add(b1);
		
		
		JTextField t = new JTextField("10");
		t.setBounds(10, 50, 250, 30);
		f.add(t);
		f.setVisible(true);
		
		b.addActionListener( new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼이 클릭되었습니다");
				t.setText(String.valueOf(Integer.valueOf(t.getText())*10));  //integer라서 표현할 수 있는 숫자의 한계가 있음
				//문자열을 정수로 바꾸고 거기다 1을 더한 걸 다시 string으로 바꾸는 과정임. 
				
				
			}
		});
		
	}

}
