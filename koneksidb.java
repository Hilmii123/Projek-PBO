
package mahasiswa;
import java.sql.*;

public class koneksidb {
    private static Connection koneksi;
    public static Connection getkoneksi(){
        try {
            String url="jdbc:mysql://localhost:3306/mahasiswa_db";
            String user="root";
            String passwd="root";
            DriverManager.deregisterDriver(new com.mysql.cj.jdbc.Driver());
            koneksi=DriverManager.getConnection(url, user, passwd);
            System.out.println("Database berhasil terkoneksi");
        } catch (Exception e) {
            System.err.println("Database tidak terkoneksi"+e.getMessage());
        }
        return koneksi;
    }
    public static void main(String[] args) {
        koneksidb.getkoneksi();
    }
}
