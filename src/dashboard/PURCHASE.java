/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dashboard;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author admin
 */
public class PURCHASE extends javax.swing.JPanel {

    /**
     * Creates new form PURCHASE
     */
    public PURCHASE() {
        initComponents();
   jTotalAmount1.disable();
    }
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        PayMode = new javax.swing.JTextField();
        Qty = new javax.swing.JTextField();
        MRP = new javax.swing.JTextField();
        Discount = new javax.swing.JTextField();
        DATe = new datechooser.beans.DateChooserCombo();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPurchaseeTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        PhoneNumber = new javax.swing.JTextField();
        CustomerName = new javax.swing.JTextField();
        CustomerID = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        FreeItem = new javax.swing.JTextField();
        NetAmount = new javax.swing.JTextField();
        TotalQty = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        BalanceAmount = new javax.swing.JTextField();
        CurrentAmount = new javax.swing.JTextField();
        ADD = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        TotalItem = new javax.swing.JTextField();
        ProductName = new javax.swing.JTextField();
        Total = new javax.swing.JLabel();
        jTotalAmount1 = new javax.swing.JTextField();
        Print1 = new javax.swing.JButton();

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PURCHASE");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 25, 220, 53));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, -1));

        jLabel2.setFont(new java.awt.Font("Lucida Sans", 1, 13)); // NOI18N
        jLabel2.setText("Free Item :");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 80, 20));

        jLabel4.setFont(new java.awt.Font("Lucida Sans", 1, 13)); // NOI18N
        jLabel4.setText("Product Name :");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 110, 20));

        jLabel5.setFont(new java.awt.Font("Lucida Sans", 1, 13)); // NOI18N
        jLabel5.setText("Qty :");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 40, 20));

        jLabel6.setFont(new java.awt.Font("Lucida Sans", 1, 13)); // NOI18N
        jLabel6.setText("Date :");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 60, 20));

        jLabel7.setFont(new java.awt.Font("Lucida Sans", 1, 13)); // NOI18N
        jLabel7.setText("MRP :");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 50, 20));

        jLabel8.setFont(new java.awt.Font("Lucida Sans", 1, 13)); // NOI18N
        jLabel8.setText("Discount :");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, 80, 20));
        jPanel2.add(PayMode, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 410, 70, -1));
        jPanel2.add(Qty, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 70, -1));
        jPanel2.add(MRP, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 70, -1));
        jPanel2.add(Discount, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, 70, -1));

        DATe.setCurrentView(new datechooser.view.appearance.AppearancesList("Dali",
            new datechooser.view.appearance.ViewAppearance("custom",
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Lucida Grande", java.awt.Font.PLAIN, 13),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Lucida Grande", java.awt.Font.PLAIN, 13),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    true,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Lucida Grande", java.awt.Font.PLAIN, 13),
                    new java.awt.Color(0, 0, 255),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Lucida Grande", java.awt.Font.PLAIN, 13),
                    new java.awt.Color(128, 128, 128),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Lucida Grande", java.awt.Font.PLAIN, 13),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Lucida Grande", java.awt.Font.PLAIN, 13),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(255, 0, 0),
                    false,
                    false,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                (datechooser.view.BackRenderer)null,
                false,
                true)));
    DATe.setFieldFont(new java.awt.Font(".Helvetica Neue DeskInterface", java.awt.Font.PLAIN, 13));
    jPanel2.add(DATe, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, 100, -1));

    jPurchaseeTable1.setAutoCreateRowSorter(true);
    jPurchaseeTable1.setFont(new java.awt.Font("STIXNonUnicode", 2, 12)); // NOI18N
    jPurchaseeTable1.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {

        },
        new String [] {
            "Product Name", "Qty", "Free", "MRP", "Discount", "Total"
        }
    ));
    jPurchaseeTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    jScrollPane1.setViewportView(jPurchaseeTable1);

    jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 530, 250));

    jPanel3.setBackground(new java.awt.Color(188, 198, 191));
    jPanel3.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));

    jLabel9.setText("Customer Name");

    jLabel10.setText("Phone Number");

    CustomerName.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            CustomerNameMouseEntered(evt);
        }
    });
    CustomerName.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            CustomerNameActionPerformed(evt);
        }
    });
    CustomerName.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            CustomerNameKeyReleased(evt);
        }
    });

    CustomerID.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
    CustomerID.setForeground(new java.awt.Color(255, 0, 0));

    javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
    jPanel3.setLayout(jPanel3Layout);
    jPanel3Layout.setHorizontalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel3Layout.createSequentialGroup()
            .addGap(18, 18, 18)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(PhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(CustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(CustomerID, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)))
            .addContainerGap())
    );
    jPanel3Layout.setVerticalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel3Layout.createSequentialGroup()
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(26, 26, 26)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(CustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(CustomerID, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(43, 43, 43)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(PhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(51, Short.MAX_VALUE))
    );

    jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 110, 390, 180));

    jLabel11.setText("Pay Mode");
    jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 410, 70, 20));

    jLabel12.setText("Net Amount");
    jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 410, 110, 20));

    jLabel13.setText("Total Qty");
    jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 370, 70, 20));
    jPanel2.add(FreeItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 110, -1));

    NetAmount.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            NetAmountActionPerformed(evt);
        }
    });
    jPanel2.add(NetAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 410, 70, -1));
    jPanel2.add(TotalQty, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 370, 70, -1));

    jLabel14.setText("Total Item");
    jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 330, 70, 20));

    jLabel15.setText("Balance Amount");
    jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 330, 110, 20));

    jLabel16.setText("Total  Amount");
    jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 570, 110, 20));
    jPanel2.add(BalanceAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 330, 70, -1));

    CurrentAmount.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            CurrentAmountActionPerformed(evt);
        }
    });
    CurrentAmount.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyPressed(java.awt.event.KeyEvent evt) {
            CurrentAmountKeyPressed(evt);
        }
    });
    jPanel2.add(CurrentAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 370, 70, -1));

    ADD.setBackground(new java.awt.Color(0, 51, 153));
    ADD.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
    ADD.setForeground(new java.awt.Color(255, 255, 255));
    ADD.setText("ADD");
    ADD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    ADD.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            ADDActionPerformed(evt);
        }
    });
    jPanel2.add(ADD, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, 110, 40));

    jLabel17.setText("Current Amount");
    jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 370, 110, 20));
    jPanel2.add(TotalItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 330, 70, -1));
    jPanel2.add(ProductName, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 130, -1));

    Total.setForeground(new java.awt.Color(255, 255, 255));
    jPanel2.add(Total, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 70, 20));

    jTotalAmount1.setForeground(new java.awt.Color(204, 0, 0));
    jPanel2.add(jTotalAmount1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 570, 150, -1));

    Print1.setBackground(new java.awt.Color(0, 51, 153));
    Print1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
    Print1.setForeground(new java.awt.Color(255, 255, 255));
    Print1.setText("Pay&Print");
    Print1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    jPanel2.add(Print1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 470, 120, 40));

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(0, 955, Short.MAX_VALUE)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(0, 610, Short.MAX_VALUE)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)))
    );
    }// </editor-fold>//GEN-END:initComponents

    
Connection con1;
PreparedStatement insert;

  public int TotalPerform(int qty,int mrp,int Discount)
{
    double Total=(qty*mrp*Discount)/100;
    
       int tot=(int) (qty*mrp-Total);
    return tot;
}
    
    private void tb_load1(){
  DefaultTableModel model=(DefaultTableModel)jPurchaseeTable1.getModel();
       
  model.addRow(new Object[]{ProductName.getText(),Qty.getText(),
    FreeItem.getText(),MRP.getText(),Discount.getText(),Total.getText()});
    }
    
    public void getsum()
    {
        double totalamount=0;
       
        for(int i=0;i<jPurchaseeTable1.getRowCount();i++)
        {
           
            Float sum=Float.parseFloat(jPurchaseeTable1.getValueAt(i,5).toString());
        totalamount+=sum;
        }
        
    //TotalItem TotalQty NetAmount
  jTotalAmount1.setText(String.valueOf(totalamount));
    
    }
    public void productCount()
    {
        
        double totalproduct=0;
        for(int i=0;i<jPurchaseeTable1.getRowCount();i++)
        {
           
            //Float sum=Float.parseFloat(jPurchaseeTable1.getValueAt(i,0).toString());
        totalproduct++;
        }
        
        TotalItem.setText(String.valueOf(totalproduct));
    }
    public void getqtysum()
    {
        double totalamount=0;
       
        for(int i=0;i<jPurchaseeTable1.getRowCount();i++)
        {
           
            Float sum=Float.parseFloat(jPurchaseeTable1.getValueAt(i,1).toString());
        totalamount+=sum;
        }
        
    //TotalItem TotalQty NetAmount
  TotalQty.setText(String.valueOf(totalamount));
    
    }
    
 public void findbalance(){
     
 Double paid = Double.valueOf(CurrentAmount.getText());
       Double tot = Double.valueOf(NetAmount.getText());
       Double due ;
       
       due =  tot-paid ;
       
     BalanceAmount.setText(String.valueOf(due));
 
 }
    
    private void ADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDActionPerformed
        //Perform purchase
        /**
         * declare the variable for daily report
         */
        String productname=ProductName.getText();
        String qtY=Qty.getText();
        String Free=FreeItem.getText();
        
    String date=DATe.getText();
    int qty=Integer.parseInt(Qty.getText());
    int mrp=Integer.parseInt(MRP.getText());
   int DIscount=Integer.parseInt(Discount.getText());
  
    double total=TotalPerform(qty,mrp,DIscount);
   //  String amount=Double. toString(total);
    Total.setText(total+"");
    String amount= Total.getText();
            tb_load1();
            getsum();
            productCount();
            getqtysum();
    int totalamount=(int) Float.parseFloat(jTotalAmount1.getText());
  
    
  NetAmount.setText(String.valueOf(totalamount));
                                      
  try {
     
        
       con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=convertToNull","root","root@123");
  insert=con1.prepareStatement("INSERT INTO trade.dailyreport (PRODUCTNAME, QTY, AMOUNT, DATE) VALUES (?,?,?,?)");
 insert.setString(1, productname);
 insert.setString(2,qtY);
 insert.setString(3,amount);
 insert.setString(4,date); 
 insert.executeUpdate();
 
 
       
      } 
      catch (SQLException ex) {
            Logger.getLogger(PURCHASE.class.getName()).log(Level.SEVERE, null, ex);
        }  
  
  try {
     
        
       con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=convertToNull","root","root@123");
  insert=con1.prepareStatement("INSERT INTO trade.saleslist (PRODUCTNAME, QTY, `FREE`, MRP, DISCOUNT, TOTAL) 	VALUES (?, ?, ?, ?, ?, ?) ");
 insert.setString(1, productname);
 insert.setString(2,qtY);
 insert.setString(3,Free);
 insert.setInt(4,mrp); 
 insert.setInt(5,DIscount); 
 insert.setString(6,amount); 
 
 
 
 insert.executeUpdate();
 
 
       
      } 
      catch (SQLException ex) {
            Logger.getLogger(PURCHASE.class.getName()).log(Level.SEVERE, null, ex);
        }
         
  
  
  

        
    }//GEN-LAST:event_ADDActionPerformed


    private void CustomerNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CustomerNameKeyReleased
        
 
        
        
    }//GEN-LAST:event_CustomerNameKeyReleased

    private void CustomerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomerNameActionPerformed
        // TODO add your handling code here:
       try {
     
        
       con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=convertToNull","root","root@123");
  insert=con1.prepareStatement("SELECT * FROM Trade.CUSTOMERRECORD where NAMe=?");
  
  insert.setString(1,CustomerName.getText());
  ResultSet rs=insert.executeQuery();
  if(rs.next())
  {
      CustomerID.setText(rs.getString("ID"));
      PhoneNumber.setText(rs.getString("PHONENo"));
      
  }
       
      } 
      catch (SQLException ex) {
            Logger.getLogger(PURCHASE.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
    }//GEN-LAST:event_CustomerNameActionPerformed

    private void CustomerNameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CustomerNameMouseEntered
        // enable all feild
        
 
    }//GEN-LAST:event_CustomerNameMouseEntered

    private void CurrentAmountKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CurrentAmountKeyPressed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_CurrentAmountKeyPressed

    private void CurrentAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CurrentAmountActionPerformed
        // TODO add your handling code here:
         findbalance();
        
        /**
         * declare the variable for sales
         */
      int Customerid=Integer.parseInt(CustomerID.getText());
      String Customername=CustomerName.getText();
      String Customerphone=PhoneNumber.getText();
      
    String date=DATe.getText();
      String totalqty=TotalQty.getText();
    String totalitem=TotalItem.getText();
  String paymode=PayMode.getText();
   String balanceamount=BalanceAmount.getText();
   String currentamount=CurrentAmount.getText();
        String netamount=NetAmount.getText();
        
        try {
     
        
       con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=convertToNull","root","root@123");
  insert=con1.prepareStatement("INSERT INTO trade.sales (CUSID, customername, CUSTOMERPh, totalqty, totalitems, paymode, balanceamount, currentamount, netamount, `DATE`) VALUES (?,?,?,?,?,?,?,?,?,?)");
 insert.setInt(1, Customerid);
 insert.setString(2,Customername);
 insert.setString(3,Customerphone);
 insert.setString(4,totalqty); 
 insert.setString(5,totalitem);
 insert.setString(6,paymode);
 insert.setString(7,balanceamount);
 insert.setString(8,currentamount);
 insert.setString(9,netamount);
 insert.setString(10,date);
 insert.executeUpdate();
 
 
       
      } 
      catch (SQLException ex) {
            Logger.getLogger(PURCHASE.class.getName()).log(Level.SEVERE, null, ex);
        }
         try {
     
        
       con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=convertToNull","root","root@123");
  insert=con1.prepareStatement("INSERT INTO trade.CUSTOMERDUE (CUSID, CUSTOMERNAME, CUSTOMERPH, TOTALQTY, TOTALITEMS, PAYMODE, BALANCEAMOUNT, CURRENTAMOUNT, NETAMOUNT, DATE) VALUES (?,?,?,?,?,?,?,?,?,?)");
 insert.setInt(1, Customerid);
 insert.setString(2,Customername);
 insert.setString(3,Customerphone);
 insert.setString(4,totalqty); 
 insert.setString(5,totalitem);
 insert.setString(6,paymode);
 insert.setString(7,balanceamount);
 insert.setString(8,currentamount);
 insert.setString(9,netamount);
 insert.setString(10,date);
 insert.executeUpdate();
 
 
       
      } 
      catch (SQLException ex) {
            Logger.getLogger(PURCHASE.class.getName()).log(Level.SEVERE, null, ex);
        }
         
         
    }//GEN-LAST:event_CurrentAmountActionPerformed

    private void NetAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NetAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NetAmountActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADD;
    private javax.swing.JTextField BalanceAmount;
    private javax.swing.JTextField CurrentAmount;
    private javax.swing.JLabel CustomerID;
    private javax.swing.JTextField CustomerName;
    private datechooser.beans.DateChooserCombo DATe;
    private javax.swing.JTextField Discount;
    private javax.swing.JTextField FreeItem;
    private javax.swing.JTextField MRP;
    private javax.swing.JTextField NetAmount;
    private javax.swing.JTextField PayMode;
    private javax.swing.JTextField PhoneNumber;
    private javax.swing.JButton Print1;
    private javax.swing.JTextField ProductName;
    private javax.swing.JTextField Qty;
    private javax.swing.JLabel Total;
    private javax.swing.JTextField TotalItem;
    private javax.swing.JTextField TotalQty;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTable jPurchaseeTable1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTotalAmount1;
    // End of variables declaration//GEN-END:variables
}
