import java.util.Scanner;

public class calc {
    public static void main(String[] args) {

        float num1, num2, result;
        String oper;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("\nEnter the First number: ");
        num1 = sc.nextFloat();

        System.out.print("Enter the Second number: ");
        num2 = sc.nextFloat();

        System.out.print("Enter the oper (+, -, *, /): ");
        oper = sc.next();
        
        switch (oper) {
            case "+":
                result = num1 + num2;
                System.out.println("\nResult for the expression " + "(" + num1 + " " + oper + " " + num2+ ")" + " is : "+result+"\n");
                break;
            case "-":
                result = num1 - num2;
                System.out.println("\nResult for the expression " + "(" + num1 + " " + oper + " " + num2+ ")" + " is : "+result+"\n");
                break;
            case "*":
                result = num1 * num2;
                System.out.println("\nResult for the expression " + "(" + num1 + " " + oper + " " + num2+ ")" + " is : "+result+"\n");
                break;
            case "/":
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("\nResult for the expression " + "(" + num1 + " " + oper + " " + num2+ ")" + " is : "+result+"\n");
                } else {
                    System.out.println("\nError: Division by zero is not allowed."+"\n");
                }
                break;
            default:
                System.out.println("\nError: Invalid oper."+"\n");
                break;
            }
        sc.close();
    }
}
