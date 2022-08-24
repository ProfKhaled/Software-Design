/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package remotecontrolcommanddp;

/**
 *
 * @author ACER
 */
public class TurnOnTVCommand implements Command{

    TV tv;

    public TurnOnTVCommand(TV tv) {
        this.tv = tv;
    }
    
    @Override
    public void execute() {
        this.tv.turnOn();
    }

    @Override
    public void undo() {
        this.tv.turnOff();
    }
    
}
