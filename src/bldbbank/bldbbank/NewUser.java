
package bldbbank;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class NewUser extends JFrame {
    JPanel newuserPanel = new JPanel(new GridLayout(7, 2));

    public NewUser()
    {
        final JFrame newuserFrame = new JFrame("New User");
        JLabel   nameLabel = new JLabel("Name:");
    JLabel  ageLabel = new JLabel("Age:");
    JLabel  weightLabel = new JLabel("weight"); 
    JLabel  districtLabel = new JLabel("District:");
    JLabel  mobileLabel = new JLabel("Mobile No:"); 
    JLabel  bloodgroupLabel = new JLabel("Blood Group:");
     JLabel voidLabel  = new JLabel("       ");
    final JTextField namefield = new JTextField();
    final JTextField agefield= new JTextField();
    final JTextField weightfield = new JTextField();
    final JTextField districtfield = new JTextField();
    final JTextField mobilefield  = new JTextField();
     final JTextField bloodgroupfield = new JTextField();
    JButton submitButton = new JButton();
        namefield.setSize(50, 10);
        agefield.setSize(50, 10);
        weightfield.setSize(50, 10);
        districtfield.setSize(50, 10);
        mobilefield.setSize(50, 10);
         bloodgroupfield.setSize(50, 10);
        submitButton.setSize(20, 10);
        newuserPanel.add(nameLabel);
        newuserPanel.add(namefield);
        newuserPanel.add(ageLabel);
        newuserPanel.add(agefield);
        newuserPanel.add(weightLabel);
        newuserPanel.add(weightfield);
        newuserPanel.add(districtLabel);
        newuserPanel.add(districtfield);
        newuserPanel.add(mobileLabel);
        newuserPanel.add(mobilefield);
        newuserPanel.add(bloodgroupLabel);
        newuserPanel.add(bloodgroupfield);
        newuserPanel.add(submitButton);
        newuserPanel.add(voidLabel);
        newuserFrame.add(newuserPanel);
        newuserFrame.setSize(400, 400);
        newuserFrame.setVisible(true);
         submitButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {

             String name= new String();
             String ageString= new String();
             String weightString= new String();
             String district= new String();
             String mobileNo= new String();
             String bloodGroup= new String();
             name = namefield.getText().toString();
             ageString = agefield.getText().toString();
             weightString = weightfield.getText().toString();
             district = districtfield.getText().toString();
             mobileNo = mobilefield.getText().toString();
              bloodGroup = bloodgroupfield.getText().toString();
             int age,weight;
             age = Integer.parseInt(ageString);
             weight =Integer.parseInt(weightString);

             if(age<18||weight<50)
             {
                 System.out.println("You can not donate blood");
           newuserFrame.dispose();

             }
           insertDB insertdb = new insertDB();
           insertdb.insert(name,age,weight,district,mobileNo,bloodGroup,);
            newuserFrame.dispose();
            }
        });



    }



}


