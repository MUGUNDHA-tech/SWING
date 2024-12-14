package demo;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class cw1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        final JFrame frame = new JFrame("Text Display Application");
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        final JTextField textField = new JTextField();
        textField.setBounds(50, 30, 200, 25);
        
        JButton displayButton = new JButton("Display Text");
        displayButton.setBounds(100, 70, 100, 25);

        displayButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = textField.getText();
                
                JOptionPane.showMessageDialog(frame, "You entered: " + text);
            }
        });

        frame.add(textField);
        frame.add(displayButton);

        frame.setVisible(true);

	}

}
