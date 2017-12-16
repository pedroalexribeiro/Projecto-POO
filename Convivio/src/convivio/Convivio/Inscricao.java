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
public class Inscricao implements Serializable{
    private Pessoa pessoa;
    private Local local;

    public Inscricao(Pessoa pessoa, Local local) {
        this.pessoa = pessoa;
        this.local = local;
    }
    
    public double getReceita(){
        return pessoa.calcularDespesa(local.getCusto(), local.getDesconto());
    }
    
    public String getNomePessoa(){
        return pessoa.getNome();
    }
    
    public String getNomeLocal(){
        return local.getNome();
    }
}
