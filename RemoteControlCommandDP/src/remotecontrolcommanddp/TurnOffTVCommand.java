/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package remotecontrolcommanddp;

/**
 *
 * @author ACER
 */
public class TurnOffTVCommand implements Command{

    TV tv;

    public TurnOffTVCommand(TV tv) {
        this.tv = tv;
    }
    
    @Override
    public void execute() {
        this.tv.turnOff();
    }

    @Override
    public void undo() {
        this.tv.turnOn();
    }
    
}