package Menagerie;

public abstract class APattes extends Animal {
    protected int nbPattes;

    protected APattes(String nom,int age){
        super(nom, age);
    }

    protected APattes(String nom){
        super(nom);
    }
}