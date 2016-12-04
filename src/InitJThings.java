import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class InitJThings {

    JFrame f = new JFrame();
    JButton buttonPlus = new JButton("Write");
    JButton buttonExit = new JButton("Exit...");

    JTextArea status = new JTextArea("Status: INITIATED");
    JScrollPane commandLine = new JScrollPane(status, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
    Border border = BorderFactory.createLineBorder(Color.BLACK);



}
