
package com.mycompany.state;


public class Hambriento implements Estado{
    
    private Mascota mascota;
    
    public Hambriento(){
        
    }

    @Override
    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    @Override
    public void alimentar() {
        System.out.println("Ñam, ñam");
        mascota.setEstado(new Aburrido());
    }

    @Override
    public void jugar() {
        System.out.println("No quiero jugar, tengo hambre");
    }

    @Override
    public void dormir() {
        System.out.println("No tengo sueño");
    }

    @Override
    public void ComoEstas() {
        System.out.println("Tengo hamre, quiero comer");
    }
}
