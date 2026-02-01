package private_set_get;

public class ClassTest1 {
    public static void main(String[] args) {
        Class c = new Class();

        //因为Class类的属性被private修饰封装了，所以下面那句，直接访问属性会报错
        //c.name = "三年级2班";

        c.setName("高三9班");
        System.out.println(c.getName());
    }
}
