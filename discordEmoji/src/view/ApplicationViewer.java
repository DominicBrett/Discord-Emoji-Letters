
package view;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.ApplicationModel;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;



public class ApplicationViewer extends JFrame {
   
    private JTabbedPane tabs = new JTabbedPane();
     private JTextArea discordDisplay = new JTextArea();
        private JTextArea aboutDisplay = new JTextArea();
       
        private JPanel controlPanel = new JPanel();
        private JButton searchButton = new JButton("Submit");
        
   
        private JTextField searchFeild = new JTextField();
          private JLabel searchLabel = new JLabel("  Input here :   ");
    
  
public void jFramePrint()
{

    this.setLayout(new BorderLayout());
    this.add(controlPanel,BorderLayout.SOUTH);
    searchButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
             String Input = searchFeild.getText();
             discordDisplay.setText(ApplicationModel.getInstance().calculateEmojis(Input));
            
        }
    });
  
        searchFeild.setColumns(50);
    
        
   
   
    controlPanel.add(searchLabel);
    controlPanel.add(searchFeild);
    controlPanel.add(searchButton);
    
    this.setSize(860,690);
    this.setTitle("Discord Emoji Letters");
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
   
    discordDisplay.append("Resuls Here");
    aboutDisplay.append("Created by Dominic Brett");

    tabs.add("Discord", discordDisplay);
    tabs.add("About", aboutDisplay);

    this.add(tabs);
 this.setVisible(true);
    
}
       
   private static ApplicationViewer instance;
   
    /**
     *
     * @return the one instance of ApplicationViewer
     */
    public static ApplicationViewer getInstance() {
        return instance;
    }


    public static void setInstance(ApplicationViewer instance) {
        ApplicationViewer.instance = instance;
    }

    

        
      
    
  
    
    
}

    
  
 