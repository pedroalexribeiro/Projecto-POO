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
public class Funcionario extends Pessoa implements Serializable{
    private String tempoTrabalho;

    public Funcionario(String nome, String perfil, String password, String tempoTrabalho) {
        super(nome, perfil, password);
        this.tempoTrabalho = tempoTrabalho;
    }

    @Override
    public String toString() {
        return getNome() + ", " + getPerfil() + ".";
    }
    
    
}
