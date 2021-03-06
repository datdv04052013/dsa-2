/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messenger;

/**
 *
 * @author datdu
 */
public class MyStack {
     public final int maxStack;
        public String[] messageContent;
        public int messageTopIndex;
        public MyStack(int maxStack){
            this.maxStack = maxStack;
            this.messageContent = new String[maxStack];
            this.messageTopIndex = -1;
        }
        public boolean isEmpty(){
            return (this.messageTopIndex == -1);
        }
        public void Push(String newMessageContent){
            if(this.messageTopIndex ==(this.maxStack -1 )){
                System.out.println("Stack full");
                System.out.println("Can not add new message");
            }
            else{
            this.messageContent[(++this.messageTopIndex)] = newMessageContent;
            }
        }
        public String Pop(){
            String popMessage = "";
            
            try{
                popMessage =this.messageContent[this.messageTopIndex];
                this.messageTopIndex--;
            }
            catch(Exception e){
                System.out.println("This stack empty Cannot delete.");
            }return popMessage;
        }
        
        public void Clear(){
            while(!this.isEmpty())
            {
                this.Pop();
            }
        }
}
