/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compositedp;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ACER
 */
public class Composite implements Component{

    String name;
    List<Component> components = new ArrayList();
    
    public Composite(String name){
        super();
        this.name = name;
    }
    public void addComponent(Component comp){
        components.add(comp);
    }
    
    public void removeComponent(Component comp){
        components.remove(comp);
    }
    
    
    @Override
    public void showPrice() {
        System.out.println(this.name);
    
        for(Component c : components){
            c.showPrice();
        }
    }
    

}
