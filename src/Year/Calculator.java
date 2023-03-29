package Year;

public class Calculator {
    void calci() {
        int a = 100;
        int b = 20;
        String operator = "-";
        switch (operator) {
            case "+":
                System.out.println(a+b);
                break;
            case "-":
                System.out.println(a-b);
                break;
            case "*":
                System.out.println(a*b);
                break;
            case "/":
                System.out.println(a/b);
                break;
            default:
                System.out.println("invalid symbol");
        }
    }
}
