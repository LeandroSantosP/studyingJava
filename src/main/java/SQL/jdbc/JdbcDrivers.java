package SQL.jdbc;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import SQL.jdbc.MyConnection.InnerJdbcConnction;

public class JdbcDrivers {
   private MyConnection conn = new JdbcConnction();

   public static void main(String[] args) {
      /*
       * Transactions - {
       * 1 - https://www.javatpoint.com/transaction-management-in-jdbc
       * 2 -
       * https://stackoverflow.com/questions/4940648/how-to-start-a-transaction-in-
       * jdbc
       * }
       */
      var jdbc = new JdbcDrivers();
      String sqlInsert = /* language=sql */"""
               INSERT INTO products (name, price, stoke, id_brend)
               VALUES (?, ?, ?, ?);
            """;
      String sqlDelet = /* language=SQL */ """
                  DELETE FROM products WHERE id = ?;
            """;

      List<InnerJdbcConnction> input = new ArrayList<>();
     /*  input.add(new InnerJdbcConnction(1, "Notebook Inspiron 16 Plus"));
      input.add(new InnerJdbcConnction(2,10398.00));
      input.add(new InnerJdbcConnction(3, 30));
      input.add(new InnerJdbcConnction(4, 2)); */
      input.add(new InnerJdbcConnction(1, 7));
      
      //System.out.println(jdbc.conn.mutation(sqlDelet, input));
      System.out.println(jdbc.conn.query("SELECT * FROM products").get(0));
      jdbc.conn.close();
      // jdbc.getProducts(1);
   }
}
