package range.calculator;
import java.util.Scanner;
public class Main {

    private int start;
    private int end;
    private int mod;
    
    Scanner input = new Scanner(System.in);
    public void input(){
       
        
        System.out.println("enter start: ");
        this.start = input.nextInt();
        System.out.println("enter end: ");
        this.end = input.nextInt();
        System.out.println("enter mod number: ");
        this.mod = input.nextInt();
    }
    
    public static void main(String[] args) {

        Main object1 = new Main();
        object1.input();
        Modulus object2 = new Modulus(object1.start, object1.end, object1.mod);
        object2.showRange();
    }
    
}
