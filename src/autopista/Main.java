/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autopista;

import Controlador.ControlaAutopista;
import Modelo.Bicicleta;
import Modelo.Camion;
import Modelo.Coche_Moto;
import Modelo.Gestora;
import Vista.Ventana;
import javax.swing.JFrame;

/**
 *
 * @author Iván
 */
public class Main {

    public static void main(String[] args) {
/*
        Ventana v = new Ventana();
        Bicicleta bici = new Bicicleta();
        Camion camion = new Camion();
        Coche_Moto auto = new Coche_Moto();
        Gestora gest = new Gestora();

        ControlaAutopista c = new ControlaAutopista(v, bici, camion, auto, gest);
*/
    
    Ventana v = new Ventana();
    
    v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
