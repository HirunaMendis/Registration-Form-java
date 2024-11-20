import javax.swing.*;
import java.awt.*;

public class Registration extends JFrame {
    private final int FRAME_WIDTH = 1000;
    private final  int FRAME_HEIGHT = 880;
    private final int FRAME_X = 680;
    private final int FRAME_Y = 150;

    Registration(){
        setTitle("Registration Form");
        setSize(FRAME_WIDTH,FRAME_HEIGHT);
        setResizable(false);
        setLocation(FRAME_X,FRAME_Y);

        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //Registration Form

        JLabel titleLable = new JLabel( "Registration Form");
        titleLable.setSize(350,50);
        titleLable.setLocation(380,20);
        titleLable.setFont(new Font("Arial",Font.BOLD,25));
        contentPane.add(titleLable);

        //name

        JLabel nameLable = new JLabel( "Name");
        nameLable.setSize(100,30);
        nameLable.setLocation(200, 100);
        nameLable.setFont(new Font("Arial",Font.PLAIN,20));
        contentPane.add(nameLable);

        JTextField nameTextField = new JTextField();
        nameTextField.setSize(250,30);
        nameTextField.setLocation(300,100);
        nameTextField.setFont(new Font("Arial",Font.PLAIN, 20));
        contentPane.add(nameTextField);

        //mobile

        JLabel mobileLable = new JLabel( "Mobile");
        mobileLable.setSize(100,30);
        mobileLable.setLocation(200, 200);
        mobileLable.setFont(new Font("Arial",Font.PLAIN,20));
        contentPane.add(mobileLable);

        JTextField mobileTextField = new JTextField();
        mobileTextField.setSize(250,30);
        mobileTextField.setLocation(300,200);
        mobileTextField.setFont(new Font("Arial",Font.PLAIN, 20));
        contentPane.add(mobileTextField);

    }
}
