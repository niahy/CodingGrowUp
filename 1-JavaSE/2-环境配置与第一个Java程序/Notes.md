# 2-环境配置与第一个Java程序

## 开发环境
在之前已经在本地配置过了Java8、17、21这三个版本。
当然，IDEA内置的即下即用的Java环境也可以，比如本人喜欢使用内置的Java21.
编译时，系统会根据环境变量去检索并使用jdk中的程序。

## 编写第一个Java程序
我们来编写第一个Java程序（详细见文件[HelloWorld.java](HelloWorld.java)）

对于这个程序，我们先学习或者说体验一下如何使用原生的Java命令进行程序编译和运行。
### 编译与运行
我们先在命令行中进入到HelloWorld.java所在的目录。
然后使用javac命令编译HelloWorld.java文件，生成HelloWorld.class文件：
```bash
javac HelloWorld.java
```
编译完成后，使用java命令运行HelloWorld.class文件。
```bash
java HelloWorld
```
如果一切正常，能在命令行中看到输出的"HelloWorld"。

## Java程序结构
在程序编译的过程中，以最简单的helloworld程序为例：

首先，一个Java程序可以有多个类，但是只能有一个public类，且类名必须与文件名相同。
类就是class声明的一个代码块，用于定义类的属性和方法。
那么，我们在HelloWorld.java文件中，定义其他的类，比如类A、B，那么编译之后会出现相应的class文件。
如果一个Java文件有多个公共类，则会报错。

main方法是Java程序的入口点，每个Java程序都必须有一个main方法，且格式固定，需要背住。不过现代IDE都有代码补全，无所谓背不背了。
方法从属于类，类似C++中的函数，但不是函数，也不是对象。
### 此程序涉及的语句语法
此程序涉及的语句语法是
```java
System.out.println("Hello World!");
```
这个语句的作用是在控制台输出"Hello World!"，并且会在输出字符串末尾添加换行符。
如果是print则不会在输出的字符串末尾添加换行符。

**编程规范之一**：类名采用驼峰命名法，即每个单词的首字母大写，其他字母小写。

