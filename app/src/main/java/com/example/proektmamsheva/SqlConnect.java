package com.example.proektmamsheva;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SqlConnect {

    public static void main(String[] args) {
        String connectionUrl =
                "jdbc:sqlserver://ngknn.ru.database.windows.net:1433;"
                        + "database=AnJava;"
                        + "user=33П;"
                        + "password=12357;"
                        + "encrypt=true;"
                        + "trustServerCertificate=false;"
                        + "loginTimeout=30;";

        try (Connection connection = DriverManager.getConnection(connectionUrl);) {

        }

        catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
