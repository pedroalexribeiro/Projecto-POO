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

    @Override
    double getCusto() {
        return consumoMinimo;
    }
}
