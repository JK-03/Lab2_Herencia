package herencia_lab2;

import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jenniferbueso
 */
public class PlanSamsung extends Plan{
    private String pin;
    ArrayList<String> bbm;

    public PlanSamsung(int numeroTelefono, String nombreCliente, String pin) {
        super(numeroTelefono, nombreCliente);
        this.pin = pin;
        this.bbm = new ArrayList<>();
    }
    
    @Override
    public double pagoMensual(int mins, int msgs){
        if(mins > 200){
            return 40+((mins-200)*0.8);
        }
        if(msgs > 300){
            return 40+((msgs-300)*0.2);
        }
        if(msgs > 300 && mins > 200){
            return 40+((msgs-300)*0.2)+((mins-200)*0.8);
        }
        return 40;
    }
    
    @Override
    public String imprimir() {
        return super.imprimir() + "\nPin: " + pin;
    }
    
    public void agregarPinAmigo(String pin) {
        if (!bbm.contains(pin)) {
            bbm.add(pin);
        }
    }

    public String getPin() {
        return pin;
    }
}
