/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Iv�n
 */
public class Bicicleta extends Vehiculo{
    /**
     * Cantidad que paga una bicicleta (no incluye los gastos de gesti�n)
     */
    public static float PRECIO_BASE=0.5f;

    public Bicicleta(String referenciaTicket) {
        super(referenciaTicket);
    }
    public Bicicleta(){
        
    }
/**
     * Calcula lo que debe pagar el veh�culo por el peaje (incluyendo los gastos
     * de gesti�n)
     * @return 
     */
    @Override
    float devolverImporte() {
        //modifica el m�todo
       return 0;
    }
    
}
