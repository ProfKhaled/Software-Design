package singletondp;
public class SingletonDP {
    public static void main(String[] args) {
//        Singleton obj1 = new Singleton();
//        Singleton obj2 = new Singleton();
        
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        System.out.println(obj1);
        System.out.println(obj2);
        
        obj1.printData();
        System.out.println("");
        obj2.printData();
        System.out.println("");
    }
    
}
