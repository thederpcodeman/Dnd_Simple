package src;

import java.util.ArrayList;
import java.util.Scanner;

public class Question {
    public static boolean rand;
    public static boolean HB;
    public static boolean UA;
    public static Option ask(ArrayList<Option> l1, String promt){
        ArrayList<Option> l = new ArrayList<>();
        if (!(HB && UA)){
            for (Option i : l1){
                if ((!i.HB || HB) && (!i.UA || UA)){
                    l.add(i);
                }
            }
        }else{
            l = l1;
        }

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
