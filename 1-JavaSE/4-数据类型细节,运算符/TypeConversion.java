public class TypeConversion{
    public static void main(String[] args){
        //类型转换
        int a = 10;
        long b = a;//自动类型转换,小->大，大的接住了小的
        System.out.println("int a: " + a);
        System.out.println("long b: " + b);

        double c = 10.0124165532141;
        float d = (float)c;//强制类型转换
        System.out.println("double c: " + c);
        System.out.println("强转后的float d: " + d +" 出现了精度丢失");
    }
 }