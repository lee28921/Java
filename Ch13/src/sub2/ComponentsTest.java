package sub2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;

public class ComponentsTest {

	private JFrame frame;
	private JTextField txtUid;
	private JTextField txtName;
	private JTextField txtHp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComponentsTest window = new ComponentsTest();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ComponentsTest() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 531, 527);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Components Test");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 12));
		lblNewLabel.setBounds(12, 10, 133, 22);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btn1 = new JButton("확인1");
		
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 System.out.println("버튼1 클릭...");
			}
		});
		btn1.setBounds(34, 72, 97, 23);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("확인2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "버튼2 클릭...");
				
			}
		});
		btn2.setBounds(143, 72, 97, 23);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("확인3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int answer = JOptionPane.showConfirmDialog(null, "버튼3 클릭...","확인대화상자",JOptionPane.YES_NO_OPTION);
				
				if(answer == 0) { // 버튼을 YES를 클릭할 경우
					System.out.println("YES 클릭...");
				}
				else {
					System.out.println("NO 클릭...");
				}
			}
		});
		btn3.setBounds(252, 72, 97, 23);
		frame.getContentPane().add(btn3);
		
		JLabel lblNewLabel_1 = new JLabel("TextField 실습");
		lblNewLabel_1.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		lblNewLabel_1.setBounds(34, 116, 103, 22);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Button 컨트롤 실습");
		lblNewLabel_2.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		lblNewLabel_2.setBounds(34, 42, 111, 20);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("아이디");
		lblNewLabel_3.setBounds(34, 153, 57, 15);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("이름");
		lblNewLabel_3_1.setBounds(34, 188, 57, 15);
		frame.getContentPane().add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("휴대폰");
		lblNewLabel_3_2.setBounds(34, 222, 57, 15);
		frame.getContentPane().add(lblNewLabel_3_2);
		
		txtUid = new JTextField();
		txtUid.setBounds(108, 150, 116, 21);
		frame.getContentPane().add(txtUid);
		txtUid.setColumns(10);
		
		txtName = new JTextField();
		txtName.setColumns(10);
		txtName.setBounds(108, 185, 116, 21);
		frame.getContentPane().add(txtName);
		
		txtHp = new JTextField();
		txtHp.setColumns(10);
		txtHp.setBounds(108, 219, 116, 21);
		frame.getContentPane().add(txtHp);
		
		JLabel lbUid = new JLabel("결과 :");
		lbUid.setBounds(325, 154, 136, 15);
		frame.getContentPane().add(lbUid);
		
		JLabel lbName = new JLabel("결과 :");
		lbName.setBounds(325, 188, 136, 15);
		frame.getContentPane().add(lbName);
		
		JLabel lbHp = new JLabel("결과 :");
		lbHp.setBounds(325, 222, 136, 15);
		frame.getContentPane().add(lbHp);
		
		JButton btnUid = new JButton("확인");
		btnUid.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String uid = txtUid.getText();
				lbUid.setText("결과 : "+uid);
				
				
			}
		});
		btnUid.setBounds(236, 149, 63, 23);
		frame.getContentPane().add(btnUid);
		
		JButton btnName = new JButton("확인");
		btnName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String name = txtName.getText();
				lbName.setText("결과 : "+name);
				
			}
		});
		btnName.setBounds(236, 186, 63, 23);
		frame.getContentPane().add(btnName);
		
		JButton btnHp = new JButton("확인");
		btnHp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String hp = txtHp.getText();
				lbHp.setText("결과 : "+hp);
				
			}
		});
		btnHp.setBounds(235, 221, 64, 23);
		frame.getContentPane().add(btnHp);
		
		JLabel lblNewLabel_4 = new JLabel("CheckBox 실습");
		lblNewLabel_4.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		lblNewLabel_4.setBounds(34, 261, 97, 15);
		frame.getContentPane().add(lblNewLabel_4);
		
		JCheckBox chk1 = new JCheckBox("사과");
		chk1.setBounds(30, 295, 61, 23);
		frame.getContentPane().add(chk1);
		
		JCheckBox chk2 = new JCheckBox("딸기");
		chk2.setBounds(108, 295, 61, 23);
		frame.getContentPane().add(chk2);
		
		JCheckBox chk3 = new JCheckBox("포도");
		chk3.setBounds(173, 295, 61, 23);
		frame.getContentPane().add(chk3);
		
		JCheckBox chk4 = new JCheckBox("수박");
		chk4.setBounds(252, 295, 61, 23);
		frame.getContentPane().add(chk4);
		
		JCheckBox chk5 = new JCheckBox("참외");
		chk5.setBounds(329, 295, 61, 23);
		frame.getContentPane().add(chk5);
		
		JLabel lbChkFruit = new JLabel("결과 :");
		lbChkFruit.setBounds(34, 324, 373, 15);
		frame.getContentPane().add(lbChkFruit);
		
		JButton btnchkFruit = new JButton("확인");
		btnchkFruit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				List<String> fruits = new ArrayList<>();
				
				if(chk1.isSelected()) { //체크 여부
					
					fruits.add(chk1.getText());
				}
				if(chk2.isSelected()) { //체크 여부
					
					fruits.add(chk2.getText());
				}
				if(chk3.isSelected()) { //체크 여부
					
					fruits.add(chk3.getText());
				}
				if(chk4.isSelected()) { //체크 여부
					
					fruits.add(chk4.getText());
				}
				if(chk5.isSelected()) { //체크 여부
					
					fruits.add(chk5.getText());
				}
				
				lbChkFruit.setText("선택한 과일 : "+fruits);
				
			}
		});
		btnchkFruit.setBounds(406, 295, 81, 23);
		frame.getContentPane().add(btnchkFruit);
		
		JLabel lblNewLabel_5 = new JLabel("RadioButton 실습");
		lblNewLabel_5.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		lblNewLabel_5.setBounds(34, 354, 111, 15);
		frame.getContentPane().add(lblNewLabel_5);
		
		JRadioButton rdMale = new JRadioButton("남자");
		rdMale.setBounds(34, 380, 63, 23);
		frame.getContentPane().add(rdMale);
		
		JRadioButton rdFemale = new JRadioButton("여자");
		rdFemale.setBounds(108, 380, 63, 23);
		frame.getContentPane().add(rdFemale);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(rdMale);
		bg.add(rdFemale);
		
		JLabel lbGender = new JLabel("선택 결과 :");
		lbGender.setBounds(34, 409, 111, 15);
		frame.getContentPane().add(lbGender);
		
		JButton btnGender = new JButton("확인");
		btnGender.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				if (rdMale.isSelected()) {
					lbGender.setText("선택 결과 : "+rdMale.getText());
				}else {
					lbGender.setText("선택 결과 : "+rdFemale.getText());
				}
				
			}
		});
		btnGender.setBounds(197, 380, 81, 23);
		frame.getContentPane().add(btnGender);
		
		
		
		
		
		
	}
}
