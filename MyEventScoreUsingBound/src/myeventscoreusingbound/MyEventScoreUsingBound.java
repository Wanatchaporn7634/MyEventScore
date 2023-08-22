/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package myeventscoreusingbound;

import java.util.Scanner;

/**
 *
 * @author GUS
 */
public class MyEventScoreUsingBound {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        LiveScoreBean scoreBean = new LiveScoreBean();
        SubscriberOne subOne = new SubscriberOne();
        SubscriberTwo subTwo = new SubscriberTwo();
        scoreBean.addPropertyChangeListener(subOne);
        scoreBean.addPropertyChangeListener(subTwo);
        
        Scanner sc = new Scanner(System.in);
        String score = "NULL";
        
        while(!score.equals("")) {
            System.out.print("Enter Score : ");
            score = sc.nextLine();
            
            if (!score.equals(""))
                scoreBean.setScoreLine(score);
        }
    }
}