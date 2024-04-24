package src;

import src.Choices.Charicter;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws InterruptedException {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        Scanner sc = new Scanner(System.in);
        Question.rand = sc.nextBoolean();
        Charicter guy = new Charicter();
        for (Option i : guy.run()){
            System.out.println(i.name);
            Thread.sleep(5);
        }

    }
}