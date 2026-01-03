import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        test1();
        test2();
    }

    //依次输出1至50，并输出累加和
    public static void test1(){
        int sum = 0;
        System.out.println("1至50的依次输出为：");
        for(int i = 0;i < 50;i++){
            System.out.print( " " + i);
            sum += i;
        }
        System.out.println("\n累加和:" + sum);
    }
    //依次输出1至50的偶数，但是如果到能被5整除的偶数则提前结束整个循环
    public static void test2(){
        System.out.println("1至50的偶数为：");
        for(int i = 0;i < 50;i++){
            if(i % 2 != 0){
                continue;//直接跳过本次循环，进入下一次循环
            }
            System.out.print(" " + i);
            if (i % 5 == 0 && i != 0){
                System.out.println("\n遇到能被5整除的偶数" + i + "，提前结束循环");
                break;//直接结束整个循环
            }
        }
        System.out.println("Loop End");
    }
}
