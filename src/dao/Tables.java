package dao;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.Statement;

/**
 *
 * @author mdsha
 */
public class Tables {
    public static void main(String[] args) {
        try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();

            // Create table
            /**st.executeUpdate("CREATE TABLE appuser("
                    + "appuser_pk INT AUTO_INCREMENT PRIMARY KEY, "
                    + "userRole VARCHAR(200), "
                    + "name VARCHAR(200), "
                    + "dob VARCHAR(200), "
                    + "mobileNumber VARCHAR(50), "
                    + "email VARCHAR(50), "
                    + "username VARCHAR(50), "
                    + "password VARCHAR(50), "
                    + "address VARCHAR(100))"
            );*/

            // Insert data
            //st.executeUpdate("INSERT INTO appuser "
                   // + "(userRole, name, dob, mobileNumber, email, username, password, address) "
                   // + "VALUES ('Admin', 'Admin', '15-09-1998', '000111222', 'admin@gmail.com', 'admin', 'password123', 'Dhaka')"
            //);
         //st.executeUpdate("CREATE TABLE medicine("
                   // + "medicine_pk INT AUTO_INCREMENT PRIMARY KEY, "
                   // + "uniqueId VARCHAR(200), "
                   // + "name VARCHAR(200), "
                    //+ "companyName VARCHAR(200), "
                    //+ "quantity BIGINT, "
                   // + "price BIGINT)"
            //);
            st.executeUpdate("CREATE TABLE bill ("
                    + "bill_pk INT AUTO_INCREMENT PRIMARY KEY, "
                    + "billID VARCHAR(200), "
                    + "billDate VARCHAR(50), "
                    + "totalPaid BIGINT, "
                    + "generated VARCHAR(50))"
            );
            JOptionPane.showMessageDialog(null, "Table Creation and Data Insertion Success !");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
