import javax.swing.*;
import java.awt.*;

public class SimpleWindow extends JFrame {

    // I am not going to have a main method in this file
    // Constructor - special method that display our attributes

    public SimpleWindow() {
        final int WINDOW_WIDTH = 400;
        final int WINDOW_HEIGHT = 500;

        setTitle("My Second Simple Window");

        setSize(WINDOW_WIDTH,WINDOW_HEIGHT);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // don't forget to display it!!
        setVisible(true);

    }
//    JLabel myLabel, myLabel2;// set the label
//    JTextField textField, textField1;// set the text field
//
//    myLabel = new JLabel("My First Big Label!!");
//        myLabel.setBounds(20,60,100,100);
//        myLabel.setFont(new Font("Times New Roman",Font.PLAIN, 25));
//    // set the string name, style, size
//        window.add(myLabel);
//
//    myLabel2 = new JLabel("My Second Big Label!!");
//        myLabel2.setBounds(20,170,100,100);
//        myLabel2.setFont(new Font("Times New Roman", Font.BOLD, 25));
//    // set the string name, style, size
//        window.add(myLabel2);
//
//
//    textField = new JTextField(35);
//        textField.setBounds(20,130,100,20);
//        window.add(textField);
//
//    textField1 = new JTextField(35);
//        textField1.setBounds(20,220,100,20);
//        window.add(textField1);


}
