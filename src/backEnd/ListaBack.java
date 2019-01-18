
package backEnd;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaBack {
    Scanner entrada = new Scanner(System.in);
    public static List<FavoritosBack> favoritos = new ArrayList<>();
    
    public FavoritosBack jaEstaNaListaNome(String nome){
        for (FavoritosBack fav: favoritos) {
            if (fav.getNome().equals(nome)){
                return fav;
            }
        }
        return null;
    }
    
    public FavoritosBack jaEstaNaListaUrl(String url){
        for (FavoritosBack fav: favoritos){
            if (fav.getUrl().equals(url))
                return fav;
        }
        return null;
    }
    
    public String addImagem(String nome, String url, Integer tamanho){
        FavoritosBack auxNome = jaEstaNaListaNome(nome);
        FavoritosBack auxUrl = jaEstaNaListaUrl(url);
        
        // tudo diferente cria novo objeto |Imagem
        if (auxNome == null && auxUrl == null){
            favoritos.add(new FavoritosBack(nome, url, tamanho, "null"));  
            return("Imagem adicionada");
        }
        // atualiza o ultimo acesso caso nome e url sejam iguais
        else if ((auxNome != null) && (auxNome.getUrl().equals(url))){
            auxNome.setUltimoAcesso();
            return("Imagem já existe, Hora do ultimo acesso atualizada.");
        }
        // atualiza a url caso nome igual e url diferente
        else if (auxNome != null && !auxNome.getUrl().equals(url)){
            auxNome.setUrl(url);
            return("Imagem já existe, URL Atualizada.");
        } 
        
        // atualiza o ultimo acesso caso a url ja exista e o nome seja diferente e atualiza o nome 
        else if (auxUrl != null && !auxUrl.getNome().equals(nome)){
            auxUrl.setUltimoAcesso();
            auxUrl.setNome(nome);
            return("Imagem já existe, Hora e nome do ultimo acesso atualizada.");
        }
        return null;
    }
    
    public String addFavorito(String nome, String url){
        FavoritosBack auxNome = jaEstaNaListaNome(nome);
        FavoritosBack auxUrl = jaEstaNaListaUrl(url);
        
        // tudo diferente cria novo objeto |Imagem
        if (auxNome == null && auxUrl == null){
            favoritos.add(new FavoritosBack(nome, url, "null"));  
            return("Favorito adicionado");
            
        }
        // atualiza o ultimo acesso caso nome e url sejam iguais
        else if ((auxNome != null) && (auxNome.getUrl().equals(url))){
            auxNome.setUltimoAcesso();
          
            return("Favorito já existe, Hora do ultimo acesso atualizada.");
        }
        // atualiza a url caso nome igual e url diferente
        else if (auxNome != null && !auxNome.getUrl().equals(url)){
            auxNome.setUrl(url);
            return("Favorito já existe, URL Atualizada.");
        }
        // atualiza o ultimo acesso caso a url ja exista e o nome seja diferente e atualiza o nome 
        else if (auxUrl != null && !auxUrl.getNome().equals(nome)){
            auxUrl.setUltimoAcesso();
            auxUrl.setNome(nome);
            return("Imagem já existe, Hora e nome do ultimo acesso atualizada.");
        }
        return null;
    }
}
