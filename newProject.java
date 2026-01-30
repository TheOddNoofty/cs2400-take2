//create a java program thats simple and has a bug in it
public class newProject {
    public static void main(String[] args) {
        int a = 10;
        int b = 2; // Bug: division by zero
        int c = a / b; // This line will cause an error
        System.out.println("Result: " + c);
    }
} 