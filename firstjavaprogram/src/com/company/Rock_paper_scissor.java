package com.company;

import java.util.Scanner;
import java.util.Random;
public class Rock_paper_scissor {
    public static void main(String[] args){
       String[] rps = {"r","p","s"};
       String computerMove = rps[new Random().nextInt(rps.length)];
       Scanner sc = new Scanner(System.in);
       String playerMove;
       while(true) {
           System.out.println("Please enter your move (r,p,s)");
           playerMove = sc.nextLine();
           if(playerMove.equals("r") || playerMove.equals("p") || playerMove.equals("s")){
               break;
           }
           System.out.println(playerMove + " is not a valid move. ");
       }
        System.out.println(" Computer played : "+ computerMove);
       if (computerMove.equals(playerMove)){
           System.out.println("It was tie !");
       }
       else if (computerMove.equals("r")){
           if (playerMove.equals("p")){
               System.out.println("you win!");
           }
           else if(playerMove.equals("s")){
               System.out.println("you lose !");
           }
       }
       else if (computerMove.equals("p")){
           if (playerMove.equals("r")){
               System.out.println("you lose!");
           }
           else if(playerMove.equals("s")){
               System.out.println("you win !");
           }
       }
       else if (computerMove.equals("s")){
           if (playerMove.equals("p")){
               System.out.println("you lose!");
           }
           else if(playerMove.equals("r")){
               System.out.println("you win !");
           }
       }
    }
}
