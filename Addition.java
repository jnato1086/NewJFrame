import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Addition {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Addition");
        JPanel panel = new JPanel();
        JLabel heading2 = new JLabel("Addition of Numbers");

        // All Components on the left Side
        JLabel q1 = new JLabel("First Number:");
        JTextField field1 = new JTextField(10);
        JLabel q2 = new JLabel("Second Number:");
        JTextField field2 = new JTextField(10);
        JLabel q3 = new JLabel("Sum:");
        JTextField field3 = new JTextField(10);

        JButton btn1 = new JButton("Compute");
        JButton btn2 = new JButton("Clear");
        JButton btn3 = new JButton("Back to Main");

        heading2.setFont(new Font("Italic", Font.ITALIC, 30));
        heading2.setForeground(Color.BLACK);
        heading2.setBounds(320, 100, 300, 40);

        q1.setFont(new Font("", Font.BOLD, 16));
        q1.setForeground(Color.BLACK);
        q1.setBounds(300, 150, 200, 40);
        field1.setBounds(440, 150, 150, 30);
        q2.setFont(new Font("Arial", Font.BOLD, 16));
        q2.setForeground(Color.BLACK);
        q2.setBounds(300, 200, 200, 40);
        field2.setBounds(440, 200, 150, 30);
        q3.setFont(new Font("Arial", Font.BOLD, 16));
        q3.setForeground(Color.BLACK);
        q3.setBounds(300, 250, 200, 40);
        field3.setBounds(440, 250, 150, 30);
        btn1.setBounds(50, 380, 100, 40);

        // Add ActionListener for the "Compute" button
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(field1.getText());
                    int num2 = Integer.parseInt(field2.getText());
                    int sum = num1 + num2;
                    field3.setText(Integer.toString(sum));
                } catch (NumberFormatException ex) {
                    field3.setText("Invalid input");
                }
            }
        });

        // Add ActionListener for the "Clear" button
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                field1.setText("");
                field2.setText("");
                field3.setText("");
            }
        });

        // Add ActionListener for the "Back to Main" button
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose(); // Close the current window
                MainMenu.main(args); // Open the main menu
            }
        });

        btn1.setBounds(250, 380, 100, 40);
        btn1.setBackground(Color.ORANGE); 
        btn2.setBounds(400, 380, 100, 40);
        btn2.setBackground(Color.ORANGE); 
        btn3.setBounds(550, 380, 145, 40);
        btn3.setBackground(Color.ORANGE); 
        
        frame.setVisible(true);
        frame.setSize(1000, 600);
        frame.setLocationRelativeTo(null);
        frame.add(panel);

        panel.add(heading2);
        panel.add(q1);
        panel.add(field1);
        panel.add(q2);
        panel.add(field2);
        panel.add(q3);
        panel.add(field3);
        panel.add(btn1);
        panel.add(btn2);
        panel.add(btn3);

        panel.setLayout(null);
        panel.setBackground(Color.GRAY);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
