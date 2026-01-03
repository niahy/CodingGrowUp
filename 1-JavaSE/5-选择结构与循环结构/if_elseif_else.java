import java.util.Scanner;//注意引入此包才能使用Scanner类，即进行键盘输入

public class if_elseif_else{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);//创建Scanner对象，这是Java提供的固定的用法
        System.out.println("输入你的成绩（整数）：");
        int score = s.nextInt();
        //这个"next+数据类型"的方法是Scanner类的方法，用于获取输入的数然后赋值给score变量

        if (score >= 80){
            System.out.println("成绩很优秀");
        }else if(score >=60 && score < 80){
            System.out.println("成绩及格");
        }else{
            System.out.println("成绩不及格");
        }

        Scanner.close();//关闭Scanner对象
    }
}