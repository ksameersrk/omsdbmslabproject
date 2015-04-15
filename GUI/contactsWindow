import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.JOptionPane;


public class contactsWindow extends javax.swing.JFrame 
{
    private javax.swing.JButton addContactsButton;
    private javax.swing.JButton deleteContactsButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private DefaultListModel lm;
    private int last_index = -1; 

    public contactsWindow() 
    {
        initComponents();
    }
                        
    private void initComponents() 
    {
         
         lm = new DefaultListModel();
         lm.addElement("Item 1");
         lm.addElement("Item 2");
         lm.addElement("Item 3");
         lm.addElement("Item 4");
         lm.addElement("Item 5");
         lm.addElement("Item 6");
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList(lm);
        addContactsButton = new javax.swing.JButton();
        deleteContactsButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("CONTACTS");

        jButton1.setText("RETURN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jList1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList1ValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        addContactsButton.setText("ADD");
        addContactsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addContactsButtonActionPerformed(evt);
            }
        });

        deleteContactsButton.setText("DELETE");
        deleteContactsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteContactsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(addContactsButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteContactsButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(addContactsButton)
                    .addComponent(deleteContactsButton))
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        pack();
    }                       

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) 
    {                                         
        setVisible(false);
        dispose();
        homeWindow f0 = new homeWindow();
        f0.makeVisible();
    }                                        

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) 
    {                                    
        System.out.println("LIST CLICKED");
        int index = jList1.getSelectedIndex();
        System.out.println(index);
        String k = jList1.getSelectedValue().toString();
        System.out.println(k);
        if(index != last_index)
        {
            last_index = index;
        }
        else
        {
            last_index = -1;
            individualChatMsgWindow f4 = new individualChatMsgWindow();
            f4.makeVisible();
        }
        System.out.println("Last index : "+last_index+" index : "+index);
    }                                   

    private void jList1ValueChanged(javax.swing.event.ListSelectionEvent evt) 
    {                                    
    }                                   

    private void addContactsButtonActionPerformed(java.awt.event.ActionEvent evt) 
    {                                                  
        String k = JOptionPane.showInputDialog("Enter Name and Mobile Number");
        String l[] = new String[2];
        l = k.split(" ");
        lm.addElement(l[0]);
    }                                                 

    private void deleteContactsButtonActionPerformed(java.awt.event.ActionEvent evt) 
    {                                                     
        int index = jList1.getSelectedIndex();
        lm.remove(index);
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
            java.util.logging.Logger.getLogger(contactsWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(contactsWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(contactsWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(contactsWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new contactsWindow().setVisible(true);
            }
        });
    }

    public void createWindow()
    {
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new contactsWindow().setVisible(true);
            }
        });
    }                
}
