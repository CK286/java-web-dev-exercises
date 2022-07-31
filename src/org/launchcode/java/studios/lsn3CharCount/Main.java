package org.launchcode.java.studios.lsn3CharCount;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //Declare Scanner type input
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Enter the phrase: ");
    String phrase = input.nextLine();
    input.close();
        CharCount.CharacterCt(phrase);
    }
}
