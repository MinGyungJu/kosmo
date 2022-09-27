package c_sample;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
/*
 * 화면(JFrame)에 '확인'버튼 하나 출력
 */
	
public class EventTest3 {
	JFrame f;
	JButton bt;
	
	EventTest3(){
		f = new JFrame("화면");
		bt = new JButton("확인3");
		///(1) 이벤트 핸들러 만들기
		//	핸들러 - 이벤트 처리 클래스
		//(2) 핸들러를 객체 생성
		
		//(3) 이벤트 발생할 컴포넌트와 연결
		bt.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "이벤트발생3");
				
			}
			
		} ) ;
	}
	// 이벤트처리 있을때 bt 다음구문 쭉 복사해서 사용
	
	
	
	public void addLayout() {
//		f.setLayout(new GridLayout());
		
		f.add(bt);
		
		f.setBounds(100,100,1500,800);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		
	
		
		
	}

	public static void main(String[] args) {
		EventTest3 event = new EventTest3();
		event.addLayout();
	}
}
