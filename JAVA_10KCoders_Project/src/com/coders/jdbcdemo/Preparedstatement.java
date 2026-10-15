
package com.coders.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Preparedstatement {

    public static void main(String[] args)
            throws ClassNotFoundException, SQLException {

        // Step 1: Load and register the driver
        Class.forName("org.postgresql.Driver");
        System.out.println("Step 1: PostgreSQL driver loaded successfully");

        // Step 2: Establish connection
        Connection conn = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/Marathalli",
                "postgres",
                "JavaDB@2026"
        );

        System.out.println("Connection completed successfully");

        // Step 3: Create statement
        Statement st = conn.createStatement();

        // Step 4: Execute the SQL query
        String strselect = "SELECT sid, sname, sbranch FROM library";

        System.out.println("The SQL statement is: " + strselect);

        ResultSet rst = st.executeQuery(strselect);

        // Step 5: Process and display the results
        System.out.println("The records are:");

        int rowcount = 0;

        while (rst.next()) {
            int sid = rst.getInt("sid");
            String sname = rst.getString("sname");
            String sbranch = rst.getString("sbranch");

            System.out.println(sid + " " + sname + " " + sbranch);
            rowcount++;
        }

        System.out.println("Total records: " + rowcount);

        // Step 6: Close resources
        rst.close();
        st.close();
        conn.close();

        System.out.println("Database connection closed");
    }
}
