package B_info;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class InfoView {
	
	//1. 멤버변수 선언
	JFrame f;
	JTextField tfName, tfId, tfTel, tfSex, tfAge, tfHome;
	JTextArea ta;
	JButton bAdd, bShow, bSearch, bDelete, bCancel, bExit;
	
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
		bExit = new JButton("Exit");
		
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
		pWest.add(tfId.add(new JLabel("ID")));
		pWest.add(tfId);
		pWest.add(tfTel.add(new JLabel("Tel")));
		pWest.add(tfTel);
		pWest.add(tfSex.add(new JLabel("Sex")));
		pWest.add(tfSex);
		pWest.add(tfAge.add(new JLabel("Age")));
		pWest.add(tfAge);
		pWest.add(tfHome.add(new JLabel("Home")));
		pWest.add(tfHome);
		
		
		f.add(pWest, BorderLayout.WEST);
		
		//Center
		f.add(ta, BorderLayout.CENTER);
		
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
	}

	public static void main(String[] args) {
		
		InfoView info = new InfoView();
		info.addLayout();
	}
}
