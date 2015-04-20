import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.JOptionPane;
import java.util.*;

public class individualChatMsgWindow extends javax.swing.JFrame
{

    private javax.swing.JButton backButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lastSeenLabel;
    private javax.swing.JLabel lastSeenValueLabel;
    private javax.swing.JList list;
    private javax.swing.JLabel recipentLabel;
    private javax.swing.JButton refreshButton;
    private javax.swing.JButton sendButton;
    private javax.swing.JLabel statusLabel;
    private javax.swing.JLabel statusValueLabel;
    private javax.swing.JTextField textField; 
    private DefaultListModel lm;
    private User user1;
    private User user2;
    
    public individualChatMsgWindow(User user1, User user2)
    {
        assert user1 != null;
        assert user2 != null;
        this.user1 = user1;
        this.user2 = user2;
        initComponents();
    }
                       
    private void initComponents() 
    {
        lm = new DefaultListModel();
        for (individualMessageJoinReceives im :
             DatabaseConnectivity.getConversation(this.user1, this.user2))
        {
            if (im.receiverPhoneNumber == user1.phoneNumber)
            {
                lm.addElement(im.text + " <<");
            }
            else
            {
                lm.addElement(">> " + im.text);
            }
        }

        recipentLabel = new javax.swing.JLabel();
        lastSeenLabel = new javax.swing.JLabel();
        statusLabel = new javax.swing.JLabel();
        lastSeenValueLabel = new javax.swing.JLabel();
        statusValueLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        list = new javax.swing.JList(lm);
        textField = new javax.swing.JTextField();
        sendButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        refreshButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        recipentLabel.setText("Recipent Name :");

        lastSeenLabel.setText("Last Seen :");

        statusLabel.setText("Status :");

        lastSeenValueLabel.setText("last_seen_value");

        statusValueLabel.setText("status_value");

        list.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listMouseClicked(evt);
            }
        });
        list.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(list);

        textField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldActionPerformed(evt);
            }
        });

        sendButton.setText("SEND");
        sendButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendButtonActionPerformed(evt);
            }
        });

        backButton.setText("BACK");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("DELETE");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        refreshButton.setText("REFRESH");
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(recipentLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lastSeenLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lastSeenValueLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(statusLabel)
                        .addGap(18, 18, 18)
                        .addComponent(statusValueLabel))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addComponent(textField))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(refreshButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(backButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sendButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(recipentLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastSeenLabel)
                    .addComponent(lastSeenValueLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(statusLabel)
                    .addComponent(statusValueLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sendButton)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(refreshButton)))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        if (this.user2 != null)
        {
            lastSeenValueLabel.setText(user2.last_seen.toString());
            statusValueLabel.setText(user2.status);
        }

        pack();
    }                        

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) 
    {                                           
        setVisible(false);
        dispose();
        individualWindow f1 = new individualWindow(this.user1);
        f1.makeVisible();        
    }                                          

    private void listValueChanged(javax.swing.event.ListSelectionEvent evt) 
    {                                  
       
    }                                 

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) 
    {                                             
        int index =  list.getSelectedIndex();
        lm.remove(index);        
    }                                            

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) 
    {                                              
        
    }                                             

    private void sendButtonActionPerformed(java.awt.event.ActionEvent evt) 
    {                                           
         String message = textField.getText();
         textField.setText("");
         DatabaseConnectivity.sendMessage(this.user1, this.user2, message);
         lm.add(0, ">>" + message);       
    }                                          

    private void textFieldActionPerformed(java.awt.event.ActionEvent evt) 
    {                                          
        
    }                                         

    private void listMouseClicked(java.awt.event.MouseEvent evt) 
    {                                  
        
    }                                 

    public static void main(String args[]) 
    {
        try 
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) 
            {
                if ("Nimbus".equals(info.getName())) 
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } 
        catch (ClassNotFoundException ex) 
        {
            java.util.logging.Logger.getLogger(individualChatMsgWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 
        catch (InstantiationException ex) 
        {
            java.util.logging.Logger.getLogger(individualChatMsgWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 
        catch (IllegalAccessException ex) 
        {
            java.util.logging.Logger.getLogger(individualChatMsgWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 
        catch (javax.swing.UnsupportedLookAndFeelException ex) 
        {
            java.util.logging.Logger.getLogger(individualChatMsgWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            User user1 = this.user1;
            User user2 = this.user2;
            public void run() {
                new individualChatMsgWindow(user1, user2).setVisible(true);
            }
        });
    }
    
    
    public void createWindow()
    {
        User user1 = this.user1;
        User user2 = this.user2;
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new individualChatMsgWindow(user1, user2).setVisible(true);
            }
        });
    }

    public void makeVisible()
    {
        setVisible(true);
    }
                
                
}
