
package bldbbank;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class collect {
     JPanel collectPanel = new JPanel(new GridLayout(3, 1));
    public collect()
    {
         final JFrame collectFrame = new JFrame("Collect");
        JLabel   nameLabel = new JLabel("Name of the Blood Group:");
         final JTextField bloodgroupfield = new JTextField();
        JButton checkButton = new JButton("Click to check");

         bloodgroupfield.setSize(50, 10);
         checkButton.setSize(20, 10);
          collectPanel.add(nameLabel);
         collectPanel.add(bloodgroupfield);
          collectPanel.add(checkButton);
          collectFrame.add(collectPanel);
        collectFrame.setSize(400, 400);
        collectFrame.setVisible(true);

       checkButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {

                 String bloodGroup= new String();

                 bloodGroup = bloodgroupfield.getText().toString();

                 insertDB insertdb = new insertDB();
                int count =0;
                count = insertdb.check(bloodGroup);
              System.out.println(count);
            }
        });


    }


}


