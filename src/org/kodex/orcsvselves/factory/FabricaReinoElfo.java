/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kodex.orcsvselves.factory;

import org.kodex.orcsvselves.data.CastilloElfo;
import org.kodex.orcsvselves.data.EjercitoElfo;
import org.kodex.orcsvselves.data.ReyElfo;
import org.kodex.orcsvselves.data.interfaces.Castillo;
import org.kodex.orcsvselves.data.interfaces.Ejercito;
import org.kodex.orcsvselves.data.interfaces.Rey;

/**
 *
 * @author JaxKodex
 */
public class FabricaReinoElfo implements FabricaAbstractaReino {
    
    private static final FabricaReinoElfo fabricaReinoElfo = new FabricaReinoElfo();

    private FabricaReinoElfo() {
    }
    
    public static FabricaAbstractaReino getInstance () {
        return fabricaReinoElfo;
    }

    @Override
    public Rey crearRey() {
        return new ReyElfo();
    }

    @Override
    public Castillo crearCastillo() {
        return new CastilloElfo();
    }

    @Override
    public Ejercito crearEjercito() {
        return new EjercitoElfo();
    }

}
