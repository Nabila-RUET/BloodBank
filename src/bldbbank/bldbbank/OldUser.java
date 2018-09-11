
package bldbbank;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.String;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class OldUser {
 public OldUser()
{
 final JFrame olduserFrame = new JFrame("Old User");
       JLabel   nameLabel = new JLabel("Enter the mobile no:");
     final JTextField mobilefield = new JTextField();
    JPanel olduserPanel = new JPanel(new GridLayout(3,1));
    JButton searchButton = new JButton("Search");

    searchButton.setSize(20, 10);
    mobilefield.setSize(50, 20);
    nameLabel.setSize(50, 50);

     olduserPanel.add(nameLabel);
    olduserPanel.add(mobilefield);
     olduserPanel.add(searchButton);
     olduserFrame.add(olduserPanel);

        olduserFrame.setSize(400, 400);
        olduserFrame.setVisible(true);

}  
}
