/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observerdp;

import java.util.*;

/**
 *
 * @author ACER
 */
public class WeatherStation implements Observable{
    List<Observer> list = new ArrayList<>();
    int temp = 20;
    @Override
    public void add(Observer o) {
        list.add(o);
    }

    @Override
    public void remove(Observer o) {
        list.remove(o);
    }

    @Override
    public void notifyO() {
        for(Observer o:list){
            o.update();
        }
    }
    
    public int getTemp(){
        return this.temp;
    }
    
}
