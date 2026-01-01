public class Operators {
    public static void main(String[] args) {
        arithmeticOperators();//静态调用 算术运算符 方法
        assignmentOperators();//静态调用 赋值运算符 方法
        incrementDecrementOperators();//静态调用 自增自减运算符 方法
        stringConcatenationOperator();//静态调用 字符串连接符 方法
        comparisonOperators();//静态调用 比较运算符 方法
        logicalOperators();//静态调用 逻辑运算符 方法
        ternaryOperator();//静态调用 三目运算符 方法
    }

    public static void arithmeticOperators() {
        int a = 10;
        int b = 5;
        System.out.println("=== 算术运算符 ===");
        System.out.println("a为" + a + "，b为" + b);
        System.out.println("a + b = " + (a + b));
        System.out.println("加减乘除以上面的＋为例，其它不赘述");
        System.out.println("a % b = " + (a % b));
        System.out.println("10 / 3 = " + (10 / 3));//整数相除
        System.out.println("10 / 3.0 = " + (10 / 3.0));//类型转换
    }

    public static void assignmentOperators() {
        //以+=为例
        int a = 10;
        a = a + 5;
        int b = 10;
        b += 5;//这个呢原理等价于上面的变量a
        //因为a和b的初始值和运算值相等，所以可通过判断a是否等于b来验证赋值运算符
        System.out.println("=== 赋值运算符 ===");
        System.out.println(a == b);//输出true
    }

    public static void incrementDecrementOperators() {
        //以++为例,++等价于自增1
        System.out.println("=== 自增自减运算符 ===");
        int a = 10;
        int b = a++;//先使用a，再自增a
        System.out.println(a);//输出11
        System.out.println(b);//输出10
        int c = 10;
        int d = ++c;
        System.out.println(c);//输出11
        System.out.println(d);//输出11
    }

    public static void stringConcatenationOperator() {
        System.out.println("=== 字符串连接符 ===");
        System.out.println("hello" + " world");//输出hello world
        //也可以考虑下面的思维
        String a = "hello";
        String b = "world";
        System.out.println(a + b);//输出helloworld
    }

    public static void comparisonOperators() {
        System.out.println("=== 比较运算符 ===");
        int a = 10;
        int b = 5;
        System.out.println(a == b);//输出false
        System.out.println(a != b);//输出true
        System.out.println(a > b);//输出true
    }

    public static void logicalOperators() {
        System.out.println("=== 逻辑运算符 ===");
        int a = 10;
        int b = 5;
        System.out.println(a > b && a < 20);//输出true
        System.out.println(a > b || a < 20);//输出true
        System.out.println(!(a > b));//输出false
    }

    public static void ternaryOperator() {
        System.out.println("=== 三目运算符 ===");
        //用字符串变量来承接三目运算符呢
        String s = (10 > 5) ? "10大于5" : "10小于5";
        System.out.println(s);//输出10大于5
    }
}