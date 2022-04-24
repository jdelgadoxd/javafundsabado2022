/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgclass.pkg1;

/**
 *
 * @author Dianely
 */
public class Class1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        iniciandoCap1();
        revisandoVariable();
        revisandoVariableBoolean();
        revisionDeVariableChar();
        revisionDeVariablesDecimales();
    }
    
    public static void revisionDeVariablesDecimales(){
        System.out.println("revisionDeVariablesDecimales");
        double precioProducto=5.7;
    }
    public static void revisionDeVariableChar(){
        System.out.println("Tipo de dato Char");
        char estadoCivil='C'; //casado
             
    }
    public static void revisandoVariableBoolean(){
        System.out.println("Tipo de Dato Boolean");
        boolean deseaCasarse=false;
        boolean tienePasaporte=true;
        boolean esMayorDeEdad=false;
        
        
    }
  
    public static void revisandoVariable(){
        System.out.println("Revisando las variables de tipo entero ");
                //edad, año,stock,cantiGoles, nroFilas, nroColumnas, cantDedos,numHijos
                //nroViviendas, cantVacunas
        int cantidad=20;
        int edad=16;
        int anho= 2022;
        int candStock=60;
        int cantiGoles=4;
        int nroFilas=2500;
        int nroColumnas=256;
        int cantDedos=20;
        int numHijos=5;
        int nroViviendas=2;
        int cantVacunas=3;
        byte cantTickets=127; // desde -128 hasta 127
        short nroFilasAsociados=32767;
        long cantAsientosEstadio=85000;
            
    }
    
    public static void iniciandoCap1(){
        Frases();
            // datos de entrada para sumar
        int x=50;
        int y=60;
        sumarDosNumeros(x,y);
        //sumarDosNumerosExactos(50,190);
        restarDosNumeros(x,y);
        multiplicarDosNumeros(x,y);
    }
        
    public static void Frases(){
        
        // TODO code application logic here
        
        System.out.println("Bienvenidos a curso Java Fundamentals Abril-2022");
        imprimirMensaje ("Bienvenidos al Curso Java 11 Fundamentals");
        imprimirMensaje ("Estamos revisando codificación en Java");
        String texto ="Capítulo 1: Generación de código a través de mensajes";
        imprimirMensaje(texto);
    
        }
        public static void restarDosNumeros(int op1, int op2){
            int resultado =op1-op2;
            System.out.println("La resta de "+op1+" - "+op2+ " es: " +resultado);
        }
        public static void imprimirMensaje(String msg){
            System.out.println(msg);
        }
        public static void sumarDosNumeros(int n1, int n2){
            int resultado=n1+n2;
            imprimirMensaje("la suma de "+n1 +", "+n2+ "  es: " +resultado);
        }
        public static void multiplicarDosNumeros (int n1, int n2){
            int producto=n1*n2;
            imprimirMensaje("El producto de "+n1 +","+n2+ " es: "+producto);
        }
}
