import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
    JButton cancelButton;
    JButton createButton;

    /**
     * Constructor for LoginFrame
     * Takes in param model, which holds the data for the app
     * @param model
     */

    public LoginFrame(Model model) {
        text = new JTextArea("Please enter ID or hit create.");
        loginButton = new JButton("Login");
        // Make Button do someting.
        /*TODO create new window?

         */
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        cancelButton = new JButton("Cancel");
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        createButton = new JButton("Create");
        constructPanel();

    }
    public void createUser(){
        String name;
        int id;

        JPanel panel = new JPanel();
        JFrame frame = new JFrame("Create User");
        JLabel nameLabel = new JLabel("Select Name");
        JLabel passWord = new JLabel("Select Password");
        JTextArea nameTextArea = new JTextArea("Please select your name");
        JTextArea passWordTextArea = new JTextArea("Please select your password");





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
        buttonPanel.add(cancelButton);
        buttonPanel.add(createButton);
        frame.add(text, BorderLayout.CENTER);
        frame.add(buttonPanel, BorderLayout.SOUTH);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);



    }
}
