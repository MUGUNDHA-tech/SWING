package demo;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class cw4 {
	private JFrame frame;
    private JTextField displayField;
    private StringBuilder input;
    private String operator;
    private double firstOperand;
    public cw4() {
        input = new StringBuilder();
        operator = "";
        firstOperand = 0;
        frame = new JFrame("Simple Calculator");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        displayField = new JTextField();
        displayField.setEditable(false);
        displayField.setFont(new Font("Arial", Font.PLAIN, 24));
        frame.add(displayField, BorderLayout.NORTH);
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4));
        String[] buttonLabels = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", "C", "=", "+"
        };
        for (int i = 0; i < buttonLabels.length; i++) {
            JButton button = new JButton(buttonLabels[i]);
            button.setFont(new Font("Arial", Font.PLAIN, 24));
            button.addActionListener(new ButtonClickListener());
            buttonPanel.add(button);
        }
        frame.add(buttonPanel, BorderLayout.CENTER);
        frame.setVisible(true);
    }
    private class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            if ("C".equals(command)) {
                input.setLength(0);
                displayField.setText("");
                operator = "";
                firstOperand = 0;
            } else if ("=".equals(command)) {
                double secondOperand = Double.parseDouble(input.toString());
                double result = calculate(firstOperand, secondOperand, operator);
                displayField.setText(String.valueOf(result));
                input.setLength(0);
                firstOperand = result;
            } else if ("+".equals(command) || "-".equals(command) || "*".equals(command) || "/".equals(command)) {
                if (input.length() > 0) {
                    firstOperand = Double.parseDouble(input.toString());
                    operator = command;
                    input.setLength(0);
                }
            } else {
                input.append(command);
                displayField.setText(input.toString());
            }
        }
    }
    private double calculate(double first, double second, String operator) {
    	if (operator.equals("+")) {
    	    return first + second;
    	} else if (operator.equals("-")) {
    	    return first - second;
    	} else if (operator.equals("*")) {
    	    return first * second;
    	} else if (operator.equals("/")) {
    	    return second != 0 ? first / second : 0; // handle division by zero
    	} else {
    	    return second;
    	}
    }
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
		    public void run() {
		        new cw4();
		    }
		});
	}

}
