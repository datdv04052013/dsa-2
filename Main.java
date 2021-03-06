/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messenger;

import java.util.Scanner;

/**
 *
 * @author datdu
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
    MainFunction mf = new MainFunction();
    int choice = 0;
    while (choice != 3)
    {
        System.out.println("Xin Moi Chon Chuc Nang");
        System.out.println("1.    Transfering ");
        System.out.println("2.    Processing ");
        System.out.println("3.    Exit");
        Scanner scanner = new Scanner(System.in);
        try {
        choice = scanner.nextInt();
        }catch (Exception e){
            System.out.println("Wrong input");
        }
        switch (choice){
            case 1:
            {
                mf.Transfer();
                break;       
        }
            case 2:
            {
                mf.Process();
                break;       
        }
            case 3:
            {
                System.exit(0);
                break;       
        }
            default:
            {
                System.out.println("Wrong choice");
                break;
               } 
           }
       }
    }
    
}
