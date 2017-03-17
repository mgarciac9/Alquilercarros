/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alquiler_autos;

import javax.swing.JOptionPane;

/**
 *
 * @author CG Consultors
 */
public class Alquiler_Autos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //Variables   
    String Carro="";
    int op1=0;
    int edad = 0;
    double desc = 0;
    int carro1=40;
    int carro2=45;
    int carro3=55;
    int valor = 0;
    double costo = 0;
    double neto = 0;
    double total_desc = 0;
    int cant_dias = 0;
    int cant_carro_1 = 0;
    int cant_carro_2 = 0;
    int cant_carro_3 = 0;
    int cant_cliente = 0;
    int cliente=1;
    //Fin de Variables 
    
    cant_cliente = Integer.parseInt( JOptionPane.showInputDialog("Digite la cantidad de clientes"));
    
    do{
        
               //Inicio de Menú variables
            JOptionPane.showMessageDialog( null,"Ingreso los Datos del Cliente #" +cliente);   
            edad = Integer.parseInt( JOptionPane.showInputDialog("Edite su Edad"));
            cant_dias = Integer.parseInt( JOptionPane.showInputDialog("Digite la cantidad de dias "));
            Carro="*** Seleccione su Vehiculo ***\n1.-Carro #1 \n2.-Carro #2  \n3.- Carro #3 " ;

                op1=Integer.parseInt(JOptionPane.showInputDialog (Carro));

         //Fin de Menú variables  
         
         
         //Inicio de switch escoger carro
        switch (op1) {
            case 1: // Carro #1
                valor = carro1;
                cant_carro_1++;

                //Inicio IF Descuento por edad       
                   if (edad<25){
                       desc =  (valor * cant_dias) *0.02; 
                       costo = (valor * cant_dias) - ((valor * cant_dias) *0.02); 
                       total_desc = (total_desc + desc);
                       neto= neto+costo;            
                   }
                   else {
                   if (edad>=25 && edad<35){
                   desc =  (valor * cant_dias) *0.05; 
                       costo = (valor * cant_dias) - desc; 
                       total_desc = (total_desc + desc);
                       neto= neto+costo;
                   }
                   else
                       {
                        if (edad>=35 && edad<45){
                   desc =  (valor * cant_dias) *0.06; 
                       costo = (valor * cant_dias) - desc; 
                       total_desc = (total_desc + desc);
                       neto= neto+costo;
                               }
                   else 
                            desc =  (valor * cant_dias) *0.09; 
                           costo = (valor * cant_dias) - desc; 
                           total_desc = (total_desc + desc);
                           neto= neto+costo;
                       }
               }


                //Fin IF Descuento por edad 
                
                
                
                break;
            case 2: // Carro #2
                valor = carro2;
                cant_carro_2++; 
                
                //Inicio IF Descuento por edad       
                   if (edad<25){
                       desc =  (valor * cant_dias) *0.02; 
                       costo = (valor * cant_dias) - desc; 
                       total_desc = (total_desc + desc);
                       neto= neto+costo;            
                   }
                   else {
                   if (edad>=25 && edad<35){
                   desc =  (valor * cant_dias) *0.05; 
                       costo = (valor * cant_dias) - desc; 
                       total_desc = (total_desc + desc);
                       neto= neto+costo;
                   }
                   else
                       {
                        if (edad>=35 && edad<45){
                   desc =  (valor * cant_dias) *0.06; 
                       costo = (valor * cant_dias) - desc; 
                       total_desc = (total_desc + desc);
                       neto= neto+costo;
                               }
                   else 
                            desc =  (valor * cant_dias) *0.09; 
                           costo = (valor * cant_dias) - desc; 
                           total_desc = (total_desc + desc);
                           neto= neto+costo;
                       }
               }


                  //Fin IF Descuento por edad  

                       break;
                
            case 3: //Carro #3
                valor = carro3;
                cant_carro_3++;
                
                //Inicio IF Descuento por edad       
                   if (edad<25){
                       desc =  (valor * cant_dias) *0.02; 
                       costo = (valor * cant_dias) - ((valor * cant_dias) *0.02); 
                       total_desc = (total_desc + desc);
                       neto= neto+costo;            
                   }
                   else {
                   if (edad>=25 && edad<35){
                   desc =  (valor * cant_dias) *0.05; 
                       costo = (valor * cant_dias) - desc; 
                       total_desc = (total_desc + desc);
                       neto= neto+costo;
                   }
                   else
                       {
                        if (edad>=35 && edad<45){
                   desc =  (valor * cant_dias) *0.06; 
                       costo = (valor * cant_dias) - desc; 
                       total_desc = (total_desc + desc);
                       neto= neto+costo;
                               }
                   else 
                            desc =  (valor * cant_dias) *0.09; 
                           costo = (valor * cant_dias) - desc; 
                           total_desc = (total_desc + desc);
                           neto= neto+costo;
                       }
               }


                  //Fin IF Descuento por edad 
            
                break;

              default:     
                       //Default es para hacer manejo de exepciones.

                JOptionPane.showMessageDialog(null, "Opción no valida, las opciones son del 1 al 5.");
         //Fin de switch escoger carro
                    break;       
    }
            JOptionPane.showMessageDialog(null, "El costo de alquiler del carro es " + (costo));
            cliente++; 
            }while (cliente <= cant_cliente);
    
    String to_print="Cantidad  de clientes = "+ cant_cliente + "\n"+                    
                    "Alquileres de Carro #1 = "+ cant_carro_1 +"\n"+ 
                    "Alquileres de Carro #2 = "+ cant_carro_2 +"\n"+ 
                    "Alquileres de Carro #3 = "+ cant_carro_3 +"\n"+
                    "Total de Ingresos Netos =" + neto + "\n"+ 
                    "Total de Descuentos = "+ total_desc +"\n"
            ;
    JOptionPane.showMessageDialog( null,to_print);
}
}
