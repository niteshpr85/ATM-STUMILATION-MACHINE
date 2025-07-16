
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Signup extends JFrame implements ActionListener {

    JRadioButton r1, r2, m1, m2, m3;
    JButton next;

    JTextField textName, textfname, textdate, textemail, textAdd, textCity, textcode, textstate;

    Random ran = new Random();
    long first4 = (ran.nextLong() % 9000L) + 1000l;
    String first = " " + Math.abs(first4);

    Signup() {
        super("APPLICATION FORM");
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25, 10, 100, 100);
        add(image);
        JLabel label1 = new JLabel("APPLICATION FORM NO" + first);
        label1.setBounds(160, 20, 600, 40);
        label1.setFont(new Font("Raleway", Font.BOLD, 38));
        add(label1);

        JLabel label2 = new JLabel("Page 1");
        label2.setBounds(330, 70, 600, 30);
        label2.setFont(new Font("Raleway", Font.BOLD, 22));
        add(label2);

        JLabel label3 = new JLabel("Personal Detail");
        label3.setBounds(290, 90, 600, 30);
        label3.setFont(new Font("Raleway", Font.BOLD, 22));
        add(label3);

        JLabel labelName = new JLabel("Name :");
        labelName.setBounds(100, 190, 100, 30);
        labelName.setFont(new Font("Raleway", Font.BOLD, 20));
        add(labelName);

        textName = new JTextField();
        textName.setBounds(300, 190, 400, 30);
        textName.setFont(new Font("Ralway", Font.BOLD, 14));
        add(textName);

        JLabel labelfName = new JLabel("FatherName :");
        labelfName.setBounds(100, 240, 200, 30);
        labelfName.setFont(new Font("Raleway", Font.BOLD, 20));
        add(labelfName);

        textfname = new JTextField();
        textfname.setBounds(300, 240, 400, 30);
        textfname.setFont(new Font("Ralway", Font.BOLD, 14));
        add(textfname);

        JLabel DOB = new JLabel("Date Of Birth :");
        DOB.setBounds(100, 340, 200, 30);
        DOB.setFont(new Font("Raleway", Font.BOLD, 20));
        add(DOB);

        textdate = new JTextField();
        textdate.setBounds(300, 340, 400, 30);
        textdate.setFont(new Font("Ralway", Font.BOLD, 14));
        add(textdate);

        JLabel labelG = new JLabel("Gender :");
        labelG.setBounds(100, 290, 200, 30);
        labelG.setFont(new Font("Raleway", Font.BOLD, 20));
        add(labelG);

        r1 = new JRadioButton("Male");
        r1.setBounds(300, 290, 60, 30);
        r1.setBackground(new Color(222, 255, 228));
        r1.setFont(new Font("Ralway", Font.BOLD, 14));
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setBounds(450, 290, 90, 30);
        r2.setBackground(new Color(222, 255, 228));
        r2.setFont(new Font("Ralway", Font.BOLD, 14));
        add(r2);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);

        JLabel labelEmail = new JLabel("Email address :");
        labelEmail.setBounds(100, 390, 200, 30);
        labelEmail.setFont(new Font("Raleway", Font.BOLD, 20));
        add(labelEmail);

        textemail = new JTextField();
        textemail.setBounds(300, 390, 400, 30);
        textemail.setFont(new Font("Ralway", Font.BOLD, 14));
        add(textemail);

        JLabel labelMs = new JLabel("Martial Status :");
        labelMs.setBounds(100, 440, 200, 30);
        labelMs.setFont(new Font("Raleway", Font.BOLD, 20));
        add(labelMs);

        m1 = new JRadioButton("Married");
        m1.setBackground(new Color(222, 255, 228));
        m1.setBounds(300, 440, 100, 30);
        m1.setFont(new Font("Ralway", Font.BOLD, 14));
        add(m1);

        m2 = new JRadioButton("Unmarried");
        m2.setBackground(new Color(222, 255, 228));
        m2.setBounds(450, 440, 100, 30);
        m2.setFont(new Font("Ralway", Font.BOLD, 14));
        add(m2);

        m3 = new JRadioButton("Other");
        m3.setBackground(new Color(222, 255, 228));
        m3.setBounds(635, 440, 100, 30);
        m3.setFont(new Font("Ralway", Font.BOLD, 14));
        add(m3);

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(m1);
        buttonGroup1.add(m2);
        buttonGroup1.add(m3);

        JLabel labelAdd = new JLabel("Address :");
        labelAdd.setBounds(100, 490, 200, 30);
        labelAdd.setFont(new Font("Raleway", Font.BOLD, 20));
        add(labelAdd);

        textAdd = new JTextField();
        textAdd.setBounds(300, 490, 400, 30);
        textAdd.setFont(new Font("Ralway", Font.BOLD, 14));
        add(textAdd);

        JLabel labelCity = new JLabel("City :");
        labelCity.setBounds(100, 540, 200, 30);
        labelCity.setFont(new Font("Raleway", Font.BOLD, 20));
        add(labelCity);

        textCity = new JTextField();
        textCity.setBounds(300, 540, 400, 30);
        textCity.setFont(new Font("Ralway", Font.BOLD, 14));
        add(textCity);

        JLabel labelcode = new JLabel("Pin code :");
        labelcode.setBounds(100, 590, 200, 30);
        labelcode.setFont(new Font("Raleway", Font.BOLD, 20));
        add(labelcode);

        textcode = new JTextField();
        textcode.setBounds(300, 590, 400, 30);
        textcode.setFont(new Font("Ralway", Font.BOLD, 14));
        add(textcode);

        JLabel labelstate = new JLabel("State :");
        labelstate.setBounds(100, 640, 200, 30);
        labelstate.setFont(new Font("Raleway", Font.BOLD, 20));
        add(labelstate);

        textstate = new JTextField();
        textstate.setBounds(300, 640, 400, 30);
        textstate.setFont(new Font("Ralway", Font.BOLD, 14));
        add(textstate);

        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setBounds(620, 710, 80, 30);
        next.setFont(new Font("Ralway", Font.BOLD, 14));
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(new Color(222, 255, 228));
        setLayout(null);
        setSize(850, 800);
        setLocation(360, 40);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String fromno = first;
        String name = textName.getText();
        String fname = textfname.getText();
        String dob = textdate.getText();
        String gender = null;

        if (r1.isSelected()) {
            gender = "Male";
        } else if (r2.isSelected()) {
            gender = "Female";
        }

        String email = textemail.getText();
        String martial = null;

        if (m1.isSelected()) {
            martial = "Married";
        } else if (m2.isSelected()) {
            martial = "Unmarried";
        } else if (m3.isSelected()) {
            martial = "Other";
        }

        String address = textAdd.getText();
        String city = textCity.getText();
        String pincode = textcode.getText();
        String state = textstate.getText();

        try {
            if (textName.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Please fill all fields.");
            } else {
                cone con1 = new cone(); // Assuming cone class handles database connection
                String q = "insert into signup values('" + fromno + "', '" + name + "','" + fname + "','" + gender + "','" + email + "','" + martial + "','" + address + "','" + pincode + "','" + state + "' )";
                new Signup2(first); // Assuming this moves to the next form or operation
                setVisible(false);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Signup();
    }
}
