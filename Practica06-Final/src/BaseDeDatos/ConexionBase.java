package BaseDeDatos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import Formas.Usuario;

public class ConexionBase {
	public String driver = "com.mysql.cj.jdbc.Driver";
	public String url = "jdbc:mysql://localhost:3306/usuarios ?useSSL=false&useLegacyDatetimeCode=false&serverTimezone=UTC";
    public String username = "root";
    public String password = "12345";
    public Connection getConnection() {
    	Connection conn = null;
    	try {
    		Class.forName(driver);
            conn = DriverManager.getConnection(url, username, password);
            
    	}catch(ClassNotFoundException | SQLException e) {
    		System.out.println("Error en la conexión: " + e);
    	}
    
    	return conn;
    }
	public boolean addContact(Usuario contact) {
    	    Connection connect = null;
	        Statement statement = null;
	        try 
	        {

	            connect = getConnection();
	            statement = connect.createStatement();
	            
	            String sql = "insert into usuarios (primer_nombre, email, telefono, sexo,  serie, musica ) values (?, ?, ?, ?, ?, ? )";
	            PreparedStatement ps = connect.prepareStatement( sql );
	            
	            ps.setString( 1, contact.getPrimerNombre() );
	            ps.setString( 2, contact.getEmail() );
	            ps.setString( 3, contact.getTelefono() );
	            ps.setString( 4, contact.getSexo());
	            ps.setString( 5, contact.getSerie() );
	            ps.setString( 6, contact.getMusica() );
	            
	            ps.executeUpdate();
	            return true;
				
	        }
	        catch (SQLException error){ 
	        	System.out.println("El registro fue inválido");
	        	System.out.println( error.toString() );
	            return false;

	       }     		   
	   }
    
}
