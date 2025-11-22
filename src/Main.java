import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        // Run the GUI construction in the Event Dispatch Thread
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createAndShowGUI();
            }
        });
    }

    private static void createAndShowGUI() {
        // Create the main window
        JFrame frame = new JFrame("My Java GUI App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null); // Center the window

        // Create a panel to hold components
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        
        // Create components
        JLabel label = new JLabel("Hello, GitHub!");
        label.setFont(new Font("Arial", Font.BOLD, 24));
        
        JButton button = new JButton("Click Me");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "You clicked the button!");
            }
        });

        // Add components to panel
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(10, 10, 10, 10);
        panel.add(label, gbc);

        gbc.gridy = 1;
        panel.add(button, gbc);

        // Add panel to frame
        frame.add(panel);

        // Display the window
        frame.setVisible(true);
    }
}
