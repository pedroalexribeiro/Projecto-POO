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
public class Exposicao extends Local implements Serializable{
    private String formaArtistica;
    private double custoIngresso;

    public Exposicao(String formaArtistica, double custoIngresso, double longitude, double latitude) {
        super(longitude, latitude);
        this.formaArtistica = formaArtistica;
        this.custoIngresso = custoIngresso;
    }

    @Override
    public double getCusto() {
        return custoIngresso;
    }
}
