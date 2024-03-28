
//SignUp Page

package AWT;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignupPg extends JFrame implements ActionListener{
    JButton submit;
    JTextField jtfcard;
    JPasswordField jtfpin;
    JComboBox x;
    SignupPg() {
        setLayout(null);

        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Sign-Up Page");
        setLocation(350, 200);

        // Load the background image
        ImageIcon img1 = new ImageIcon("C:\\Users\\Aryan\\Downloads\\Dark Blur Abstract 4k - 4k Wallpapers - 40_000+ ipad wallpapers 4k - 4k wallpaper Pc.jpg");
        Image img2 = img1.getImage().getScaledInstance(2000, 1360, Image.SCALE_DEFAULT);
        ImageIcon img3 = new ImageIcon(img2);
        JLabel label = new JLabel(img3);
        label.setBounds(0, 0, 2000, 1360);


        JLabel title = new JLabel("Enter your Details");
        title.setBounds(400, 17, 700, 100);
        title.setFont(new Font("Arial", Font.BOLD, 55));
        title.setForeground(Color.WHITE);
        label.add(title);

        JLabel email = new JLabel("E-Mail ID: ");
        email.setBounds(300, 150, 500, 100);
        email.setFont(new Font("Arial", Font.BOLD, 50));
        email.setForeground(Color.WHITE);
        label.add(email);

        jtfcard = new JTextField();
        jtfcard.setBounds(550, 172, 400, 50);

        label.add(jtfcard);

        JLabel pin = new JLabel("Password: ");
        pin.setBounds(300, 250, 500, 100);
        pin.setFont(new Font("Arial", Font.BOLD, 45));
        pin.setForeground(Color.WHITE);
        label.add(pin);

        jtfpin = new JPasswordField();
        jtfpin.setBounds(550, 272, 400, 50);

        label.add(jtfpin);

        submit = new JButton("Submit");
        submit.setBounds(873, 340, 75, 30);
        submit.addActionListener(this);
        label.add(submit);

        String[] str = {"a","b","c"};
        JComboBox x = new JComboBox(str);
        x.setBounds(1150,680,200,40);
        label.add(x);

//        signin = new JButton("Sign-In");
//        signin.setBounds(550, 340, 75, 30);
//        signin.addActionListener(this);
//        label.add(signin);

//        signup = new JButton("Sign-Up");
//        signup.setBounds(550, 400, 400, 30);
//        label.add(signup);

        add(label);
    }

    public static void main(String[] args) {
        SignupPg signup = new SignupPg();
        signup.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==submit){
            JOptionPane.showMessageDialog(null,"Sign-Up Successful!");
            setVisible(false);
        }
    }
}