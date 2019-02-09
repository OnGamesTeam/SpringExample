package com.project.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Test {

    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/student_tracker?useSSL=false&serverTimezone=UTC";
        String user = "root";
        String pass = "fd22041993";

        try {
            Connection myConn = DriverManager.getConnection(jdbcUrl, user, pass);
            System.out.println("Connessione riuscita!!!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

