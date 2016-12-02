import javax.swing.*;
import javax.swing.text.DefaultCaret;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main implements ActionListener {

    private static final int WIDTH = 640;
    private static final int HEIGHT = 480;

    private static JFrame f = new JFrame();
    private static InitJThings initj = new InitJThings();
    private static Dimension size = new Dimension(WIDTH, HEIGHT);

    private static final String title = "Carvo Servo Controller";
    private static String write = "Status: ONLINE";

    public static int clicks = 0;

    public static void main(String[] args) {

        Main main = new Main();
        main.frameInit();
        main.initJThings();
        main.setActionListener();
        main.addJThings();

    }

    private void frameInit() {

        f.getContentPane().setLayout(null);
        f.setTitle(title);
        f.setPreferredSize(size);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(false);
        f.pack();
        f.setLocationRelativeTo(null);
        f.setVisible(true);

    }

    public void initJThings(){
        initj.buttonPlus.setBounds(420, 10, 100, 50);
        initj.buttonExit.setBounds(420, 70, 100, 50);
        initj.commandLine.setBounds(10, 10, 400, 400);
        initj.commandLine.setBorder(initj.border);
        initj.status.setCaretPosition(initj.status.getDocument().getLength());
        initj.status.setEditable(false);
    }

    public void setActionListener() {

        initj.buttonPlus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                clicks++;
                initj.status.append("\nButton was pressed " + clicks + " times.");
            }
        } );

        initj.buttonExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.exit(1);
            }
        });

    }

    public void addJThings() {

        f.add(initj.buttonPlus);
        f.add(initj.buttonExit);

        f.add(initj.commandLine);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

}
