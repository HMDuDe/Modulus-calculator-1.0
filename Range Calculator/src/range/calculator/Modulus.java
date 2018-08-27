package range.calculator;

public class Modulus {
    private int startNum;
    private int endNum;
    private int modNum;
    
    public Modulus(int start, int end, int modNum){
        this.startNum = start;
        this.endNum = end;
        this.modNum = modNum;
    }
    
    public void showRange(){
        int count;
        double answer = 0;
        
        System.out.println("Range: " + this.startNum + "- " + this.endNum);
        System.out.println("Modulus: " + this.modNum);
        System.out.println("**********************************");
        for(count = this.startNum; count <= this.endNum;count++){
        
            System.out.println("Number: " + count);
            
            answer = count % this.modNum;
            
            System.out.println("answer: " + answer);
            System.out.println("**********************************");
        }
    }
}
