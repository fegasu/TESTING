/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;   

/**
 *
 * @author JOSE F GALINDO
 */
public class ALQUILAPC{

    /**
     * @param args the command line arguments
     */
    static Scanner entradaDatos = new Scanner(System.in);
    static String nom;
    static int opcion=0;
    static int equipos;
    static double domicilio;
    static int diasal;
    static int diasad;
    static double alqui;
    static String Tipo;
    static double descuentos=0;
    static double domi=0;
    static double diasd=0;
    static double total=0;
 
 static double CalculoDentroEstablecimiento(){
       return 0;  
     }
     static double CalcularValores(){
         return 0;
    }
    static double CalculoAlquilerAdicional(){
        return 0;
    }
    static double CalculoAlquilerAdicionalDto(){
        return 0;
    }
    static double CalculoAlquiler(){
       return 0;
    }
    static double CalculoDomicilio(){
        return 0;
    }
    static double CalculoDescuento(){
        return 0;
    }
    
    static void Encabezado(){
        //for (int i = 0; i < 100; ++i) System.out.println();
     	System.out.println("\t\t\t**************SENA PRUEBAS DE SOFTWARE 2020************");
	System.out.println("\t\t\tANALISIS Y DESARROLLO DE SISTEMAS DE INFORMACION CGMLTI\n\n");   
    }
    static void TipoServicio(){
                System.out.println("\nTipos de servicios ofrecidos");
        System.out.println("[1] Dentro de la Ciudad");
        System.out.println("[2] Fuera de la ciudad");
        System.out.println("[3] Dentro del Establecimiento");
        System.out.print("Tipo de servicio tomado por el cliente  :");
        opcion = entradaDatos.nextInt();
        if(opcion==1)
            Tipo="Dentro de la Ciudad";
        else if(opcion==2)
            Tipo="Fuera de la ciudad";
        else if(opcion==3)
            Tipo="Dentro del Establecimiento";

    }
    static void EquiposAlquiler(){
        System.out.print("Numero de equipos que desea alquilar:");
        equipos = entradaDatos.nextInt();        
    }
    static void DiasAlquiler(){
        System.out.print("Numero de Dias que desea tomar el alquiler:");
        diasal = entradaDatos.nextInt();        
    }
    static void DiasAdicionales(){
        System.out.print("Numero de Dias adicionales que toma el alquiler:");
        diasad = entradaDatos.nextInt();        
    }
    static void DatosBasicos(){
        System.out.print("Nombre Cliente:");
        nom = entradaDatos.nextLine();
        EquiposAlquiler();
        DiasAlquiler();
        DiasAdicionales();
    }
    static void MostrarDatos(){
        System.out.println("\t\t\tA L Q U I L A P C");
        System.out.println("Nombre:"+nom);
        System.out.println("Tipo de servicio:"+Tipo);
        System.out.println("Numero de Equipos:"+equipos);
        System.out.println("No. Dias Iniciales:"+diasal);
        System.out.println("Valor Alquiler: $"+CalculoAlquiler());
        System.out.println("No. Dias adicionales:"+diasad);
        System.out.println("Valor Dias adicionales: $"+CalculoAlquilerAdicional());
        System.out.println("Descuentos: $"+CalculoDescuento());
        System.out.println("Domicilio: $"+CalculoDomicilio());
        System.out.println("Total a pagar: $"+CalcularValores());
        System.out.println("Factura generada por el  S  E  N  A");
        System.out.println("Gracias por utilizar nuestros servicios...!!!");
    }
    
    public  static void  main(String[] args) {
        // TODO code apvoidplication logic here
         Encabezado();
         DatosBasicos();
         TipoServicio();
         CalcularValores();
         MostrarDatos();
       
    }
    
}