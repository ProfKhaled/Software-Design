/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observerdp;

/**
 *
 * @author ACER
 */
public class WindowDiplay implements Observer{
    WeatherStation station = new WeatherStation();
    
    public WindowDiplay(WeatherStation station) {
        this.station = station;
    }

    
    @Override
    public void update() {
        System.out.println("This is Window Display; Weather is changed!! ");
        System.out.println("Temp: "+this.station.getTemp());
    }
    
    
}
