//进行加减乘除运算
import java.util.Scanner;

public class Switch{
    public static void  main(String[] args){
        int a = 0;
        int b = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("请输入数字a：");
        a = s.nextInt();
        do{
            System.out.println("请输入数字b：");
            b = s.nextInt();
            if(b == 0){
                System.out.println("b不能为0，请重新输入：");
            }
        }while(b == 0);
        System.out.println("现在a=" + a + "，b=" + b);
        System.out.println("选择运算符（+、-、*、/）：");
        char op = '0';
        op = s.next().charAt(0);
        /*
        或者String op = s.next();
         */
        switch (op){
            case '+':
                System.out.println("a+b=" + (a+b));
                break;
            case '-':
                System.out.println("a-b=" + (a-b));
                break;
            case '*':
                System.out.println("a*b=" + (a*b));
                break;
            case '/':
                System.out.println("整数相除a/b=" + (a/b));
                break;
            default:
                System.out.println("输入错误");
        }
        s.close();
    }
}