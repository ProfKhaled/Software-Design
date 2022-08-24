/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package remotecontrolcommanddp;

import java.util.LinkedList;

/**
 *
 * @author ACER
 */
public class RemoteControl {
    private Command[] onCommand;
    private Command[] offCommand;
    LinkedList<Command> history = new LinkedList<>();
    
    public RemoteControl(){
        
        onCommand = new Command[4];
        offCommand = new Command[4];
    }
    
    public void setCommand(int slot, Command onCommand, Command offCommand){
        this.onCommand[slot] = onCommand;
        this.offCommand[slot] = offCommand;
    }
    public void onButtonPressed(int slot){
        this.onCommand[slot].execute();
        history.push(this.onCommand[slot]);
    }
    public void offButtonPressed(int slot){
        this.offCommand[slot].execute();
        history.push(this.offCommand[slot]);
    }
    
    public void undo(){
        if(history.peek() != null){
            history.poll().undo();
        }else{
            System.out.println("No Command Histort found!!");
        }
    }
    
}
