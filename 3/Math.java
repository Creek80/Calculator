        import java.util.Scanner;

public class Math {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a = getInt();
        int b = getInt();
        char operation = getOperation();
        int result = calc(a,b,operation);
        System.out.println("Result: "+result);
    }

    public static int getInt(){
        System.out.println("Enter a number:");
        int num;
        if(scanner.hasNextInt()){
            num = scanner.nextInt();
        } else {
            System.out.println("Error");
            scanner.next();
            num = getInt();
        }
        return num;
    }

    public static char getOperation(){
        System.out.println("Select operation:");
        char operation;
        if(scanner.hasNext()){
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Error. Try again");
            scanner.next();
            operation = getOperation();
        }
        return operation;
    }

    public static int calc(int a, int b, char operation){
        int result;
        switch (operation){
            case '+':
                result = a+b;
                break;
            case '-':
                result = a-b;
                break;
            case '*':
                result = a*b;
                break;
            case '/':
                result = a/b;
                break;
            default:
                System.out.println("Operation not recognized. Try again");
                result = calc(a, b, getOperation());
        }
        return result;
    }
}