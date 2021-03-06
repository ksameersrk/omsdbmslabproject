public class registrationFrame extends javax.swing.JFrame {

    private javax.swing.JButton registrationFormButtonBack;
    private javax.swing.JButton registrationFormButtonSubmit;
    private javax.swing.JLabel registrationFormLabel1;
    private javax.swing.JLabel registrationFormLabel2;
    private javax.swing.JLabel registrationFormLabel3;
    private javax.swing.JLabel registrationFormLabel4;
    private javax.swing.JLabel registrationFormLabel5;
    private javax.swing.JLabel registrationFormLabel6;
    private javax.swing.JLabel registrationFormLabel7;
    private javax.swing.JRadioButton registrationFormRadioButtonFemale;
    private javax.swing.JRadioButton registrationFormRadioButtonMale;
    private javax.swing.JTextField registrationFormTextFieldAge;
    private javax.swing.JTextField registrationFormTextFieldCountry;
    private javax.swing.JTextField registrationFormTextFieldName;
    private javax.swing.JTextField registrationFormTextFieldPhoneNumber;
    private javax.swing.JTextField registrationFormTextFieldStatus;
    //User user = new User();

    public registrationFrame() {
        initComponents();
    }
    private void initComponents() {

        registrationFormLabel1 = new javax.swing.JLabel();
        registrationFormLabel2 = new javax.swing.JLabel();
        registrationFormLabel3 = new javax.swing.JLabel();
        registrationFormLabel4 = new javax.swing.JLabel();
        registrationFormLabel5 = new javax.swing.JLabel();
        registrationFormLabel6 = new javax.swing.JLabel();
        registrationFormTextFieldName = new javax.swing.JTextField();
        registrationFormTextFieldPhoneNumber = new javax.swing.JTextField();
        registrationFormRadioButtonMale = new javax.swing.JRadioButton();
        registrationFormRadioButtonFemale = new javax.swing.JRadioButton();
        registrationFormTextFieldAge = new javax.swing.JTextField();
        registrationFormTextFieldCountry = new javax.swing.JTextField();
        registrationFormButtonSubmit = new javax.swing.JButton();
        registrationFormButtonBack = new javax.swing.JButton();
        registrationFormLabel7 = new javax.swing.JLabel();
        registrationFormTextFieldStatus = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        registrationFormLabel1.setText("REGISTRATION FORM");

        registrationFormLabel2.setText("Name :");

        registrationFormLabel3.setText("Phone Number :");

        registrationFormLabel4.setText("Sex :");

        registrationFormLabel5.setText("Age :");

        registrationFormLabel6.setText("Country :");

        registrationFormTextFieldName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrationFormTextFieldNameActionPerformed(evt);
            }
        });

        registrationFormTextFieldPhoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrationFormTextFieldPhoneNumberActionPerformed(evt);
            }
        });

        registrationFormRadioButtonMale.setText("Male");
        registrationFormRadioButtonMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrationFormRadioButtonMaleActionPerformed(evt);
            }
        });

        registrationFormRadioButtonFemale.setText("Female");
        registrationFormRadioButtonFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrationFormRadioButtonFemaleActionPerformed(evt);
            }
        });

        registrationFormTextFieldAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrationFormTextFieldAgeActionPerformed(evt);
            }
        });

        registrationFormTextFieldCountry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrationFormTextFieldCountryActionPerformed(evt);
            }
        });

        registrationFormButtonSubmit.setText("SUBMIT");
        registrationFormButtonSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrationFormButtonSubmitActionPerformed(evt);
            }
        });

        registrationFormButtonBack.setText("BACK");
        registrationFormButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrationFormButtonBackActionPerformed(evt);
            }
        });

        registrationFormLabel7.setText("Status :");

        registrationFormTextFieldStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrationFormTextFieldStatusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(registrationFormLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(registrationFormLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(registrationFormLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(registrationFormLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(registrationFormLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(registrationFormLabel6)
                            .addComponent(registrationFormLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(registrationFormTextFieldName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(registrationFormTextFieldPhoneNumber, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(registrationFormRadioButtonMale)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(registrationFormRadioButtonFemale))
                            .addComponent(registrationFormTextFieldAge, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(registrationFormTextFieldCountry, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(registrationFormButtonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(registrationFormButtonSubmit))
                            .addComponent(registrationFormTextFieldStatus))))
                .addContainerGap(145, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(registrationFormLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(registrationFormLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(registrationFormTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(registrationFormLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(registrationFormTextFieldPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(registrationFormLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(registrationFormRadioButtonMale)
                            .addComponent(registrationFormRadioButtonFemale))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(registrationFormLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(registrationFormTextFieldAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registrationFormLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registrationFormTextFieldCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(registrationFormLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(registrationFormTextFieldStatus, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registrationFormButtonBack)
                    .addComponent(registrationFormButtonSubmit))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        pack();
    }

    private void registrationFormTextFieldNameActionPerformed(java.awt.event.ActionEvent evt)
    {
        //user.name = registrationFormTextFieldName.getText();
        //System.out.println(registrationFormTextFieldName.getText());
    }

    private void registrationFormTextFieldPhoneNumberActionPerformed(java.awt.event.ActionEvent evt)
    {
        //user.phoneNumber = registrationFormTextFieldPhoneNumber.getText();
        //System.out.println(registrationFormTextFieldPhoneNumber.getText());
    }

    private void registrationFormRadioButtonMaleActionPerformed(java.awt.event.ActionEvent evt)
    {
        if(registrationFormRadioButtonMale.isSelected())
        {
            //user.sex = registrationFormRadioButtonMale.getText();
            //System.out.println(registrationFormRadioButtonMale.getText());
        }
    }

    private void registrationFormRadioButtonFemaleActionPerformed(java.awt.event.ActionEvent evt)
    {
        if(registrationFormRadioButtonFemale.isSelected())
        {
            //user.sex = registrationFormRadioButtonFemale.getText();
            //System.out.println(registrationFormRadioButtonFemale.getText());
        }
    }

    private void registrationFormTextFieldAgeActionPerformed(java.awt.event.ActionEvent evt)
    {
        //user.age = registrationFormTextFieldAge.getText();
        //System.out.println(registrationFormTextFieldAge.getText());
    }

    private void registrationFormTextFieldCountryActionPerformed(java.awt.event.ActionEvent evt)
    {
        //user.country = registrationFormTextFieldCountry.getText();
        //System.out.println(registrationFormTextFieldCountry.getText());
    }

    private void registrationFormButtonBackActionPerformed(java.awt.event.ActionEvent evt)
    {
        loginFrame lf = new loginFrame();
        lf.makeVisible();
        setVisible(false);
        dispose();
    }

    private void registrationFormButtonSubmitActionPerformed(java.awt.event.ActionEvent evt)
    {
        //user.name = registrationFormTextFieldName.getText();
        System.out.println(registrationFormTextFieldName.getText());
        //user.phoneNumber = registrationFormTextFieldPhoneNumber.getText();
        System.out.println(registrationFormTextFieldPhoneNumber.getText());
        if(registrationFormRadioButtonMale.isSelected())
        {
            //user.sex = registrationFormRadioButtonMale.getText();
            System.out.println(registrationFormRadioButtonMale.getText());
        }
        if(registrationFormRadioButtonFemale.isSelected())
        {
            //user.sex = registrationFormRadioButtonFemale.getText();
            System.out.println(registrationFormRadioButtonFemale.getText());
        }
        //user.age = registrationFormTextFieldAge.getText();
        System.out.println(registrationFormTextFieldAge.getText());
        //user.country = registrationFormTextFieldCountry.getText();
        System.out.println(registrationFormTextFieldCountry.getText());
        //user.status = registrationFormTextFieldStatus.getText();
        System.out.println(registrationFormTextFieldStatus.getText());
        /*
         * addNewUser(user);
         * New user is added with all the fields mentioned.
         *
         **/
        loginFrame lf = new loginFrame();
        lf.makeVisible();
        setVisible(false);
        dispose();
    }

    private void registrationFormTextFieldStatusActionPerformed(java.awt.event.ActionEvent evt)
    {
        //user.status = registrationFormTextFieldStatus.getText();
        //System.out.println(registrationFormTextFieldStatus.getText());
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
            java.util.logging.Logger.getLogger(registrationFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registrationFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registrationFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registrationFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registrationFrame().setVisible(true);
            }
        });
    }

    public void makeVisible()
    {
        setVisible(true);
    }

    public void createWindow()
    {
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new registrationFrame().setVisible(true);
            }
        });
    }



}
