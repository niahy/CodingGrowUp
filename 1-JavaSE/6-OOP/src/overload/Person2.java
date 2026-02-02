package overload;

public class Person2 {
    private String name;
    private int age;
    private String sex;

    //无参构造方法
    public Person2() {

    }
    //有参构造方法--构造方法重载
    //单参
    public Person2(String name) {
        this.name = name;
    }
    //多参
    public  Person2(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
