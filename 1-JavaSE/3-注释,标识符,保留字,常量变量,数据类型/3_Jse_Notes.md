# 3-注释,标识符,保留字,常量变量,数据类型

## 注释
详见 [Comment.java](Comment.java)  
对于Java的注释部分，首先有单行注释、多行注释和文档注释  
- **单行注释**:`//注释内容`，只能注释单行  
- **多行注释**:`/*注释内容*/`，可以注释多行  
- **文档注释**:`/**注释内容*/`，程序会依据此注释来参考生成API文档。

## 标识符
标识符是用来给类、变量、常量方法等内容命名时的字符
**规则**：
对大小写敏感、不能使用Java关键字保留字、不能用数字开头  
- **不能使用Java关键字保留字**，比如class、public、static等  
- **不能用数字开头**，比如123a是不合法的  
- **最重要的一点**：要有可读性！要做到见名知意！

## 保留字
Java语言内置的字符序列。

| 常见的 | 保 | 留 | 字 |
|---|---|---|---|
| abstract | boolean | byte | char |
| class | const | default | do |
| double | else | extends | final |
| finally | float | for | if |
| implements | import | instanceof | int |
| interface | long | native | new |
| package | private | protected | public |
| return | short | static | super |
| switch | this | throw | throws |
| transient | void | volatile | while |


## 常量变量
详见 [ConstantsAndVariables.java](ConstantsAndVariables.java)  
常量就是保持不变的量，比如数字、字符等  
变量就是能够改变的量，是用来保存数据的容器，使用前需要先声明。

## 变量的分类
详见 [VariableTypes.java](VariableTypes.java)  
### 按作用域分
分成全局变量和局部变量
- **全局变量**：在类里面且方法外的变量。类中的所有方法都可以使用全局变量。
- **局部变量**：在方法里的变量，只有对应的方法可以使用。
### 按数据类型分
分成基本数据类型和引用数据类型
- **基本数据类型**：`int`、`long`、`byte`、`short`;`boolean`;`float`、`double`;`char`
- **引用数据类型**：基本数据类型之外的，比如`String`、`Object`、`Array`、`Interface`

## 数据类型
### boolean类型
只有`true`和`false`两个值，用于表示逻辑上的真和假。
### 字符类型
  - **char**，用于表示单个字符，比如'A'、'a'、'1'等，还可以'汉字'。
  - **四位十六进制数**，unicode.可以表示一个字符，比如`\u0041`表示字符'A'。
  - **转义字符**，常见的转义字符有：
    - `\n`：换行符
    - `\t`：制表符
    - `\r`：回车符
    - `\\`：反斜杠
    - `\"`：双引号
    - `\'`：单引号
    - `\b`，用于退格。
    - `\s`，用于表示空格。
    - `\u`，用于表示十六进制数，比如`\u0041`表示字符'A'。
    - `\0`，表示空字符。
  
### 整数类型
在Java中，整数默认`int`，如果是`long`，则需要在末尾标记`l`或`L`。
  
| 类型 | 字节数 |
|------|--------|
| byte | 1字节 |
| short | 2字节 |
| int | 4字节 |
| long | 8字节 |
