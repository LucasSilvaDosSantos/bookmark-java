package bancoDeDados;

import java.sql.SQLException;
import java.sql.Statement;


public class CriarBancoSQlite {
    
    private final ConexaoSQLite conexaoSQLite;
    
    public CriarBancoSQlite(ConexaoSQLite pConexaoSQLite){
        conexaoSQLite = pConexaoSQLite;
    }
    
    public void criarTabelaFavoritos(){
        String sql = "create table tbl_favoritos ("
                + "nome string primary key,"
                + "url string not null,"
                + "tamanho int,"
                + "ultimoAcesso string)";
        
        // Executando o sql de criar tabelas
        boolean conectou = false;
        
        try{
            conectou = this.conexaoSQLite.conectar();
            Statement stmt = this.conexaoSQLite.criarStatement();
            stmt.execute(sql);
        }catch(SQLException e){
            
        }finally{
            if(conectou){
                this.conexaoSQLite.desconectar();
            }
        }
    }
}
