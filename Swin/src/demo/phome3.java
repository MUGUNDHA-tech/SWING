package demo;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class phome3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        final JFrame frame = new JFrame("IRC Trainer Feedback Form");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(5, 1, 10, 10));

        JPanel panel1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel label1 = new JLabel("Were the contents delivered clearly by the trainer:");
        final JRadioButton yes1 = new JRadioButton("Yes");
        final JRadioButton no1 = new JRadioButton("No");
        ButtonGroup group1 = new ButtonGroup();
        group1.add(yes1);
        group1.add(no1);
        panel1.add(label1);
        panel1.add(yes1);
        panel1.add(no1);

        JPanel panel2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel label2 = new JLabel("Do the trainers clear all your doubts:");
        final JRadioButton yes2 = new JRadioButton("Yes");
        final JRadioButton no2 = new JRadioButton("No");
        ButtonGroup group2 = new ButtonGroup();
        group2.add(yes2);
        group2.add(no2);
        panel2.add(label2);
        panel2.add(yes2);
        panel2.add(no2);

        JPanel panel3 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel label3 = new JLabel("Is the trainer interactive:");
        final JRadioButton yes3 = new JRadioButton("Yes");
        final JRadioButton no3 = new JRadioButton("No");
        ButtonGroup group3 = new ButtonGroup();
        group3.add(yes3);
        group3.add(no3);
        panel3.add(label3);
        panel3.add(yes3);
        panel3.add(no3);

        JPanel panel4 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel label4 = new JLabel("Rate the trainer on a scale of 1 to 10:");
        final JTextField ratingField = new JTextField(2);
        panel4.add(label4);
        panel4.add(ratingField);

        JPanel panel5 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton submitButton = new JButton("Submit");
        panel5.add(submitButton);

        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String feedbackMessage = "Feedback Submitted:\n"
                        + "Contents delivered clearly: " + (yes1.isSelected() ? "Yes" : "No") + "\n"
                        + "Clear doubts: " + (yes2.isSelected() ? "Yes" : "No") + "\n"
                        + "Trainer interactive: " + (yes3.isSelected() ? "Yes" : "No") + "\n"
                        + "Trainer rating: " + ratingField.getText();
                
                JOptionPane.showMessageDialog(frame, feedbackMessage, "Feedback", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        frame.add(panel1);
        frame.add(panel2);
        frame.add(panel3);
        frame.add(panel4);
        frame.add(panel5);

        frame.setVisible(true);

	}

}
