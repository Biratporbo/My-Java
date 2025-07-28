package Learnpoint_ii;

public abstract  class mainclass{
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.age=21;
        p1.name="Birat";

        Person p2 = new Person();
        p2.age=27;
        p2.name="Bishal";
        p2.read();
        // System.out.println(p1.age +" "+p1.name);
        p2.read(3);
        // System.out.println(p2.age +" "+p2.name);

        // p1.call();

    }
}


class Person{
    String name;
    int age;

    void call(){
        System.out.println(name + " is calling");
    }
    void read(){
        System.out.println(name + " is reading");
    }
    void read(int timing){
        System.out.println(name + " reading "+ timing);
    }
}