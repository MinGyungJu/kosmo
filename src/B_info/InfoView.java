package B_info;

// awt 전부 임포트
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.Calendar; // 캘린터 유틸 임포트

// javax의 swing 전부 임포트
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class InfoView {
	
	//1. 멤버변수 선언 
	JFrame 		f; //프레임
	JTextField 	tfName, tfId, tfTel, tfSex, tfAge, tfHome; //텍스트필드
	JTextArea 	ta;	//텍스트 에어리어
	JButton 	bAdd, bShow, bSearch, bDelete, bCancel, bExit; //버튼
	
	//2. 멤버변수 객체생성
	InfoView(){
		
		f		= new JFrame("DBTest"); //프레임의 이름지정
		
		tfName 	= new JTextField(20);	//텍스트필드 크기지정 , 그리드로 행열 지정했기떄문에 하나만 해도 동일하게 지정됨
		tfId 	= new JTextField();		
		tfTel 	= new JTextField();
		tfSex 	= new JTextField();
		tfAge 	= new JTextField();
		tfHome 	= new JTextField();
	
		
		ta 		= new JTextArea(10,10); // 텍스트에어리어 ta 객체생성 , 괄호안에 ( , ) 는 크기 지정
		bAdd	= new JButton("Add"); 	// bAdd 버턴 생성 + 괄호안에 버튼에 들어갈 값 입력하기
		bShow	= new JButton("Show");
		bSearch = new JButton("Search");
		bDelete = new JButton("Delete");
		bCancel = new JButton("Cancel");
		
		bExit 	= new JButton("Exit(alt+x)", new ImageIcon("src\\B_info\\imgs\\1.png"));  
		// bExit 버튼에 "Exit(alt+x)이름을 단 버튼을 넣은 후 콤마 , 를 찍고 new ImageIcon을 사용해서 괄호안에 "이미지주소"를 넣어 이미지가 들어가게 설정
																		
			bExit.setHorizontalTextPosition(JButton.CENTER); 	// 이미지를 가운대로
			bExit.setVerticalTextPosition(JButton.BOTTOM);		// 이미지와 글을 분리
			bExit.setRolloverIcon(new ImageIcon("src\\B_info\\imgs\\2.png")); //마우스가 올라가면 이미지가 바뀌게하기 넣은걸로
			bExit.setPressedIcon(new ImageIcon("src\\B_info\\imgs\\3.png")); //마우스로 클릭하면 이미지가 바뀌는 것
			bExit.setToolTipText("안녕");	//툴팁 : 마우스로 가져다 댔을때 글뜸(도움말)
			bExit.setMnemonic('x'); // alt + x 를 누르면 버튼이눌림 -> 나중에 취소버튼 추가할것
		
	}
	
	//3. 화면구성하고 출력
		/*
		 * 전체 프레임 BorderLayout 지정
		 * 	-West : JPanel (GridLayout(6,2) )
		 * 	-Center : 텍스트에어리어
		 * 	-South : JPanel(GridLayout(1,6) )
		 *  
		 */
	public void addLayout() {
		//전체프레임
		f.setLayout(new BorderLayout()); 	// 내가 만들 프레임의 전체프레임을 f. 셋 레이아웃을 하고 괄호안에 볼더레이아웃(상하좌우) 설정, 그리드,보더 등이있음
		
		//West
		
		JPanel pWest = new JPanel();	// pWest JPanel 설정
			pWest.setLayout(new GridLayout(6,2)); // 패널로 설정한 pWest를 레이아웃을 세팅해서 그리드레이아웃(행열)로 설정
												// 그리드레이아웃은 순서대로 위의줄 왼쪽부터 생성된다
			pWest.add(new JLabel("Name",JLabel.CENTER));  // pWest 에 add로 더해서 새로운 Label(라벨)설정, 괄호안에 왼쪽에 레이블에 쓸 내용, 오른쪽엔 위치지정
														  // 오른쪽 위치지정에는 JLabel.center 로 레이블의 글자를 중앙에 넣을 수 있다
			pWest.add(tfName);			// 위에 만들어놓은 텍스트파일 tfName 을 지정 
			pWest.add(new JLabel("ID",JLabel.CENTER));
			pWest.add(tfId);
			pWest.add(new JLabel("Tel",JLabel.CENTER));
			pWest.add(tfTel);
			pWest.add(new JLabel("Sex",JLabel.CENTER));
			pWest.add(tfSex);
			pWest.add(new JLabel("Age",JLabel.CENTER));
			pWest.add(tfAge);
			pWest.add(new JLabel("Home",JLabel.CENTER));
			pWest.add(tfHome);
			
		f.add(pWest, BorderLayout.WEST);	// 라벨로 만든 pWest를 f.add 로 붙인 후 위에생성한 보더레이아웃을 사용해서 오른쪽 위치쓰는곳에 보더 . West( 서쪽)으로 함
		
		//Center
		f.add(ta, BorderLayout.CENTER); // 위에 만들어둔 텍스트에어리어 ta를 붙이고 위치를 센터로 지정
		
		//South
		
		JPanel pSouth = new JPanel(); 	// 패널 pSouth 생성
		
			pSouth.setLayout(new GridLayout(1,6)); // pSouth 를 그리아레이아웃 1행 6열로 설정
			pSouth.add(bAdd);	//패널 pSouth에 버튼들 추가
			pSouth.add(bShow);
			pSouth.add(bSearch);
			pSouth.add(bDelete);
			pSouth.add(bCancel);
			pSouth.add(bExit);
			
		f.add(pSouth, BorderLayout.SOUTH); // 만들어둔 패널 pSouth 를 남쪽으로 붙임
		

		//화면출력
		f.setBounds(100,100,1500,800);	// 셋바운드 : 왼쪽 두개는 좌표, 오른쪽 두개는 길이
		f.setVisible(true);	// 셋비지블 : 괄호안에 true를 넣을경우 프레임을 보일수있게한다, false일경우는 창이 안띄어짐
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // 프레임을 X버튼을 누를경우 꺼지게 만드는 설정
	}

	public void eventProc() {	//이벤트프로세서 메서드생성 
		//'ADD' 버튼이 눌렸을때
		bAdd.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "이벤트발생1");
			}
		} ) ; // .addACtionListner ~~ 이부분은 복사해서 이벤트 발생시 다음에도 사용, 아래에 값엔 (null, 발생할 이벤트 내용입력) 
		
		bShow.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "이벤트발생2");
			}
		} ) ;
		bSearch.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "이벤트발생3");
			}
		} ) ;
		bDelete.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "이벤트발생4");
			}
		} ) ;
		bCancel.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "이벤트발생5");
			}
		} ) ;
		bExit.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "이벤트발생6");
			}
		} ) ;
		//주민번호 입력창에서 엔터 쳤을 때
		tfId.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				getJuminInfo();  // 주민번호 입력 텍스트필드에서 엔터를 쳤을때 getJuminInfo()함수 호출
				
			}//end of actionPerformed
			
		} ) ;//end of addActionListner
		//주민번호 입력창에서 포커스 이벤트 발생했을때
		tfId.addFocusListener(new FocusListener() {		// 주민번호 입력시 구문을 입력하고 다른 어떤 칸을 입력해서 엔터효과나게해줌
			public void focusLost(FocusEvent e) {
				getJuminInfo();
			}
			public void focusGained(FocusEvent e) {
			
			}
		}); // end of addFocusListener
		
	}// end of eventProc()
	
	void getJuminInfo() {
		String jumin = tfId.getText(); //tfID의 값을 가져와서 jumin변수에 입력(text라 스트링)
		if(jumin.length()<14) {
			JOptionPane.showMessageDialog(null, "- 포함한 15자를 맞춰주세요"); // 이벤트 발생구문 
			return;
		}

		//(1) 주민번호 7번쨰 문자로 성별을 구하여 성별창에 출력
		char sung = jumin.charAt(7); // 주민의 글자에 저장된것중 7번쨰값을 캐릭터 sung에 저장
		if(sung =='1'|| sung == '3' ||sung=='9') {
			tfSex.setText("남성"); // tfSex에 남성이라는 텍스트를 세팅
		}else if( sung == '2'||sung=='4'||sung=='0') {
			tfSex.setText("여성");// tfSex에 여성이라는 텍스트를 세팅
		}
		//(2) 주민번호 8번쨰 문자로 출신지를 구하여 출신지창에 출력
		char chul = jumin.charAt(8); 
		
		
		switch (chul) {
		case '0' :
			tfHome.setText("서울");
			break;
		case '1' :
			tfHome.setText("인천/ 부산");
			break;
		case '2' :
			tfHome.setText("경기");
			break;
		default:
			tfHome.setText("입력된값이 없습니다");
		}
//		(3) 주민번호에서 년도에 의해 나이를 구해서 나이를창에 출력
		String nai = jumin.substring(0, 2);	
		int sunai = Integer.parseInt(nai);	
		
		int age = 0;
		
		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);
		
		if(sung == '1'||sung == '2') {
			age = year-(1900 + sunai) +1;
//			String age1 = String.valueOf(age); 
			tfAge.setText(String.valueOf(age)); 	// tfage 에 텍스트를세팅 => age값은 정수(int)형인데 텍스트값은 스트링이니 String형으로 변환하는
													// String.valueof()를 사용해서 스트링값으로 변환해서 읽기
		}else if (sung =='3'|| sung=='4') {
			age = year-(2000 + sunai) +1;
//			String age2 = String.valueOf(age);
			tfAge.setText(String.valueOf(age));
		}
	}
	
	public static void main(String[] args) {
		
		InfoView info = new InfoView();
		info.addLayout();
		info.eventProc();
	}
}
