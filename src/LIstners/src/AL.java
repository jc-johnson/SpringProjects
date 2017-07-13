import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 * Created by Jordan on 7/7/2017.
 */
public class AL extends Frame implements WindowListener, ActionListener {

    private TextField textField = new TextField(20);
    private int numClicks = 0;
    private Button button = new Button("Click me");

    public static void main(String[] args) {
        AL myWindow = new AL("My first window");
        myWindow.setSize(350, 100);
        myWindow.setVisible(true);

    }

    public AL(String title) {
        super(title);
        setLayout(new FlowLayout());
        addWindowListener(this);
        button = new Button("Click me");
        add(button);
        add(textField);
        button.addActionListener(this);

    }

    public void actionPerformed(ActionEvent event) {

        numClicks++;
        textField.setText("Button Clicked " + numClicks + " times");
    }


    @Override
    public void windowOpened(WindowEvent e) {}
    @Override
    public void windowClosing(WindowEvent e) {

        dispose();
        System.exit(0);

    }
    @Override
    public void windowClosed(WindowEvent e) {}
    @Override
    public void windowIconified(WindowEvent e) {}
    @Override
    public void windowDeiconified(WindowEvent e) {}
    @Override
    public void windowActivated(WindowEvent e) {}
    @Override
    public void windowDeactivated(WindowEvent e) {}
}
