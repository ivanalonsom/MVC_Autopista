/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autopista;

/**
 *
 * @author Encarna
 */
public class Camion extends Vehiculo {
    /**
     * Cantidad base que paga un cami�n (no incluye los gastos de gesti�n, 
     * ni el pago por los kms recorridos ni el pago por el tonelaje)
     */
    public static float PRECIO_BASE = 0.25f;
    /**
     * lo que se le cobra al cami�n por cada km recorrido
     */
    public static float PRECIO_POR_KM = 0.01f;
    /**
     * Lo que se le cobra al cami�n por cada tonelada que pesa
     */
    public static float PRECIO_POR_TONELADA_DE_PESO = 0.02f;
    /**
     * los kms recorridos por el cami�n
     */
    private final float kms;
    /**
     * El n�mero de toneladas de peso del cami�n
     */
    private final float tonelaje;

    public Camion(float kms, float tonelaje, String referenciaTicket) {
        super(referenciaTicket);
        this.kms = kms;
        this.tonelaje = tonelaje;
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
