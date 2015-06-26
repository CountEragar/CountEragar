package com.counteragar;

import java.util.ArrayList;
import java.util.Scanner;

public class Language {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        ArrayList msgs = new ArrayList();
        
        int c;
        
        do {
            
            System.out.println(
                "What language would you prefer?\n" + 
                "Vilket språk föredrar du?\n" + 
                "[1] English\n" + 
                "[2] Svenska");
        
            c = s.nextInt();
        
            if (c == 1) {
                msgs.add("You choose: English.\nGood choice!");
                msgs.add("");
                msgs.add("");
                msgs.add("");
                c = 0;
            }
        
            else if (c == 2) {
                msgs.add("Du valde: Svenska.\nBra val!");
                msgs.add("");
                msgs.add("");
                msgs.add("");
                c = 0;
            }
        
            else {
                System.out.println("Not a valid choice.\nTry again.");
            }
        } while (c != 0);
        
        System.out.println(msgs.get(0));
        System.out.println("End.");
    }
    
}
