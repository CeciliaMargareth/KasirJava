package koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Koneksi {
    Connection koneksi = null;

    public static Connection koneksiDb() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Menggunakan variabel kelas
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/kasir", "root", "");
            return koneksi;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
