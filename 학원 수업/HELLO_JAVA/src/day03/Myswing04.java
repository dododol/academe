package day03;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Myswing04 extends JFrame {

	private JPanel contentPane;
	private JTextField tfMine;
	private JTextField tfCom;
	private JTextField tfResult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Myswing04 frame = new Myswing04();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Myswing04() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("나:");
		lblNewLabel.setBounds(50, 57, 57, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("컴:");
		lblNewLabel_1.setBounds(50, 82, 57, 15);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("결과");
		lblNewLabel_2.setBounds(50, 107, 57, 15);
		contentPane.add(lblNewLabel_2);
		
		tfMine = new JTextField();
		tfMine.setBounds(96, 54, 116, 21);
		contentPane.add(tfMine);
		tfMine.setColumns(10);
		
		tfCom = new JTextField();
		tfCom.setBounds(96, 79, 116, 21);
		contentPane.add(tfCom);
		tfCom.setColumns(10);
		
		tfResult = new JTextField();
		tfResult.setBounds(96, 104, 116, 21);
		contentPane.add(tfResult);
		tfResult.setColumns(10);
		
		JButton btnNewButton = new JButton("홀짝 맞추기");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				myclick();
			}
		});
		btnNewButton.setVerticalAlignment(SwingConstants.TOP);
		btnNewButton.setBounds(82, 177, 97, 23);
		contentPane.add(btnNewButton);
	}
	
	public void myclick() {
		String mine = tfMine.getText();
		String com = "";
		String result ="";
		
		double rnd = Math.random();
		if(rnd>0.5) {
			com = "홀";
		}else {
			com = "짝";
		}
		if(mine.equals(com)) {
			result = "이김";
		}else {
			result = "짐";
		}
		
		
		tfCom.setText(com);
		tfResult.setText(result);
		
	}
	
	
	
}
