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
public class Jardim extends Parque implements Serializable{
    private double area;

    public Jardim(double area, double longitude, double latitude) {
        super(longitude, latitude);
        this.area = area;
    }
}