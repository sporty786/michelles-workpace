public class Cat extends Animal{
    Cat(){
        super("Meow");
    }
    void sound(){
        System.out.println("Cat sound:");
        super.sound();
    }
    void purr(){
        System.out.println("prrrr");
    }
}
