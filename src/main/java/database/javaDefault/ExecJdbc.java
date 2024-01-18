package database.javaDefault;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ExecJdbc {
    public static void main(String[] args) {
        try {
            Connection conn = ConnecitonDafault.getConnection();
            System.out.println("Connection ");
            Statement sta = conn.createStatement();
            String queryCreateUser = "INSERT INTO users_tb (id, name, address, phone, mothername, subname)"
                    + "VALUES (1 , 'john', 'Sao paulo', 1234567890, 'Maria',' Doe')";
            int rowsAffected = sta.executeUpdate(queryCreateUser);
            System.out.println(rowsAffected);
            String querySelectUsers = "SELECT * FROM users_tb";
            ResultSet resultSet = sta.executeQuery(querySelectUsers);
            int columsAmount = resultSet.getMetaData().getColumnCount();
            while (resultSet.next()) {
                for (int i = 1; i < columsAmount; i++) {
                    String colunmName = resultSet.getMetaData().getColumnName(i);
                    String coulunmValue = resultSet.getString(i);
                    System.out.println(colunmName + ": " + coulunmValue);
                }
                System.out.println();
            }
            sta.executeUpdate("TRUNCATE TABLE users_tb");
            conn.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
