package demo;
import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class phome5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        final JFrame frame = new JFrame("Click Coordinates Application");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        panel.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();

                JOptionPane.showMessageDialog(frame, "Mouse clicked at coordinates: (" + x + ", " + y + ")");
            }
        });

        frame.add(panel);

        frame.setVisible(true);

	}

}
