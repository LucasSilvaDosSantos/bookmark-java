
package backEnd;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FavoritosBack {
    private String nome, url;
    private int tamanho;
    private String ultimoAcesso;
    MenuBack menu = new MenuBack();
    
    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); 
    Date date = new Date(); 
    
    public FavoritosBack(String nome, String url, String ultimoAcesso){
        this.nome = nome;
        this.url = url;
        
        if (ultimoAcesso.equals("null")){
            this.ultimoAcesso = dateFormat.format(date);
        }else{
            this.ultimoAcesso = ultimoAcesso;
        }

        menu.SalvarFavorito(this.nome, this.url, this.ultimoAcesso);
    }
    
    public FavoritosBack(String nome, String url, int tamanho, String ultimoAcesso) {
        this.nome = nome;
        this.url = url;
        this.tamanho = tamanho;
        this.ultimoAcesso = dateFormat.format(date);
        
        if (ultimoAcesso.equals("null") ){
            this.ultimoAcesso = dateFormat.format(date);
        }else{
            this.ultimoAcesso = ultimoAcesso;
        }
        
        menu.SalvarImagem(this.nome, this.url, this.tamanho, this.ultimoAcesso);
    }   

    // ultimo acesso set
    public void setUltimoAcesso(){
        Date date = new Date();
        this.ultimoAcesso = dateFormat.format(date);    
        menu.AlterarUltimoAcesso(this.nome, this.url, this.ultimoAcesso);
    }
    
    // nome get
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
        menu.AlterarNome(nome, this.url);
    }
    
    // url get
    public String getUrl(){
        return this.url;
    }   
    
    public int getTamanho(){
        return this.tamanho;
    }
    
    public String getUltimoAcesso(){
        return this.ultimoAcesso;
    }
    
    public void setUrl(String url){
        this.url = url;
        menu.AlterarUrl(this.nome, this.url);
    }
}
