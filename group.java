
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

     public static void (String[] args) {
        addE();
    }
    }
   public static void addE(){
        System.out.println("Imane Lamine");
    }

    public static void getGoupMembers(){
        System.out.println("Imane Lamine");
        
    }
// Method to perform multiplication using addition
    public int multiply(int num1, int num2) {
        int total = 0;
        int sign = (num1 < 0) ^ (num2 < 0) ? -1 : 1;
        num1 = Math.abs(num1);
        num2 = Math.abs(num2);
        for (int i = 0; i < num1; i++) {
            total += num2;
        }
        return sign * total;
    }
    public static void addE(){
        System.out.println("Hasn Hameed");
    }

    public static void getGoupMembers(){
        System.out.println("Hasn Hameed");
        
    }
    public static int multiply(int num1, int num2) {
        int result = 0;
        boolean negative = (num1 < 0) ^ (num2 < 0);
        num1 = Math.abs(num1);
        num2 = Math.abs(num2);
        for (int i = 0; i < num2; i++) {
            result += num1;
        }
        return negative ? -result : result;
    }
    public static void addE(){
        System.out.println("Kennedy Saxton");
    }
    public static void getGroupMembers(){
        System.out.println("Kennedy Saxton");
    }
    public static void addE(){
        System.out.println("Sarah Nguyen");
    }
    public static void getGroupMembers(){
        System.out.println("Sarah Nguyen");
    }
    // Method
    public static double sqrt(double X, double low, double high) {
    double mid = (low + high) / 2;
    double p = mid * mid;
     if (p == X || (Math.abs(X - p) < PRECISION)) {
        return mid;
    }
    if (p < X) {
        return sqrt(X, mid, high);
    }
    return sqrt(X, low, mid);
}
