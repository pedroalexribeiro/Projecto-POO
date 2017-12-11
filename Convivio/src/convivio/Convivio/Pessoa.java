/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convivio.Convivio;

import java.io.Serializable;

/**
 *
 * @author pedro
 */
public abstract class Pessoa implements Serializable{
    private String nome;
    private String perfil;
    private String password;

    public Pessoa(String nome, String perfil, String password) {
        this.nome = nome;
        this.perfil = perfil;
        this.password = password;
    }
    
    public double calcularDespesa(){
        System.out.println("Têm de me fazer ainda.");
        return 0;
    }

    public String getNome() {
        return nome;
    }

    public String getPerfil() {
        return perfil;
    }

    public String getPassword() {
        return password;
    }
    
}
