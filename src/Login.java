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
        text.setBounds(200, 40, 100, 40);
        add(text);

        getContentPane().setBackground(Color.WHITE);

        setSize(800, 400);
        setVisible(true);
        setLocation(350,200);
    }
    public static void main(String[] args) {
        new Login();
    }
}
