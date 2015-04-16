
public class groupChatDetailsWindow extends javax.swing.JFrame 
{

    private javax.swing.JButton groupMsgButtonBack;
    private javax.swing.JLabel groupMsgDetailsLabel1;
    private javax.swing.JLabel groupMsgDetailsLabel2;
    private javax.swing.JLabel groupMsgDetailsLabel3;
    private javax.swing.JLabel groupMsgDetailsLabel4;
    private javax.swing.JLabel groupMsgDetailsLabel5;
    private javax.swing.JLabel groupMsgDetailsLabel6;
    private javax.swing.JTextArea groupMsgTextArea1;
    private javax.swing.JScrollPane jScrollPane1;

    public groupChatDetailsWindow() 
    {
        initComponents();
    }
                     
    private void initComponents() 
    {

        groupMsgDetailsLabel1 = new javax.swing.JLabel();
        groupMsgDetailsLabel2 = new javax.swing.JLabel();
        groupMsgDetailsLabel3 = new javax.swing.JLabel();
        groupMsgDetailsLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        groupMsgTextArea1 = new javax.swing.JTextArea();
        groupMsgButtonBack = new javax.swing.JButton();
        groupMsgDetailsLabel5 = new javax.swing.JLabel();
        groupMsgDetailsLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        groupMsgDetailsLabel1.setText("GROUP MESSAGES DETAILS");

        groupMsgDetailsLabel2.setText("SENT BY :");

        groupMsgDetailsLabel3.setText("SENT AT :");

        groupMsgDetailsLabel4.setText("RECEIVED BY :");

        groupMsgTextArea1.setColumns(20);
        groupMsgTextArea1.setRows(5);
        groupMsgTextArea1.setText("Received By Names : with time may be");
        jScrollPane1.setViewportView(groupMsgTextArea1);

        groupMsgButtonBack.setText("BACK");
        groupMsgButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                groupMsgButtonBackActionPerformed(evt);
            }
        });

        groupMsgDetailsLabel5.setText("sentByName");

        groupMsgDetailsLabel6.setText("sentAtTime");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(groupMsgDetailsLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(groupMsgButtonBack))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(groupMsgDetailsLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(groupMsgDetailsLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(groupMsgDetailsLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(groupMsgDetailsLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(groupMsgDetailsLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 34, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(groupMsgDetailsLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(groupMsgButtonBack))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(groupMsgDetailsLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(groupMsgDetailsLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(groupMsgDetailsLabel3)
                    .addComponent(groupMsgDetailsLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(groupMsgDetailsLabel4)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }                   

    private void groupMsgButtonBackActionPerformed(java.awt.event.ActionEvent evt) 
    {                                                   
        groupChatMsgWindow f5 = new groupChatMsgWindow();
        f5.makeVisible();
        setVisible(false);
        dispose();
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
            java.util.logging.Logger.getLogger(groupChatDetailsWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(groupChatDetailsWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(groupChatDetailsWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(groupChatDetailsWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new groupChatDetailsWindow().setVisible(true);
            }
        });
    }
      
    public void createWindow()
    {
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new groupChatDetailsWindow().setVisible(true);
            }
        });
    }  
                  

                
}
