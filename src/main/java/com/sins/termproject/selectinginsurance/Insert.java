package com.sins.termproject.selectinginsurance;


import java.sql.*;

public class Insert {

        public static void main(String[] args) {
            String connectionURL = "jdbc:oracle:thin:@//localhost:1521/ORCLCDB.localdomain";
            Connection conn = null;
            Statement sqlstatement = null;
            ResultSet result = null;

            try {
                Class.forName("oracle.jdbc.OracleDriver").newInstance();
                conn = DriverManager.getConnection(connectionURL, "osqln01", "osqln01");
                sqlstatement = (Statement) conn.createStatement();

                String sql = "select * from test ";
                result = sqlstatement.executeQuery(sql);
                int row = 1 ;


                while (result.next()){
                    System.out.print("Record "+ (row++)+ ": ");
                    System.out.println(result.getInt("testno")+ " ");
                }
                conn.close();


            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }


}
