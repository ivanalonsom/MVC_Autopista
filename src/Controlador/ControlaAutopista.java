/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Vista.Ventana;
import Modelo.Bicicleta;
import Modelo.Camion;
import Modelo.Coche_Moto;
import Modelo.Gestora;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

/**
 *
 * @author Iván
 */
public class ControlaAutopista implements ActionListener{
    
    private Ventana v;
    
    private Bicicleta bici;
    private Camion camion;
    private Coche_Moto auto;
    private Gestora gest;
    
    private float precioTotal = 0;
    private float precioBici = 0;
    private float precioCamion = 0;
    private float precioAuto = 0;
    
    private int contBici = 0;
    private int contCamion = 0;
    private int contAuto = 0;
    

    public ControlaAutopista(Ventana v, Bicicleta bici, Camion camion, Coche_Moto auto, Gestora gest) {
        this.v = v;
        this.bici = bici;
        this.camion = camion;
        this.auto = auto;
        this.gest = gest;
        this.v.jButtonCancelar.addActionListener(this);
        this.v.jButtonAceptar.addActionListener(this);
        this.v.jRadioButtonBici.addActionListener(this);
        this.v.jRadioButtonCamion.addActionListener(this);
        this.v.jRadioButtonCocheMoto.addActionListener(this);
    }
    
    public void iniciar(){
        v.setVisible(true);
        v.setTitle("PEAJE AUTOPISTA");
        v.setLocationRelativeTo(null);
    }
    
    public void vehiculoSel(){
        if(v.jRadioButtonBici.isSelected() ){
            v.jTextFieldKMS.setEnabled(false);
            v.jTextFieldToneladas.setEnabled(false);
        } else if(v.jRadioButtonCamion.isSelected() ){
            v.jTextFieldKMS.setEnabled(true);
            v.jTextFieldToneladas.setEnabled(true);
        }else if(v.jRadioButtonCocheMoto.isSelected() ){
            v.jTextFieldKMS.setEnabled(true);
            v.jTextFieldToneladas.setEnabled(false);
        }
    }
    
    public String vehicFrecuente(){
        if(contBici>contAuto && contBici>contCamion){
            return "Bicicleta";
        }else if(contCamion>contAuto && contCamion>contBici){
            return "Camión";
        }else if(contAuto>contCamion && contAuto>contBici){
            return "Coche y moto";
        }else{
            return "Tenemos empate";
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == v.jButtonCancelar){
            System.exit(0);
        }
        if(e.getSource() == v.jRadioButtonBici || e.getSource() == v.jRadioButtonCamion || e.getSource() == v.jRadioButtonCocheMoto){
            vehiculoSel();
        }
        if(e.getSource() == v.jButtonAceptar){
           String referencia = v.jTextFieldReferencia.getText();
           
           int km = (v.jTextFieldKMS.getText().equals("")) ? 0:Integer.parseInt(v.jTextFieldKMS.getText() );
           int tonelaje = (v.jTextFieldToneladas.getText().equals("")) ? 0:Integer.parseInt(v.jTextFieldToneladas.getText() );
           
           if(v.jRadioButtonBici.isSelected()){
               Bicicleta bici = new Bicicleta(referencia);
               precioBici += Modelo.Bicicleta.PRECIO_BASE;
               contBici++;
               
           } else if (v.jRadioButtonCamion.isSelected() ){
               Camion camion = new Camion(km, tonelaje, referencia);
               precioCamion += Modelo.Camion.PRECIO_BASE + 
                       Modelo.Camion.PRECIO_POR_KM * camion.getKms() +
                       Modelo.Camion.PRECIO_POR_TONELADA_DE_PESO * camion.getTonelaje();
               contCamion++;
           } else if (v.jRadioButtonCocheMoto.isSelected() ){
               Coche_Moto auto = new Coche_Moto(km, referencia);
               precioAuto += Modelo.Coche_Moto.PRECIO_BASE + Modelo.Coche_Moto.PRECIO_POR_KM * auto.getKms();
               contAuto++;
           }
           precioTotal = precioBici + precioAuto + precioCamion;
        }
        
        DecimalFormat df = new DecimalFormat("#.##");
        String precioTotFormat = df.format(precioTotal);
        String precioBiciFormat = df.format(precioBici);
        String precioCamionFormat = df.format(precioCamion);
        String precioAutoFormat = df.format(precioAuto);
        
        v.jTextArea1.setText("TOTAL RECAUDADO:\t" +  precioTotFormat + "€\n\n" + 
                "VEHÍCULO MÁS FRECUENTE: " + vehicFrecuente() +
                "\n\nBICIS\tMOTOS_COCHES\tCAMIONES \n" +
                contBici + "\t" + contAuto + "\t" + contCamion + "\n" +
                precioBiciFormat + "\t" + precioAutoFormat + "\t" + precioCamionFormat);
       
        
    }
    
    
}
