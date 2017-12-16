/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convivio.Convivio;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author pedro
 */
public class Bar extends Local implements Serializable{
    private int lotacao;
    private double consumoMinimo;
    private ArrayList<Pessoa> guestlist;
    static private double tamanhoGuestList = 0.30;

    public Bar(String nome, int lotacao, double consumoMinimo, double longitude, double latitude) {
        super(nome, longitude, latitude);
        this.lotacao = lotacao;
        this.consumoMinimo = consumoMinimo;
        this.guestlist = new ArrayList<>();
    }

    @Override
    public double getCusto() {
        return consumoMinimo;
    }

    @Override
    public String toString() {
        return "Bar: " + getNome() + " -> Número de Inscritos: " + getPessoasInscritas() + " || Lotação: " + lotacao + '.';
    }
    
    public String getGuestListInfo(){
        String rt = "";
        for(Pessoa p : guestlist){
            rt += p + "\n";
        }
        return rt;
    }
    
    public int addGuestList(Pessoa p){
        if(getPessoasInscritas() < lotacao){
            if(guestlist.size()< (tamanhoGuestList*lotacao)){
                guestlist.add(p);
                return 2;
            }else{
                if(p.getPerfil().equals("Boémio")){
                    for(int i = guestlist.size()-1; i>=0; i--){
                        if(!guestlist.get(i).getPerfil().equals("Boémio")){
                            guestlist.set(i, p);
                            return 2;
                        }
                    }
                }
            }
            return 1;
        }else{
            return -1;
        }
    }
    
    @Override
    public boolean isBar(){
        return true;
    }
}
