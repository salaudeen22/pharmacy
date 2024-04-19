package doa;

import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Tables {

    public static void main(String[] args) {
        try {
            Connection con = ConnectionProvider.getConnection();
            Statement st = con.createStatement();
            String sql = "CREATE TABLE medicine ("
                    + "medicine_pk INT AUTO_INCREMENT PRIMARY KEY, "
                    + "uniqueId VARCHAR(200), "
                    + "name VARCHAR(200), "
                    + "companyName VARCHAR(200), "
                    + "quantity BIGINT, "
                    + "price BIGINT"
                    + ")";

            // Execute the SQL statement
            st.executeUpdate(sql);
            System.out.println("Table 'medicine' created successfully.");

//            String createTableQuery = "CREATE TABLE appuser ("
//                + "appuser_id INT AUTO_INCREMENT PRIMARY KEY, "
//                + "userRole VARCHAR(200), "
//                + "name VARCHAR(200), "
//                + "dob VARCHAR(50), "
//                + "mobileNumber VARCHAR(50), "
//                + "email VARCHAR(200), "
//                + "username VARCHAR(200), "
//                + "password VARCHAR(50), "
//                + "address VARCHAR(200))";
//            st.executeUpdate(createTableQuery);
//String insertQuery = "INSERT INTO appuser (userRole, name, dob, mobileNumber, email, username, password, address) "
//                    + "VALUES ('Admin', 'Admin', '16-12-1992', '0000111122', 'admin@email.com', 'admin', 'admin', 'India')";
//            int rowsAffected = st.executeUpdate(insertQuery);
//            if (rowsAffected > 0) {
//                JOptionPane.showMessageDialog(null, "Record Inserted Successfully");
//            } else {
//                JOptionPane.showMessageDialog(null, "Failed to Insert Record");
//            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }
}
