/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kodex.orcsvselves.factory;

import org.kodex.orcsvselves.data.CastilloOrco;
import org.kodex.orcsvselves.data.EjercitoOrco;
import org.kodex.orcsvselves.data.ReyOrco;
import org.kodex.orcsvselves.data.interfaces.Castillo;
import org.kodex.orcsvselves.data.interfaces.Ejercito;
import org.kodex.orcsvselves.data.interfaces.Rey;

/**
 *
 * @author JaxKodex
 */
public class FabricaReinoOrco implements FabricaAbstractaReino{
    private static final FabricaReinoOrco fabricaReinoOrco = new FabricaReinoOrco();

    private FabricaReinoOrco() {
    }
    
    public static FabricaAbstractaReino getInstance () {
        return fabricaReinoOrco;
    }

    @Override
    public Rey crearRey() {
        return new ReyOrco();
    }

    @Override
    public Castillo crearCastillo() {
        return new CastilloOrco();
    }

    @Override
    public Ejercito crearEjercito() {
        return new EjercitoOrco();
    }
    
}
