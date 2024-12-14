package demo;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class dc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final JFrame frame = new JFrame("Java Swing Application");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a menu bar and a menu
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Options");
        
        // Create a menu item and add it to the menu
        JMenuItem showMessageItem = new JMenuItem("Show Message");
        menu.add(showMessageItem);
        
        // Add action listener to the menu item
        showMessageItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Show a message dialog when the menu item is selected
                JOptionPane.showMessageDialog(frame, "Hello, welcome to the Java Swing Application!");
            }
        });
        
        // Add the menu to the menu bar and set the menu bar in the frame
        menuBar.add(menu);
        frame.setJMenuBar(menuBar);
        
        // Make the frame visible
        frame.setVisible(true);

	}

}
