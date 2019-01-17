package lk.ijse.dep.pizza.order.db;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnection {
    private static DBConnection dbConnection;
    private Connection connection;

    private DBConnection() throws IOException, SQLException {

        Properties dbpro = new Properties();
        File file = new File("resources/application.properties");
        FileReader fileReader= new FileReader(file);


        dbpro.load(fileReader);

        String ip = dbpro.getProperty("ip");
        String port = dbpro.getProperty("port");
        String db = dbpro.getProperty("db");
        String username = dbpro.getProperty("username");
        String passsword = dbpro.getProperty("password");

        String url = "jdbc:mysql://"+ ip+ ":"+ port +"/"+ db;
        connection = DriverManager.getConnection(url,username,passsword);
    }
    public static DBConnection getInstance() throws SQLException, IOException {
        if (dbConnection == null) {
            dbConnection = new DBConnection();
        }
        return dbConnection;
    }
    public Connection getConnection(){
        return connection;

    }
}
