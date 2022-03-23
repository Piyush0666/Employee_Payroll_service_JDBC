package com.bridgelabz.Day34;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UC4 {
        String updateQuery="update employee_payroll set salary=5000000 where empname='Terisa'";

        public void updateSalary(Connection connection) {
            try {
                PreparedStatement preparedStatement=connection.prepareStatement(updateQuery);
                preparedStatement.execute();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }