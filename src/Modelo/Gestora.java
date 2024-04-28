/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Modelo.Vehiculo;

/**
 *
 * @author Iván
 */
public class Gestora {

    /**
     * el número total de bicicletas que han pagado peaje
     */
    public int numBicicletas;
    /**
     * el número total de coches y motos que han pagado peaje
     */
    public int numCochesMotos;
    /**
     * el número total de camiones que han pagado peaje
     */
    public int numCamiones;
    /**
     * recaudación total obtenida por el pago de peaje de biciletas
     */
    public float recaudacionBicicletas;
    /**
     * recaudación total obtenida por el pago de peaje de coches y motos
     */
    public float recaudacionCochesMotos;
    /**
     * recaudación total obtenida por el pago de peaje de camiones
     */
    public float recaudacionCamiones;

    /**
     * Actualiza la recaudación obtenida por el paso de UN coche o moto o un
     * camión o una bicicleta(si el vehículo es un camion se actualizara la
     * recaudación de camiones pero si es un coche o una moto, se actualizará la
     * recaudación de coches y motos) También se incrementará el contador de
     * vehículos que corresponda (numBicicletas, numCochesMotos o numCamiones)
     *
     * @param vehiculo el vehículo que acaba de pasar por el peaje
     */
    public void actualizarInformacion(Vehiculo vehiculo) {
       //mdodifica el método
    }

    /**
     * Calcula el total que hasta el momento se ha recaudado en el peaje por el
     * paso de bicicletas,coches, motos y camiones
     *
     * @return
     */
    public float devolverTotalRecaudado() {
        //modifica el método
        return 0;
    }
    
    /**
     * devuelve un String con la siguiente información y en el siguiente
     * formato:
     *
            TOTAL RECAUDADO:	17,50 €

            VEHICULO MÁS FRECUENTE:BICICLETA - COCHES_MOTOS

            BICIS	MOTOS_COCHES	CAMIONES
            3       	3       	1       
            1,80    	14,30   	1,40    
     * @return
     */
    @Override
    public String toString() {
       //modifica el método
        return null;
    }
    /**
     * devuelve el tipo de vehículo más frecuente
     * @return BICICLETA, CAMION o COCHE_MOTO (si la cantidad correspondiente 
     * al menos frecuente coincide para varios tipos el String devuelto contendrá 
     * todos los nombres de tipo coincidentes separados por un -)
     */
    public String devuelveTipoVehiculoMasFrecuente(){
        //modifica el método
        return null;
    }
}
