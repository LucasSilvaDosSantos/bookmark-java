package bancoDeDados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexaoSQLite {
    
    private Connection conexao;
    
    public boolean conectar(){
        try {
            String url = "jdbc:sqlite:banco_sqlite.db";
            conexao = DriverManager.getConnection(url);
            
        }catch(SQLException e){
            return false;
        }
        return true;
    }
    
    public boolean desconectar(){
        try {
            if(this.conexao.isClosed() == false){
                this.conexao.close();
            }
            
        }catch(SQLException e){
           return false; 
        }
        return true;
    }
    
    public Statement criarStatement(){
        try{
           return this.conexao.createStatement();
        }catch(SQLException e){
            return null;
        }
    }
    
    public Connection getConexao(){
        return this.conexao;
    }
    
    public PreparedStatement criarPreparedStatement(String sql){
        try{
           return this.conexao.prepareStatement(sql);
        }catch(SQLException e){
            return null;
        }
    }
}
