package demo;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class phome1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
        final JFrame frame = new JFrame("Student Registration Form");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(5, 2, 10, 10));

        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField();
        
        JLabel regNoLabel = new JLabel("Regno:");
        JTextField regNoField = new JTextField();
        
        JLabel cgpaLabel = new JLabel("CGPA:");
        JTextField cgpaField = new JTextField();
   
        JLabel genderLabel = new JLabel("Gender:");
        JCheckBox maleCheckbox = new JCheckBox("Male");
        JCheckBox femaleCheckbox = new JCheckBox("Female");

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleCheckbox);
        genderGroup.add(femaleCheckbox);

        JPanel genderPanel = new JPanel();
        genderPanel.add(maleCheckbox);
        genderPanel.add(femaleCheckbox);
        JButton submitButton = new JButton("Submit");
        
        frame.add(nameLabel);
        frame.add(nameField);
        
        frame.add(regNoLabel);
        frame.add(regNoField);
        
        frame.add(cgpaLabel);
        frame.add(cgpaField);
        
        frame.add(genderLabel);
        frame.add(genderPanel);
        
        frame.add(submitButton);

        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Welcome");
            }
        });
        frame.setVisible(true);

	}

}
