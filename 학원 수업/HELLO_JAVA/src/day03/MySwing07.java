package day03;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MySwing07 extends JFrame {

   private JPanel contentPane;

   /**
    * Launch the application.
    */
   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               MySwing07 frame = new MySwing07();
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
   public MySwing07() {
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setBounds(100, 100, 450, 300);
      contentPane = new JPanel();
      contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

      setContentPane(contentPane);
      contentPane.setLayout(null);
      
      JLabel lbl1 = new JLabel("_");
      lbl1.setBounds(12, 23, 57, 15);
      contentPane.add(lbl1);
      
      JLabel lbl2 = new JLabel("_");
      lbl2.setBounds(86, 23, 57, 15);
      contentPane.add(lbl2);
      
      JLabel lbl3 = new JLabel("_");
      lbl3.setBounds(163, 23, 57, 15);
      contentPane.add(lbl3);
      
      JLabel lbl4 = new JLabel("_");
      lbl4.setBounds(234, 23, 57, 15);
      contentPane.add(lbl4);
      
      JLabel lbl5 = new JLabel("_");
      lbl5.setBounds(307, 23, 57, 15);
      contentPane.add(lbl5);
      
      JLabel lbl6 = new JLabel("_");
      lbl6.setBounds(376, 23, 57, 15);
      contentPane.add(lbl6);
      
      JButton btn = new JButton("로또생성하기");
      btn.addMouseListener(new MouseAdapter() {
         @Override
         public void mouseClicked(MouseEvent e) {
            String lotto[] = new String[6];
            String result = "";
            for(int i = 0; i<lotto.length; i++) {
               int num = (int)(Math.random()*45)+1;
               lotto[i] = Integer.toString(num); 
               for(int j =0; j<i; j++) {
                  if(lotto[i] == lotto[j]) {
                     i--;
                     break;
                  }
               }
               lbl1.setText(lotto[0]);
               lbl2.setText(lotto[1]);
               lbl3.setText(lotto[2]);
               lbl4.setText(lotto[3]);
               lbl5.setText(lotto[4]);
               lbl6.setText(lotto[5]);
            }
            
            
         }
      });
      btn.setBounds(30, 64, 352, 161);
      contentPane.add(btn);
   }
}