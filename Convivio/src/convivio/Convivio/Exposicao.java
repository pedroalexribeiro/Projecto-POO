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

    @Override
    double getCusto() {
        return custoIngresso;
    }
}
