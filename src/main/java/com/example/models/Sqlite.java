package com.example.models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Sqlite implements Database{

    @Override
    public Connection connect(){
        try {
            return tryConnect();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return null;
        }
    }


    public Connection tryConnect() throws SQLException {
        String url = "jdbc:sqlite:database.sqlite";
        DriverManager.getConnection(url);
        return null;
    }

    @Override
    public void close(Connection conn){
        try {
            tryClose(conn);
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public void tryClose(Connection conn) throws SQLException {
        conn.close();
    }
    
}
