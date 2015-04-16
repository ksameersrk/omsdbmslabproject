public class homeWindow extends javax.swing.JFrame
{
    private javax.swing.JLabel OMSLabel;
    private javax.swing.JButton contactsButton;
    private javax.swing.JButton exit;
    private javax.swing.JButton gMessagesButton;
    private javax.swing.JButton messagesButton;

    public homeWindow()
    {
        initComponents();
    }

    private void initComponents()
    {
        OMSLabel = new javax.swing.JLabel();
        messagesButton = new javax.swing.JButton();
        gMessagesButton = new javax.swing.JButton();
        contactsButton = new javax.swing.JButton();
        exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        OMSLabel.setText("ONLINE MESSAGING SYSTEM");

        messagesButton.setText("MESSAGES");
        messagesButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                messagesButtonActionPerformed(evt);
            }
        });

        gMessagesButton.setText("G MESSAGES");
        gMessagesButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                gMessagesButtonActionPerformed(evt);
            }
        });

        contactsButton.setText("CONTACTS");
        contactsButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                contactsButtonActionPerformed(evt);
            }
        });

        exit.setText("EXIT");
        exit.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(messagesButton)
                        .addGap(26, 26, 26)
                        .addComponent(gMessagesButton)
                        .addGap(18, 18, 18)
                        .addComponent(contactsButton)
                        .addGap(18, 18, 18)
                        .addComponent(exit))
                    .addComponent(OMSLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(OMSLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(messagesButton)
                    .addComponent(gMessagesButton)
                    .addComponent(contactsButton)
                    .addComponent(exit))
                .addContainerGap(230, Short.MAX_VALUE))
        );

        pack();
    }

    private void messagesButtonActionPerformed(java.awt.event.ActionEvent evt)
    {
        individualWindow p = new individualWindow();
        p.createWindow();
        System.out.println("Messages CLICKED");
        setVisible(false);
    }

    public void makeVisible()
    {
        setVisible(true);
    }

    private void gMessagesButtonActionPerformed(java.awt.event.ActionEvent evt)
    {
        groupWindow p = new groupWindow();
        p.createWindow();
        System.out.println("Group Messages CLICKED");
        setVisible(false);
    }

    private void contactsButtonActionPerformed(java.awt.event.ActionEvent evt)
    {
        contactsWindow p = new contactsWindow();
        p.createWindow();
        System.out.println("Contacts CLICKED");
        setVisible(false);
    }

    private void exitActionPerformed(java.awt.event.ActionEvent evt)
    {
        System.exit(0);
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
            java.util.logging.Logger.getLogger(homeWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(homeWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(homeWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(homeWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new homeWindow().setVisible(true);
            }
        });
    }


    public void createWindow()
    {
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new homeWindow().setVisible(true);
            }
        });
    }


}
