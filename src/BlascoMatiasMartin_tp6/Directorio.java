/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BlascoMatiasMartin_tp6;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author M
 */
public class Directorio {
    protected static TreeMap<Long,Cliente> clientes = new TreeMap();
    
    
    public Directorio() {
        
    }
    
    public static boolean agregarCliente(long telefono, Cliente cliente){
        if(clientes.containsKey(telefono)){
            return false;
        }else{
            clientes.put(telefono, cliente);
            return true;
        }
    }
    
    public static Cliente buscarCliente(long telefono){
        Cliente cliente=null;
        if(clientes.containsKey(telefono)){
            cliente = clientes.get(telefono);
        }return cliente;
    }
    
    public static List<Long> buscarTelefono(String apellido){
        ArrayList<Long> numeros = new ArrayList();
        
       for(Map.Entry<Long, Cliente> e:clientes.entrySet()){
           Long clave = e.getKey();
           Cliente valor = e.getValue();
           
           if(valor.getApellido().equals(apellido)){
                numeros.add(clave);
            }
       }
        
       return numeros;
    }
    
    public static List<Cliente> buscarClientes(String ciudad){
        ArrayList<Cliente> clientes1 = new ArrayList();
        
       for(Map.Entry<Long, Cliente> e:clientes.entrySet()){
           Long clave = e.getKey();
           Cliente valor = e.getValue();
           
           if(valor.getCiudad().equals(ciudad)){
           clientes1.add(valor);
           }  
       }
       return clientes1;
    }
       
    public static void borrarCliente(long dni){
        Long telefono = null;
        for (Map.Entry<Long, Cliente> e : clientes.entrySet()) {
            Long clave = e.getKey();
            Cliente valor = e.getValue();
            if(valor.getDni() == dni){
                telefono = clave;
            }
        }
        if(telefono != null){
            clientes.remove(telefono);
        }
        
    }
}
