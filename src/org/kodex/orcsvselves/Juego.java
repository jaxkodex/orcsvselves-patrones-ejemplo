/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kodex.orcsvselves;

import org.kodex.orcsvselves.data.interfaces.Castillo;
import org.kodex.orcsvselves.data.interfaces.Ejercito;
import org.kodex.orcsvselves.data.interfaces.Rey;
import org.kodex.orcsvselves.enums.Raza;
import org.kodex.orcsvselves.factory.FabricaReinoElfo;
import org.kodex.orcsvselves.factory.FabricaReinoOrco;

/**
 *
 * @author JaxKodex
 */
public class Juego {
    
    private final Raza raza;
    private Castillo castillo;
    private Rey rey;
    private Ejercito ejercito;
    
    public Juego (Raza raza) {
        this.raza = raza;
    }
    
    public void build () {
        if (Raza.ELFO.equals(raza)) {
            castillo = FabricaReinoElfo.getInstance().crearCastillo();
            rey = FabricaReinoElfo.getInstance().crearRey();
            ejercito = FabricaReinoElfo.getInstance().crearEjercito();
        } else {
            castillo = FabricaReinoOrco.getInstance().crearCastillo();
            rey = FabricaReinoOrco.getInstance().crearRey();
            ejercito = FabricaReinoOrco.getInstance().crearEjercito();
        }
    }
    
    public Raza getRaza () {
        return raza;
    }
}
