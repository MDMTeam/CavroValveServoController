import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main implements ActionListener {

    private static final int WIDTH = 640;
    private static final int HEIGHT = 480;

    private static JFrame f = new JFrame();
    private static Dimension size = new Dimension(WIDTH, HEIGHT);
    private static Dimension buttonSize = new Dimension(100, 50);

    private static final String title = "Carvo Servo Controller";
    private static String write = "Status: ONLINE";

    public static int clicks = 0;

    public static void main(String[] args) {
        Main main = new Main();

        JButton button = new JButton("Lel");
        
        JTextArea textArea = new JTextArea("Test the TextField.");
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setPreferredSize(new Dimension(400, 200));
        textArea.setEditable(false);


        f.setLayout(new FlowLayout());
        f.setResizable(false);
        f.setPreferredSize(size);
        f.setTitle(title);
        f.pack();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setVisible(true);

        button.setSize(buttonSize);
        button.setLocation(520, 30);

        f.add(button);
        f.add(scrollPane);
        //f.add(scroll);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                clicks++;
                //textArea.append("\nYou clicked the button " + clicks + " times.");
            }
        });

    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
