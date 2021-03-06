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
public class MyQueue {
    public Message messageHead;
        public Message messageTail;

        public MyQueue(){
                this.messageHead= null;
                this.messageTail = null;
        }

        public boolean isEmpty(){
                return (this.messageHead==null);
        }

        public void Enqueue(String messageContent){
                Message newMessage = new Message(messageContent);
                if(this.isEmpty()){
                    this.messageHead = newMessage;
                    this.messageTail = newMessage;
                }else{
                    this.messageTail.setMessegeNext(newMessage);
                    this.messageTail = newMessage;
                }
        }

        public Message Dequeue(){
                if (isEmpty()){
                    System.out.println("Queue empty");
                    return null;
                }else{
                    Message temp = this.messageHead;
                    this.messageHead = this.messageHead.getMessageNext();
                    temp.setMessegeNext(null);
                    return temp;
                }
        }
        
        public void Clear(){
                if (this.isEmpty()){
                    System.out.println("Queue empty");
                }
                else {
                while(!this.isEmpty())
                {
                this.Dequeue();
                }
                }
         }
}
