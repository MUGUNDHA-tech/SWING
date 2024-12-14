package demo;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

public class phome2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        JFrame frame = new JFrame("Timer Label Application");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        final JLabel timeLabel = new JLabel();
        timeLabel.setHorizontalAlignment(SwingConstants.CENTER);
        timeLabel.setFont(timeLabel.getFont().deriveFont(20.0f));

        Timer timer = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String currentTime = new SimpleDateFormat("HH:mm:ss").format(new Date());
                timeLabel.setText("Current Time: " + currentTime);
            }
        });

        timer.start();
        frame.add(timeLabel);
        
        frame.setVisible(true);

	}

}
