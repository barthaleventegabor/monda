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


    private Connection tryConnect() throws SQLException {
        String url = "jdbc:sqlite:database.sqlite";

        return DriverManager.getConnection(url);
        
    }

    @Override
    public void close(Connection conn){
        try {
            tryClose(conn);
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    private void tryClose(Connection conn) throws SQLException {
        conn.close();
    }

    //a close mondjuk nem kell, mert van saját close metódusa is.
    //Az employeeSourceban az itt feliratnál van azzal a jobb
    //és rövidebb megoldással.
    
}
