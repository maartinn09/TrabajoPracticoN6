/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BlascoMatiasMartin_tp6;

/**
 *
 * @author M
 */
public class MainDirectorio {
    public static void main(String[] args){
        Directorio c1 = new Directorio();
        
        c1.agregarCliente("2664584745", new Cliente("43690217", "Martin","Blasco", "San luis", "Domicilio"));
        System.out.println("El cliente BUSCADO es: "+c1.buscarCliente("2664584745"));
        c1.borrarCliente("43690217");
        System.out.println("El cliente buscado es: "+c1.buscarCliente("2664584745"));
        
        
    }
}
