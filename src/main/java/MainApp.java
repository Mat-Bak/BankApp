
import java.awt.Dimension;
import java.io.FileWriter;
import javax.swing.JFrame;
import java.io.BufferedWriter;
import java.io.File;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonIOException;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import java.awt.Color;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.Border;

/**
 *
 * @author Mateusz
 */
public class MainApp extends javax.swing.JPanel {

    String name, surname, city, address, login, password, sex, email, phoneNumber, pesel, postCode;
    int balance;
    JFrame F = new JFrame("BankApp");
    static String getPesel = "";
    //Red border if field is wrong and gray if it is correct
    static Border empty = BorderFactory.createLineBorder(Color.RED, 1);
    static Border correct = BorderFactory.createLineBorder(Color.gray, 1);
    
    // Path to file with data
    static Path currentRelativePath = Paths.get("");
    static String projectPath = currentRelativePath.toAbsolutePath().toString();
    final static String pathToFile = "\\src\\main\\java\\accounts.json";
    static String outputFilePath = projectPath + pathToFile;
     
    /**
     *
     */
    public MainApp() {
        initComponents();
        ErrorPane.setBackground(new Color(238,238,238, 255));
        ErrorPanel.setBackground(new Color(238,238,238, 255));
        testPanel.setVisible(false);
        MainPanel.setVisible(true);
    }
    
    static MainApp N = new MainApp();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JTabbedPane();
        LogiIn = new javax.swing.JPanel();
        Login_Label = new javax.swing.JLabel();
        Login_Field = new javax.swing.JTextField();
        Password_Label = new javax.swing.JLabel();
        Login = new javax.swing.JButton();
        Password_Field = new javax.swing.JPasswordField();
        loginError = new javax.swing.JLabel();
        Register = new javax.swing.JPanel();
        Last_Name = new javax.swing.JTextField();
        First_Name = new javax.swing.JTextField();
        City = new javax.swing.JTextField();
        Address = new javax.swing.JTextField();
        PostCode = new javax.swing.JTextField();
        FirstName_Label = new javax.swing.JLabel();
        LastName_Label = new javax.swing.JLabel();
        City_Label = new javax.swing.JLabel();
        Address_Label = new javax.swing.JLabel();
        PostCode_Label = new javax.swing.JLabel();
        Phone_Number = new javax.swing.JTextField();
        PhoneNumber_Label = new javax.swing.JLabel();
        Sex_Text = new javax.swing.JLabel();
        Sex_box = new javax.swing.JComboBox<>();
        registerNewAccount = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Pesel_label = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Login_field = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Email_label = new javax.swing.JTextField();
        Password_Name = new javax.swing.JLabel();
        RePassword_Name = new javax.swing.JLabel();
        Password = new javax.swing.JPasswordField();
        RePassword = new javax.swing.JPasswordField();
        ErrorPane = new javax.swing.JScrollPane();
        ErrorPanel = new javax.swing.JTextPane();
        testPanel = new javax.swing.JPanel();
        depositCashButton = new javax.swing.JButton();
        withdrawCashButton = new javax.swing.JButton();
        logOutButton = new javax.swing.JButton();
        balanceField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        changePasswordButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        accountInfo = new javax.swing.JTextPane();
        deleteAccountButton = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(500, 600));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(500, 600));

        MainPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        MainPanel.setInheritsPopupMenu(true);
        MainPanel.setMinimumSize(new java.awt.Dimension(500, 600));
        MainPanel.setName(""); // NOI18N
        MainPanel.setPreferredSize(new java.awt.Dimension(500, 600));

        LogiIn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        LogiIn.setMinimumSize(new java.awt.Dimension(500, 600));
        LogiIn.setPreferredSize(new java.awt.Dimension(500, 600));

        Login_Label.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Login_Label.setText("Login");
        Login_Label.setToolTipText("");

        Password_Label.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Password_Label.setText("Password");
        Password_Label.setToolTipText("");

        Login.setText("Login");
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });

        loginError.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        loginError.setForeground(new java.awt.Color(102, 0, 0));
        loginError.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout LogiInLayout = new javax.swing.GroupLayout(LogiIn);
        LogiIn.setLayout(LogiInLayout);
        LogiInLayout.setHorizontalGroup(
            LogiInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LogiInLayout.createSequentialGroup()
                .addContainerGap(116, Short.MAX_VALUE)
                .addGroup(LogiInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(loginError, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Login_Label)
                    .addComponent(Login_Field, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Password_Label)
                    .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Password_Field, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(113, 113, 113))
        );
        LogiInLayout.setVerticalGroup(
            LogiInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LogiInLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(Login_Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Login_Field, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(Password_Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Password_Field, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(loginError, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(220, Short.MAX_VALUE))
        );

        MainPanel.addTab("Log In", null, LogiIn, "");

        Register.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Register.setMinimumSize(new java.awt.Dimension(500, 600));
        Register.setPreferredSize(new java.awt.Dimension(500, 600));

        Last_Name.setAutoscrolls(false);
        Last_Name.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));

        First_Name.setAutoscrolls(false);
        First_Name.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));

        City.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));

        Address.setAutoscrolls(false);
        Address.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));

        PostCode.setAutoscrolls(false);
        PostCode.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));

        FirstName_Label.setText("First Name");

        LastName_Label.setText("City");

        City_Label.setText("Last Name");

        Address_Label.setText("Address");

        PostCode_Label.setText("Post Code");

        Phone_Number.setAutoscrolls(false);
        Phone_Number.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));

        PhoneNumber_Label.setText("Phone number");

        Sex_Text.setText("Sex");
        Sex_Text.setToolTipText("");

        Sex_box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Other", "Male", "Female", " " }));

        registerNewAccount.setText("Register");
        registerNewAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerNewAccountActionPerformed(evt);
            }
        });

        jLabel1.setText("Pesel");

        Pesel_label.setAutoscrolls(false);
        Pesel_label.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));

        jLabel2.setText("Login");

        Login_field.setAutoscrolls(false);
        Login_field.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));

        jLabel3.setText("E-mail");

        Email_label.setAutoscrolls(false);
        Email_label.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));

        Password_Name.setText("Password");

        RePassword_Name.setText("Repeat password");

        Password.setAutoscrolls(false);
        Password.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));

        RePassword.setAutoscrolls(false);
        RePassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));

        ErrorPane.setBorder(null);

        ErrorPanel.setEditable(false);
        ErrorPanel.setBorder(null);
        ErrorPanel.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        ErrorPanel.setAutoscrolls(false);
        ErrorPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ErrorPane.setViewportView(ErrorPanel);

        javax.swing.GroupLayout RegisterLayout = new javax.swing.GroupLayout(Register);
        Register.setLayout(RegisterLayout);
        RegisterLayout.setHorizontalGroup(
            RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegisterLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RegisterLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(FirstName_Label))
                    .addGroup(RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(First_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LastName_Label)
                        .addComponent(City, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(PostCode_Label)
                        .addComponent(PostCode, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Sex_Text)
                        .addComponent(Sex_box, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(Login_field, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Password_Name)
                        .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RegisterLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(City_Label))
                    .addGroup(RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(Last_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Address_Label)
                        .addComponent(Address, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(PhoneNumber_Label)
                        .addComponent(Phone_Number, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)
                        .addComponent(Pesel_label, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(Email_label, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(RePassword_Name)
                        .addComponent(RePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(43, 43, 43))
            .addGroup(RegisterLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(registerNewAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ErrorPane, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        RegisterLayout.setVerticalGroup(
            RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegisterLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(FirstName_Label)
                    .addComponent(City_Label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(First_Name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Last_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LastName_Label)
                    .addComponent(Address_Label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(Address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(City, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PostCode_Label)
                    .addComponent(PhoneNumber_Label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(PostCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Phone_Number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Sex_Text)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(Pesel_label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Sex_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(Login_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Email_label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Password_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RePassword_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(RegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(RePassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(ErrorPane, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(registerNewAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(155, Short.MAX_VALUE))
        );

        MainPanel.addTab("Register", null, Register, "");

        testPanel.setMinimumSize(new java.awt.Dimension(500, 600));

        depositCashButton.setText("Deposit Cash");
        depositCashButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositCashButtonActionPerformed(evt);
            }
        });

        withdrawCashButton.setText("Withdraw Cash");
        withdrawCashButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdrawCashButtonActionPerformed(evt);
            }
        });

        logOutButton.setText("Log Out");
        logOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutButtonActionPerformed(evt);
            }
        });

        balanceField.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        balanceField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        balanceField.setText("0");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Balance:");

        changePasswordButton.setText("Change Password");
        changePasswordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePasswordButtonActionPerformed(evt);
            }
        });

        accountInfo.setEditable(false);
        accountInfo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jScrollPane1.setViewportView(accountInfo);

        deleteAccountButton.setText("Delete Account");
        deleteAccountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteAccountButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout testPanelLayout = new javax.swing.GroupLayout(testPanel);
        testPanel.setLayout(testPanelLayout);
        testPanelLayout.setHorizontalGroup(
            testPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(testPanelLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(testPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(balanceField, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteAccountButton, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(testPanelLayout.createSequentialGroup()
                        .addGroup(testPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(depositCashButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(changePasswordButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(testPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(withdrawCashButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(logOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        testPanelLayout.setVerticalGroup(
            testPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(testPanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(balanceField, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(testPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(withdrawCashButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(depositCashButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(testPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(changePasswordButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deleteAccountButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(testPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(506, 506, 506))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(testPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        MainPanel.getAccessibleContext().setAccessibleName("form");
        MainPanel.getAccessibleContext().setAccessibleDescription("");
    }// </editor-fold>//GEN-END:initComponents
    
    //Button register
    private void registerNewAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerNewAccountActionPerformed
        
        //set errors font color to red
        ErrorPanel.setForeground(Color.red);
        
        String errorList = "";
        //clear panel with errors
        ErrorPanel.setText("");

        //clear the border of each field
        First_Name.setBorder(correct);
        Last_Name.setBorder(correct);
        City.setBorder(correct);
        Address.setBorder(correct);
        Login_field.setBorder(correct);
        Password.setBorder(correct);
        RePassword.setBorder(correct);
        Email_label.setBorder(correct);
        Sex_box.setBorder(correct);
        Phone_Number.setBorder(correct);
        Pesel_label.setBorder(correct);
        PostCode.setBorder(correct);
        
        //get text from fields 
        name = First_Name.getText();
        surname = Last_Name.getText();
        city = City.getText();
        address = Address.getText();
        login = Login_field.getText();
        password = Password.getText();
        email = Email_label.getText();
        sex = String.valueOf(Sex_box.getSelectedItem());
        phoneNumber = Phone_Number.getText();
        pesel = Pesel_label.getText();
        postCode = PostCode.getText();
        balance = 0;

        
        ArrayList<JTextField> accountData = new ArrayList<JTextField>();
            accountData.add(First_Name);
            accountData.add(Last_Name);
            accountData.add(City);
            accountData.add(Address);
            accountData.add(Login_field);
            accountData.add(Password);
            accountData.add(RePassword);
            accountData.add(Email_label);
            accountData.add(Phone_Number);
            accountData.add(Pesel_label);
            accountData.add(PostCode);
        
        BufferedWriter bf = null;
        
         //Save data to file
         try{
             
            File file = new File(outputFilePath);

            // check that all data is correct
            String checkDataErrorList = checkData(First_Name, Last_Name, City, Address, Login_field, Password, RePassword, Email_label, Phone_Number, Pesel_label, PostCode);
            if(login.length() < 8){
                if(!login.isEmpty()){
                    errorList+= """
                                Login Is Too Short!
                                """;
                }
                Login_field.setBorder(empty);
            }
            
            List<Account> loadDataFromFile = null;
            //Load data from file to list
            loadDataFromFile = loadData();
            
            //check if login, phone number or email already exist in file 
            if(!loadDataFromFile.equals(null)){
                for(Account userData : loadDataFromFile){
                    if((userData.getLogin().equals(login))){
                        Login_Field.setBorder(empty);
                        errorList += """
                                      Login Already Exist!
                                     """;
                    } 
                    if(userData.getEmail().equals(email)){
                        errorList += """
                                     Email Already Exist!
                                     """;
                        Email_label.setBorder(empty); 
                    }
                    if(userData.getPhoneNumber().equals(phoneNumber)){
                        errorList += """
                                     Phone Number Already Exist!
                                     """;
                        Phone_Number.setBorder(empty);
                    } 
                }
            }

            // if any field has a red border, it means that it is invalid and the data cannot be written to the file
            for(JTextField data : accountData){
                if(data.getBorder() == empty){
                    ErrorPanel.setText(ErrorPanel.getText() + errorList + checkDataErrorList);
                    return;
                }
                
            }
            
            loadDataFromFile.add(new Account(name, surname, city, address, login, password, sex, email, phoneNumber, pesel, postCode, balance));
            bf = new BufferedWriter(new FileWriter(file));
            Gson gson = new GsonBuilder().setPrettyPrinting().create();

            gson.toJson(loadDataFromFile, bf);
            
            // If everything is ok, save the data to a file and show a successful message
            ErrorPanel.setForeground(new Color(17,74,0));
            ErrorPanel.setText("Account creation successful!");
            
            bf.flush();          
            //file.close();
        }catch(JsonIOException | IOException e) {
            System.out.println("ERROR!!!!!");
        }
    }//GEN-LAST:event_registerNewAccountActionPerformed

    
    
    
    // Login account
    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed
        // TODO add your handling code here:
        String login = Login_Field.getText();
        String password = Password_Field.getText();
        boolean loginSuccessful = false;
        List<Account> data = loadData();
        int accountBalance = 0;
        String info = "";
        
        // Login to account if login and password are correct
        for(Account users : data){
            if(users.getLogin().equals(login) && users.getPassword().equals(password)){
                
                MainPanel.setVisible(false);
                F.add(testPanel);
                testPanel.setVisible(true);
                //set info about account
                accountBalance = users.getBalance();
                info += "Name: " + users.getName() + "\n" + "Surname: " + users.getSurname() + "\n"
                        + "Address: " + users.getCity() + ", " + users.getAddress() + ", " + users.getPostCode() + "\n"
                        + "Sex: " + users.getSex() + "\n" + "Email: " + users.getEmail() + "\n" + "Pesel: " + users.getPesel();
                loginSuccessful = true;
                getPesel = users.getPesel();
                break;
            }
        }
        
        if(!loginSuccessful){
            loginError.setText("Login or Password is invalid");
        }
        
        balanceField.setText(String.valueOf(accountBalance));
        accountInfo.setText(info);      
    }//GEN-LAST:event_LoginActionPerformed

    /**
     *
     * @param add
     */
    public static void depositCash(String add){
        int addBalance = Integer.parseInt(balanceField.getText()) + Integer.parseInt(add);
        balanceField.setText(String.valueOf(addBalance));
    }
    
    /**
     *
     * @param cash
     * @return
     */
    public static boolean withdrawCash(String cash){
        int getBalance = Integer.parseInt(balanceField.getText());
        int withdraw = getBalance - Integer.parseInt(cash);
        if(getBalance >= Integer.parseInt(cash)){
            balanceField.setText(String.valueOf(withdraw));
            return true;
        }else{
            WithdrawMoney.setError("Not Enought Money");
            return false;
        }
    }
    
    /**
     *
     * @param oldPassword
     * @param newPassword
     * @param reNewPassword
     */
    public static void changePassword(JPasswordField oldPassword ,JPasswordField newPassword, JPasswordField reNewPassword){
        List<Account> data = loadData();
        String changePass = checkPassword(newPassword);
        BufferedWriter bf = null;
        File file = new File(outputFilePath);
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        // check that the new password is different from the old one and meets the conditions
        if(oldPassword.getText().equals(newPassword.getText())){
            changePassword.setText("New password can not be the same like old password");
            return;
        }
        if(!newPassword.getText().equals(reNewPassword.getText())){
            changePassword.setText("Invalid Data");
            return;
        }

        try {
            // changePass should return empty if everything is ok or it should return a string with errors
            // if changePass is empty then change password
            if(changePass.isEmpty()){
                for(Account users: data){
                    if(users.getPesel().equals(getPesel)  && users.getPassword().equals(oldPassword.getText())){
                        users.setPassword(newPassword.getText());
                        bf = new BufferedWriter(new FileWriter(file));
                        gson.toJson(data, bf);
                        changePassword.setText("Password changed successful!");
                        break;
                    }
                }
                bf.flush();
            }
        } catch (Exception e) {
            System.out.println("Change password error!");
        } 
        
    }
    
    /**
     *
     * @param pesel
     * @param password
     * @param error
     * @return
     */
    public static boolean checkDataToRemoveAccount(JTextField pesel, JPasswordField password, JLabel error){
        List<Account> data = loadData();
        
        for(Account users : data){
            if(users.getPesel().equals(getPesel)){
                // confirm pesel and password to delete account
                if(pesel.getText().equals(users.getPesel()) && password.getText().equals(users.getPassword())){
                    return true;
                }else{
                    error.setText("Incorrect data");
                    return false;
                }
            }
        }
        error.setText("Incorrect data");
        return false;
        
    }
    
    /**
     *
     */
    public static void removeAccount(){
        List<Account> data = loadData();
        BufferedWriter bf = null;
        File file = new File(outputFilePath);
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try {
            for(Account users : data){
                if(users.getPesel().equals(getPesel)){
                    data.remove(users);
                    bf = new BufferedWriter(new FileWriter(file));
                    gson.toJson(data, bf);
                    break;
                }
            }
            bf.flush();
        } catch (Exception e) {
            System.out.println("Delete user Error!");
        }
        
        
    }
    
    private void logOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutButtonActionPerformed
        // TODO add your handling code here:
        List<Account> data = loadData();
        BufferedWriter bf = null;
        File file = new File(outputFilePath);
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try {
            for(Account users : data){
                if(users.getPesel().equals(getPesel)){
                    users.setBalance(Integer.parseInt(balanceField.getText()));
                    bf = new BufferedWriter(new FileWriter(file));
                    gson.toJson(data, bf);
                    break;
                }
            }
            bf.flush();
        } catch (Exception e) {
        }
        testPanel.setVisible(false);
        MainPanel.setVisible(true);
        Login_Field.setText("");
        Password_Field.setText("");
                
    }//GEN-LAST:event_logOutButtonActionPerformed

    private void changePasswordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePasswordButtonActionPerformed
        // TODO add your handling code here:
        changePassword createNewPassword = new changePassword();
        createNewPassword.setVisible(true);
        
    }//GEN-LAST:event_changePasswordButtonActionPerformed

    private void depositCashButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositCashButtonActionPerformed
        // TODO add your handling code here:
        DepositMaoney deposit = new DepositMaoney();
        deposit.setVisible(true);
        
    }//GEN-LAST:event_depositCashButtonActionPerformed

    private void withdrawCashButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdrawCashButtonActionPerformed
        // TODO add your handling code here:
        WithdrawMoney withdraw = new WithdrawMoney();
        withdraw.setVisible(true);
    }//GEN-LAST:event_withdrawCashButtonActionPerformed

    private void deleteAccountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteAccountButtonActionPerformed
        // TODO add your handling code here:
        
        DeleteAccount removeAcc = new DeleteAccount();
        removeAcc.setVisible(true);  
    }//GEN-LAST:event_deleteAccountButtonActionPerformed

    
    //Load data from file to List

    /**
     *
     * @return
     */
    public static List<Account> loadData(){
        
        List<Account> data = null;
        
        try {
           File file = new File(outputFilePath);
           Gson gson = new Gson();
           BufferedReader bf = new BufferedReader(new FileReader(file));
           Type userType = new TypeToken<List<Account>>(){}.getType(); 
           data = gson.fromJson(bf, userType);
        } catch (JsonIOException | JsonSyntaxException | FileNotFoundException e) {
            System.out.println("ERROR DATA LOAD!");
        }
        
        return data;
    }
    
    //check the correctness of the data

    /**
     *
     * @param name
     * @param surname
     * @param city
     * @param address
     * @param login
     * @param password
     * @param rePassword
     * @param email
     * @param phoneNumber
     * @param pesel
     * @param postCode
     * @return
     */
    public String checkData(JTextField name, JTextField surname, JTextField city, JTextField address, JTextField login, 
            JPasswordField password, JPasswordField rePassword, JTextField email, JTextField phoneNumber, JTextField pesel, JTextField postCode){

            String errorList = "";
            
            ArrayList<JTextField> accountData = new ArrayList<JTextField>();
            accountData.add(name);
            accountData.add(surname);
            accountData.add(city);
            accountData.add(address);
            accountData.add(login);
            accountData.add(password);
            accountData.add(rePassword);
            accountData.add(email);
            accountData.add(phoneNumber);
            accountData.add(pesel);
            accountData.add(postCode);
            
            boolean fieldIsEmpty = false;
            for(JTextField data : accountData){
                if(data.getText().isEmpty()){
                    fieldIsEmpty = true;
                    data.setBorder(empty);
                }
            }
            
            if(fieldIsEmpty){
                errorList += """
                             All fields must be completed
                             """;
            }
            
            //check if Pesel contains only numbers and length is equal 11
            String peselError = containOnlyDigit(pesel, 11, "pesel");
            
            //check if phone number contains only numbers and length is equal 9
            String phoneNumberError = containOnlyDigit(phoneNumber, 9, "phone number");
            
            //check if password is the same like rePassword
            if(!String.valueOf(password.getPassword()).equals(String.valueOf(rePassword.getPassword()))){
                errorList += """
                             Password and rePassword Must Be The Same!
                             """;
                password.setBorder(empty);
                rePassword.setBorder(empty);
            }
            
            //check if password contain one special char, one big letter, one digit and is longer than 8
            String checkPasswordError = checkPassword(password);
            
            //Check if postcode matches the pattern
            boolean matchPostCodeOne = Pattern.matches("[0-9]{5}", postCode.getText());
            if(!matchPostCodeOne){
                postCode.setBorder(empty);
                if(!postCode.getText().isEmpty()){
                    errorList += """
                                 Post Code Is Invalid!
                                 """;
                }
                
            }
            
             //Check if email matches the pattern
            String emailPattern = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@" + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
            boolean matchEmail = Pattern.matches(emailPattern, email.getText());
            if(!matchEmail){
                
                email.setBorder(empty);
                if(!email.getText().isEmpty()){
                    errorList += """
                                 Email Is Invalid!
                                 """ ;
                }
            }
            errorList += checkPasswordError + peselError + phoneNumberError;
            return errorList;
            
    }
    
    // check that the password meets all the conditions

    /**
     *
     * @param password
     * @return
     */
    public static String checkPassword(JPasswordField password){
        boolean upperCase = false;
        boolean lowerCase = false;
        boolean digit = false;
        boolean specialChar = false;
        
        String correctPassword = """
                                 The password should contain:
                                  * At least one uppercase and lowercase letter
                                  * Should be greater than or equal to 6
                                  * Should contain at least one number
                                  * Should contain at least one special character""" ;
        
        String tooShort = """
                          Password is too short!
                          """;
        
        String text = password.getText();
        if(text.length() < 8){
            if(!text.isEmpty()){
                return tooShort;
            }
            return "";
        }
        
        //Check if password contain:
        // At least one uppercase and lowercase letter
        // It is longer than 6
        // Contain at least one number
        // Contain at least one special character
        for(int i = 0; i < text.length(); ++i){
            if(Character.isDigit(text.charAt(i))){
                digit = true;
            }
            if(Character.isUpperCase(text.charAt(i))){
                upperCase = true;
            }
            if(Character.isLowerCase(text.charAt(i))){
                lowerCase = true;
            }
            if(!Character.isDigit(text.charAt(i))
               && !Character.isLetter(text.charAt(i))
               && !Character.isWhitespace(text.charAt(i))){
               
                specialChar = true;           
            }
        }
        
        
                                      
        
        if(upperCase && digit && specialChar && lowerCase){
            password.setBorder(correct);
            return "";
        }else{
            password.setBorder(empty);
            return correctPassword;
        }
    }
    
    
    // Method allow to check if every char in str is digit and length of str is equal length

    /**
     *
     * @param str
     * @param length
     * @param name
     * @return
     */
    public String containOnlyDigit(JTextField str, int length, String name){
        String errorList = "";
        if(str.getText().length() !=  length){                
            str.setBorder(empty);
            if(!str.getText().isEmpty()){
                errorList += "Length in " + name +" must be equal " + length + "\n";
            }
        }
        boolean onlyDigit = true;
        for(int i = 0; i < str.getText().length(); ++i){
            char checkChar = str.getText().charAt(i);
            if(!Character.isDigit(checkChar)){
                onlyDigit = false;
                
            }
        }
        if(!onlyDigit){
            str.setBorder(empty);
            errorList += """
                             Field should contain only digits
                             """;
        }
            return errorList;
    }
    
    /**
     *
     */
    public void createGUI(){
        F.setMinimumSize(new Dimension(500,550));
        F.setPreferredSize(new Dimension(500,500));
        F.add(MainPanel);
        
        F.setVisible(true);
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        N.setPreferredSize(new Dimension(500,550));
        N.createGUI();  
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Address;
    private javax.swing.JLabel Address_Label;
    private javax.swing.JTextField City;
    private javax.swing.JLabel City_Label;
    private javax.swing.JTextField Email_label;
    private javax.swing.JScrollPane ErrorPane;
    private javax.swing.JTextPane ErrorPanel;
    private javax.swing.JLabel FirstName_Label;
    private javax.swing.JTextField First_Name;
    private javax.swing.JLabel LastName_Label;
    private javax.swing.JTextField Last_Name;
    private javax.swing.JPanel LogiIn;
    private javax.swing.JButton Login;
    private javax.swing.JTextField Login_Field;
    private javax.swing.JLabel Login_Label;
    private javax.swing.JTextField Login_field;
    private javax.swing.JTabbedPane MainPanel;
    private javax.swing.JPasswordField Password;
    private javax.swing.JPasswordField Password_Field;
    private javax.swing.JLabel Password_Label;
    private javax.swing.JLabel Password_Name;
    private javax.swing.JTextField Pesel_label;
    private javax.swing.JLabel PhoneNumber_Label;
    private javax.swing.JTextField Phone_Number;
    private javax.swing.JTextField PostCode;
    private javax.swing.JLabel PostCode_Label;
    private javax.swing.JPasswordField RePassword;
    private javax.swing.JLabel RePassword_Name;
    private javax.swing.JPanel Register;
    private javax.swing.JLabel Sex_Text;
    private javax.swing.JComboBox<String> Sex_box;
    private javax.swing.JTextPane accountInfo;
    private static javax.swing.JTextField balanceField;
    private javax.swing.JButton changePasswordButton;
    private javax.swing.JButton deleteAccountButton;
    private javax.swing.JButton depositCashButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logOutButton;
    private javax.swing.JLabel loginError;
    private javax.swing.JButton registerNewAccount;
    private javax.swing.JPanel testPanel;
    private javax.swing.JButton withdrawCashButton;
    // End of variables declaration//GEN-END:variables
}
