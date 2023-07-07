package sub3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class MyCalc {
	
	private int num1 = 0;
	private int num2 = 0;
	private int operator = 0; // 1: plus, 2: minus, 3:multi, 4: div

	private JFrame frmMycalc;
	private JTextField txtDsp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyCalc window = new MyCalc();
					window.frmMycalc.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	// 숫자를 저장하는 리스트
	ArrayList<Double> numberList = new ArrayList<>();
	// 연산자를 저장하는 리스트
	ArrayList<String> arithList = new ArrayList<>();
	
	// 입력되는 데이터(숫자, 연산자)를 저장하는 변수
	StringBuilder sb = new StringBuilder();
	char[] arithmetic = {'+','×','-','/'};
	
	
	
	// 숫자와 연산자를 나누어 저장하는 메소드
	public boolean disitnct() {
		char[] cArr = sb.toString().toCharArray();
		StringBuilder temp = new StringBuilder();
		
		for(int i=0; i<cArr.length;i++) {
			
			if(cArr[i] == '+' || cArr[i] == '-' || cArr[i] == '/' || cArr[i] == '×') { // 해당 인덱스의 값이 연산자일 경우 실행
				
				if(i==0) { //첫번째 값의 부호가 '+'나 '-'인 경우
					if(cArr[i] == '-' || cArr[i] == '+') {
						temp.append(cArr[i]);
						continue;
					}
					else if(cArr[i] == '×' || cArr[i] == '/') { 
					//첫번째 값의 부호가 '×'나 '/'인 경우는 잘못된 수식이므로 모든 데이터를 초기화 시키고 오류 메시지를 표시한다.
						
						JOptionPane.showMessageDialog(null, "잘못된 수식입니다.","경고",JOptionPane.INFORMATION_MESSAGE);
						//reset();
						
						return false;
					}
					
				}
				
				numberList.add(Double.parseDouble(temp.toString())); //연산자 나오기전까지 저장되었던 숫자 값을 numberList에 저장
				arithList.add(String.valueOf(cArr[i])); // 연산자를 arithList에 저장
				temp.delete(0, temp.length()); // 값을 저장한뒤에 다시 숫자를 넣기 위해 초기화
				
			}
			
			
		}
		return true;
	}
	
	// 모든 데이터를 초기화하는 메서드
	public void reset() {
		sb.delete(0, sb.length());
		numberList.clear();
		arithList.clear();
		txtDsp.setText("0");
	}
	
	
	/**
	 * Create the application.
	 */
	public MyCalc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMycalc = new JFrame();
		frmMycalc.setTitle("MyCalc 1.0");
		frmMycalc.setBounds(100, 100, 287, 280);
		frmMycalc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMycalc.getContentPane().setLayout(null);
		
		txtDsp = new JTextField();
		txtDsp.setBackground(Color.WHITE);
		txtDsp.setEditable(false);
		txtDsp.setFont(new Font("Bahnschrift", Font.PLAIN, 22));
		txtDsp.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDsp.setText("0");
		txtDsp.setBounds(12, 10, 248, 33);
		frmMycalc.getContentPane().add(txtDsp);
		txtDsp.setColumns(10);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn7.setBounds(12, 53, 53, 38);
		frmMycalc.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn8.setBounds(77, 53, 53, 38);
		frmMycalc.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn9.setBounds(142, 53, 53, 38);
		frmMycalc.getContentPane().add(btn9);
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDiv.setBounds(207, 53, 53, 38);
		frmMycalc.getContentPane().add(btnDiv);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn4.setBounds(12, 101, 53, 38);
		frmMycalc.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn5.setBounds(77, 101, 53, 38);
		frmMycalc.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn6.setBounds(142, 101, 53, 38);
		frmMycalc.getContentPane().add(btn6);
		
		JButton btnMulti = new JButton("×");
		btnMulti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnMulti.setBounds(207, 101, 53, 38);
		frmMycalc.getContentPane().add(btnMulti);
		
		
		
		
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtDsp.setText("1");
				num1 = 1;
				
			}
		});
		btn1.setBounds(12, 149, 53, 38);
		frmMycalc.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num2 = 2;
				
			}
		});
		btn2.setBounds(77, 149, 53, 38);
		frmMycalc.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn3.setBounds(142, 149, 53, 38);
		frmMycalc.getContentPane().add(btn3);
		
		JButton btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnMinus.setBounds(207, 149, 53, 38);
		frmMycalc.getContentPane().add(btnMinus);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btn0.setBounds(12, 197, 53, 38);
		frmMycalc.getContentPane().add(btn0);
		
		JButton btnCancel = new JButton("C");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCancel.setBounds(77, 197, 53, 38);
		frmMycalc.getContentPane().add(btnCancel);
		
		JButton btnEq = new JButton("=");
		btnEq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int result = 0;
				
				if(operator == 1) {
					result = num1 + num2;
				}
				else if(operator == 2) {
					result = num1 + num2;
				}
				else if(operator == 3) {
					result = num1 * num2;
				}
				else if(operator == 4) {
					result = num1 / num2;
				}
				
				txtDsp.setText(""+result);
						
				
				
				
			}
		});
		btnEq.setBounds(142, 197, 53, 38);
		frmMycalc.getContentPane().add(btnEq);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				operator = 1;
				
				
			}
		});
		btnPlus.setBounds(207, 197, 53, 38);
		frmMycalc.getContentPane().add(btnPlus);
	}

}
