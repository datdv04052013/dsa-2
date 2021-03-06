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
public class Message {
    private String messageContent;
    private Message messageNext;
    
    public Message(String messageContent){
        this.messageContent = messageContent;
        this.messageNext = null;
    }
    
    public String getMessageContent(){
        return messageContent;
    }
    
    public void setMesageContent(String messageContent){
        this.messageContent= messageContent;
    }
    
    public Message getMessageNext(){
        return messageNext;
    }
    
    public void setMessegeNext(Message messageNext){
        this.messageNext = messageNext;
    }
}
