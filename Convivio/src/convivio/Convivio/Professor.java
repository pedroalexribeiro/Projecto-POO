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
public class Professor extends Pessoa implements Serializable{
    private String tipoProfessor;

    public Professor(String nome, String perfil, String password, String tipoProfessor) {
        super(nome, perfil, password);
        this.tipoProfessor = tipoProfessor;
    }
}
