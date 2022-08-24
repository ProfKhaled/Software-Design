/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package remotecontrolcommanddp;

/**
 *
 * @author ACER
 */
public class PullUpCurtainCommand implements Command{
    Curtain curtain;

    public PullUpCurtainCommand(Curtain curtain) {
        this.curtain = curtain;
    }

    @Override
    public void execute() {
        this.curtain.pullUp();
    }

    @Override
    public void undo() {
        this.curtain.pullDown();
    }
    
    
}
