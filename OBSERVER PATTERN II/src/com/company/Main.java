package com.company;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
	Motor V8 =new Motor();
    Acelerador x =new Acelerador();
    x.enlazarObservador(V8);
    x.pizarElAcelerador();
    }
}
