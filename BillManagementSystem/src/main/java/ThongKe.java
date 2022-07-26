
import DB.ConnectionDB;
import java.sql.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFormattedTextField;
import javax.swing.table.DefaultTableModel;
import viewmodel.ProductDAO;
import viewmodel.ProductDAOImpl;
import models.*;
import viewmodel.*;
import viewmodel.DAO.IServiceDAO;
import viewmodel.DAO.ServiceDAO;
import viewmodel.Mapper.IMapper;
import viewmodel.Mapper.NhapKhoMapper;
import viewmodel.Mapper.ProductMapper;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Ling
 */
public class ThongKe extends javax.swing.JFrame {

    /**
     * Creates new form ThongKe
     */
    public ThongKe() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        jFormattedTextField2 = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(70, 20));
        setMaximumSize(new java.awt.Dimension(1200, 700));
        setMinimumSize(new java.awt.Dimension(1200, 700));
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 40)); // NOI18N
        jLabel1.setText("THỐNG KÊ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, 220, -1));

        jComboBox1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tồn kho", "Nhập kho", "Thống kê theo doanh thu", "Thống kê theo lượng sản phẩm" }));
        jComboBox1.setVerifyInputWhenFocusTarget(false);
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 110, 30));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 55, 1140, 10));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("Tăng dần");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 70, -1, 30));

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jRadioButton2.setText("Giảm dần");
        getContentPane().add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 70, -1, 30));

        jRadioButton3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jRadioButton3.setSelected(true);
        jRadioButton3.setText("Đĩa nhạc");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, -1, 30));

        jRadioButton4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jRadioButton4.setSelected(true);
        jRadioButton4.setText("Sách");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, -1, 30));

        jRadioButton5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jRadioButton5.setSelected(true);
        jRadioButton5.setText("Đĩa phim");
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, -1, 30));

        jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("y/MM/dd"))));
        jFormattedTextField1.setToolTipText("");
        jFormattedTextField1.setActionCommand("<Not Set>");
        jFormattedTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jFormattedTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 73, 80, 25));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel2.setText("Từ ngày");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 70, -1, 30));

        jFormattedTextField2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("y/MM/dd"))));
        jFormattedTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jFormattedTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 73, 80, 25));

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel3.setText("Đến ngày");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 70, -1, 30));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 1140, 530));

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(100, 100, 100));
        jLabel4.setText("DOANH THU");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 650, 150, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(50, 50, 50));
        jLabel5.setText("100.000.000.000");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 650, -1, 30));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 680, 430, 20));

        jButton1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        jButton1.setText("Xong");
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 70, 80, 30));

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
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 45, 45));

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(70, 70, 70));
        jLabel6.setText("VNĐ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 650, -1, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(100, 100, 100));
        jLabel7.setText("LỢI NHUẬN");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 650, 140, -1));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 680, 410, 10));

        jLabel10.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(70, 70, 70));
        jLabel10.setText("VNĐ");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 650, -1, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(50, 50, 50));
        jLabel11.setText("100.000.000.000");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 650, -1, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton5ActionPerformed

    private void jFormattedTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField1ActionPerformed

    private void jFormattedTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String stt = "";
        String sql = "";
        int select = jComboBox1.getSelectedIndex();
        Boolean sachBl = jRadioButton4.isSelected();
        Boolean diaPhimBl = jRadioButton5.isSelected();
        Boolean diaNhacBl = jRadioButton3.isSelected();
        if (jRadioButton1.isSelected()){
            stt = "ASC";
        }else{
            stt = "DESC";
        }
        
        String date1 = jFormattedTextField1.getText();
        if ("".equals(date1) || date1 == null){
            date1 = "1990/01/01";
        }
        
        String date2 = jFormattedTextField2.getText();
        if ("".equals(date2) || date2 == null){
            date2 = "2222/01/01";
        }
    switch(select){
    case 0 -> {
        jLabel4.setVisible(false);
        jLabel10.setVisible(false);
        jSeparator2.setVisible(false);
        jSeparator3.setVisible(false);
        jLabel11.setVisible(false);
        jLabel5.setVisible(false);
        jLabel6.setVisible(false);
        jLabel7.setVisible(false);
        sql = """
                      select san_pham.id, ten, don_gia, gia_ban, loai, san_pham.so_luong, the_loai, NULL as tac_gia, NULL as nha_xuat_ban, NULL as dich_gia, NULL as dao_dien, NULL as nha_san_xuat, NULL as ca_si, NULL as ban_nhac from san_pham, %s, nhap_hang where san_pham.ID = %s.ID and nhap_hang.ID_san_pham = san_pham.id and date >= all(select date from nhap_hang where nhap_hang.ID_san_pham = san_pham.id)
                      UNION
                      select san_pham.id, ten, don_gia, gia_ban, loai, san_pham.so_luong, the_loai, NULL as tac_gia, NULL as nha_xuat_ban, NULL as dich_gia, NULL as dao_dien, NULL as nha_san_xuat, NULL as ca_si, NULL as ban_nhac from san_pham, %s, nhap_hang where san_pham.ID = %s.ID and nhap_hang.ID_san_pham = san_pham.id and date >= all(select date from nhap_hang where nhap_hang.ID_san_pham = san_pham.id)
                      UNION
                      select san_pham.id, ten, don_gia, gia_ban, loai, san_pham.so_luong, the_loai, NULL as tac_gia, NULL as nha_xuat_ban, NULL as dich_gia, NULL as dao_dien, NULL as nha_san_xuat, NULL as ca_si, NULL as ban_nhac from san_pham, %s, nhap_hang where san_pham.ID = %s.ID and nhap_hang.ID_san_pham = san_pham.id and date >= all(select date from nhap_hang where nhap_hang.ID_san_pham = san_pham.id)""";
        sql = format0(sql, sachBl, diaPhimBl, diaNhacBl);
        IServiceDAO pdDao = new ServiceDAO() {};
        IMapper<Product> mapper = new ProductMapper();
        List<Product> pd_list = pdDao.query(sql, mapper);
        String[] columnName = {"ID", "Tên sản phẩm", "Giá nhập", "Giá bán", "Số lượng", "Thể loại", "Loại"};
        String data[][] = new String[pd_list.size()][7];
        int i = 0;
        for (Product pd : pd_list){
            data[i][0] = String.valueOf(pd.getID());
            data[i][1] = pd.getName();
            data[i][2] = String.valueOf(pd.getInPrice());
            data[i][3] = String.valueOf(pd.getOutPrice());
            data[i][4] = String.valueOf(pd.getAmount());
            data[i][5] = pd.getCategory();
            data[i][6] = pd.getType();
            i++;
        }
        DefaultTableModel dtm = new DefaultTableModel(data, columnName);
        jTable1.setModel(dtm);
    }
    case 1 -> {
        sql = "select nhap_hang.id, ID_nhan_vien, ID_NCC, ID_san_pham, nhap_hang.so_luong, don_gia, date, loai from nhap_hang, san_pham, nhan_vien, ncc where ID_san_pham = san_pham.ID and ID_nhan_vien = nhan_vien.ID and ID_NCC = ncc.ID and (loai = '%s' or loai = '%s' or loai = '%s') and date <= '"+date2+"' and date >= '"+date1+"' order by date "+stt;
        sql = format1(sql, sachBl, diaPhimBl, diaNhacBl);
        
        IServiceDAO Dao = new ServiceDAO() {};
        NhanVienDAO nvDAO = new NhanVienDAOImpl();
        NCCDAO nccDAO = new NCCDAOImpl();
        ProductDAO pdDAO = new ProductDAOImpl();
        IMapper<NhapKho> mapper = new NhapKhoMapper();
        
        List<NhapKho> nk_list = Dao.query(sql, mapper);
        
        String[] columnName = {"ID", "Tên nhân viên", "Tên nhà cung cấp", "Tên sản phẩm", "Số lượng", "Đơn giá", "Loại", "Ngày nhập"};
        String data[][] = new String[nk_list.size()][8];
        int i = 0;
        int sum = 0;
        for (NhapKho nk : nk_list){
            data[i][0] = String.valueOf(nk.getID());
            data[i][1] = nvDAO.getByID(nk.getNhanVien().getID()).getTen();
            data[i][2] = nccDAO.getByID(nk.getNCC().getID()).getTen();
            data[i][3] = pdDAO.getByID(nk.getSanPham().getID()).getName();
            data[i][4] = String.valueOf(nk.getSoLuong());
            data[i][5] = String.valueOf(nk.getGiaNhap());
            data[i][6] = nk.getSanPham().getType();
            data[i][7] = nk.getNgayNhap().toString();
            sum += nk.getSoLuong()*nk.getGiaNhap();
            i++;
        }
        jLabel4.setText("Tổng tiền");
        jLabel11.setText(formatDecimal(sum));
        jLabel4.setVisible(true);
        jLabel5.setVisible(false);
        jLabel6.setVisible(false);
        jLabel7.setVisible(false);
        jLabel10.setVisible(true);
        jLabel11.setVisible(true);
        jSeparator2.setVisible(true);
        jSeparator3.setVisible(false);
        DefaultTableModel dtm = new DefaultTableModel(data, columnName);
        jTable1.setModel(dtm);
    }
    case 2 -> {
        sql = "select ban_hang.ID_san_pham as ID,ten, the_loai, loai,sum(ban_hang.so_luong) as amount,nhap_hang.don_gia as gia_nhap, ban_hang.don_gia as gia_ban, sum(ban_hang.so_luong*ban_hang.don_gia) as tong_tien from san_pham, ban_hang, nhap_hang "+
                "where san_pham.ID = ban_hang.ID_san_pham "+
                "and  san_pham.ID = nhap_hang.ID_san_pham "+
                "and ban_hang.date < '"+date2+"' and ban_hang.date > '"+date1+"' "+
                "and (loai = '%s' or loai = '%s' or loai = '%s') "+
                "and ban_hang.date > nhap_hang.date "+
                "and nhap_hang.date >= all(select date from nhap_hang where nhap_hang.ID_san_pham = san_pham.ID and date < ban_hang.date) "+
                "group by ID, ten, the_loai, loai, gia_nhap, gia_ban "+
                "order by tong_tien "+ stt;
        
        sql = format1(sql, sachBl, diaPhimBl, diaNhacBl);
        System.out.println(sql);
        ConnectionDB connector = new ConnectionDB();
        
        
        Connection con = connector.getConnection();
            try {
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(sql);
                int i = 0;
                String title[] = {"ID", "Tên sản phẩm", "Thể loại", "Loại", "Số lượng", "Tổng tiền"};
                String data[][] = new String[1][6];
                DefaultTableModel dtm = new DefaultTableModel(null, title);
                int sum = 0;
                int thu_nhap = 0;
                while(rs.next()){
                    data[0][0] = String.valueOf(rs.getInt("ID"));
                    data[0][1] = rs.getString("ten");
                    data[0][2] = rs.getString("the_loai");
                    data[0][3] = rs.getString("loai");
                    data[0][4] = String.valueOf(rs.getInt("amount"));      
                    data[0][5] = String.valueOf(rs.getInt("tong_tien"));
                    sum += rs.getInt("tong_tien");
                    thu_nhap += rs.getInt("tong_tien") - rs.getInt("gia_nhap")*rs.getInt("amount");
                    dtm.addRow(data[0]);
                }
                System.out.println(thu_nhap);
                jLabel4.setText("Doanh thu");
                jLabel11.setText(formatDecimal(sum));
                jLabel5.setText(formatDecimal(thu_nhap));
                jLabel4.setVisible(true);
                jLabel5.setVisible(true);
                jLabel6.setVisible(true);
                jLabel7.setVisible(true);
                jLabel10.setVisible(true);
                jLabel11.setVisible(true);

                jSeparator2.setVisible(true);
                jTable1.setModel(dtm);
                
            } catch (SQLException ex) {
                Logger.getLogger(ThongKe.class.getName()).log(Level.SEVERE, null, ex);
            }finally{
                try{
                    con.close();
                }catch(SQLException e){       
                }
            }
    }
    case 3 -> {
        
        sql = "select ban_hang.ID_san_pham as ID,ten, the_loai, loai,sum(ban_hang.so_luong) as amount,nhap_hang.don_gia as gia_nhap, ban_hang.don_gia as gia_ban, sum(ban_hang.so_luong*ban_hang.don_gia) as tong_tien from san_pham, ban_hang, nhap_hang "+
                "where san_pham.ID = ban_hang.ID_san_pham "+
                "and  san_pham.ID = nhap_hang.ID_san_pham "+
                "and ban_hang.date < '"+date2+"' and ban_hang.date > '"+date1+"' "+
                "and (loai = '%s' or loai = '%s' or loai = '%s') "+
                "and ban_hang.date > nhap_hang.date "+
                "and nhap_hang.date >= all(select date from nhap_hang where nhap_hang.ID_san_pham = san_pham.ID and date < ban_hang.date) "+
                "group by ID, ten, the_loai, loai, gia_nhap, gia_ban "+
                "order by amount "+ stt;
        
        sql = format1(sql, sachBl, diaPhimBl, diaNhacBl);
        
        ConnectionDB connector = new ConnectionDB();
        
        
        Connection con = connector.getConnection();
            try {
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(sql);
                int i = 0;
                String title[] = {"ID", "Tên sản phẩm", "Thể loại", "Loại", "Số lượng", "Tổng tiền"};
                String data[][] = new String[1][6];
                DefaultTableModel dtm = new DefaultTableModel(null, title);
                int sum = 0;
                int thu_nhap = 0;
                while(rs.next()){
                    data[0][0] = String.valueOf(rs.getInt("ID"));
                    data[0][1] = rs.getString("ten");
                    data[0][2] = rs.getString("the_loai");
                    data[0][3] = rs.getString("loai");
                    data[0][4] = String.valueOf(rs.getInt("amount"));      
                    data[0][5] = String.valueOf(rs.getInt("tong_tien"));
                    sum += rs.getInt("tong_tien");
                    thu_nhap += rs.getInt("tong_tien") - rs.getInt("gia_nhap")*rs.getInt("amount");
                    dtm.addRow(data[0]);
                }
                System.out.println(thu_nhap);
                jLabel4.setText("Doanh thu");
                jLabel11.setText(formatDecimal(sum));
                jLabel5.setText(formatDecimal(thu_nhap));
                jLabel4.setVisible(true);
                jLabel5.setVisible(true);
                jLabel6.setVisible(true);
                jLabel7.setVisible(true);
                jLabel10.setVisible(true);
                jLabel11.setVisible(true);

                jSeparator2.setVisible(true);
                jTable1.setModel(dtm);
                
            } catch (SQLException ex) {
                Logger.getLogger(ThongKe.class.getName()).log(Level.SEVERE, null, ex);
            }finally{
                try{
                    con.close();
                }catch(SQLException e){       
                }
            }
        }
}
// san_pham.id, ten, don_gia, gia_ban, san_pham.so_luong, the_loai, date

        
    }//GEN-LAST:event_jButton1ActionPerformed
    public String formatDecimal(int number){
        return String.format("%,.2f", (double)number);
    }
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        new Home().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        jLabel4.setVisible(false);
        jLabel5.setVisible(false);
        jLabel6.setVisible(false);
        jSeparator2.setVisible(false);
        jLabel7.setVisible(false);
        jLabel10.setVisible(false);
        jLabel11.setVisible(false);
        jSeparator3.setVisible(false);
    }//GEN-LAST:event_formComponentShown

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton4ActionPerformed
    public String format0(String sql, Boolean sachBl, Boolean diaPhimBl, Boolean diaNhacBl){
        if (sachBl == true){
            if (diaPhimBl == true){
                if (diaNhacBl == true){
                    // 123
                    return String.format(sql, "sach","sach", "dia_phim","dia_phim", "dia_nhac", "dia_nhac");
                }else{
                    // 12
                    return String.format(sql, "sach","sach", "dia_phim","dia_phim", "sach", "sach");
                }
            }else{
                if (diaNhacBl == true){
                    // 13
                    return String.format(sql, "sach","sach", "sach","sach", "dia_nhac", "dia_nhac");
                }else{
                    // 1
                    return String.format(sql, "sach","sach", "sach","sach", "sach", "sach");
                }
            }
        }else{
            if (diaPhimBl == true){
                if (diaNhacBl == true){
                    // 23
                    return String.format(sql, "dia_phim","dia_phim", "dia_phim","dia_phim", "dia_nhac", "dia_nhac");
                }else{
                    // 2
                    return String.format(sql, "dia_phim","dia_phim", "dia_phim","dia_phim", "dia_phim", "dia_phim");
                }
            }else{
                // 3
                return String.format(sql, "dia_nhac","dia_nhac", "dia_nhac","dia_nhac", "dia_nhac", "dia_nhac");
            }
        }
    }
    public String format1(String sql, Boolean sachBl, Boolean diaPhimBl, Boolean diaNhacBl){
        if (sachBl == true){
            if (diaPhimBl == true){
                if (diaNhacBl == true){
                    // 123
                    return String.format(sql, "sách","đĩa phim", "đĩa nhạc");
                }else{
                    // 12
                    return String.format(sql, "sách", "đĩa phim","sách");
                }
            }else{
                if (diaNhacBl == true){
                    // 13
                    return String.format(sql, "sách","sách", "đĩa nhạc");
                }else{
                    // 1
                    return String.format(sql, "sách","sách", "sách");
                }
            }
        }else{
            if (diaPhimBl == true){
                if (diaNhacBl == true){
                    // 23
                    return String.format(sql, "đĩa phim","đĩa phim", "đĩa nhạc");
                }else{
                    // 2
                    return String.format(sql, "đĩa phim","đĩa phim", "đĩa phim");
                }
            }else{
                // 3
                return String.format(sql, "đĩa nhạc", "đĩa nhạc", "đĩa nhạc");
            }
        }
    }
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
            java.util.logging.Logger.getLogger(ThongKe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThongKe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThongKe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThongKe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThongKe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JFormattedTextField jFormattedTextField2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
