/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kodex.orcsvselves.factory;

import org.kodex.orcsvselves.data.interfaces.Castillo;
import org.kodex.orcsvselves.data.interfaces.Ejercito;
import org.kodex.orcsvselves.data.interfaces.Rey;

/**
 *
 * @author JaxKodex
 */
public interface FabricaAbstractaReino {
    
    public Rey crearRey();
    
    public Castillo crearCastillo();
    
    public Ejercito crearEjercito();
}
