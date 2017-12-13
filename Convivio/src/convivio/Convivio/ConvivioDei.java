/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convivio.Convivio;

import java.util.ArrayList;

/**
 *
 * @author pedro
 */
public class ConvivioDei {
    private String nome;
    private ArrayList<Pessoa> listaPessoasInscritas;
    private ArrayList<Local> listaLocais;

    public ConvivioDei(String nome) {
        this.nome = nome;
        this.listaPessoasInscritas = new ArrayList<>();
        this.listaLocais = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }
    
    public void adicionarLocal(Local local){
        this.listaLocais.add(local);
    }
    
    public void inscreverPessoa(Pessoa pessoa){
        this.listaPessoasInscritas.add(pessoa);
    }
    
    public void printrLocaisOrdenado(){
        System.out.println("Ainda estou por acabar.");
    }
    
    public void printLocais(){
        System.out.println("Ainda estou por acabar.");
    }
    
    public boolean isPersonRegistered(Pessoa p){
        if(listaPessoasInscritas.contains(p)){
            return true;
        }else{
            return false;
        }
    }
    
    public String getInfoLocais(){
        String infoLocal = "";
        for(Local local : listaLocais){
            infoLocal += local + "\n";
        }
        return infoLocal;
    }
}
