/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package observerdp;

/**
 *
 * @author ACER
 */
public interface Observable {
    public void add(Observer o);
    public void remove(Observer o);
    public void notifyO();
}
