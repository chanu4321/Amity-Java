import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class open_ended_1 extends JFrame implements ActionListener {
    private JLabel messageLabel;
    private JButton redButton, yellowButton, greenButton;

    public open_ended_1() {
        setTitle("Traffic Light Simulator");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        messageLabel = new JLabel("Select a light:");
        redButton = new JButton("Red");
        yellowButton = new JButton("Yellow");
        greenButton = new JButton("Green");

        redButton.addActionListener(this);
        yellowButton.addActionListener(this);
        greenButton.addActionListener(this);

        add(messageLabel);
        add(redButton);
        add(yellowButton);
        add(greenButton);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String light = "";
        String message = "";

        if (e.getSource() == redButton) {
            light = "Red";
            message = "Stop";
        } else if (e.getSource() == yellowButton) {
            light = "Yellow";
            message = "Ready";
        } else if (e.getSource() == greenButton) {
            light = "Green";
            message = "Go";
        }

        messageLabel.setText("The traffic light is " + light + ". " + message);
    }

    public static void main(String[] args) {
        new open_ended_1();
    }
}
