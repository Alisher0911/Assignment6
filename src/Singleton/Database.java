package Singleton;

import java.sql.*;

public class Database {
    private static Database instance;
    private Connection con;

    private Database() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            this.con  = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/users?autoReconnect=true&useSSL=false", "root", "idealcode");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            return;
        }
    }

    public static Database getInstance() {
        if(Database.instance == null) {
            Database.instance = new Database();
        }
        return Database.instance;
    }

    public void query(String sql) {
        try {
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while(rs.next()) {
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("First name: " + rs.getString("first_name"));
                System.out.println("Second Name: " + rs.getString("second_name"));
                System.out.println();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
