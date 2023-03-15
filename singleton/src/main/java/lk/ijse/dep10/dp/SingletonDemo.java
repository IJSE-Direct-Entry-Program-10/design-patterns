package lk.ijse.dep10.dp;

public class SingletonDemo {

    public static void main(String[] args) {
        Earth earth1 = Earth.getInstance();
        Earth earth2 = Earth.getInstance();
        Earth earth3 = Earth.getInstance();
        Earth earth4 = Earth.getInstance();
        Earth earth5 = Earth.getInstance();
        System.out.println(earth1 == earth2);
        System.out.println(earth2 == earth3);
        System.out.println(earth3 == earth4);
        System.out.println(earth4 == earth5);
    }
}

class Earth{
    private static final Earth earth = new Earth(); // Eager

    private Earth(){}

    public static Earth getInstance(){
        return earth;
        //return (earth == null)? earth = new Earth(): earth; // Lazy
//        if (earth == null){
//            earth = new Earth();
//        }
//        return earth;
    }
}
