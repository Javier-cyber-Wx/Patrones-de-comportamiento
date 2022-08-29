package com.company;

public class Motor  implements Observador{

    public Motor() {}
    @Override
    public void update() {
        System.out.println("Subir velocidad, revoluciones y la potencia");
    }
}
