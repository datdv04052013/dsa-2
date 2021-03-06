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
public class MainFunction {
    MyQueue transferQueue = new MyQueue();
        MyStack processingStack = new MyStack(100);
    
        public void Transfer(){

            System.out.println("Enter message : (type ok to end)");
            String newMessage= "";

            do{
                    Scanner scanner = new Scanner(System.in);

                    newMessage = scanner.nextLine(); 

                    if(!("ok").equals(newMessage)){  
                        transferQueue.Enqueue(newMessage);
                    }

            }while(!("ok").equals(newMessage)); 


            
            while (!transferQueue.isEmpty()){  

                    String x = transferQueue.Dequeue().getMessageContent(); 
                    processingStack.Push(x); 
                    System.out.println("Message " + x + " is sending"); 
                    System.out.println("..........................................................................  _ OK");

            }
        }
    
    
        public void Process(){
                if(processingStack.isEmpty()){
                     System.out.println("No message !!! :"); 
                }
                else{
                        System.out.println("Message from Transfered is :");   

                         while (!processingStack.isEmpty()) {                
                                 System.out.println(processingStack.Pop()); 
                         }   
                }      
        }
}
