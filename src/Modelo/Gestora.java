/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Modelo.Vehiculo;

/**
 *
 * @author Iv�n
 */
public class Gestora {

    /**
     * el n�mero total de bicicletas que han pagado peaje
     */
    public int numBicicletas;
    /**
     * el n�mero total de coches y motos que han pagado peaje
     */
    public int numCochesMotos;
    /**
     * el n�mero total de camiones que han pagado peaje
     */
    public int numCamiones;
    /**
     * recaudaci�n total obtenida por el pago de peaje de biciletas
     */
    public float recaudacionBicicletas;
    /**
     * recaudaci�n total obtenida por el pago de peaje de coches y motos
     */
    public float recaudacionCochesMotos;
    /**
     * recaudaci�n total obtenida por el pago de peaje de camiones
     */
    public float recaudacionCamiones;

    /**
     * Actualiza la recaudaci�n obtenida por el paso de UN coche o moto o un
     * cami�n o una bicicleta(si el veh�culo es un camion se actualizara la
     * recaudaci�n de camiones pero si es un coche o una moto, se actualizar� la
     * recaudaci�n de coches y motos) Tambi�n se incrementar� el contador de
     * veh�culos que corresponda (numBicicletas, numCochesMotos o numCamiones)
     *
     * @param vehiculo el veh�culo que acaba de pasar por el peaje
     */
    public void actualizarInformacion(Vehiculo vehiculo) {
       //mdodifica el m�todo
    }

    /**
     * Calcula el total que hasta el momento se ha recaudado en el peaje por el
     * paso de bicicletas,coches, motos y camiones
     *
     * @return
     */
    public float devolverTotalRecaudado() {
        //modifica el m�todo
        return 0;
    }
    
    /**
     * devuelve un String con la siguiente informaci�n y en el siguiente
     * formato:
     *
            TOTAL RECAUDADO:	17,50 �

            VEHICULO M�S FRECUENTE:BICICLETA - COCHES_MOTOS

            BICIS	MOTOS_COCHES	CAMIONES
            3       	3       	1       
            1,80    	14,30   	1,40    
     * @return
     */
    @Override
    public String toString() {
       //modifica el m�todo
        return null;
    }
    /**
     * devuelve el tipo de veh�culo m�s frecuente
     * @return BICICLETA, CAMION o COCHE_MOTO (si la cantidad correspondiente 
     * al menos frecuente coincide para varios tipos el String devuelto contendr� 
     * todos los nombres de tipo coincidentes separados por un -)
     */
    public String devuelveTipoVehiculoMasFrecuente(){
        //modifica el m�todo
        return null;
    }
}
