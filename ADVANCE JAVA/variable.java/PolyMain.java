class Animal {        //class
    String name;
    String sound;

    Animal() {
        this("Cat", "Meow");
    }
    Animal(String name,String sound) { //parameterized constructor
        this.name = name;
        this.sound = sound;
    }
    void getInfo() {     //default method
        System.out.println(name);
        System.out.println(sound);
    }
    void getInfo(String a){   //overloaded method
        System.out.println(name);
        System.out.println(sound);
    }
    void getInfo(String sound, String legs){  //overloaded method
        System.out.println("CAT");
        System.out.println(sound);
        System.out.println(legs);
    }
}
public class PolyMain { //main class
     public static void main(String[] args) { //main method
        Animal an1 = new Animal("HORSE","HINGGG");
        an1.getInfo("HORSE");
        an1.getInfo("MEOW", String.valueOf(4));
        Animal c1 = new Animal();
        c1.getInfo();

    }
}
