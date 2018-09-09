package Core;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;

public class DataBaseConnection {

    public static void main(String[] args) {

    Connection con;



    String name = ResourceReader.getProperty("learn_name");
    String address = ResourceReader.getProperty("learn_address");
    String pass = ResourceReader.getProperty("learn_pass");
    String user = ResourceReader.getProperty("learn_user");

        try {
            con = DriverManager.getConnection(name,user,pass);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
