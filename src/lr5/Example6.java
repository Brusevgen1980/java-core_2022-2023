package lr5;

public class Example6 {   public static void main(String[] args) {
    Lab5 test05 = new Lab5(20);
    System.out.println("Число "+ test05.Check());
    test05.setA(15);
    System.out.println("Число "+ test05.Check());
    test05.setA(125);
    System.out.println("Число "+ test05.Check());
    test05.setA(-50);
    System.out.println("Число "+ test05.Check());
    test05.setA();
    System.out.println("Число "+ test05.Check());
}
}
class Lab5 {
    private int a;
    public void setA(int x) {
        a = x;
        if ( x >= 100){
            a = 100;
        }
        if (x <= 0){
            a = 0;
        }
    }
    public void setA(){
        a = 0;
    }
    public int Check(){
        return a;
    }
    Lab5(int a){
        this.setA(a);
    }


}

