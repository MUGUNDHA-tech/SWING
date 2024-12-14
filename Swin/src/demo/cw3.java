package demo;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class cw3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        final JFrame frame = new JFrame("Color Changer Application");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        final JPanel colorPanel = new JPanel();
        colorPanel.setBounds(50, 50, 300, 150);
        colorPanel.setBackground(Color.WHITE);

        String[] colors = {"White", "Red", "Green", "Blue", "Yellow"};
        final JComboBox colorComboBox = new JComboBox(colors);
        colorComboBox.setBounds(150, 220, 100, 25);

        colorComboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selectedColor = (String) colorComboBox.getSelectedItem();
                if ("Red".equals(selectedColor)) {
                    colorPanel.setBackground(Color.RED);
                } else if ("Green".equals(selectedColor)) {
                    colorPanel.setBackground(Color.GREEN);
                } else if ("Blue".equals(selectedColor)) {
                    colorPanel.setBackground(Color.BLUE);
                } else if ("Yellow".equals(selectedColor)) {
                    colorPanel.setBackground(Color.YELLOW);
                } else {
                    colorPanel.setBackground(Color.WHITE);
                }
            }
        });

        frame.add(colorPanel);
        frame.add(colorComboBox);

        frame.setVisible(true);

	}

}
