import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.JOptionPane;

public class individualChatMsgWindow extends javax.swing.JFrame
{

    private javax.swing.JButton backButton;
    private javax.swing.JList chatsMessageList;
    private javax.swing.JButton deleteChatsMessageButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lastSeenLabel;
    private javax.swing.JLabel lastSeenValueLabel;
    private javax.swing.JTextField messageTextField;
    private javax.swing.JLabel recipentNameLabel;
    private javax.swing.JButton sendButton;
    private javax.swing.JLabel sentStatusLabel;
    private javax.swing.JLabel sentStatusValueLabel;
    private DefaultListModel lm;

    public individualChatMsgWindow() {
        initComponents();
    }
    /*
     * public individualChatMsgWindow(User obj)
     * {
     *      User user = obj;
     * }
     * */
    private void initComponents() {

        lm = new DefaultListModel();
         lm.addElement("Item 1");
         lm.addElement("Item 2");
         lm.addElement("Item 3");
         lm.addElement("Item 4");
         lm.addElement("Item 5");
         lm.addElement("Item 6");

         /*
          * get all the messages list btw the current
          * user and user(obj);
          * add all the chats to
          * lm.addElement(chat1);
          * lm.addElement(chat2);
          * etc etc..
          * if msg is from current_user to user_obj append
          * "<<" at end of msg or otherwise append in beggining
          * ">>"
          *
          * last seen :
          * lastSeenValueLabel.setText(getLastSeen(obj));
          * sent status
          * sentStatusValueLabel.setText(Tick some method);
          * recipent name:
          * recipentNameLabel.setText(user_obj.name);
          *
          * remove of all .setText() statements below
          * which update these value.
          * */

        jLabel1 = new javax.swing.JLabel();
        recipentNameLabel = new javax.swing.JLabel();
        lastSeenLabel = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        chatsMessageList = new javax.swing.JList(lm);
        messageTextField = new javax.swing.JTextField();
        sendButton = new javax.swing.JButton();
        lastSeenValueLabel = new javax.swing.JLabel();
        sentStatusLabel = new javax.swing.JLabel();
        sentStatusValueLabel = new javax.swing.JLabel();
        deleteChatsMessageButton = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        recipentNameLabel.setText("Recipent Name");

        lastSeenLabel.setText("LAST SEEN :");

        backButton.setText("BACK");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        chatsMessageList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chatsMessageListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(chatsMessageList);

        messageTextField.setText("Enter the message here");
        messageTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                messageTextFieldActionPerformed(evt);
            }
        });

        sendButton.setText("SEND");
        sendButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendButtonActionPerformed(evt);
            }
        });

        lastSeenValueLabel.setText("last seen value");

        sentStatusLabel.setText("SENT STATUS :");

        sentStatusValueLabel.setText("TICK");

        deleteChatsMessageButton.setText("Delete");
        deleteChatsMessageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteChatsMessageButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lastSeenLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(recipentNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lastSeenValueLabel)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(deleteChatsMessageButton)
                                    .addComponent(backButton))
                                .addGap(42, 42, 42))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(messageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(sendButton)
                        .addContainerGap(48, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(sentStatusLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sentStatusValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(recipentNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastSeenLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastSeenValueLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sentStatusLabel)
                    .addComponent(sentStatusValueLabel)
                    .addComponent(deleteChatsMessageButton))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(sendButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(messageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {
        setVisible(false);
        dispose();
        individualWindow f1 = new individualWindow();
        f1.makeVisible();
    }

    private void sendButtonActionPerformed(java.awt.event.ActionEvent evt)
    {

         String messageSending = messageTextField.getText();
         messageSending = messageSending + "<<";
         lm.addElement(messageSending);
         messageTextField.setText("");
         /*
          * messageSent(messageSending);
          */
    }

    private void chatsMessageListMouseClicked(java.awt.event.MouseEvent evt)
    {
    }

    private void messageTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void deleteChatsMessageButtonActionPerformed(java.awt.event.ActionEvent evt)
    {
        int index =  chatsMessageList.getSelectedIndex();
        lm.remove(index);
    }


    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(individualChatMsgWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(individualChatMsgWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(individualChatMsgWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(individualChatMsgWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new individualChatMsgWindow().setVisible(true);
            }
        });
    }
    public void createWindow()
    {
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new individualChatMsgWindow().setVisible(true);
            }
        });
    }

    public void makeVisible()
    {
        setVisible(true);
    }


}
