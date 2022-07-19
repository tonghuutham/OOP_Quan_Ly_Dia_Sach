
import DB.ConnectionDB;
import java.sql.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.Bill;
import models.KhachHang;
import models.NhanVien;
import models.NhapKho;
import models.Product;
import viewmodel.BillDAO;
import viewmodel.BillDAOImpl;
import viewmodel.KhachHangDAO;
import viewmodel.KhachHangDAOImpl;
import viewmodel.NhanVienDAO;
import viewmodel.NhanVienDAOImpl;
import viewmodel.ProductDAO;
import viewmodel.ProductDAOImpl;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Ling
 */
public class BillUI extends javax.swing.JFrame {
    
    /**
     * Creates new form Bill
     */
    public int finalTotal=0;    
    private DefaultTableModel dtm = null;
    List<Bill> listBill = new ArrayList<>();
    Product product;
    NhanVien nhanVien;
    KhachHang khachHang;
    LocalDateTime dateTime = LocalDateTime.now();
    int sum = 0;
    
    public BillUI() {
        String title[] = {"ID sản phẩm","Tên sản phẩm", "Số lượng", "Đơn giá", "Loại"};
        dtm = new DefaultTableModel(null, title);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        timeNow = new javax.swing.JLabel();
        dateNow = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(java.awt.Color.black);
        setLocation(new java.awt.Point(70, 15));
        setMaximumSize(new java.awt.Dimension(1220, 700));
        setMinimumSize(new java.awt.Dimension(1220, 700));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1180, 700));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 1, 48)); // NOI18N
        jLabel1.setText("BILL");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(551, 0, -1, -1));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back.png"))); // NOI18N
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setFocusPainted(false);
        jButton4.setRequestFocusEnabled(false);
        jButton4.setVerifyInputWhenFocusTarget(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 45, 45));

        jLabel2.setText("DATE:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 10, -1, -1));

        jLabel3.setText("TIME:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 32, -1, -1));

        timeNow.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        timeNow.setText("4:36:40");
        getContentPane().add(timeNow, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 30, -1, -1));

        dateNow.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        dateNow.setText("27/6/2022");
        getContentPane().add(dateNow, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 8, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 63, 710, 10));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(731, 64, 10, 620));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 62, 450, 360));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel6.setText("Họ tên:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, 30));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 290, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel7.setText("SĐT:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, -1, 30));

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 130, 220, 30));
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 210, 710, 10));

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton1.setText("Thêm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 170, 90, 30));

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton2.setText("Sửa");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 170, 90, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(200, 0, 0));
        jLabel8.setText("THÔNG BÁO:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 90, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("NHẬP SẢN PHẨM");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel10.setText("ID:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 25, 30));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 250, 30));

        jButton3.setBackground(new java.awt.Color(242, 242, 242));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search.png"))); // NOI18N
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 290, 30, 30));
        getContentPane().add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 120, 710, 10));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel11.setText("NHÂN VIÊN");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel12.setText("KHÔNG CÓ");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 76, 270, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel13.setText("TÊN SẢN PHẨM:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, 30));
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, 440, 30));
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, 200, 30));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel14.setText("LOẠI:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, -1, 30));
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 440, 200, 30));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel15.setText("SỐ LƯỢNG:");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, -1, 30));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel16.setText("ĐƠN GIÁ:");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, -1, 30));
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 490, 200, 30));

        jButton5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton5.setText("Thêm");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 650, 90, 30));

        jButton6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton6.setText("Reset");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 650, 90, 30));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel17.setText("TOTAL:");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 455, -1, 30));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel18.setText("PAID AMOUNT:");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 505, -1, 30));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel19.setText("RETURN AMOUNT:");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 555, -1, 30));

        jTextField8.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        jTextField8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField8KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField8KeyReleased(evt);
            }
        });
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 505, 240, 30));

        jTextField9.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        getContentPane().add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 455, 240, 30));

        jTextField10.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        getContentPane().add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 555, 240, 30));

        jButton7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton7.setText("Xong");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 650, 90, 30));

        jButton8.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton8.setText("Delete");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 650, 90, 30));

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/detail.png"))); // NOI18N
        jButton9.setBorderPainted(false);
        jButton9.setContentAreaFilled(false);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 640, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(210, 0, 0));
        jLabel4.setText("THÔNG BÁO");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 570, -1, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(210, 0, 0));
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 570, -1, 30));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(200, 0, 0));
        jLabel20.setText("jLabel20");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 300, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        new Home().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
        String sdt = jTextField2.getText();
        ConnectionDB connector = new ConnectionDB();
        Connection con = connector.getConnection();
        KhachHangDAO khDAO = new KhachHangDAOImpl();
        try
        {
            
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from khach_hang where sdt like '%"+sdt+"'");
            if(rs.next())
            {
                jTextField1.setText(rs.getString(2));
                jTextField2.setText(rs.getString(3));
                khachHang = khDAO.getByID(rs.getInt(1));
                jLabel8.setVisible(false);
                jLabel20.setVisible(false);
            }
            else 
            {
                jLabel8.setVisible(true);
                jLabel20.setText("Không tìm thấy thông tin khách hàng");
                jLabel20.setVisible(true);
                khachHang = null;
                jTextField1.setText("");
            }
        }
        catch(Exception e)
        {
           JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new AddKhachHang().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        ProductDAO pdDAO = new ProductDAOImpl();
       
        product = pdDAO.getByID(Integer.valueOf(jTextField3.getText()));
        
        if (product == null){
            jLabel5.setText("Không tìm thấy sản phẩm, thêm sản phẩm mới");
            jLabel4.setVisible(true);
            jLabel5.setVisible(true);
            jTextField4.setText("");
            jTextField5.setText("");
            jTextField7.setText("");
            jTextField4.setEditable(true);
            jTextField5.setEditable(true);
            return;
        }
        jTextField4.setText(product.getName());
        jTextField5.setText(product.getType());
        jTextField6.setText("");
        jTextField7.setText(String.valueOf(product.getOutPrice()));
        jLabel4.setVisible(false);
        jLabel5.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new UpdateKhachHang().setVisible(true);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
//        int paid_amount = Integer.valueOf(jTextField8.getText());
//        
//        jTextField10.setText(String.valueOf(sum - paid_amount));
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        new BilllListUI().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        ProductDAO pdDAO = new ProductDAOImpl();
        String Id = jTextField3.getText();
        if ("".equals(Id)){
            jLabel4.setVisible(true);
            jLabel5.setText("Không được bỏ trống ID");
            jLabel5.setVisible(true);
            return;
        }
        if ("".equals(jTextField6.getText())){
            jLabel4.setVisible(true);
            jLabel5.setText("Nhập số lượng!");
            jLabel5.setVisible(true);
            return;
        }
        
        int so_luong = Integer.valueOf(jTextField6.getText());
        
        if (product.getAmount() < so_luong){
            jLabel4.setVisible(true);
            jLabel5.setText("Số lượng không đủ");
            jLabel5.setVisible(true);
            return;
        }
        if (khachHang == null){
            khachHang = new KhachHang();
        }
        // NhanVien nhanVien, Product sanPham, KhachHang khachHang, int soLuong, int donGia,LocalDateTime date
        Bill bill = new Bill(nhanVien, product, khachHang, so_luong, product.getOutPrice(), dateTime);
        listBill.add(bill);
        
        String data[][] = new String[1][5];
        data[0][0] = String.valueOf(product.getID());
        data[0][1] = product.getName();
        data[0][2] = String.valueOf(bill.getSoLuong());
        data[0][3] = String.valueOf(bill.getDonGia());
        data[0][4] = product.getType();
        sum += bill.getSoLuong()*bill.getDonGia();
        dtm.addRow(data[0]);
        
        jTable1.setModel(dtm);
        
        jTextField9.setText(String.valueOf(formatDecimal(sum)));
        product = null;
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
        
        if (!"".equals(jTextField8.getText())){
            int paid_amount = Integer.valueOf(jTextField8.getText());  
            int return_amount = paid_amount - sum;
            jTextField10.setText(formatDecimal(return_amount));
        }
        
    }//GEN-LAST:event_jButton5ActionPerformed
    public String formatDecimal(int number){
        return String.format("%,.2f", (double)number);
    }
    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        jTable1.setModel(dtm);
        jLabel4.setVisible(false);
        jLabel5.setVisible(false);
        jLabel8.setVisible(false);
        jLabel20.setVisible(false);
        jTextField4.setEditable(false);
        jTextField5.setEditable(false);
        jTextField7.setEditable(false);
        jTextField9.setEditable(false);
        jTextField10.setEditable(false);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-YYYY");
        dateNow.setText(dateTime.format(dtf));
        dtf = DateTimeFormatter.ofPattern("HH:mm");
        timeNow.setText(dateTime.format(dtf));
        NhanVienDAO nvDAO = new NhanVienDAOImpl();
        List<NhanVien> nv_list = nvDAO.showAll();
        for (NhanVien nv: nv_list){
            if (nv.getHoatDong() == 1){
                nhanVien = nv;
                jLabel12.setText(nv.getTen().toUpperCase());
                break;
            }
        }
    }//GEN-LAST:event_formComponentShown

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
        product = null;
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        int row = jTable1.getSelectedRow();
        if(row != -1) {
            // remove selected row from the model
            Bill bill = listBill.remove(row);
            sum -= bill.getDonGia()*bill.getSoLuong();
            jTextField9.setText(String.valueOf(formatDecimal(sum)));
            dtm.removeRow(row);
        }
        if (!"".equals(jTextField8.getText())){
            int paid_amount = Integer.valueOf(jTextField8.getText());  
            int return_amount = paid_amount - sum;
            jTextField10.setText(formatDecimal(return_amount));
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jTextField8KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField8KeyReleased
        // TODO add your handling code here:
        int paid_amount = Integer.valueOf(jTextField8.getText());
       
        int return_amount = paid_amount - sum;
        jTextField10.setText(formatDecimal(return_amount));
    }//GEN-LAST:event_jTextField8KeyReleased

    private void jTextField8KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField8KeyPressed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_jTextField8KeyPressed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:

        BillDAO billDAO = new BillDAOImpl();
        ProductDAO pdDAO = new ProductDAOImpl();
        Product pd;
        for (Bill bill: listBill){
            billDAO.add(bill);
            
            pd = bill.getSanPham();
            pd.setAmount(pd.getAmount()-bill.getSoLuong());
            pdDAO.update(pd);
        }
        setVisible(false);
        new BillUI().setVisible(true);
        
    }//GEN-LAST:event_jButton7ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BillUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BillUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BillUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BillUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new BillUI().setVisible(true);
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dateNow;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JLabel timeNow;
    // End of variables declaration//GEN-END:variables
}