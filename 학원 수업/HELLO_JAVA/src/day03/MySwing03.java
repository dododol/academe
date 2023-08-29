package day03;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MySwing03 extends JFrame {

   private JPanel contentPane;
   private JTextField tf;
   JTextArea ta = new JTextArea();

   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               MySwing03 frame = new MySwing03();
               frame.setVisible(true);
            } catch (Exception e) {
               e.printStackTrace();
            }
         }
      });
   }

   public MySwing03() {
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setBounds(100, 100, 300, 450);
      contentPane = new JPanel();
      contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

      setContentPane(contentPane);
      contentPane.setLayout(null);
      
      JLabel lbl = new JLabel("출력 단수 : ");
      lbl.setBounds(47, 49, 69, 15);
      contentPane.add(lbl);
      
      tf = new JTextField();
      tf.setBounds(119, 46, 113, 21);
      contentPane.add(tf);
      tf.setColumns(10);
      
      JButton btn = new JButton("구구단 출력하기");
      
      btn.setBounds(47, 81, 185, 23);
      contentPane.add(btn);
      
      ta.setBounds(47, 114, 185, 241);
      contentPane.add(ta);
      
      btn.addMouseListener(new MouseAdapter() {
         @Override
         public void mouseClicked(MouseEvent e) {
            int a=Integer.parseInt(tf.getText());
            String aa="";
            for(int i =1;i<=9;i++) {
               aa+=a+" * "+i+" = "+a*i+"\n";
            }
            ta.setText(aa);
         }
      });
   }
}