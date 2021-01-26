package models;

import com.mysql.cj.jdbc.Driver;

import java.sql.*;

public class JdbcLec {
    public static void main(String[] args) {
        try {
            DriverManager.registerDriver(new Driver());

            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost/codeup_test_db?serverTimezone=UTC&useSSL=false",
                    "root",
                    "codeup"
            );

            Statement stmt = connection.createStatement();
//            String query = "SELECT * FROM albums WHERE id > 30";
//            ResultSet rs = stmt.executeQuery(query);
            //calling .next once iterates over one time

//rs.next();

//            System.out.println(rs.getString(1));
//            System.out.println(rs.getString(2));
//            System.out.println(rs.getString(3));
//            System.out.println(rs.getString(4));

//rs.beforeFirst();
//rs.previous();
//while (rs.next()) {
//    System.out.println("==================");
//    System.out.println(rs.getString("id"));
//    System.out.println(rs.getString("name"));
//    System.out.println(rs.getString("artist"));
//    System.out.println(rs.getString("release_date"));
//    System.out.println(rs.getString("genre"));
//}
            //getting metadata
//ResultSetMetaData metadata = rs.getMetaData();
//int colCount = metadata.getColumnCount();
//for (int i = 1; i <= colCount; i++) {
//    System.out.println(metadata.getColumnName(i));
//}
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

}
