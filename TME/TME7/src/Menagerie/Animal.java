package Menagerie;

public abstract class Animal {
    protected String nom;
    protected int age;

    public Animal(String n, int a) {
        nom = n;
        age = a;
    }

    public Animal(String n) {
        this(n, 1);
    }

    @Override
    public String toString() {
        return "Animal " + nom + " age:" + age;
    }

    public void vieillir() {
        age += 1;
    }

    public abstract void crier();
}
