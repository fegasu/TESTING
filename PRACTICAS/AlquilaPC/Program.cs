/*
 * Creado por SharpDevelop.
 * Usuario: JOSE F GALINDO
 * Fecha: 08/06/2022
 * Hora: 07:53 p. m.
 * 
 * Para cambiar esta plantilla use Herramientas | Opciones | Codificación | Editar Encabezados Estándar
 */
using System;

namespace Prueba1
{
	class Program
	{
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
        //for (int i = 0; i < 100; ++i) Console.WriteLine();
     	Console.WriteLine("\t\t\t**************SENA PRUEBAS DE SOFTWARE 2020************");
	Console.WriteLine("\t\t\tANALISIS Y DESARROLLO DE SISTEMAS DE INFORMACION CGMLTI\n\n");   
    }
    static void TipoServicio(){
                Console.WriteLine("\nTipos de servicios ofrecidos");
        Console.WriteLine("[1] Dentro de la Ciudad");
        Console.WriteLine("[2] Fuera de la ciudad");
        Console.WriteLine("[3] Dentro del Establecimiento");
        Console.Write("Tipo de servicio tomado por el cliente  :");
        opcion = int.Parse(Console.ReadLine());
        if(opcion==1)
            Tipo="Dentro de la Ciudad";
        else if(opcion==2)
            Tipo="Fuera de la ciudad";
        else if(opcion==3)
            Tipo="Dentro del Establecimiento";

    }
    static void EquiposAlquiler(){
        Console.Write("NÝmero de equipos que desea alquilar:");
        equipos = int.Parse(Console.ReadLine());       
    }
    static void DiasAlquiler(){
        Console.Write("NÝmero de dÝas que desea tomar el alquiler:");
        diasal = int.Parse(Console.ReadLine());         
    }
    static void DiasAdicionales(){
        Console.Write("NÝmero de dÝas adicionales que toma el alquiler:");
        diasad = int.Parse(Console.ReadLine());          
    }
    static void DatosBasicos(){
        Console.Write("Nombre Cliente:");
        nom = Console.ReadLine();  
        EquiposAlquiler();
        DiasAlquiler();
        DiasAdicionales();
    }
    static void MostrarDatos(){
        Console.WriteLine("\t\t\tA L Q U I L A P C");
        Console.WriteLine("Nombre:"+nom);
        Console.WriteLine("Tipo de servicio:"+Tipo);
        Console.WriteLine("Numero de Equipos:"+equipos);
        Console.WriteLine("No. DÝas Iniciales:"+diasal);
        Console.WriteLine("Valor Alquiler: $"+CalculoAlquiler());
        Console.WriteLine("No. DÝas adicionales:"+diasad);
        Console.WriteLine("Valor dÝas adicionales: $"+CalculoAlquilerAdicional());
        Console.WriteLine("Descuentos: $"+CalculoDescuento());
        Console.WriteLine("Domicilio: $"+CalculoDomicilio());
        Console.WriteLine("Total a pagar: $"+CalcularValores());
        Console.WriteLine("Factura generada por el  S  E  N  A");
        Console.WriteLine("Gracias por utilizar nuestros servicios...!!!");
        Console.WriteLine("Presione una tecla.....");
        Console.ReadLine();
    }
    
		public static void Main(string[] args)
		{
		 Encabezado();
         DatosBasicos();
         TipoServicio();
         CalcularValores();
         MostrarDatos();
		}
	}
}