package backEnd;

import bancoDeDados.ConexaoSQLite;
import bancoDeDados.CriarBancoSQlite;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MenuBack {
    ConexaoSQLite conexaoSQLite = new ConexaoSQLite();
    CriarBancoSQlite criarBancoSQLite = new CriarBancoSQlite(conexaoSQLite);
    String nome, url, ultimo;
    int tamanho;
    
    public MenuBack(){
        criarBancoSQLite.criarTabelaFavoritos();
    }
    
    // Inserçao de favoritos sem tamanho
    public void SalvarFavorito(String nome, String url, String ultimo){
        conexaoSQLite.conectar();
        this.nome = nome;
        this.url = url;
        this.ultimo = ultimo;
        
        String sqlInsert = " INSERT INTO tbl_Favoritos ("
                + "nome,"
                + "url,"
                + "ultimoAcesso"
                + ") VALUES(?,?,?)"
                + ";";
        
        PreparedStatement preparedStatement = conexaoSQLite.criarPreparedStatement(sqlInsert);
        try{
            preparedStatement.setString(1, this.nome);
            preparedStatement.setString(2, this.url);
            preparedStatement.setString(3, this.ultimo);            
            preparedStatement.executeUpdate();
        }catch(SQLException e){

        }finally{
            if(preparedStatement != null){
                try {
                    preparedStatement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(MenuBack.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            conexaoSQLite.desconectar();
        }
    }
    
    //Inserçao de imagens com tamanho
    public void SalvarImagem(String nome, String url, int tamanho, String ultimo){
        conexaoSQLite.conectar();
        this.nome = nome;
        this.url = url;
        this.tamanho = tamanho;
        this.ultimo = ultimo;
        
        String sqlInsert = " INSERT INTO tbl_Favoritos ("
                + "nome,"
                + "url,"
                + "tamanho,"
                + "ultimoAcesso"
                + ") VALUES(?,?,?,?)"
                + ";";
        
        PreparedStatement preparedStatement = conexaoSQLite.criarPreparedStatement(sqlInsert);
        try{
            preparedStatement.setString(1, this.nome);
            preparedStatement.setString(2, this.url);
            preparedStatement.setInt(3, this.tamanho);
            preparedStatement.setString(4, this.ultimo);            
            preparedStatement.executeUpdate();
             
        }catch(SQLException e){

        }finally{
            if(preparedStatement != null){
                try {
                    preparedStatement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(MenuBack.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            conexaoSQLite.desconectar();
        }
    }
    
    public void CarregaFavoritos(){
        conexaoSQLite.conectar();

        ResultSet resultSet = null;
        Statement statement = null;
        
        String query = "SELECT * FROM tbl_Favoritos";
        
        statement = conexaoSQLite.criarStatement();
        
        try {
            resultSet = statement.executeQuery(query);
            
            while (resultSet.next()) {
                
                if (resultSet.getString("tamanho") == null){
                    ListaBack.favoritos.add(new FavoritosBack(resultSet.getString("nome"), resultSet.getString("url"), resultSet.getString("ultimoAcesso")));  
                }else{
                    ListaBack.favoritos.add(new FavoritosBack(resultSet.getString("nome"), resultSet.getString("url"), resultSet.getInt("tamanho"), resultSet.getString("ultimoAcesso")));  
                }
            }         
        } catch (SQLException e) {
            
        }finally{
            try {
                resultSet.close();
                statement.close();
                conexaoSQLite.desconectar();
            } catch (SQLException e) {
            }
        }
    }
    
    public void AlterarUrl(String nome, String url){
        conexaoSQLite.conectar();

        ResultSet resultSet = null;
        Statement statement = null;
        
        String query = "update tbl_favoritos"
                + " set url = ?"
                + " where nome = ?;";
        
       PreparedStatement preparedStatement = conexaoSQLite.criarPreparedStatement(query);
        try{
            preparedStatement.setString(1, url);
            preparedStatement.setString(2, nome);           
            preparedStatement.executeUpdate();
             
        }catch(SQLException e){

        }finally{
            if(preparedStatement != null){
                try {
                    preparedStatement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(MenuBack.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            conexaoSQLite.desconectar();
        }
    }
        
    public void AlterarNome(String nome, String url){
        conexaoSQLite.conectar();

        ResultSet resultSet = null;
        Statement statement = null;
        
        String query = "update tbl_favoritos"
                + " set nome = ?"
                + " where url = ?;";
        
       PreparedStatement preparedStatement = conexaoSQLite.criarPreparedStatement(query);
        try{
            preparedStatement.setString(1, nome);
            preparedStatement.setString(2, url);           
            preparedStatement.executeUpdate();
             
        }catch(SQLException e){

        }finally{
            if(preparedStatement != null){
                try {
                    preparedStatement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(MenuBack.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            conexaoSQLite.desconectar();
        }
        
    }
    
    public void AlterarUltimoAcesso(String nome, String url, String ultimoAcesso){
        conexaoSQLite.conectar();

        ResultSet resultSet = null;
        Statement statement = null;
        
        String query = "update tbl_favoritos"
                + " set ultimoAcesso = ?"
                + " where nome = ? and url = ?;";
        
       PreparedStatement preparedStatement = conexaoSQLite.criarPreparedStatement(query);
        try{
            preparedStatement.setString(1, ultimoAcesso);
            preparedStatement.setString(2, nome);
            preparedStatement.setString(3, url);           
            preparedStatement.executeUpdate();
             
        }catch(SQLException e){

        }finally{
            if(preparedStatement != null){
                try {
                    preparedStatement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(MenuBack.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            conexaoSQLite.desconectar();
        }
    }
}
