package src;

import java.util.ArrayList;
import java.util.Scanner;

public class Question {
    public static boolean rand;
    public static Option ask(ArrayList<Option> l, String promt){
        if (rand){
            return l.get((int) (Math.random() * l.size()));
        }else{
            int uin = -1;
            Scanner sc = new Scanner(System.in);
            while (!(uin >= 0 && uin < l.size())){
                System.out.println(promt);
                System.out.println("Choices:");
                for (Option i: l){
                    System.out.println(l.indexOf(i) + ": " + i.name);
                }
                uin = sc.nextInt();
            }
            return l.get(uin);
        }
    }
}
