
package bancoDeDados;

import java.sql.SQLException;
import org.sqlite.SQLiteException;


public class BancoDeDados {
    java.sql.Connection connection = null;
    java.sql.Statement stdm = null;
    
    public BancoDeDados() throws ClassNotFoundException{
        Class.forName("org.sqlite.JDBC");
    } 
    
    public boolean Conectar(){
        try{
            connection = java.sql.DriverManager.getConnection("jdbc:sqlite:banco.db");
            stdm = connection.createStatement();
            
            stdm.executeUpdate("create table Favoritos (nome string primary key, url string not null)");
                    
            return true;
        }catch(SQLException e){
            return false;
        }   
    }
    
    public boolean Desconectar(){
        try{
            if (this.connection != null){
                connection.close(); 
            }
            return true;
        }catch(java.sql.SQLException e){
            return false;
        }
    }
    
    public boolean SalvarFavorito(String a, String b) throws SQLException{
        if(Conectar()){
            try{
                String update;
                update = "insert into Favoritos values('"+a+"', '"+b+"')";
                stdm.executeUpdate(update);
                return true;
            }catch(SQLiteException e){
                return false;
            }
        }
        return false;            
    }   
}
