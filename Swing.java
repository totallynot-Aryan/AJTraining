//Main Page
package AWT;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Swing extends JFrame implements ActionListener {
    JButton clear, signin, signup;
    JTextField jtfcard;
    JPasswordField jtfpin;

    Swing() {
        setLayout(null);

        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Login Page");
        setLocation(350, 200);

        // Load the background image
        ImageIcon img1 = new ImageIcon("C:\\Users\\Aryan\\Downloads\\Dark Blur Abstract 4k - 4k Wallpapers - 40_000+ ipad wallpapers 4k - 4k wallpaper Pc.jpg");
        Image img2 = img1.getImage().getScaledInstance(2000, 1360, Image.SCALE_DEFAULT);
        ImageIcon img3 = new ImageIcon(img2);
        JLabel label = new JLabel(img3);
        label.setBounds(0, 0, 2000, 1360);


        JLabel title = new JLabel("Enter your Login Details");
        title.setBounds(400, 17, 700, 100);
        title.setFont(new Font("Arial", Font.BOLD, 55));
        title.setForeground(Color.WHITE);
        label.add(title);

        JLabel card = new JLabel("Card No.: ");
        card.setBounds(300, 150, 500, 100);
        card.setFont(new Font("Arial", Font.BOLD, 50));
        card.setForeground(Color.WHITE);
        label.add(card);

        jtfcard = new JTextField();
        jtfcard.setBounds(550, 172, 400, 50);

        label.add(jtfcard);

        JLabel pin = new JLabel("PIN: ");
        pin.setBounds(300, 250, 500, 100);
        pin.setFont(new Font("Arial", Font.BOLD, 50));
        pin.setForeground(Color.WHITE);
        label.add(pin);

        jtfpin = new JPasswordField();
        jtfpin.setBounds(550, 272, 400, 50);

        label.add(jtfpin);

        clear = new JButton("Clear");
        clear.setBounds(873, 340, 75, 30);
        clear.addActionListener(this);
        label.add(clear);

        signin = new JButton("Sign-In");
        signin.setBounds(550, 340, 75, 30);
        signin.addActionListener(this);
        label.add(signin);

        signup = new JButton("Sign-Up");
        signup.setBounds(550, 400, 400, 30);
        signup.addActionListener(this);
        label.add(signup);
        add(label);
    }

    public static void main(String[] args) {
        Swing swing = new Swing();
        swing.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==clear){
            jtfcard.setText("");
            jtfpin.setText("");
        } else if (ae.getSource()==signin) {
            JOptionPane.showMessageDialog(null,"Signed-In Succesfully");
            setVisible(false);
        } else if (ae.getSource()==signup) {
            JOptionPane.showMessageDialog(null,"You'll be redirected to another page!");
            setVisible(false);
            SignupPg signupPg = new SignupPg();
            signupPg.setVisible(true);
        }
    }
}
