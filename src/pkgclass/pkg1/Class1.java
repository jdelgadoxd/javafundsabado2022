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
        

        Frases();
            // datos de entrada para sumar
        int x=50;
        int y=60;
        
        sumarDosNumeros(x,y);
        sumarDosNumeros(50,190);
        restarDosNumeros(x,y);
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
            imprimirMensaje("la suma de "+n1 +" , "+n2+ "  es: " +resultado);
        }
        
}
