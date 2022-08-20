/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compositedp;

/**
 *
 * @author ACER
 */
public class Leaf implements Component{

    String name;
    int price;

    public Leaf(String name, int price) {
        this.name = name;
        this.price = price;
    }
    
    @Override
    public void showPrice() {
        System.out.println(this.name+" : "+this.price);
    }
    
    public int getPrice(){
        return price;
    }


}
