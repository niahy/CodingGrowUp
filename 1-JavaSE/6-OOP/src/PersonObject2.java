public class PersonObject2 {
    public static void main(String[] args) {
        Person p1 = new Person();//new方法相当于malloc函数
        Person p2 = new Person();
        Person p3 = new Person();
        p1.name = "小智";
        p2.name = "小霞";
        System.out.println("初始属性：" + "对象p1-" + p1.name + " 对象p2-" + p2.name);

        //对象间属性赋值
        p1 = p2;
        System.out.println("赋值后，" + "对象p1-" + p1.name + " 对象p2-" + p2.name);
        //对象属性修改，另一个对象属性也会改变
        p2.name = "小遥";
        System.out.println("改变任一个对象属性值后，" + "对象p1-" + p1.name + " 对象p2-" + p2.name + '\n');

        //对象作为方法的传参，方法内外都会改变
        p3.name = "小王";
        System.out.println("初始属性：" + "对象p3-" + p3.name);
        changePersonName(p3);
        System.out.println(",方法外部值-" + p3.name + '\n');

        //对于变量来讲，传参到方法中，方法外部的变量不会改变
        int a = 10;
        System.out.println("初始变量值：" + a);
        changeInt(a);
        System.out.println(",方法外部值-" + a);
    }
    public static void changePersonName(Person p){
        p.name = "皮卡丘";
        System.out.printf("方法内部值-" + p.name);
    }
    public static void changeInt(int a){
        a = 100;
        System.out.printf("方法内部值-" + a);
    }
}
