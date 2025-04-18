
package exp_s6_francisco_vargas;

import java.util.Scanner;

public class NumerosPares {
    static int acomulador=0;
    static String acomuladorAsiento="";
    static String numeroAsiento="";
    static int cantidadEntrada=0; 
    
    public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
      
        String remplazo=" ";
        String asientos= "1 2 3\n4 5 6 \n7 8 9 ";
        String asientoModificar;             
        int numeroEntradas=0;   
        int opcion;
        int valorEntrada=10000;
        int opcion2=0;
        int opcion3=0;
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
                      if (acomuladorAsiento.contains(numeroAsiento)){
                    System.out.println("asiento no disponible");
                    i--;
                    acomuladorAsiento=acomuladorAsiento.replace(numeroAsiento, remplazo);//BReakpoint 4
                          
                    acomulador-=valorEntrada;
                    cantidadEntrada--;
             }
                    acomuladorAsiento+=numeroAsiento+" ";
                    cantidadEntrada++;
                    acomulador+=valorEntrada;//breakpoint 1
                    
              }
                System.out.println("entradas reservadas");
                System.out.println("para continuar precione opcion 2  para volver al menu principal");
                System.out.println("despues seleccionar opcion 4 para imprimir boleta y hacer efectiva la reserva");
                System.out.println("para salir precione opcion 1 si sale sin imprimir la boleta la reserva se cancelara");
             }
            case 2 ->{
                
                if(cantidadEntrada>=1){
                    System.out.println("Ssi continua se borrara su reserva si quiere continuar con la reserva imprima su boleta  ");
                    do{
                    System.out.println("1 para imprimir 2 para continuar");
                    opcion2=scanner.nextInt();}while(opcion2<1||opcion2>2);
                     if (opcion2==1){
                    System.out.println("ubicacion de Asientos: "+ acomuladorAsiento);
                    System.out.println("cantidad de entradas: "+ cantidadEntrada);
                    System.out.println("valor total: " + acomulador);
                   
                    acomuladorAsiento=" ";
                    acomulador=0;
                    break;
                }else if(opcion2==2){
                    cantidadEntrada-=cantidadEntrada;
                    acomuladorAsiento=" ";
                    acomulador=0;
                }
                
                }
                
                 System.out.println("¿Cuantas entradas quiere reservar?");
                numeroEntradas=scanner.nextInt();
                System.out.println(asientos);
                for (int i = 1; i <= numeroEntradas; i++) {
                    System.out.println("elija numero de asiento");
                    numeroAsiento=scanner.next();
                      if (acomuladorAsiento.contains(numeroAsiento)){
                    System.out.println("asiento no disponible");
                    i--;
                    acomuladorAsiento=acomuladorAsiento.replace(numeroAsiento, remplazo);//BReakpoint 3
                          
                    acomulador-=valorEntrada;
                    cantidadEntrada--;
             }
                    acomuladorAsiento+=numeroAsiento+" ";
                    cantidadEntrada++;
                    acomulador+=valorEntrada;//breakpoint 1
                    
              }
                System.out.println("¿Quiere Imprimir Boleta?presione 1 para si presione 2 para no");
                opcion=scanner.nextInt();
                if (opcion==1){
                    System.out.println("ubicacion de Asientos: "+ acomuladorAsiento);
                    System.out.println("cantidad de entradas: "+ cantidadEntrada);
                    System.out.println("valor total: " + acomulador);
                    
                    acomuladorAsiento=" ";
                    acomulador=0;
                    numeroEntradas=0;
                    
                }
                
            }
               
            case 3 -> {
               
                if (numeroEntradas ==0)
                {System.out.println("primero debe reservar un Asiento para poder modificar");
                break;
                     }
                 System.out.println("ingrese asiento que quiere modificar");
                    asientoModificar=scanner.next();
                  
                  if(acomuladorAsiento.contains(asientoModificar)){
                      System.out.println("presione 1 para Eliminar 2 Para cambiar");
                      opcion2=scanner.nextInt();}
                  if(opcion2==1){
                  acomuladorAsiento=acomuladorAsiento.replace(asientoModificar, remplazo);//breakpoint 3
                      System.out.println("OWO "+ acomuladorAsiento );}
                  
                           
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
                    
                if (opcion2==1){
                    System.out.println("ubicacion de Asientos: "+ acomuladorAsiento);
                    System.out.println("cantidad de entradas: "+ cantidadEntrada);
                    System.out.println("valor total: " + acomulador);
                    
                    acomuladorAsiento=" ";
                    acomulador=0;
                }
                }
                        
            }
            
        }
           
        do{
        System.out.println("quiere salir? 1 si 2 no");
        opcion3=scanner.nextInt();
        
        }while(opcion3<1 || opcion3>2);
        }while (opcion3 !=1);
        scanner.close();
        System.out.println("gracias por venir a Cafe Moro"); 
    }
  
}

