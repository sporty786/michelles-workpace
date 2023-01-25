import java.util.*;

public class Test{
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>();
        // for (int i = 0; i < 8; i++){
        //     list.add(i);
        // }
        // System.out.println(list);
        // List<Integer> sublist = list.subList(0, 3);
        // System.out.println(sublist);
        // sublist.clear();
        // System.out.println(list);

        Animal kitty = new Cat();
        kitty.sound();
        kitty.jump();
        // kitty.purr();
    }
}