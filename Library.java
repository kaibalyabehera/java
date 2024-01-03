package library;
import javax.swing.jOptionPane;
public class Login extendsjavax.swing.JFrame{
    public Login(){
        initComponents();
    }
    @SuppressWarnings("unchecked")
    private void initComponents(){
     jLabel1=new javax.swing.jLabel();
     jpanel1=new javax.swing.jpanel();
     jLabel2=new javax.swing.jLabel();
     txtusername=new javax.swing.jTextField();
     txtpass=new javax.swing.JPasswordField();
     jButton2=new javax.swing.JButton();
     jButton1=new javax.swing.jButton();
     setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
     jLabel1.setFont(new java.awt.font("Sego UI",1,36));
     jLabel1.setText("Library Login");
     jPanel1.setBorder(javax.swing.BorderFactory.create TitledBorder("Login"));
     jLabel2.setText("Username");
     jLabel3.setText("Passward");
     javax.swing.GroupLayout jpanel1Layout=new javax.swing.GroupLayout(jpanel1);
     jPanel1.setLayout(jPanel1Layout);
     jPanel1Layout.setHorizontalGroup(
     jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
     .addGroup(jPanel1Layout.createSequentialGroup()
     .addGap(48,48,48)
     .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
     .addComponent(jLabel2)
     .addComponent(jLabel3))
     .addGap(51,51,51)
     .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING,false)
     .addGroup(jPanel1Layout.createSequentialGroup()
     .addGap(4,4,4)
     .addComponent(txtpass))
     .addComponent(txtusername,javax.swing.GroupLayout.PREFERRED_SIZE,161,javax.swing.GroupLayout.PREFERRED_SIZE))
     .addContainerGap(114,Short.MAX_VALUE))
     );
     jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,jPanel1Layout.createSequentialGroup()
        .addGap(33,33,33)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.groupLayout.Alignment.BASELINE)
        .addComponent(txtusername,javax.swing.GroupLayout.PREFERRED_SIZE,javax.swing.GroupLayout.DEFAULT_SIZE,javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(43,43,43)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
        .addComponent(txtpass,javax.swing.GroupLayout.PREFERRED_SIZE,javax.swing.GroupLayout.DEFAULT_SIZE,swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap(31,Short.MAX_VALUE))
     );
     jButton2.setText("Cancel");
     jButton2.addActionListener(new java.awt.event.ActionListener(){
        public void actionPerformed(java.awt.event.ActionEvent evt){
            jButton1ActionPerformed(evt);
        }
    });
    javax.swing.GroupLayout layout=new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
        .addGap(31,31,31)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jLabel1)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
        .addGroup(layout.createSequentialGroup()
        .addComponent(jButton1,javax.swing.GroupLayout.PREFERRED_SIZE,115,javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(jButton2,javax.swing.GroupLayout.PREFERRED_SIZE,126,javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(4,4,4))
        .addComponent(jPanel1,javax.swing.GroupLayout.PREFERRED_SIZE,javax.swing.GroupLayout.DEFAULT_SIZE,javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
        .addContainerGap(18,Short.MAX_VALUE)
        .addComponent(jLabel1)
        .addGap(18,18,18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,layout.createSequentialGroup()
        .addComponent(jPanel1,javax.swing.GroupLayout.PREFERRED_SIZE,javax.swing.GroupLayout.DEFAULT_SIZE,javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(64,64,64))
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
        .addComponent(jButton2,javax.swing.GroupLayout.PEFERRED_SIZE,45,javax,swing.GroupLayout.PREFERRED_SIZE)
        .addComponent(jButton1,javax.swing.GroupLayout.PREFERRED_SIZE,45,javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap())))
    );
    private void jButton1 ActionPerformed(java.awt.event.ActionEvent evt){//GEN-FIRST:event_jButton1ActionPerformed
    String username=txtusername.getText();
    String pass=txtpass.getText();
    if(username.equals("Peter")&& Pass.equals("123"))
    {
        Main m=new Main();
        this.hide();
        m.setVisible(true);
    }
    else
  {
    jOptionPane.showMessageDialog(this,"Username and Password do not match");
    txtusername.set Text("");
    txtpass.setText("");
    txtusername.requestFocus();
  }
}
  }
















    )
    )
     