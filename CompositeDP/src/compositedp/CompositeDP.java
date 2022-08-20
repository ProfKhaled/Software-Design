package compositedp;

public class CompositeDP {

    public static void main(String[] args) {
        
        // define Leafs
        Component hdd = new Leaf("HDD", 200);
        Component cpu = new Leaf("CPU", 1200);
        Component ram = new Leaf("RAM", 500);
        Component keyboard = new Leaf("Keyboard", 100);
        Component monitor = new Leaf("Monitor", 900);
        
        //define composites
        Composite accessories = new Composite("Accessories");
        Composite box = new Composite("Box");
        Composite mb = new Composite("MotherBoard");
        Composite computer = new Composite("Computer");
        
        accessories.addComponent(keyboard);
        accessories.addComponent(monitor);
        
        mb.addComponent(ram);
        mb.addComponent(cpu);
        
        box.addComponent(hdd);
        box.addComponent(mb);
        
        computer.addComponent(accessories);
        computer.addComponent(box);
        
//        mb.removeComponent(ram);
        box.showPrice();
        
        
    }
    
}
