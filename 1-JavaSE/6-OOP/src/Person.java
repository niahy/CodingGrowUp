public class Person {
    String name;//名字
    int age;//年龄
    double height;//身高

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
