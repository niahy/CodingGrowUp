public class VariableTypes{
    //按作用域分类
    int a = 10;//这是全局变量
    public static void main(String[] args){
        int b = 20;//这是局部变量b
        System.out.println("这是main中定义的局部变量b的值：" + b);

        VariableTypes vt = new VariableTypes();//创建一个VariableTypes对象vt
        vt.test1();  // 调用test1方法
        vt.test2();  // 调用test2方法
    }
    public void test1(){
        System.out.println("这是全局变量a的值：" + a);//可以输出全局变量
        //System.out.println(b);//不可以输出局部变量,这句代码会报错
    }
    //按数据类型分类,常用的：
    public void test2(){
        int c = 30;//这是int整形
        char d = 'a';//这是char字符
        boolean e = true;//这是boolean布尔
        double f = 3.14;//这是double浮点数
        float g = 3.14f;//这是float单精度浮点数
        long h = 1000000000000000000L;//这是long长整型
        System.out.println("int c: " + c);
        System.out.println("char d: " + d);
        System.out.println("boolean e: " + e);
        System.out.println("double f: " + f);
        System.out.println("float g: " + g);
        System.out.println("long h: " + h);
    }
}