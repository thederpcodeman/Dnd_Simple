package src;

import java.util.ArrayList;
import java.util.Scanner;

public class Question {
    public static boolean rand;
    public static boolean HB;
    public static boolean HB2;
    public static boolean UA;
    public static Option ask(ArrayList<Option> l1, String promt){
        ArrayList<Option> l = new ArrayList<>();
        if (!(HB && UA && HB2)){
            for (Option i : l1){
                if ((!i.HB || HB) && (!i.UA || UA) && (!i.HB2 || HB2)){
                    l.add(i);
                }
            }
        }else{
            l = l1;
        }
        if (l.size() == 0){
            return (new Option("Error: no legal options. :("));
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
