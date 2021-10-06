/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BlascoMatiasMartin_tp6;


import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author M
 */
public class Directorio {
    private TreeMap<String,Cliente> clientes = new TreeMap<>();
    
    
    public Directorio() {
        
    }
    
    public boolean agregarCliente(String telefono, Cliente cliente){
        if(clientes.containsKey(telefono)){
            return false;
        }else{
            clientes.put(telefono, cliente);
            return true;
        }
    }
    
    public Cliente buscarCliente(String numero){
        Cliente cliente=null;
        if(clientes.containsKey(numero)){
            cliente = clientes.get(numero);
        }return cliente;
    }
    
//    public boolean buscarTeléfono(String apellido){
//        
//    }
    
//    public void buscarClientes(String ciudad){
//        
//    }
    
    public void borrarCliente(String dni){
         Set<String> key=clientes.keySet();
         Iterator it=key.iterator();
         while(it.hasNext()){
             String l1=(String)it.next();
             Cliente c1=clientes.get(l1);
             if(c1.getDni().equals(dni)){
                it.remove();
                System.out.println("El cliente BORRADO es: "+c1.toString());
             }
         }
         
    }
}
