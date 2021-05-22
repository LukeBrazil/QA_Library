package com.qa.jdbc;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class LearningJDBC {


    private String jdbcConnectionURL;
    private String username;
    private String password;

    public LearningJDBC(String username, String password) {
        jdbcConnectionURL = "jdbc:mysql://localhost:3306/qa_ims";
        this.username = username;
        this.password = password;
    }

    public LearningJDBC(String jdbcConnectionURL, String username, String password) {
        this.jdbcConnectionURL = jdbcConnectionURL;
        this.username = username;
        this.password = password;
    }
    
    public void readAll() {
    	
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(jdbcConnectionURL, username, password);
        } catch (SQLException e) {
           System.out.println(e);
        } finally {
            try {
                if(conn != null) {
                	System.out.println("CONNECTED!");
                    conn.close();
                }
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }
}