import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Signup2 extends JFrame implements ActionListener {
    JComboBox<String> comboBox, comboBox2, comboBox3, comboBox4, comboBox5;
    JTextField textPan, textAadhar;
    JRadioButton r1, r2, e1, e2;
    JButton next;
    String formno;

    Signup2( String formno) {
        //this.formno = formno;
        super("APPLICATION FORM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150, 5, 100, 100);
        add(image);
        this.formno = formno;

        JLabel l1 = new JLabel("Page 2:-");
        l1.setBounds(300, 30, 600, 40);
        l1.setFont(new Font("Raleway", Font.BOLD, 22));
        add(l1);

        JLabel l2 = new JLabel("Additional Detail ");
        l2.setBounds(300, 60, 600, 40);
        l2.setFont(new Font("Raleway", Font.BOLD, 22));
        add(l2);

        JLabel l3 = new JLabel("Religion");
        l3.setBounds(100, 120, 100, 30);
        l3.setFont(new Font("Raleway", Font.BOLD, 18));
        add(l3);
        String[] religion = {"Hindu", "Muslim", "Sikh", "Christian", "Other"};
        comboBox = new JComboBox<>(religion);
        comboBox.setBackground(new Color(252, 208, 76));
        comboBox.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBox.setBounds(350, 120, 320, 30);
        add(comboBox);

        JLabel l4 = new JLabel("Category");
        l4.setBounds(100, 170, 100, 30);
        l4.setFont(new Font("Raleway", Font.BOLD, 18));
        add(l4);
        String[] category = {"General", "OBC", "SC", "ST", "Other"};
        comboBox2 = new JComboBox<>(category);
        comboBox2.setBackground(new Color(252, 208, 76));
        comboBox2.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBox2.setBounds(350, 170, 320, 30);
        add(comboBox2);

        JLabel l5 = new JLabel("Income");
        l5.setBounds(100, 220, 100, 30);
        l5.setFont(new Font("Raleway", Font.BOLD, 18));
        add(l5);
        String[] income = {"NULL", "<1,50,000", "<2,50,000", "500000", "UPTO 10,00000", "ABOVE 10,00000"};
        comboBox3 = new JComboBox<>(income);
        comboBox3.setBackground(new Color(252, 208, 76));
        comboBox3.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBox3.setBounds(350, 220, 320, 30);
        add(comboBox3);

        JLabel l6 = new JLabel("Educational");
        l6.setBounds(100, 270, 150, 30);
        l6.setFont(new Font("Raleway", Font.BOLD, 18));
        add(l6);
        String[] educational = {"Non Graduate", "Graduate", "Post Graduation", "Doctorate", "Other"};
        comboBox4 = new JComboBox<>(educational);
        comboBox4.setBackground(new Color(252, 208, 76));
        comboBox4.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBox4.setBounds(350, 270, 320, 30);
        add(comboBox4);

        JLabel l7 = new JLabel("Occupation");
        l7.setBounds(100, 340, 150, 30);
        l7.setFont(new Font("Raleway", Font.BOLD, 18));
        add(l7);
        String[] occupation = {"Salaried", "Self-employed", "Business", "Student", "Retired", "Other"};
        comboBox5 = new JComboBox<>(occupation);
        comboBox5.setBackground(new Color(252, 208, 76));
        comboBox5.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBox5.setBounds(350, 340, 320, 30);
        add(comboBox5);

        JLabel l8 = new JLabel("PAN Number");
        l8.setBounds(100, 390, 150, 30);
        l8.setFont(new Font("Raleway", Font.BOLD, 18));
        add(l8);
        textPan = new JTextField();
        textPan.setFont(new Font("Raleway", Font.BOLD, 14));
        textPan.setBounds(350, 390, 320, 30);
        add(textPan);

        JLabel l9 = new JLabel("Aadhar Number");
        l9.setBounds(100, 440, 180, 30);
        l9.setFont(new Font("Raleway", Font.BOLD, 18));
        add(l9);
        textAadhar = new JTextField();
        textAadhar.setFont(new Font("Raleway", Font.BOLD, 14));
        textAadhar.setBounds(350, 440, 320, 30);
        add(textAadhar);

        JLabel l10 = new JLabel("Senior Citizen");
        l10.setBounds(100, 490, 180, 30);
        l10.setFont(new Font("Raleway", Font.BOLD, 18));
        add(l10);
        r1 = new JRadioButton("Yes");
        r1.setFont(new Font("Raleway", Font.BOLD, 14));
        r1.setBounds(350, 490, 100, 30);
        r1.setBackground(new Color(252, 208, 76));
        add(r1);
        r2 = new JRadioButton("No");
        r2.setFont(new Font("Raleway", Font.BOLD, 14));
        r2.setBounds(460, 490, 100, 30);
        r2.setBackground(new Color(252, 208, 76));
        add(r2);

        JLabel l11 = new JLabel("Existing Account");
        l11.setBounds(100, 540, 180, 30);
        l11.setFont(new Font("Raleway", Font.BOLD, 18));
        add(l11);
        e1 = new JRadioButton("Yes");
        e1.setFont(new Font("Raleway", Font.BOLD, 14));
        e1.setBounds(350, 540, 100, 30);
        e1.setBackground(new Color(252, 208, 76));
        add(e1);
        e2 = new JRadioButton("No");
        e2.setFont(new Font("Raleway", Font.BOLD, 14));
        e2.setBounds(460, 540, 100, 30);
        e2.setBackground(new Color(252, 208, 76));
        add(e2);

        ButtonGroup seniorCitizenGroup = new ButtonGroup();
        seniorCitizenGroup.add(r1);
        seniorCitizenGroup.add(r2);

        ButtonGroup existingAccountGroup = new ButtonGroup();
        existingAccountGroup.add(e1);
        existingAccountGroup.add(e2);

        JLabel l12 = new JLabel("Form No");
        l12.setBounds(700, 10, 100, 30);
        l12.setFont(new Font("Raleway", Font.BOLD, 18));
        add(l12);

        JLabel l13 = new JLabel(formno);
        l13.setBounds(760, 10, 100, 30);
        l13.setFont(new Font("Raleway", Font.BOLD, 18));
        add(l13);

        next = new JButton("NEXT");
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(570, 640, 100, 30);
        next.setBackground(Color.WHITE);
        next.setForeground(Color.BLACK);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(new Color(252, 208, 76));
        setLayout(null);
        setSize(850, 750);
        setLocation(450, 80);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == next) {
            String rel = (String) comboBox.getSelectedItem();
            String cate = (String) comboBox2.getSelectedItem();
            String inc = (String) comboBox3.getSelectedItem();
            String edu = (String) comboBox4.getSelectedItem();
            String occ = (String) comboBox5.getSelectedItem();
            String pan = textPan.getText();
            String aadhar = textAadhar.getText();
            String seniorCitizen = r1.isSelected() ? "Yes" : "No";
            String existingAccount = e1.isSelected() ? "Yes" : "No";

            try {
                if (pan.isEmpty() || aadhar.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Please fill all fields.");
                } else {
                    // Assuming cone class handles database connection
                    cone c1 = new cone();
                    String query = "insert into signuptwo values('" + formno + "', '" + rel + "','" + cate + "','" + inc + "','" + edu + "','" + occ + "','" + pan + "','" + aadhar + "','" + seniorCitizen + "','" + existingAccount + "' )";
                    c1.statement.executeUpdate(query);
                    new Signup3(formno); // Open Signup3 or another form
                    setVisible(false);
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        new Signup2("");
    }
}
