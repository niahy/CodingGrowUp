public class BasicDataTypes{
    public static void main(String[] args){
        int a = 10;
        System.out.println("整型int值：" + a);
        long b = 1000000000000L;
        System.out.println("长整型long值：" + b);
        /*
        long b = 1000000000000;
        System.out.println("长整型long值：" + b);
        //这个就是long的数后面没有加L或l，所以这段代码会报错
        */
        double c = 3.14;
        System.out.println("双精度double值：" + c);
        float d = 3.14f;//这个与上方的long同理，如果不加f或F，会报错
        System.out.println("单精度float值：" + d);

        //整数默认是int，小数默认是double
        byte e = 5;//这其实是把int类型的5赋值给了byte类型的变量
        System.out.println("字节byte值：" + e);
        /*
        byte e = 256;
        //这个会报错，因为溢出了，由此可以反向推断，给byte赋值一个整数其实是把int类型的给他了，并且在这个例子中超出了byte类型的容量
        //小数的默认double的例子可与上同理
         */
    }
}