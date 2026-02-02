package overload;

public class OverloadTest1 {
    public static void main(String[] args) {
        fun(1,2);
        fun(1.0,2.0);
        fun(1,2.0);
        fun(1.0,2);
    }
    //通过方法重载，实现相同功能，但参数类型不同的方法。提高了代码的复用性和健壮性
    //不然的话，我想进行运算时，出现了整数加小数或者其它类似情况的时候，就很可能会报错
    public static void fun(int a, int b){
        System.out.println(a+b);
    }
    public static void fun(double a, double b){
        System.out.println(a+b);
    }
    public static void fun(int a, double b){
        System.out.println(a+b);
    }
    public static void fun(double a, int b){
        System.out.println(a+b);
    }
}
