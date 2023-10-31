/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minihwgithubsetup;

import java.util.Scanner;

/**
 *
 * @author NHLUJ
 */
public class MiniHWGitHubSetup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        String [] responses = {"", "", ""};
        String [] answers = {"d", "a", "d"};
        
        System.out.println("What is 2 + 2?");
        System.out.println("a) 1");
        System.out.println("b) 2");
        System.out.println("c) 3");
        System.out.println("d) 4");
        
        System.out.println("What is 3 + 3?");
        System.out.println("a) 6");
        System.out.println("b) 7");
        System.out.println("c) 8");
        System.out.println("d) 9");
        
        System.out.println("What is 4 + 4?");
        System.out.println("a) 5");
        System.out.println("b) 6");
        System.out.println("c) 7");
        System.out.println("d) 8");
        
        responses[0] = scan.next();
        responses[1] = scan.next();
        responses[2] = scan.next();
        
        int score =0;
        
        for (int i =0; i < 3; i++){
            if(responses[i].equalsIgnoreCase(answers[i])){
            score++;
        }
                    
        }
        System.out.println("Score: " + score + "/3");
        

    }
    
}
