package remotecontrolcommanddp;

import java.util.HashSet;
import java.util.Set;

public class RemoteControlCommandDP {


    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl();
        
        TV tv = new TV();
        TurnOnTVCommand turnOnTVcmd = new TurnOnTVCommand(tv);
        TurnOffTVCommand turnoffTVcmd = new TurnOffTVCommand(tv);
        
        AC ac = new AC();
        PowerOnACCommand powerOnACcmd = new PowerOnACCommand(ac);
        PowerOffACCommand powerOffACcmd = new PowerOffACCommand(ac);
        
        Light light = new Light();
        TurnOnLightCommand turnOnLightcmd = new TurnOnLightCommand(light);
        TurnOffLightCommand turnOffLightcmd = new TurnOffLightCommand(light);
        
        Curtain curtain = new Curtain();
        PullUpCurtainCommand pullUpCurtaincmd = new PullUpCurtainCommand(curtain);
        PullDownCurtainCommand pullDownCurtaincmd = new PullDownCurtainCommand(curtain);
        
        
        remote.setCommand(0, turnOnTVcmd, turnoffTVcmd);
        remote.setCommand(1, powerOnACcmd, powerOffACcmd);
        remote.setCommand(2, turnOnLightcmd, turnOffLightcmd);
        remote.setCommand(3, pullUpCurtaincmd, pullDownCurtaincmd);
        
        remote.onButtonPressed(0);
        remote.onButtonPressed(2);
        
        remote.undo();
        remote.undo();
        remote.undo();
    }
    
}
