package org.example;
import java.sql.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        final String DB_URL = "jdbc:postgresql://localhost:5432/coffeeDB";
        final String USERNAME = "postgres";
        final String PASSWORD = "Dolphins1972!";

        try{
            Connection conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            System.out.println("Connected!");

            Statement stmt = conn.createStatement();
            String sqlStament = "SELECT * FROM Coffee";

            ResultSet result = stmt.executeQuery(sqlStament);
            while(result.next()){
                System.out.println(result.getString("description"));
            }

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}