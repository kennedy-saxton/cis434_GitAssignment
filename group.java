
public class Group {

    public static void main(String[] args) {
        addE();
    }
    
    public static void addE(){
        System.out.println("Eric Hernandez");
    }

    public static void getGoupMembers(){
        System.out.println("Eric Hernandez");
        
    
// code idea from https://www.javatpoint.com/power-of-a-number-in-java
    public static int power(int num1,int num2){
        num1 = 2;
        num2 = 3;
        double x;
        for(int i = 0; i < num2; i++){
            x *= num1;
    }
        return (int) x;
}
   public static void addI(){
        System.out.println("Imane Lamine");
    }
      // Method to perform multiplication using addition
    public static int multiply(int num1, int num2) {
        int total = 0;
        int sign = (num1 < 0) ^ (num2 < 0) ? -1 : 1;
        num1 = absoluteValue(num1);
        num2 = absoluteValue(num2);
        for (int i = 0; i < num1; i++) {
            total += num2;
        }
        return sign * total;
    }

    public static void addH(){
        System.out.println("Hasn Hameed");
    }
        
    //Kennedy needs to update starting from line 46  
   public static void addK(){
        System.out.println("Kennedy Saxton");
    }
        public static void addS() {
        System.out.println("Sarah Nguyen");
    }

    // Custom method to replace Math.abs
    public static int absoluteValue(int number) {
        return number < 0 ? -number : number;
    }
}
