package src;

import src.Choices.Charicter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws InterruptedException {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        Scanner sc = new Scanner(System.in);
        System.out.println("Would you like to randomize (true/false)");
        Question.rand = sc.nextBoolean();
        System.out.println("Would you like to enable select Unearthed Arcana / Potentially Setting Specific features (These features will be called UA even if they are not) (true/false)");
        Question.UA = sc.nextBoolean();
        System.out.println("Would you like to enable select Homebrew features. (true/false)");
        Question.HB = sc.nextBoolean();
        if (Question.HB && Question.UA){
            System.out.println("Would you like to enable All Homebrew features. (true/false)");
            Question.HB2 = sc.nextBoolean();
        }else{
            Question.HB2 = false;
        }

        Charicter guy = new Charicter();
        ArrayList<Option> list = guy.run();
        ArrayList<Option> list2 = new ArrayList<>();
        ArrayList<Option> listfin = new ArrayList<>();
        while (list.size() > 0){
            for (Option i : list){
                for (Option i2 : i.run()){
                    list2.add(i2);
                }
                listfin.add(i);
            }
            list = new ArrayList<>();
            for (Option i : list2){
                list.add(i);
            }
            list2 = new ArrayList<>();
        }
        for (Option i : listfin){
            System.out.println(i.name);
            Thread.sleep(250);
        }




    }
}