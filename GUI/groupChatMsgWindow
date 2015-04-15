public class groupChatMsgWindow extends javax.swing.JFrame 
{

    private javax.swing.JButton backButton;
    private javax.swing.JList chatsMessageList;
    private javax.swing.JButton deleteChatsMessageButton;
    private javax.swing.JButton groupMessageDetails;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField messageTextField;
    private javax.swing.JLabel recipentNameLabel;
    private javax.swing.JButton sendButton;

    public groupChatMsgWindow() 
    {
        initComponents();
    }                         
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        recipentNameLabel = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        chatsMessageList = new javax.swing.JList();
        messageTextField = new javax.swing.JTextField();
        sendButton = new javax.swing.JButton();
        deleteChatsMessageButton = new javax.swing.JButton();
        groupMessageDetails = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        recipentNameLabel.setText("GroupName");

        backButton.setText("BACK");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        chatsMessageList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        chatsMessageList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chatsMessageListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(chatsMessageList);

        messageTextField.setText("jTextField1");
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

        deleteChatsMessageButton.setText("Delete");
        deleteChatsMessageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteChatsMessageButtonActionPerformed(evt);
            }
        });

        groupMessageDetails.setText("MESSAGE DETAILS");
        groupMessageDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                groupMessageDetailsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(messageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(recipentNameLabel)
                        .addGap(32, 32, 32)
                        .addComponent(groupMessageDetails)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deleteChatsMessageButton)
                    .addComponent(sendButton, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(recipentNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(groupMessageDetails)
                    .addComponent(backButton))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(messageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(deleteChatsMessageButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sendButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }                       

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) 
    {                                           
        groupWindow f2 = new groupWindow();
        f2.makeVisible();
        setVisible(false);
        dispose();
    }                                          

    private void sendButtonActionPerformed(java.awt.event.ActionEvent evt) 
    {                                           
    }                                          

    private void chatsMessageListMouseClicked(java.awt.event.MouseEvent evt) 
    {                                              
    }                                             

    private void messageTextFieldActionPerformed(java.awt.event.ActionEvent evt) 
    {                                                 
    }                                                

    private void deleteChatsMessageButtonActionPerformed(java.awt.event.ActionEvent evt) 
    {                                              
    }                                                        

    private void groupMessageDetailsActionPerformed(java.awt.event.ActionEvent evt) 
    {                                                    
        groupChatDetailsWindow f6 = new groupChatDetailsWindow();
        f6.createWindow();
        setVisible(false);
    }                                                   
    
    public static void main(String args[]) 
    {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(groupChatMsgWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(groupChatMsgWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(groupChatMsgWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(groupChatMsgWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new groupChatMsgWindow().setVisible(true);
            }
        });
    }
    
    public void createWindow()
    {
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new groupChatMsgWindow().setVisible(true);
            }
        });
    }
       
    public void makeVisible()
    {
        setVisible(true);
    }
               

                 
}
