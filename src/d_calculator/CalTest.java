package d_calculator;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;

public class CalTest {
	//텍스트필드 위에, 버튼 아래에
	
	// 1. 멤버변수 선언
	JFrame f;
	JTextField tf;
	JButton []bNum = new JButton[10]; // 0~9까지 숫자를 표현할 버튼 10개
									// 멤버변수에 배열을 선언하기 위해서는 선언 후 new JButton[배열칸] 하기
	JButton []bOp = new JButton[4];  // +,-,*,/ 연산자를 표현할 버튼들
	JButton bEqual;
	
	int first, second;
	String op;
	
	// 2. 객체생성
	CalTest(){
		//프레임생성
		f = new JFrame("유치원"); 	//유치원 이름가진 프레임 생성
		//텍스트필드 생성
		tf = new JTextField(100); //텍스트필드 크기지정
		// bNum 배열선언
		for(int i=0; i<bNum.length;i++) {
//			String s = Integer.toString(i);
			bNum[i]= new JButton(Integer.toString(i));
		} // b0 b1 b2 ~~ 순으로 배열을 for문으로 찍어내는방식, 이때 i는 정수이기에 스트링으로 형변환 필요, for구문안에서 new 객체 생성
		
		// bOP 배열선언 
		bOp[0]=new JButton("+");
		bOp[1]=new JButton("-");
		bOp[2]=new JButton("*");
		bOp[3]=new JButton("/");
		//배열선언 힘들기에 그냥 0~3번방까지의 값 직접 지정
		
		//"="버튼생성
		bEqual = new JButton("=");
	
	} // end of CalTest
	
	// 3. 화면 구성 및 화면 출력
	void addLayout() {
		//레이아웃 동서남북설정
		f.setLayout(new BorderLayout()); 	// 보더레이아웃으로 레이아웃세팅
		
		//텍스트필드 북쪽으로
		f.add(tf, BorderLayout.NORTH);	//tf라는 텍스트필드를 북쪽으로 붙이기
		
		//버튼입력
		JPanel psouth = new JPanel();	// 남쪽에 들어갈것들 패널설정
			psouth.setLayout(new GridLayout(5,3)); // 남쪽에 들어갈 패널들을 그리드레이아웃(행,열)로 설정
													// 이떄 그리드레이아웃은 왼쪽위부터 지정한 행열로 순차적으로 배치되기에 그거에 맞게 배치
			for (int i =0; i<bNum.length; i++) {	// 배열을 썻기에 붙이는 구문도 FOR문 사용, 길이에는 bNum배열의 길이로 설정하고
				psouth.add(bNum[i]);				// add() 괄호안에 bNum[], 대괄호안에는 for구문의 i 넣기
			}
			
			psouth.add(bOp[0]);		// 사진에는 ~9까지있고 0이아닌 + 가 있기에 +버튼 가진 bOp[0]넣기
			psouth.add(bNum[0]);
			psouth.add(bEqual);
			
			for(int i =1; i<bOp.length; i++) {	// 1~3번까지지만 편의를위해 위와같이 for문으로 배열 꺼내기
				psouth.add(bOp[i]);
			}
			psouth.setPreferredSize(new Dimension(700,100));	// pSouth 패널의 사이즈를 지정하는방법 프리펄드 사이즈 (뉴 디맨션(가로,세로))
			f.add(psouth, BorderLayout.CENTER);	// psouth 만든 패널을 add로 붙이고 센터에 넣기
			
		//기본 프레임
		f.setBounds(100,100,500,400);		// 프레임의 크기지정
		f.setVisible(true);		// 보이기지정
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);	//닫는 버튼 지정
		
		
	} // end of addLayout()
	
	// 4. 이벤트 처리
	void eventProc() {		//이벤트프로토콜 매서드
		//숫자버튼이 눌렸을때
		for(int i=0; i<bNum.length;i++) {	//숫자버튼눌렸을때 배열을썻기에 for구문을 사용
			bNum[i].addActionListener(new ActionListener(){	// gui -src- c_sample - EventTest3의 구문복사, 이벤트 만드는 식
												// 넣을거 . addActionListner(new ActionListner...) 까지 치고 컨트롤 스페이스바누르면 자동완성
				public void actionPerformed(ActionEvent e) {
					// 이벤트가 발생한 컴포넌트의 참조를 얻어옴
					JButton eBtn = (JButton)e.getSource();	// JButton에 eBtn 만들고 그안에 위의 액션이벤트의 소스를 가져온다 
					String su = tf.getText()+eBtn.getText(); // su라는 스트링변수를 만들고 더하는식 
															//이때 tf.getText()+eBtn.getText()로 두자리이상의 사칙연산이 가능
															//원리는 545일때 tf.getText()가 54 + 5가 eBtn.getText() 다
					tf.setText(su);	// 후에 String으로 받아온 su값을 tf텍스트에 넣는다
				}
			} ) ;
		}
		
		//연산자 버튼이 눌렸을때
		for(int i=0; i<bOp.length;i++) {
			bOp[i].addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					// 이벤트가 발생한 컴포넌트의 참조를 얻어옴
					JButton eBtn = (JButton)e.getSource(); 
					op = eBtn.getText(); // 위에 String으로 선언한 op에 eBtn.getText()를 넣는다
					
					first = Integer.parseInt(tf.getText()); // 정수 first 에 tf를 get해서 가져오기(형변환)
					tf.setText(""); // 초기화 기능 , 이것이 없을시 55 + 44가아니라 5544가 찍힘 
				}
			} ) ;
		}
		// = 버튼이 눌렸을떄
		bEqual.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				// 이벤트가 발생한 컴포넌트의 참조를 얻어옴
				second = Integer.parseInt(tf.getText()); 	//first엔 첫값저장 , second엔 두번쨰값저장 둘다 들어오는값이 스트링값이기에 인트형으로 변환필요
				int result = 0;	
				switch(op) { // 연산자가 ~일경우 실행하는 switch문
				case "+" : result = first + second; break;
				case "-" : result = first - second; break;
				case "*" : result = first * second; break;
				case "/" : result = first / second; break;
				}
				tf.setText(String.valueOf(result));	
				// 스위치분으로 입력된 값을 텍스트에 세팅, 이떄 위에서 인트형으로 변환했기때문에 text에 넣을 스트링값으로 변환이 필요
			}
		} ) ;
		
	}// end of eventProc()
	
	public static void main(String[] args) {
		CalTest cal = new CalTest();
		cal.addLayout();
		cal.eventProc();
	}
}
