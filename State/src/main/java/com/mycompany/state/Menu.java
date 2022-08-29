

package com.mycompany.state;

import java.util.Scanner;



public class Menu {

    Mascota mascota;
    
    public Menu(Mascota mascota){
        this.mascota = mascota;
    }
    
    public void display(){
        Scanner scanner = new Scanner(System.in);
        char opcion;
        String Opciones = "Realizar accion "+
                "a) alimentar, d) dormir, j) jugar, p) preguntar, s) salir";
        
        while(true){
            System.out.println(Opciones);
            opcion = scanner.next().charAt(0);
            switch (opcion) {
                case 'a': System.out.println("Mascota "); mascota.alimentar(); break;
                case 'd': System.out.println("Mascota "); mascota.dormir(); break;
                case 'j': System.out.println("Mascota "); mascota.jugar(); break;
                case 'p': System.out.println("Mascota "); mascota.ComoEstas(); break;
                case 's': System.out.println("Hasta pronto"); System.exit(0);
                default: System.out.println("Opcion no valida");
                    
            }
        }
    }
}

