/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import entidades.Evehiculo;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.sql.*;
/**
 *
 * @author Josué
 */
public class Dvehiculo {
    
    public ArrayList<Evehiculo> alVehiculo = new ArrayList<>();
Evehiculo vehiculo;
   
		
	
	
	/*public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
           // cargar();
            /*for(int i=0;i<alVehiculo.size();i++){
                System.out.println(alVehiculo.get(i));
            }
             alVehiculo.get(0).setNombre("JJJ");
            for(int i=0;i<alVehiculo.size();i++){
                System.out.println("\n"+alVehiculo.get(i));
            }*/
            /* for(int i=0;i<alVehiculo.size();i++){
                System.out.println("\n"+alVehiculo.get(i));
            }
            modificar("Josue AShton","Josuecito","09", "0952434744", "----", "----");
             for(int i=0;i<alVehiculo.size();i++){
                System.out.println("\n"+alVehiculo.get(i));
            }
            
                System.out.println("Se ha producido un error en la conexion a la base de datos Ejemplo! \n"+e.getMessage());
            }
	}*/
	
    public ArrayList<Evehiculo> Buscar(String nombre){ 
        int i =0; boolean bandera=false;
        ArrayList<Evehiculo> ar = new ArrayList<Evehiculo>();
        if(nombre.equals("")){
           JOptionPane.showMessageDialog(null,"Debe ingresar el nombre del Cliente");
        }else{
            for(i=0; i<alVehiculo.size(); i++){
                if( alVehiculo.get(i).getNombre().equalsIgnoreCase(nombre)){
                   ar.add(alVehiculo.get(i));
                   bandera=true;
                }
            }
            if(bandera==false){
                JOptionPane.showMessageDialog(null,"Cliente no encontrado");
            }
        }
		return ar;
    } 
	
	public  int tamArr(){
		return alVehiculo.size();
	}

	public  Dvehiculo(){
		Evehiculo vehiculo = new Evehiculo();
		vehiculo = new Evehiculo("Josue AShton","0952434744","0991562492","Coop. Juan Montalvo Mz.1985 V.1");
		alVehiculo.add(vehiculo);
		vehiculo = new Evehiculo("Andy Carrillo","0999999999","0999999999","En su casa");
		alVehiculo.add(vehiculo);
		vehiculo = new Evehiculo("Joseph Vazques","0777777777","0777777777","Por ahi");
		alVehiculo.add(vehiculo);
		vehiculo = new Evehiculo("Bryan Romero","0666666666","0666666666","en el GYM");
		alVehiculo.add(vehiculo);
		vehiculo = new Evehiculo("Jonathan Guato","0555555555","0555555555","Guayaquil");
		alVehiculo.add(vehiculo);
	}
        
        public void nuevo(Evehiculo vehiculo){
            
            int c=0;
            if(vehiculo.getNombre().equals("") || vehiculo.getCelular().equals("") || vehiculo.getCi().equals("") || vehiculo.getDireccion().equals("")){
                JOptionPane.showMessageDialog(null,"Debe llenar los campos del Cliente");
            }else{
                for(int i=0; i<alVehiculo.size(); i++){
                    if(alVehiculo.get(i).getNombre().equals(vehiculo.getNombre()) || alVehiculo.get(i).getCi().equals(vehiculo.getCi())){
                           /*System.out.println(alVehiculo.get(i).getNombre().toString()+" - "+nombre);
                           System.out.println(alVehiculo.get(i).getCi().toString()+" - "+ci);*/
                            c++; 
                    }
                }
               if(c!=0){
                   JOptionPane.showMessageDialog(null,"Cliente Ya Existe en el Sistema");
               }else{
                  
                   alVehiculo.add(vehiculo);
                   JOptionPane.showMessageDialog(null,"Cliente Guardado Correctamente");
               }
            }
                
        }
        
        public void modificar(Evehiculo vehiculo, String n1, String c1){
            int c=0,i=0,aux=0;
            if(vehiculo.getNombre().equals("") || vehiculo.getCelular().equals("") || vehiculo.getCi().equals("") || vehiculo.getDireccion().equals("")){
                JOptionPane.showMessageDialog(null,"Debe seleccionar un Cliente");
            }else{
                for(i=0; i<alVehiculo.size(); i++){
                    if(alVehiculo.get(i).getNombre().equals(n1) || alVehiculo.get(i).getCi().equals(c1)){
                           System.out.println(alVehiculo.get(i).getNombre().toString()+" - "+vehiculo.getNombre());
                           System.out.println(alVehiculo.get(i).getCi().toString()+" - "+vehiculo.getCi());
                            c++;
                            aux=i;
                    }
                }
               if(c!=0){
                   alVehiculo.get(aux).setNombre(vehiculo.getNombre());
                   alVehiculo.get(aux).setCi(vehiculo.getCi());
                   alVehiculo.get(aux).setCelular(vehiculo.getCelular());
                   alVehiculo.get(aux).setDireccion(vehiculo.getDireccion());
                   JOptionPane.showMessageDialog(null,"Cliente guardado correctamente");
               }else{
                   JOptionPane.showMessageDialog(null,"Cliente no Existe en el Sistema");
               }
            }
        }
        
        public void eliminar(Evehiculo v){
            int c=0,i=0,aux=0;
            if(vehiculo.getNombre().equals("") || vehiculo.getCi().equals("")){
                JOptionPane.showMessageDialog(null,"Debe seleccionar un Cliente");
            }else{
                for(i=0; i<alVehiculo.size(); i++){
                    if(alVehiculo.get(i).getNombre().equals(vehiculo.getNombre()) || alVehiculo.get(i).getCi().equals(vehiculo.getCi())){
                            c++;
                            aux=i;
                    }
                }
               if(c!=0){
                   alVehiculo.remove(aux);
                   JOptionPane.showMessageDialog(null,"Cliente se eliminó correctamente");
               }else{
                   JOptionPane.showMessageDialog(null,"Cliente no Existe en el Sistema");
               }
            }
        }
}
