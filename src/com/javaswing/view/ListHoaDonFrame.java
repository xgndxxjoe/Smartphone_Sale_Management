/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaswing.view;

import com.javaswing.model.HoaDon;
import com.javaswing.service.HoaDonService;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author phamn
 */
public class ListHoaDonFrame extends javax.swing.JFrame {

    HoaDon hoaDon;
    HoaDonService hoaDonService;
    DefaultTableModel defaultTableModel;
    
    public ListHoaDonFrame() {
        initComponents();
        
        setLocation(380, 160);
        
        hoaDon = new HoaDon();
        hoaDonService = new HoaDonService();
        defaultTableModel = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        
        ListHoaDonTable.setModel(defaultTableModel);
        
        defaultTableModel.addColumn("Ma HD");
        defaultTableModel.addColumn("Ten KH");
        defaultTableModel.addColumn("Tong Tien");
        defaultTableModel.addColumn("Ngay Tao");
        defaultTableModel.addColumn("Ghi Chu");
        defaultTableModel.addColumn("Ten Kho");
        
        List<HoaDon> list = hoaDonService.getAllHoaDon();
            float doanhThu = 0;
            for (HoaDon hd : list) {
                defaultTableModel.addRow(new Object[]{hd.getMaHD(), hd.getTenKH(), 
                hd.getTongTien(), hd.getNgayTao(), hd.getGhiChu(),
                hd.getTenKho()});
                doanhThu += hd.getTongTien();
            }
        doanthuTextField.setText("" + doanhThu);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        ListHoaDonTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        refreshButton = new javax.swing.JButton();
        inputTextField = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        monthComborBox = new javax.swing.JComboBox<>();
        filterButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        doanthuTextField = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ListHoaDonTable.setModel(new javax.swing.table.DefaultTableModel(
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
        ListHoaDonTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(ListHoaDonTable);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("THONG KE HOA DON");

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        refreshButton.setText("Refresh Table");
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });

        searchButton.setText("Tìm kiếm");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        monthComborBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Thang 1", "Thang 2", "Thang 3", "Thang 4", "Thang 5", "Thang 6", "Thang 7", "Thang 8", "Thang 9", "Thang 10", "Thang 11", "Thang 12" }));
        monthComborBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthComborBoxActionPerformed(evt);
            }
        });

        filterButton.setText("Loc Hoa Don");
        filterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filterButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Tong Doanh thu:");

        doanthuTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doanthuTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jSeparator2)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(127, 127, 127)
                        .addComponent(backButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(doanthuTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(refreshButton))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(filterButton)
                                .addGap(18, 18, 18)
                                .addComponent(monthComborBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(inputTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(searchButton)))))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(backButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButton)
                    .addComponent(monthComborBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(filterButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(refreshButton)
                    .addComponent(doanthuTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        new MenuManage().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        defaultTableModel.setRowCount(0); // Xoa het du lieu trong bang hien tai
        List<HoaDon> list = new ArrayList<>();
        list = hoaDonService.getAllHoaDon();
        float doanhThu = 0;
        for (HoaDon hd : list) {
            defaultTableModel.addRow(new Object[]{hd.getMaHD(), hd.getTenKH(), 
            hd.getTongTien(), hd.getNgayTao(), hd.getGhiChu(),
            hd.getTenKho()});
            doanhThu += hd.getTongTien();
        }
        doanthuTextField.setText("" + doanhThu);    
        inputTextField.setText("");
        
        
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        defaultTableModel.setRowCount(0);
        List<HoaDon> list = new ArrayList<>();
        list = hoaDonService.findByName(inputTextField.getText());
        float doanhThu = 0;
        for (HoaDon hd : list) {
            defaultTableModel.addRow(new Object[]{hd.getMaHD(), hd.getTenKH(), 
            hd.getTongTien(), hd.getNgayTao(), hd.getGhiChu(),
            hd.getTenKho()});
            doanhThu += hd.getTongTien();
        }
        doanthuTextField.setText("" + doanhThu);
        
    }//GEN-LAST:event_searchButtonActionPerformed

    private void filterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filterButtonActionPerformed
        defaultTableModel.setRowCount(0);
        List<HoaDon> list = new ArrayList<>();
        int monthSelected = monthComborBox.getSelectedIndex();
        
        list = hoaDonService.getAllHoaDon();
        float doanhThu = 0;
        for (HoaDon hd : list) {
            if(monthSelected == 0 && hd.getNgayTao().getMonth() == 0){
                defaultTableModel.addRow(new Object[]{hd.getMaHD(), hd.getTenKH(), 
                hd.getTongTien(), hd.getNgayTao(), hd.getGhiChu(),
                hd.getTenKho()});
                doanhThu += hd.getTongTien();
            }
            if(monthSelected == 1 && hd.getNgayTao().getMonth() == 1){
                defaultTableModel.addRow(new Object[]{hd.getMaHD(), hd.getTenKH(), 
                hd.getTongTien(), hd.getNgayTao(), hd.getGhiChu(),
                hd.getTenKho()});
                doanhThu += hd.getTongTien();
            }
            if(monthSelected == 2 && hd.getNgayTao().getMonth() == 2){
                defaultTableModel.addRow(new Object[]{hd.getMaHD(), hd.getTenKH(), 
                hd.getTongTien(), hd.getNgayTao(), hd.getGhiChu(),
                hd.getTenKho()});
                doanhThu += hd.getTongTien();
            }
            if(monthSelected == 3 && hd.getNgayTao().getMonth() == 3){
                defaultTableModel.addRow(new Object[]{hd.getMaHD(), hd.getTenKH(), 
                hd.getTongTien(), hd.getNgayTao(), hd.getGhiChu(),
                hd.getTenKho()});
                doanhThu += hd.getTongTien();
            }
            if(monthSelected == 4 && hd.getNgayTao().getMonth() == 4){
                defaultTableModel.addRow(new Object[]{hd.getMaHD(), hd.getTenKH(), 
                hd.getTongTien(), hd.getNgayTao(), hd.getGhiChu(),
                hd.getTenKho()});
                doanhThu += hd.getTongTien();
            }
            if(monthSelected == 5 && hd.getNgayTao().getMonth() == 5){
                defaultTableModel.addRow(new Object[]{hd.getMaHD(), hd.getTenKH(), 
                hd.getTongTien(), hd.getNgayTao(), hd.getGhiChu(),
                hd.getTenKho()});
                doanhThu += hd.getTongTien();
            }
            if(monthSelected == 6 && hd.getNgayTao().getMonth() == 6){
                defaultTableModel.addRow(new Object[]{hd.getMaHD(), hd.getTenKH(), 
                hd.getTongTien(), hd.getNgayTao(), hd.getGhiChu(),
                hd.getTenKho()});
                doanhThu += hd.getTongTien();
            }
            if(monthSelected == 7 && hd.getNgayTao().getMonth() == 7){
                defaultTableModel.addRow(new Object[]{hd.getMaHD(), hd.getTenKH(), 
                hd.getTongTien(), hd.getNgayTao(), hd.getGhiChu(),
                hd.getTenKho()});
                doanhThu += hd.getTongTien();
            }
            if(monthSelected == 8 && hd.getNgayTao().getMonth() == 8){
                defaultTableModel.addRow(new Object[]{hd.getMaHD(), hd.getTenKH(), 
                hd.getTongTien(), hd.getNgayTao(), hd.getGhiChu(),
                hd.getTenKho()});
                doanhThu += hd.getTongTien();
            }
            if(monthSelected == 9 && hd.getNgayTao().getMonth() == 9){
                defaultTableModel.addRow(new Object[]{hd.getMaHD(), hd.getTenKH(), 
                hd.getTongTien(), hd.getNgayTao(), hd.getGhiChu(),
                hd.getTenKho()});
                doanhThu += hd.getTongTien();
            }
            if(monthSelected == 10 && hd.getNgayTao().getMonth() == 10){
                defaultTableModel.addRow(new Object[]{hd.getMaHD(), hd.getTenKH(), 
                hd.getTongTien(), hd.getNgayTao(), hd.getGhiChu(),
                hd.getTenKho()});
                doanhThu += hd.getTongTien();
            }
            if(monthSelected == 11 && hd.getNgayTao().getMonth() == 11){
                defaultTableModel.addRow(new Object[]{hd.getMaHD(), hd.getTenKH(), 
                hd.getTongTien(), hd.getNgayTao(), hd.getGhiChu(),
                hd.getTenKho()});
                doanhThu += hd.getTongTien();
            }
        }
        doanthuTextField.setText("" + doanhThu);
        
    }//GEN-LAST:event_filterButtonActionPerformed

    private void monthComborBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthComborBoxActionPerformed
        String selectedItem = (String) monthComborBox.getSelectedItem();
    }//GEN-LAST:event_monthComborBoxActionPerformed

    private void doanthuTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doanthuTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_doanthuTextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(ListHoaDonFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListHoaDonFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListHoaDonFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListHoaDonFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListHoaDonFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ListHoaDonTable;
    private javax.swing.JButton backButton;
    private javax.swing.JTextField doanthuTextField;
    private javax.swing.JButton filterButton;
    private javax.swing.JTextField inputTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JComboBox<String> monthComborBox;
    private javax.swing.JButton refreshButton;
    private javax.swing.JButton searchButton;
    // End of variables declaration//GEN-END:variables
}
