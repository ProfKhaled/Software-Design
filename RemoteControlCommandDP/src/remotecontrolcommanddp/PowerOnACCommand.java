/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package remotecontrolcommanddp;

/**
 *
 * @author ACER
 */
public class PowerOnACCommand implements Command{

    AC ac;

    public PowerOnACCommand(AC ac) {
        this.ac = ac;
    }
    
    @Override
    public void execute() {
        this.ac.powerOn();
    }

    @Override
    public void undo() {
        this.ac.powerOff();
    }
    
}
