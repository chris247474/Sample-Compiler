/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package scanneralt;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
/**
 *
 * @author Sonia Tan
 */
public class InputDialog extends JDialog{
    private JTextField input;
    private JLabel inputLabel;
    private JButton btnLogin;
    private JButton btnCancel;

    public InputDialog(Frame parent, String id) {
        super(parent, "Input", true);
        //
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints cs = new GridBagConstraints();

        cs.fill = GridBagConstraints.HORIZONTAL;

        inputLabel = new JLabel("Input for variable "+id+" : ");
        cs.gridx = 0;
        cs.gridy = 0;
        cs.gridwidth = 1;
        panel.add(inputLabel, cs);

        input = new JTextField(30);
        cs.gridx = 1;
        cs.gridy = 0;
        cs.gridwidth = 2;
        panel.add(input, cs);
        
        

        panel.setBorder(new LineBorder(Color.GRAY));


        btnLogin = new JButton("Ok");

        btnLogin.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                if (input.getText() != null) {
                    // reset username and password
                    
                    dispose();
                }
            }
        });
        btnCancel = new JButton("Cancel");
        btnCancel.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        JPanel bp = new JPanel();
        bp.add(btnLogin);
        bp.add(btnCancel);



        getContentPane().add(panel, BorderLayout.CENTER);
        getContentPane().add(bp, BorderLayout.PAGE_END);

        pack();
        setResizable(false);
        setLocationRelativeTo(parent);
    }

    public String getInput() {
        return input.getText().trim();
    }


}

