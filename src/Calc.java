import java.awt.EventQueue;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.*;
public class Calc {

	public JFrame frame;
	public JTextField textField;
	
	double a;
	double b;
	double result;
	
	String action;
	String answer;
	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() {
				try {
					Calc window = new Calc();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Calc() {
		initialize();
	}
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(211, 211, 211));
		frame.setResizable(false);
		frame.setBounds(100, 100, 554, 426);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setTitle("Calculator");
		
		textField = new JTextField();
		textField.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		textField.setForeground(new Color(0, 0, 0));
		textField.setBackground(Color.WHITE);
		textField.setBounds(0, 0, 556, 113);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		textField.setEditable(false);
		
		JButton btnsin = new JButton("Sin");
		btnsin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double s = Math.sin(Double.parseDouble(textField.getText()));
				textField.setText("Sin"+textField.getText()+"= ");
				textField.setText(textField.getText()+s);
				
			}
		});
		btnsin.setBackground(new Color(255, 255, 255));
		btnsin.setBounds(94, 172, 82, 47);
		frame.getContentPane().add(btnsin);
		
		JButton btnCos = new JButton("Cos");
		btnCos.setBackground(new Color(255, 255, 255));
		btnCos.setBounds(94, 231, 82, 47);
		frame.getContentPane().add(btnCos);
		btnCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double c = Math.cos(Double.parseDouble(textField.getText()));
				textField.setText("Cos"+textField.getText()+"= ");
				textField.setText(textField.getText()+c);
			}
		});
		
		JButton btnTan = new JButton("Tan");
		btnTan.setBackground(new Color(255, 255, 255));
		btnTan.setBounds(94, 290, 82, 47);
		frame.getContentPane().add(btnTan);
		btnTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double t = Math.tan(Double.parseDouble(textField.getText()));
				textField.setText("Tan"+textField.getText()+"= ");
				textField.setText(textField.getText()+t);
			}
		});
		
		JButton btnb = new JButton("DEL");
		btnb.setBackground(new Color(255, 255, 255));
		btnb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String bck = null;
				if(textField.getText().length()>0)
				{
					StringBuilder str= new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					bck=str.toString();
					textField.setText(bck);
				}
				
			}
		});
		btnb.setBounds(373, 116, 82, 47);
		frame.getContentPane().add(btnb);
		
		JButton btnC = new JButton("AC");
		btnC.setBackground(new Color(255, 255, 255));
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 textField.setText(null);
			}
		
		});
		btnC.setBounds(469, 118, 82, 47);
		frame.getContentPane().add(btnC);
		
		JButton btn7 = new JButton("7");
		btn7.setBackground(new Color(255, 255, 255));
		btn7.setForeground(Color.BLACK);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setBounds(185, 172, 82, 47);
		frame.getContentPane().add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.setBackground(new Color(255, 255, 255));
		btn4.setForeground(Color.BLACK);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setBounds(185, 231, 82, 47);
		frame.getContentPane().add(btn4);
		
		JButton btn1 = new JButton("1");
		btn1.setBackground(new Color(255, 255, 255));
		btn1.setForeground(Color.BLACK);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setBounds(185, 290, 82, 47);
		frame.getContentPane().add(btn1);
		
		JButton btn0 = new JButton("0");
		btn0.setBackground(new Color(255, 255, 255));
		btn0.setForeground(Color.BLACK);
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setBounds(185, 349, 82, 47);
		frame.getContentPane().add(btn0);
		
		JButton btn8 = new JButton("8");
		btn8.setBackground(new Color(255, 255, 255));
		btn8.setForeground(Color.BLACK);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setBounds(279, 172, 82, 47);
		frame.getContentPane().add(btn8);
		
		JButton btn5 = new JButton("5");
		btn5.setBackground(new Color(255, 255, 255));
		btn5.setForeground(Color.BLACK);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setBounds(279, 231, 82, 47);
		frame.getContentPane().add(btn5);
		
		JButton btn2 = new JButton("2");
		btn2.setBackground(new Color(255, 255, 255));
		btn2.setForeground(Color.BLACK);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setBounds(279, 290, 82, 47);
		frame.getContentPane().add(btn2);
		
		JButton btn9 = new JButton("9");
		btn9.setBackground(new Color(255, 255, 255));
		btn9.setForeground(Color.BLACK);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setBounds(373, 172, 82, 47);
		frame.getContentPane().add(btn9);
		
		JButton btn6 = new JButton("6");
		btn6.setBackground(new Color(255, 255, 255));
		btn6.setForeground(Color.BLACK);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setBounds(373, 231, 82, 47);
		frame.getContentPane().add(btn6);
		
		JButton btn3 = new JButton("3");
		btn3.setBackground(new Color(255, 255, 255));
		btn3.setForeground(Color.BLACK);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setBounds(373, 290, 82, 47);
		frame.getContentPane().add(btn3);
		
		JButton btnDot = new JButton(".");
		btnDot.setBackground(new Color(255, 255, 255));
		btnDot.setForeground(Color.BLACK);
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btnDot.getText();
				textField.setText(number);
			}
		});
		btnDot.setBounds(279, 349, 82, 47);
		frame.getContentPane().add(btnDot);
		
		JButton btnSqr = new JButton("x²");
		btnSqr.setBackground(new Color(255, 255, 255));
		btnSqr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double x =Double.parseDouble(textField.getText());
				x=x*x;
				textField.setText(textField.getText()+"^2"+"= ");
				textField.setText(textField.getText()+x);
			}
		});
		btnSqr.setBounds(185, 117, 82, 47);
		frame.getContentPane().add(btnSqr);
		
		JButton btnFact = new JButton("x!");
		btnFact.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double fact=Double.parseDouble(textField.getText());
				double fac = 1;
				while(fact!=0) {
					fac=fact*fac;
					fac--;
				}
				textField.setText(textField.getText()+"! = "+fac);
			}
		});
		btnFact.setBackground(Color.WHITE);
		btnFact.setBounds(0, 290, 82, 47);
		frame.getContentPane().add(btnFact);
		
		JButton btnCube = new JButton("x3");
		btnCube.setBackground(new Color(255, 255, 255));
		btnCube.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double x =Double.parseDouble(textField.getText());
				x=x*x*x;
				textField.setText(textField.getText()+"^3"+"= ");
				textField.setText(textField.getText()+x);
			}
		});
		btnCube.setBounds(94, 349, 82, 47);
		frame.getContentPane().add(btnCube);
		
		JButton btnSqrt = new JButton("√ ");
		btnSqrt.setBackground(Color.WHITE);
		btnSqrt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double sqrt = Math.sqrt(Double.parseDouble(textField.getText()));
				
				textField.setText("√ "+textField.getText()+"= ");
				textField.setText(textField.getText()+sqrt);
			}
		});
		btnSqrt.setBounds(0, 232, 82, 47);
		frame.getContentPane().add(btnSqrt);
		
		JButton btnPow = new JButton("x^y");
		btnPow.setBackground(Color.WHITE);
		btnPow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=Double.parseDouble(textField.getText());
				action = "x^y";
			}
		});
		btnPow.setBounds(0, 349, 82, 47);
		frame.getContentPane().add(btnPow);
		
		JButton btnLog = new JButton("Log");
		btnLog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double log=Math.log(Double.parseDouble(textField.getText()));
				textField.setText("log "+textField.getText()+" = "+log);
				
			}
		});
		btnLog.setBackground(Color.WHITE);
		btnLog.setBounds(0, 172, 82, 47);
		frame.getContentPane().add(btnLog);
		
		JButton btnEql = new JButton("=");
		btnEql.setForeground(UIManager.getColor("FormattedTextField.caretForeground"));
		btnEql.setBackground(new Color(222, 184, 135));
		btnEql.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				b=Double.parseDouble(textField.getText());
				if(action=="+")
				{
					result=a+b;
					answer=String.format("%.2f+%.2f=%.2f",a,b,result);
					textField.setText(answer);
				}
				else if(action=="-")
				{
					result=a-b;
					answer=String.format("%.2f-%.2f=%.2f",a,b,result);
					textField.setText(answer);

				}
				else if(action=="*")
				{
					result=a*b;
					answer=String.format("%.2f*%.2f=%.2f",a,b,result);
					textField.setText(answer);

				}
				else if(action=="/")
				{
					result=a/b;
					answer=String.format("%.2f/%.2f=%.2f",a,b,result);
					textField.setText(answer);
				}
				else if(action=="x^y")
				{
					double n =1;
					int i=0;
					while(i<b)
					{
						n = a*i;
						i++;
					}
					answer = String.format("%.1f ^ %.1f=%.2f", a,b,n);
					textField.setText(answer);
				}
				}
				catch(Exception ae)
				{
					JOptionPane.showMessageDialog(frame,"Enter the Values again!!","Error",JOptionPane.ERROR_MESSAGE);
				}
				
			}
		});
		btnEql.setBounds(373, 349, 82, 47);
		frame.getContentPane().add(btnEql);
		
		JButton btnAdd = new JButton("+");
		btnAdd.setForeground(Color.BLACK);
		btnAdd.setBackground(new Color(205, 133, 63));
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=Double.parseDouble(textField.getText());
				textField.setText("");
				action = "+";
				
			}
			
		});
		btnAdd.setBounds(467, 286, 83, 51);
		frame.getContentPane().add(btnAdd);
		
		JButton btnSub = new JButton("-");
		btnSub.setForeground(Color.BLACK);
		btnSub.setBackground(new Color(205, 133, 63));
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=Double.parseDouble(textField.getText());
				textField.setText("");
				action = "-";
			}
		});
		btnSub.setBounds(467, 172, 83, 47);
		frame.getContentPane().add(btnSub);
		
		JButton btnMul = new JButton("X");
		btnMul.setForeground(Color.BLACK);

		btnMul.setBackground(new Color(205, 133, 63));
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=Double.parseDouble(textField.getText());
				textField.setText("");
				action = "*";
			}
		});
		btnMul.setBounds(467, 231, 83, 47);
		frame.getContentPane().add(btnMul);
		
		JButton btnDiv = new JButton("÷");
		btnDiv.setForeground(Color.BLACK);

		btnDiv.setBackground(new Color(205, 133, 63));
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=Double.parseDouble(textField.getText());
				textField.setText("");
				action = "/";
			}
		});
		btnDiv.setBounds(467, 349, 83, 47);
		frame.getContentPane().add(btnDiv);
		
		JButton btn00 = new JButton("00");
		btn00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn00.getText();
				textField.setText(number);
				
			}
		});
		btn00.setForeground(Color.BLACK);
		btn00.setBackground(new Color(255, 255, 255));
		btn00.setBounds(279, 115, 82, 47);
		frame.getContentPane().add(btn00);
		
		JToggleButton btnToggle = new JToggleButton("SCI/STD");
		btnToggle.setBackground(new Color(255, 255, 255));
		btnToggle.setForeground(Color.BLACK);
		btnToggle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btnToggle.isSelected()) {
				btnsin.setEnabled(false);
				btnCos.setEnabled(false);
				btnTan.setEnabled(false);
				btnLog.setEnabled(false);
				btnSqrt.setEnabled(false);
				btnCube.setEnabled(false);
				btnSqr.setEnabled(false);
				btnFact.setEnabled(false);
				btnPow.setEnabled(false);
				}
				else
				{
					btnsin.setEnabled(true);
					btnCos.setEnabled(true);
					btnTan.setEnabled(true);
					btnLog.setEnabled(true);
					btnSqrt.setEnabled(true);
					btnCube.setEnabled(true);
					btnSqr.setEnabled(true);
					btnFact.setEnabled(true);
					btnPow.setEnabled(true);
				}
			}
		});
		btnToggle.setBounds(93, 116, 82, 46);
		frame.getContentPane().add(btnToggle);
		
		JToggleButton btnonoff = new JToggleButton("ON/OFF");
		btnonoff.setBackground(Color.WHITE);
		btnonoff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btnonoff.isSelected()) {
					btnsin.setEnabled(false);
					btnCos.setEnabled(false);
					btnTan.setEnabled(false);
					btnLog.setEnabled(false);
					btnSqrt.setEnabled(false);
					btnCube.setEnabled(false);
					btnSqr.setEnabled(false);
					btnFact.setEnabled(false);
					btnPow.setEnabled(false);
					btnAdd.setEnabled(false);
					btnSub.setEnabled(false);
					btn6.setEnabled(false);
					btn5.setEnabled(false);
					btn4.setEnabled(false);
					btn3.setEnabled(false);
					btn2.setEnabled(false);
					btn1.setEnabled(false);
					btn7.setEnabled(false);
					btn8.setEnabled(false);
					btn9.setEnabled(false);
					btn0.setEnabled(false);
					btn00.setEnabled(false);
					btnb.setEnabled(false);
					btnC.setEnabled(false);
					btnMul.setEnabled(false);
					btnDiv.setEnabled(false);
					btnEql.setEnabled(false);
					btnToggle.setEnabled(false);
					btnDot.setEnabled(false);
					}
					else
					{
						btnsin.setEnabled(true);
						btnCos.setEnabled(true);
						btnTan.setEnabled(true);
						btnLog.setEnabled(true);
						btnSqrt.setEnabled(true);
						btnCube.setEnabled(true);
						btnSqr.setEnabled(true);
						btnFact.setEnabled(true);
						btnPow.setEnabled(true);
						btnAdd.setEnabled(true);
						btnSub.setEnabled(true);
						btn6.setEnabled(true);
						btn5.setEnabled(true);
						btn4.setEnabled(true);
						btn3.setEnabled(true);
						btn2.setEnabled(true);
						btn1.setEnabled(true);
						btn7.setEnabled(true);
						btn8.setEnabled(true);
						btn9.setEnabled(true);
						btn0.setEnabled(true);
						btn00.setEnabled(true);
						btnb.setEnabled(true);
						btnC.setEnabled(true);
						btnMul.setEnabled(true);
						btnDiv.setEnabled(true);
						btnEql.setEnabled(true);
						btnToggle.setEnabled(true);
						btnDot.setEnabled(true);

					}
			}
		});
		btnonoff.setBounds(0, 115, 82, 47);
		frame.getContentPane().add(btnonoff);
		


	}
}
