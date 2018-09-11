
package bldbbank;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Bldbbank extends JFrame{

    JPanel mainPanel = new JPanel();
   JButton donateButton = new JButton("Donate");
    JButton collectButton = new JButton("collect");
     public Bldbbank(){
         JFrame mainFrame = new JFrame("Blood Bank");

        donateButton.setSize( 30, 10);
       collectButton.setSize( 30, 20);

       mainPanel.add(donateButton);
       mainPanel.add(collectButton);
       mainFrame.add(mainPanel);
        mainFrame.setSize(400, 400);
        mainFrame.setVisible(true);
   donateButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {

               BloodDonate donate= new BloodDonate();
           }
        });

        collectButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {

               collect collectblood = new collect();
            }
        });


   }
         
     
    public static void main(String[] args) {
              new Bldbbank();

    }
}
