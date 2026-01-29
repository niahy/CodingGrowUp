public class Person {
    String name;//名字
    int age;//年龄
    double height;//身高

    /*
    //这是构造方法，相当于初始化对象的属性值。当然也可以在主类中创建对象时，给属性赋值
    public Person(){
        name = "张三";
        age = 18;
        height = 1.7;
    }
    */
    public void eat(){
        System.out.println(name + "正在吃东西");
    }
    public void sleep(){
        System.out.println(name + "正在睡觉");
    }
    public void show(){
        System.out.println("姓名：" + name + "，年龄：" + age + "，身高：" + height);
    }
}
