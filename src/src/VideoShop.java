
import javax.swing.JFrame;
import javax.swing.JTabbedPane;

import view2.CustomerView;
import view2.RentView;
import view2.VideoView;

//메인
public class VideoShop extends JFrame {
	CustomerView customer; 	
	VideoView video; 
	RentView rental;

	public VideoShop() {
		// 각각의 화면을 관리하는 클래스 객체 생성
		customer = new CustomerView();
		video = new VideoView();
		rental = new RentView();

		JTabbedPane pane = new JTabbedPane();
		pane.addTab("고객관리", customer);	// 고객관리 탭
		pane.addTab("비디오관리", video);		// 비디오관리 탭
		pane.addTab("대여관리", rental);		// 대여관리 탭

		pane.setSelectedIndex(2);

		// 화면크기지정
		add("Center", pane);
		setSize(800, 600);
		setVisible(true);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new VideoShop();
	}
}
