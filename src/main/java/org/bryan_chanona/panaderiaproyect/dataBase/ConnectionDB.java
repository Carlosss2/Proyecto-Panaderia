package org.bryan_chanona.panaderiaproyect.dataBase;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
public class ConnectionDB {

   private static final String url = "jdbc:mysql://localhost:3306/panaderia";
   private static final String user="root";

   private static final String password="Castro2005";

   public static Connection conectar() throws SQLException{
      return DriverManager.getConnection(url,user,password);
   }

}
