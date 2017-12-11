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
public class Aluno extends Pessoa implements Serializable{
    private String nomeCurso;

    public Aluno(String nome, String perfil, String password, String nomeCurso) {
        super(nome, perfil, password);
        this.nomeCurso = nomeCurso;
    }
}
