
package com.mycompany.state;


public class Aburrido implements Estado {
    
    private Mascota mascota;
   
    @Override
    public void setMascota(Mascota mascota){
        this.mascota = mascota;
    }
    
    public void alimnetar(){
        System.out.println("No quiero comer");
    }
    
    @Override
    public void jugar(){
        System.out.println("Juguemos");
        mascota.setEstado(new Cansado());
    }
    
    @Override
    public void dormir(){
        System.out.println("No quiero dormir");
    }
    
    @Override
    public void ComoEstas(){
        System.out.println("Estoy aburrido, quiero jugar");
    }

    @Override
    public void alimentar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
