/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package commanddpdemo;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author ACER
 */
public class CommandDPDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RemoteController remote = new RemoteController();
        
        TV tv = new TV();
        OnTVcmd ontvcmd = new OnTVcmd(tv);
        OffTVcmd offtvcmd = new OffTVcmd(tv);
        
        Light light = new Light();
        TurnOnLightcmd turnonlightcmd = new TurnOnLightcmd(light);
        TurnOffLightcmd turnofflightcmd = new TurnOffLightcmd(light);
        
        remote.setCommand(0, ontvcmd, offtvcmd);
        remote.setCommand(1, turnonlightcmd, turnofflightcmd);
        
        remote.onButtonPressed(0);
        remote.onButtonPressed(1);
        remote.undoButtonPressed();
        remote.undoButtonPressed();
        remote.undoButtonPressed();
        
        
        
    }
    
}
