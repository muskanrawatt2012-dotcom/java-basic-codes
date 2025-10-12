package Defining and Implementing Interfaces Problem Statements;

public class CloningExample {
    
}
class Prototype implements Cloneable {
    int id = 10;
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class CloningExample {
    public static void main(String[] args) throws CloneNotSupportedException {
        Prototype p1 = new Prototype();
        Prototype p2 = (Prototype) p1.clone();
        System.out.println("Cloned object id: " + p2.id);
    }
}
