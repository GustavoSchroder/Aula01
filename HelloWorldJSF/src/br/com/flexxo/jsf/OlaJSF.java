package br.com.flexxo.jsf;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class OlaJSF {

    private String nome;

    public OlaJSF() {
    }
    
    public void salvar() {
    
    }

    public String getNome() {
    	return nome == null ? nome : nome + ", beleza!";
    }

    public void setNome(String user_name) {
        this.nome = user_name;
    }
}
