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
    private ArrayList<Inscricao> inscricoes;

    public ConvivioDei(String nome) {
        this.nome = nome;
        this.listaPessoasInscritas = new ArrayList<>();
        this.listaLocais = new ArrayList<>();
        this.inscricoes = new ArrayList<>();
    }

    public ArrayList<Inscricao> getInscricoes() {
        return inscricoes;
    }

    public ArrayList<Local> getListaLocais() {
        return listaLocais;
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
    
    public String getInfoLocaisOrdered(){
        String infoLocal = "";
        ArrayList<Local> listaTmp = listaLocais;
        Local temp;
        for (int x=0; x<listaTmp.size(); x++){
            for (int i=0; i < listaTmp.size()-x-1; i++) {
                if (listaTmp.get(i).getPessoasInscritas() < listaTmp.get(i+1).getPessoasInscritas()){
                    temp = listaTmp.get(i);
                    listaTmp.set(i,listaTmp.get(i+1) );
                    listaTmp.set(i+1, temp);
                }
            }
        }
        for(Local local : listaTmp){
            infoLocal += local + "\n";
        }
        return infoLocal;
    }
    
    public int inscreverEmLocal(Pessoa p, Local l){
       if(l.isBar()){
           int flag = ((Bar)l).addGuestList(p);
           if(flag == 2){
                inscricoes.add(new Inscricao(p, l));
                int index = listaLocais.indexOf(l);
                listaLocais.get(index).incrementarPessoasIns();
               return 2;
           }else if(flag == 1){
                inscricoes.add(new Inscricao(p, l));               
                int index = listaLocais.indexOf(l);
                listaLocais.get(index).incrementarPessoasIns();
               return 1;
           }else{
               return -1;
           }           
       }
       inscricoes.add(new Inscricao(p, l));
       int index = listaLocais.indexOf(l);
       listaLocais.get(index).incrementarPessoasIns();
       return 1;
    }
    
    public void desinscreverDeLocal(String p, Local local){
        String l = local.getNome();
        Inscricao remover = null;
        for(Inscricao ins : inscricoes){
            if(ins.getNomePessoa().equals(p) && ins.getNomeLocal().equals(l)){
                remover = ins;
                break;
            }
        }
        int index = inscricoes.indexOf(remover);
        inscricoes.remove(index);
        local.decrementarPessoasIns();
    }
}
