
package com.mycompany.state;

public class Main{
    
    public static void main(String[] args){
        Mascota spike = new Mascota();
        
        new Menu(spike).display();
    }
}