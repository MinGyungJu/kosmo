package c_info2;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class InfoView {

	//1. 멤버변수 선언
	JFrame f;
	JTextField tfName, tfId, tfTel, tfSex, tfAge, tfHome;
	JTextArea ta;
	JButton bAdd, bShow, bSearch, bDelete, bCancel, bExit;

	InfoModel model;

	//2. 멤버변수 객체생성
	InfoView(){

		f= new JFrame("DBTest");

		tfName = new JTextField(8);
		tfId = new JTextField();
		tfTel = new JTextField();
		tfSex = new JTextField();
		tfAge = new JTextField();
		tfHome = new JTextField();


		ta = new JTextArea(10,10);

		bAdd= new JButton("Add");
		bShow = new JButton("Show");
		bSearch = new JButton("Search");
		bDelete = new JButton("Delete");
		bCancel = new JButton("Cancel");
		bExit = new JButton("수정하기");

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
		f.setLayout(new BorderLayout());

		//West

		JPanel pWest = new JPanel();
		pWest.setLayout(new GridLayout(6,2));

		pWest.add(tfName.add(new JLabel("Name",JLabel.CENTER)));
		pWest.add(tfName);
		pWest.add(tfId.add(new JLabel("ID",JLabel.CENTER)));
		pWest.add(tfId);
		pWest.add(tfTel.add(new JLabel("Tel",JLabel.CENTER)));
		pWest.add(tfTel);
		pWest.add(tfSex.add(new JLabel("Sex",JLabel.CENTER)));
		pWest.add(tfSex);
		pWest.add(tfAge.add(new JLabel("Age",JLabel.CENTER)));
		pWest.add(tfAge);
		pWest.add(tfHome.add(new JLabel("Home",JLabel.CENTER)));
		pWest.add(tfHome);


		f.add(pWest, BorderLayout.WEST);

		//Center
		f.add(ta, BorderLayout.CENTER);

		// 모델객체 생성
		try {
			model = new InfoModelImpl();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		//South

		JPanel pSouth = new JPanel();
		pSouth.setLayout(new GridLayout(1,6));
		pSouth.add(bAdd);
		pSouth.add(bShow);
		pSouth.add(bSearch);
		pSouth.add(bDelete);
		pSouth.add(bCancel);
		pSouth.add(bExit);
		f.add(pSouth, BorderLayout.SOUTH);



		//화면출력
		f.setBounds(100,100,500,350);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		f.setTitle("DbTest");

	}

	void eventProc() {
		// ADD버튼이 눌렸을떄
		bAdd.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				//JOptionPane.showMessageDialog(null, "이벤트발생1");
				insertData();
			}
		} ) ;
		// show 버튼이 눌렸을때
		bShow.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				//JOptionPane.showMessageDialog(null, "이벤트발생1");
				selectAll();
			}
		} ) ;
		// Search 버튼이 눌렸을때
		bSearch.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				//JOptionPane.showMessageDialog(null, "이벤트발생1");
				selectBytel();
			}
		} ) ;
		// 전화번호 텍스트필드에서 엔터쳤을 때
		tfTel.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				//JOptionPane.showMessageDialog(null, "이벤트발생1");
				selectBytel();
			}
		} ) ;
		//딜리트 버튼이 눌렸을떄
		bDelete.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				//JOptionPane.showMessageDialog(null, "이벤트발생1");
				deleteBytel();
			}
		} ) ;

	}
	void deleteBytel() {
		//(1) 입력한 전화번호 값을 얻어오기
		String tel = tfTel.getText();
		try {
			
			//(2) 모델단에 selectByTel()호출
			model.delete(tel);
			//(3) 받은 결과를 각각의 텍스트필드에 지정(출력)
			clearText();
			
		}catch(Exception ex) {
			ta.setText("삭제 실패 : "+ ex.getMessage());
		}
	}

	void selectBytel() {
		try {
			//(1) 입력한 전화번호 값을 얻어오기
			String tel = tfTel.getText();
			//(2) 모델단에 selectByTel()호출
			InfoVO vo =model.selectByTel(tel);
			//(3) 받은 결과를 각각의 텍스트필드에 지정(출력)
			tfName.setText(vo.getName());
			tfId.setText(vo.getId());
			tfTel.setText(vo.getTel());
			tfSex.setText(vo.getSex());
			tfAge.setText(Integer.toString(vo.getAge()));
			tfHome.setText(vo.getHome());

		}catch(Exception ex) {
			ta.setText("전화번호 검색 실패 : "+ ex.getMessage());
		}
	}// end of selectByTel()

	void selectAll() {
		try {
			ArrayList<InfoVO> data =model.selectAll();
			ta.setText("------검색결과 ----\n\n");
			for(InfoVO vo : data) {
				ta.append(vo.toString());
			}

		} catch (SQLException e) {
			ta.setText("검색실패 :"+e.getMessage());
		}
	}


	void insertData() {
		//(1) 사용자 입력값 얻어오기
		String name = tfName.getText();
		String Id = tfId.getText();
		String Tel = tfTel.getText();
		String Sex = tfSex.getText();
		int Age = Integer.parseInt(tfAge.getText());
		String Home = tfHome.getText();

		//(2) 1번의 값들을 InfoVO에 지정
		InfoVO vo = new InfoVO();
		vo.setName(name);
		vo.setId(Id);
		vo.setTel(Tel);
		vo.setSex(Sex);
		vo.setAge(Age);
		vo.setHome(Home);

		//(3) 모델의 insertInfo() 호출
		try {
			model.insertInfo(vo);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		//(4) 화면의 입력값들을 지우기
		clearText();
	}
	void clearText() {
		tfName.setText(null);
		tfId.setText(null);
		tfTel.setText(null);
		tfSex.setText(null);
		tfAge.setText(null);
		tfHome.setText(null);
	}

	public static void main(String[] args) {

		InfoView info = new InfoView();
		info.addLayout();
		info.eventProc();
	}
}
