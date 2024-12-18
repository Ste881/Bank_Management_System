import javax.swing.*;
import java.awt.*;

public class Login extends JFrame{
    Login(){
        setTitle("Automated Teller Machine");
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(70, 10, 100, 100);
        add(label);

        JLabel text = new JLabel("Welcome to ATM");
        text.setFont(new Font("Osward", Font.BOLD, 38));
        text.setBounds(200, 40, 400, 40);
        add(text);

        // Creating labels
        JLabel cardno = new JLabel("Card No:");
        cardno.setFont(new Font("Raleway", Font.BOLD, 28));
        cardno.setBounds(120, 150, 250, 40);
        add(cardno);

        //text field for entering details
        JTextField cardTextField = new JTextField();
        cardTextField.setBounds(300, 150, 250, 40);
        add(cardTextField);

        JLabel pin = new JLabel("PIN:");
        pin.setFont(new Font("Raleway", Font.BOLD, 28));
        pin.setBounds(120, 220, 250, 40);
        add(pin);

        JTextField pinTextField = new JTextField();
        pinTextField.setBounds(300, 220, 250, 40);
        add(pinTextField);

        getContentPane().setBackground(Color.WHITE);

        setSize(800, 400);
        setVisible(true);
        setLocation(350,200);
    }
    public static void main(String[] args) {
        new Login();
    }
}
