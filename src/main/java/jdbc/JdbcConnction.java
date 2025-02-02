package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

interface MyConnection {
   Connection getConnection();

   List<Map<String, Object>> query(String args);

   public record InnerJdbcConnction(int col, Object value) {
   }

   int mutation(String args, List<InnerJdbcConnction> params);

   void close();
}

public class JdbcConnction implements MyConnection {

   private String url = "jdbc:mysql://127.0.0.1:3306/basic_sql";
   private String user = "root"; // Your database username
   private String password = "sql"; // Your database password

   private Connection connection;

   JdbcConnction() {
      try {
         connection = DriverManager.getConnection(url, user, password);
         if (this.connection == null) {
            System.out.println("Connetion not Found!");
            return;
         }
         System.out.println("Connected to the database!");
      } catch (Exception e) {
         System.out.println("Error on database Connetion!");
         e.printStackTrace();
      }
   }

   @Override
   public int mutation(String args, List<InnerJdbcConnction> params) {
      try (PreparedStatement stmt = this.getConnection().prepareStatement(args)) {
         int n = 0;
         while (n < params.size()) {
            var current = params.get(n);
            stmt.setObject(current.col(), current.value());
            n++;
         }
         int rowsInserted = stmt.executeUpdate();
         return rowsInserted;
      } catch (SQLException e) {
         e.printStackTrace();
      }
      return -1;
   }

   @Override
   public List<Map<String, Object>> query(String args) {
      List<Map<String, Object>> results = new ArrayList<>();

      try (Statement stmt = this.getConnection().createStatement()) {
         /* https://www.javatpoint.com/ResultSet-interface */

         ResultSet rs = stmt.executeQuery(args);
         var metaData = rs.getMetaData();
         int columnCount = metaData.getColumnCount();
         while (rs.next()) {
            Map<String, Object> row = new HashMap<>();
            for (int i = 1; i < columnCount; i++) {
               row.put(metaData.getColumnName(i), rs.getObject(i));
            }
            results.add(row);
         }
      } catch (SQLException e) {
         e.printStackTrace();
      }
      this.close();
      return results;
   }

   @Override
   public Connection getConnection() {
      return this.connection;
   }

   @Override
   public void close() {
      try {
         this.connection.close();
      } catch (SQLException e) {
         e.printStackTrace();
      }
   }

}
