

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Deposit extends JFrame implements ActionListener {
   String pin;
   TextField textField;
   JButton b1;
   JButton b2;

   Deposit(String pin) {
      this.pin = pin;
      ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("atm2.png"));
      Image i2 = i1.getImage().getScaledInstance(1550, 830, 1);
      ImageIcon i3 = new ImageIcon(i2);
      JLabel l3 = new JLabel(i3);
      l3.setBounds(0, 0, 1550, 830);
      this.add(l3);
      JLabel label1 = new JLabel("ENETR AMOUNT YOU WANT TO DEPOSIT");
      label1.setForeground(Color.WHITE);
      label1.setFont(new Font("System", 1, 16));
      label1.setBounds(460, 180, 400, 35);
      l3.add(label1);
      this.textField = new TextField();
      this.textField.setBackground(new Color(65, 125, 128));
      this.textField.setForeground(Color.WHITE);
      this.textField.setBounds(460, 230, 320, 25);
      this.textField.setFont(new Font("Raleway", 1, 22));
      l3.add(this.textField);
      this.b1 = new JButton("DEPOSIT");
      this.b1.setBounds(700, 362, 150, 35);
      this.b1.setBackground(new Color(65, 125, 128));
      this.b1.setForeground(Color.WHITE);
      this.b1.addActionListener(this);
      l3.add(this.b1);
      this.b2 = new JButton("BACK");
      this.b2.setBounds(700, 406, 150, 35);
      this.b2.setBackground(new Color(65, 125, 128));
      this.b2.setForeground(Color.WHITE);
      this.b2.addActionListener(this);
      l3.add(this.b2);
      this.setLayout((LayoutManager)null);
      this.setSize(1550, 1080);
      this.setLocation(0, 0);
      this.setVisible(true);
   }

   public void actionPerformed(ActionEvent e) {
      try {
         String amount = this.textField.getText();
         Date date = new Date();
         if (e.getSource() == this.b1) {
            if (this.textField.getText().equals("")) {
               JOptionPane.showMessageDialog((Component)null, "Please enter the Amount you want to Deposit");
            } else {
               Connn c = new Connn();
               String var10001 = this.pin;
               //c.statement.executeUpdate("insert into bank values('" + var10001 + "', '" + String.valueOf(date) + "','Deposit', '" + amount + "')");
               //JOptionPane.showMessageDialog((Component)null, "Rs. " + amount + " Deposited Successfully");
               this.setVisible(false);
               new main(this.pin);
            }
         } else if (e.getSource() == this.b2) {
            this.setVisible(false);
            new main(this.pin);
         }
      } catch (Exception var5) {
         var5.printStackTrace();
      }

   }

   public static void main(String[] args) {
      new Deposit("");
   }

   public String getPin() {
      return pin;
   }

   public void setPin(String pin) {
      this.pin = pin;
   }

   public TextField getTextField() {
      return textField;
   }

   public void setTextField(TextField textField) {
      this.textField = textField;
   }

   public JButton getB1() {
      return b1;
   }

   public void setB1(JButton b1) {
      this.b1 = b1;
   }

   public JButton getB2() {
      return b2;
   }

   public void setB2(JButton b2) {
      this.b2 = b2;
   }

   private static class Connn {

      public Connn() {
      }
   }
}
