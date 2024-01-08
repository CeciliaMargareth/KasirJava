/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package kasir;

/**
 *
 * @author AXIOO
 */
import java.io.FileWriter;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class transaksi extends javax.swing.JFrame {

    public Statement st;
    public ResultSet rs;
    public DefaultTableModel tabModel;
    Connection cn = koneksi.Koneksi.koneksiDb();
    public transaksi() {
        initComponents();
        
        judul();
        tampilData("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelbayar = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        outputTanggal = new javax.swing.JLabel();
        outputStatus = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        outputIdTransaksi = new javax.swing.JLabel();
        outputUser = new javax.swing.JLabel();
        outputTotal = new javax.swing.JLabel();
        btnBayar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabelbayar.setModel(new javax.swing.table.DefaultTableModel(
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
        tabelbayar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelbayarMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelbayar);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, 360, 280));

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel8.setText("Menu");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, -1, -1));

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-transaction-30.png"))); // NOI18N
        jLabel6.setText("Transaction");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        outputTanggal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        outputTanggal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        outputTanggal.setText("-");
        jPanel1.add(outputTanggal, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, -1, -1));

        outputStatus.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        outputStatus.setText("-");
        jPanel1.add(outputStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Total Bayar");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("ID User");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("ID Transaksi");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        outputIdTransaksi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        outputIdTransaksi.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        outputIdTransaksi.setText("-");
        jPanel1.add(outputIdTransaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, -1, -1));

        outputUser.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        outputUser.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        outputUser.setText("-");
        jPanel1.add(outputUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, -1, -1));

        outputTotal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        outputTotal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        outputTotal.setText("-");
        jPanel1.add(outputTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, -1, -1));

        btnBayar.setBackground(new java.awt.Color(0, 153, 255));
        btnBayar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBayar.setForeground(new java.awt.Color(255, 255, 255));
        btnBayar.setText("Bayar");
        btnBayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBayarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 160, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Tanggal Pembayaran");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Status");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel10.setText("Logout");
        jLabel10.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, -1, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 410));

        setSize(new java.awt.Dimension(729, 448));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tabelbayarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelbayarMouseClicked
        // TODO add your handling code here:
        int selectedRow = tabelbayar.getSelectedRow();

    // Pastikan baris yang dipilih valid
    if (selectedRow >= 0) {
        // Ambil data dari tabel dan set ke JLabel
        String idTransaksi = tabelbayar.getValueAt(selectedRow, 0).toString();
        String idUser = tabelbayar.getValueAt(selectedRow, 1).toString();
        String totalBayar = tabelbayar.getValueAt(selectedRow, 2).toString();
        String tanggalTransaksi = tabelbayar.getValueAt(selectedRow, 3).toString();
        String status = tabelbayar.getValueAt(selectedRow, 4).toString();

        // Set data ke JLabel
        outputIdTransaksi.setText(idTransaksi);
        outputUser.setText(idUser);
        outputTotal.setText(totalBayar);
        outputTanggal.setText(tanggalTransaksi);
        outputStatus.setText(status);
    }

    }//GEN-LAST:event_tabelbayarMouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
                Order baru = new Order();
                baru.setVisible(true);
                this.dispose();
    }//GEN-LAST:event_jLabel8MouseClicked

    private void btnBayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBayarActionPerformed
    try {
        Connection cn = koneksi.Koneksi.koneksiDb();
        Statement st = cn.createStatement();

        // Mendapatkan ID user (contoh: ID user yang akan dibayar adalah 2)
        String idUser = "2";

        // Mengubah status menjadi "Sudah Dibayar" di tabel pesanan
        st.executeUpdate("UPDATE pesanan SET status = 'sudah dibayar' WHERE id_user = '" + idUser + "'");

        // Mengubah status menjadi "Sudah Dibayar" di tabel transaksi
        st.executeUpdate("UPDATE transaksi SET status = 'sudah dibayar' WHERE id_user = '" + idUser + "'");

        // Mencetak data ke file TXT
        String outputFile = "output.txt";
        PrintWriter writer = new PrintWriter(outputFile);

        // Mendapatkan data dari tabel pesanan
        ResultSet pesananRs = st.executeQuery("SELECT * FROM pesanan WHERE id_user = '" + idUser + "'");
        writer.println("Data Pesanan:");
        while (pesananRs.next()) {
            // Proses pengambilan data dan penulisan ke file TXT
            writer.println("ID Pesanan: " + pesananRs.getString("id_pesanan"));
            // Tambahan data lain sesuai kebutuhan
        }

        // Mendapatkan data dari tabel transaksi
        ResultSet transaksiRs = st.executeQuery("SELECT * FROM transaksi WHERE id_user = '" + idUser + "'");
        writer.println("\nData Transaksi:");
        while (transaksiRs.next()) {
            // Proses pengambilan data dan penulisan ke file TXT
            writer.println("ID Transaksi: " + transaksiRs.getString("id_transaksi"));
            // Tambahan data lain sesuai kebutuhan
        }

        // Menutup file writer
        writer.close();

        JOptionPane.showMessageDialog(null, "Pembayaran berhasil! Data tersimpan di " + outputFile);
    } catch (Exception e) {
        e.printStackTrace();
    }

    }//GEN-LAST:event_btnBayarActionPerformed

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
            java.util.logging.Logger.getLogger(transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new transaksi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBayar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel outputIdTransaksi;
    private javax.swing.JLabel outputStatus;
    private javax.swing.JLabel outputTanggal;
    private javax.swing.JLabel outputTotal;
    private javax.swing.JLabel outputUser;
    private javax.swing.JTable tabelbayar;
    // End of variables declaration//GEN-END:variables
public void judul() {
        Object[] judul = {
            "ID Transaksi", "ID User", "Total Bayar", "Tanggal Transaksi", "Status"
        };
        tabModel = new DefaultTableModel(null, judul);
        tabelbayar.setModel(tabModel);
    }

public void tampilData(String where) {
        try {
            st = cn.createStatement();
            tabModel.getDataVector().removeAllElements();
            tabModel.fireTableDataChanged();
            rs = st.executeQuery("SELECT * FROM transaksi " + where);
            
            while (rs.next()) {
                Object[] data = {
                    rs.getString("id_transaksi"),
                    rs.getString("id_user"),
                    rs.getString("total_bayar"),
                    rs.getString("tanggal_transaksi"),
                    rs.getString("status"),
                };
                
                    tabModel.addRow(data);
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
