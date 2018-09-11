/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bldbbank;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author user
 */
public class BloodDonate extends JFrame {
    
     JPanel donatePanel =new JPanel();
    JButton newUserButton = new JButton("New User");
    JButton oldUserButton = new JButton("Old User");

    public BloodDonate()
    {
        JFrame donateFrame = new JFrame("Blood Donation");

       newUserButton.setSize( 30, 10);
       oldUserButton.setSize( 30, 20);
       donatePanel.add(newUserButton);
       donatePanel.add(oldUserButton);
       donateFrame.add(donatePanel);
        donateFrame.setSize(400, 400);
        donateFrame.setVisible(true);

       newUserButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
               
                  NewUser newuser = new NewUser();
            }
        });
        oldUserButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
               OldUser olduser = new OldUser();

            }
        });

    }



    
}
