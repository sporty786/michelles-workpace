public class Animal {
    String noise;
    Animal(){
        this.noise = "";
    }
    Animal(String noise){
        this.noise = noise;
    }
    void sound(){
        System.out.println(noise);
    }
    void jump(){
        System.out.println("Boing!");
    }
}
