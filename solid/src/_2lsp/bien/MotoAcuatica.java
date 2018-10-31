/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _2lsp.bien;

/**
 *
 * @author Palacios
 */
public class MotoAcuatica implements VehiculoAcuatico{
    private boolean encendido;

    public MotoAcuatica() {
        this.encendido = false;
    }
        
    @Override
    public void navegar() {
        if(!estaEncendido()){
            this.encender();
            System.out.println("Encendido & Navegando");
        }else{
            System.out.println("Navegando");
        }
    }
    
    public boolean estaEncendido(){
        return encendido;
    }
    
    public void encender(){
        this.encendido = true;
    }
    
}
