package overload;

public class Person2Test {
    public static void main(String[] args) {
        //空参构造创建对象
        Person2 p1 = new Person2();
        System.out.println("现在是空参构造，所有属性为空：" + p1.getName());
        p1.setName("小一");
        System.out.println("需要再手动调用set方法，现在有值了:" + p1.getName());

        //带参构造创建对象，比如我们用个单参的
        Person2 p2 = new Person2("小二");
        System.out.println("传入了一个参数name，只有name属性有值：" + p2.getName());

        //多参的呢
        Person2 p3 = new Person2("小多", 18, "男");
        System.out.println("传入了多个参数，现在get出来看看：" + p3.getName() + " " + p3.getAge() + " " + p3.getSex());

        System.out.println("以上就是构造方法重载的测试演示，构造方法重载让我们开发时更便捷了，也能够兼容不同的开发习惯");
    }
}
