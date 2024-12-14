package demo;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class cw2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        final JFrame frame = new JFrame("Item Selection Application");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        String[] items = {"Item 1", "Item 2", "Item 3", "Item 4", "Item 5"};
        final JList itemList = new JList(items);

        itemList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        JScrollPane listScrollPane = new JScrollPane(itemList);
        listScrollPane.setBounds(50, 30, 100, 100);

        JButton showButton = new JButton("Show Selected Item");
        showButton.setBounds(200, 60, 150, 30);

        showButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	String selectedItem = (String) itemList.getSelectedValue();
                if (selectedItem != null) {
                    JOptionPane.showMessageDialog(frame, "Selected item: " + selectedItem);
                } else {
                    JOptionPane.showMessageDialog(frame, "No item selected");
                }
            }
        });

        frame.add(listScrollPane);
        frame.add(showButton);

        frame.setVisible(true);
	}

}
