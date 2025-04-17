public class SwapExample {
    public static void main(String[] args) {
        // Initialize two variables to swap
        int a = 5;
        int b = 10;
        
        System.out.println("Before swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        // Swap using third variable
        int temp = a;
        a = b;
        b = temp;
        
        System.out.println("\nAfter swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        String name ="john";
        int age =20;
        System.out.println("my name is "+name +" and my age is "+age);
        // Example of adding different numeric types
        int e = 10;
        int f = 20;
        float g = 9.0f;
        float h = 1.5f;
        System.out.println("Sum of e+f+g+h: " + (e + f + g + h));
    }

}
