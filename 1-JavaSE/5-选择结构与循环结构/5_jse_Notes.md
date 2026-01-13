# 5-选择结构与循环结构
## 基本选择结构
- 详见  [if_elseif_else.java](if_elseif_else.java)
- ifelse语句是可以嵌套的
### if语句
```
//如果逻辑表达式的值为真，则执行if代码块
if(逻辑表达式){
    代码块
}
```
### if-else语句
```
//如果逻辑表达式的值为真，则执行if代码块，否则执行else代码块
if(逻辑表达式){
    代码块1
}else{
    代码块2
}
```
### if-else if-else语句
```
//从上至下以此判断表达式，哪个为真，则执行对应的代码块
//如果所有if的表达式都为假，则执行else代码块
if(逻辑表达式1){
    代码块1
}else if(逻辑表达式2){
    代码块2
}else{
    代码块3
}
```
## 基本循环结构

### for循环
- 详见 [ForLoop.java](ForLoop.java)
```
for(初始化语句;循环条件;更新语句){
    循环体
}
/*
先执行初始化语句，之后判断循环条件，为真则执行循环体
执行完循环体之后执行更新语句，再判断循环条件，为真则重复执行循环体，为假则结束循环
 */
 ```

### while循环
- 详见 [WhileLoop.java](WhileLoop.java)
```
while(循环条件){
    循环体
}
 /*
 先判断循环条件，为真则执行循环体；
 循环体执行结束后再判断循环条件，为真则重复执行循环体，为假则结束循环
  */
```
### do-while循环
- 详见 [DoWhileLoop.java](DoWhileLoop.java)
```
do{
    循环体
}while(循环条件);
 /*
 先执行循环体，再判断循环条件，为真则重复执行循环体，为假则结束循环
 必定会执行一次循环体
  */
```
## 多路选择语句
- 详见 [Switch.java](Switch.java)
```
switvh(字符或整数){
    case 字符或整数值1:
        执行语句1;
        break;//防止case穿透
    case 字符或整数值2:
        执行语句2;
        break;
         ...
    default:
        执行语句3;
}
 /*
 自上而下依次执行switch中的case，判断switch字符或整数与case的相匹配，则执行此case，并且一直执行到最后
 如果没有匹配的case，则执行default中的语句
 为了防止case穿透，一般加上break
 */
```