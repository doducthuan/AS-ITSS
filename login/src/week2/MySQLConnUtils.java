/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2;

/**
 *
 * @author ddung
 */
import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnUtils {
	
	public static Connection getMySQLConnection() throws ClassNotFoundException, SQLException {
		final String url = "jdbc:mysql://localhost:8889/mysql_db";
                final String user = "root";
                final String password = "root";
                try{
                    Class.forName("com.mysql.jdbc.Driver");
                    return DriverManager.getConnection(url, user, password);
                }catch(ClassNotFoundException e){
                    e.printStackTrace();
                }catch (SQLException e){
                    e.printStackTrace();
                }
                return null;
		//return geMySQLConnection(dbURL, username,password);
	}
        public static void main(String[] args) throws SQLException, ClassNotFoundException{
            Connection connection = getMySQLConnection();
            java.sql.Statement sta= connection.createStatement();
            
            if(connection != null){
                System.out.println("Thanh cong");
            }
            else{
                System.out.println("That bai");
            }
            
            
        }
                
}
