
package exp_s6_francisco_vargas;

import java.util.Scanner;

public class Exp2_S6_Francisco_Vargas {
    static int acomulador=0;
   static String acomuladorAsiento="";
   static String numeroAsiento=""; 
   
    public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
        String remplazo=" ";
        String resultado="";
        String asientos= "1 2 3\n4 5 6 \n7 8 9 ";
        String asientoModificar;             
        int numeroEntradas=0;   
        int opcion;
        int valorEntrada=10000;
        int opcion2=0;
      
        do{
            do {
        System.out.println("Bienvenidos al Cafe Moro");
        System.out.println("1 para Reserva de entradas 2 para Compra de entradas 3 Para modificar una venta existente 4 imprimir boletas");
        opcion=scanner.nextInt();
        }while(opcion>4||opcion<1);
        
        switch (opcion){
            
            case 1 ->{
                System.out.println("¿Cuantas entradas quiere reservar?");
                numeroEntradas=scanner.nextInt();
                System.out.println(asientos);
                
                for (int i = 1; i <= numeroEntradas; i++) {
                    System.out.println("elija numero de asiento");
                numeroAsiento=scanner.next();
                acomuladorAsiento+=numeroAsiento+" ";
                acomulador+=valorEntrada;}//breakpoint 1
                
                
               
            }
            case 2 ->{
                System.out.println("¿Cuantas entradas quiere comprar?");
                numeroEntradas=scanner.nextInt();
                System.out.println(asientos);
                                
                for (int i = 1; i <= numeroEntradas; i++) {
                    System.out.println("elija numero de asiento");
                numeroAsiento=scanner.next();
                acomuladorAsiento+=numeroAsiento+" ";
                acomulador+=valorEntrada;}//breakpoint 2
            
            }
            case 3 -> {
               
                if (numeroEntradas ==0)
                {System.out.println("primero debe ingresar un Asiento para poder modificar\n");
                break;
                     }
                 System.out.println("ingrese asiento que quiere modificar");
                  asientoModificar=scanner.next();
                  
                  if(acomuladorAsiento.contains(asientoModificar)){
                      System.out.println("presione 1 para Eliminar 2 Para cambiar");
                      opcion2=scanner.nextInt();}
                  if(opcion2==1){
                  resultado=acomuladorAsiento.replace(asientoModificar, remplazo);//breakpoint 3
                      System.out.println("OWO "+ resultado );}
                  
                           
                  else{
                      System.out.println("Asiento no esta reservado");}
            }
            case 4-> { 
                if (numeroEntradas==0){
                    System.out.println("debe tener una boleta activa para imprimir");
                    break;
                }else{
                System.out.println("¿imprimir boleta? 1 si 2 no" );
                opcion2=scanner.nextInt();
                if (opcion2==1){System.out.println("hola elejiste la opcion");
                
                }
                }
                        
            }
            
        }
        System.out.println("acomulador asientos   "+resultado);
        System.out.println("quiere salir? 1 si 2 no");
        opcion=scanner.nextInt();
            
        }while (opcion !=1);
       
    }
  
}
