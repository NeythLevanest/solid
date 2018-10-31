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
public class NavegacionTest {
    
    public static void navegacion(VehiculoAcuatico... vehiculosAcuaticos) {
        for (VehiculoAcuatico vehiculo : vehiculosAcuaticos) {
                vehiculo.navegar();
        }
    }
        
    public static void main(String[] args) {
        // TODO code application logic here
        Velero v = new Velero();
        MotoAcuatica m = new MotoAcuatica();
        navegacion(m, v, m);
        
    }
    
}
