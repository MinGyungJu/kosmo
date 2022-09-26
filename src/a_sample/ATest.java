package a_sample;

import java.awt.BorderLayout;

import javax.swing.ButtonGroup;
/*
 * 자바의 GUI (화면)
 * 	- AWT : 1.2 이전
 * 	- Swing : 1.2 이후
 * 			  대부분 클래스 앞에 J
 */
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ATest {

	JFrame f;
	JButton btn,btn2;
	JCheckBox jbox, obox;
	JRadioButton mbox, fbox;
	JTextField tf;
	JTextArea ta;

	ATest(){
		f = new JFrame("나의 첫창");
		btn = new JButton("클릭");
		btn2 = new JButton("취소");
		jbox = new JCheckBox("자바");
		obox = new JCheckBox("오라클");
		mbox = new JRadioButton("남자");
		fbox = new JRadioButton("여자");
		ButtonGroup group = new ButtonGroup();
		group.add(mbox);
		group.add(fbox);
		tf = new JTextField(20);
		ta = new JTextArea(40, 20);
		
	}
	
	void addLayout() {
		//FlowLayout f1 = new FlowLayout(); ==> 하나로 줄여서 -> new FlowLayout
		//f.setLayout(new FlowLayout());	//한줄에배치 
		//f.setLayout(new GridLayout(3,3)); 	//행과열로 맞춰 배치
		f.setLayout(new BorderLayout());		//동/서/남/북 가운대
		// 붙이기작업
		f.add(btn , BorderLayout.NORTH);
		f.add(btn2, BorderLayout.SOUTH);
		
//		f.add(jbox);
//		f.add(obox);
			JPanel pEast = new JPanel();
			pEast.add(mbox);
			pEast.add(fbox);
		f.add(pEast, BorderLayout.EAST);
		
//		
		f.add(new JLabel("입력하세요"),BorderLayout.WEST);
//		f.add(tf, BorderLayout.EAST);
		f.add(ta, BorderLayout.CENTER);
		
		//화면출력
		f.setBounds(100, 100, 500, 350); //영어읽듯이 해석 , 크게보기 , 흐름만파악
		f.setVisible(true);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}


	public static void main(String[] args) {

		ATest a = new ATest();
		a.addLayout();
		

	}

}