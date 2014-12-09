import javax.swing.*;
import java.awt.*;

/**
 * Created by Kaigen on 12/7/14.
 */
public class LoginFrame {
    private int id;
    private String name;
    JFrame frame;
    JPanel buttonPanel;
    JTextArea text;
    JButton loginButton;
    JButton cancleButton;
    JButton createButton;

    /**
     * Constructor for LoginFrame
     * Takes in param model, which holds the data for the app
     * @param model
     */

    public LoginFrame(Model model) {
        text = new JTextArea("Please enter ID or hit create.");
        loginButton = new JButton("Login");
        cancleButton = new JButton("Cancel");
        createButton = new JButton("Create");
        constructPanel();

    }

    /**
     * Contructs the main panel to holds the components
     * for user to log in.
     */


    public void constructPanel(){
        frame = new JFrame("Login");
        frame.setSize(400,400);
        frame.setLocationRelativeTo(null);
        buttonPanel = new JPanel();
        buttonPanel.add(loginButton);
        buttonPanel.add(cancleButton);
        buttonPanel.add(createButton);
        frame.add(text, BorderLayout.CENTER);
        frame.add(buttonPanel, BorderLayout.SOUTH);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);



    }
}
