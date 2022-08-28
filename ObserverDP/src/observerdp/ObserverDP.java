/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package observerdp;

/**
 *
 * @author ACER
 */
public class ObserverDP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();
        PhoneDisplay p1 = new PhoneDisplay(station);
        PhoneDisplay p2 = new PhoneDisplay(station);
        PhoneDisplay p3 = new PhoneDisplay(station);
        WindowDiplay wd1 = new WindowDiplay(station);
        WindowDiplay wd2 = new WindowDiplay(station);
        WindowDiplay wd3 = new WindowDiplay(station);
        WindowDiplay wd4 = new WindowDiplay(station);
        
        station.add(p1);
        station.add(p2);
        station.add(p3);
        station.add(wd1);
        station.add(wd2);
        station.add(wd3);
        station.add(wd4);
        
        station.temp = 50;
        station.notifyO();
    }
    
}
