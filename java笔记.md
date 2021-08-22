# 一、MarkDown学习

## 标题

### 三级标题

#### 四级标题

一级标题 #

二级标题 ##

以此类推  共六级标题

## 字体

**hello，world!**

*hello，world!*

***hello，world!***

~~hello，world!~~

加粗 ** **

斜体 * *

斜体加粗 * * *      * * *

中划线 ~~ ~~

## 引用

> 选择狂神说Java，走向人生巅峰

引用：通过  > + 空格

## 分割线

---

***

三个 -  或者 三个 *

## 图片

![图片](/Users/yanyuting/Downloads/闫瑜婷.jpg)

![远程图片](https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fimg.16pic.com%2F00%2F88%2F44%2F16pic_8844212_s.jpg&refer=http%3A%2F%2Fimg.16pic.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=jpeg?sec=1631542631&t=bbb9720f7a692cebd28528231f8351db)

本地图片或在线图片 ![名称] （地址）

## 超链接

[百度一下](https://www.baidu.com/)

【链接文字】（链接地址）

## 列表

1. A
2. B
3. C

- A
- B
- C

有序列表 1.   2.

无序列表  -.

## 表格

名字|性别|生日
:-:|:-:|:-:
张三|男|1997.1.1

## 代码

```java
public static void main(String args){
  
}
```

` `` + 语言



# 二、基本的DOS命令

## CMD的打开方式

1. 开始+系统+命令提示符
2. win+R 输入CMD打开控制台(推荐使用)
3. 在任意的文件夹下面，按住shift+鼠标右键，在此处打开命令行窗口
4. 资源管理器的地址栏前面加上cmd路径

## 常用的Dos命令

```bash
# d:          盘符切换
# dir         当前目录下的所有文件
# cd /d f:    切换盘符下的某个文件
# cd ..       回到上一级目录
# cls         清楚屏幕  clear screen
# exit        退出
# ipconfig    查看电脑ip
# calc        计算器
# mspaint     画图
# notepad     记事本
# ping   			查看网址的IP地址
# md				  创建文件夹
# cd>a.txt    创建文件
# del a.txt   删除文件
# rd text     移除目录
```

# 三、计算机语言与java发展

## 计算机语言发展

1. 机器语言  0 1

2. 汇编语言 应用：

   ​	逆向工程、机器人、病毒

3. 高级语言

   ​	摩尔定律：价格不变时，每隔18个月，晶体管数量增加一倍性能也将提升一倍。

    - 面向过程的语言
    - 面向对象的语言

## C & C++ & Java

1. c语言1972年诞生

​		贴近硬件，运行极快，效率极高

​		操作系统，编译器，数据库，网络系统等

​		指针和内存管理

2. c++ 1982年诞生

   ​	面向对象，兼容C，图形领域、游戏等

3. java出生

   ​	1995年 网页简单而粗糙，缺乏互动性。

   ​	图形界面的程序（Applet）

   ​	java 2 标准版 J2SE   占领桌面，控制台开发

   ​	java 2 移动端 J2ME  占领手机，小家电

   ​	java 2 企业版 J2EE   占领服务器 ，web端，服务器开发



​	weblogic  高可用 、高性能、高并发

构建工具：ant，maven，jenkins

应用服务器：tomcat、jetty、jboss、websphere、weblogic

web开发：Struts、spring、hibernate、mybatis

开发工具：eclipse、NetBeans、intellij idea、jbuilder



​		2006年hadoop     2008年 android手机端

4. java特效与优势
    - 简单性、面向对象、可移植性 write one run anywhere、高性能、分布式、动态性(反射)、多线程、安全性、健壮性
    - 人多   爱上java 无穷魅力；天时地利人和

5. JDK、JRE、JVM

   JDK：JAVA Development Kit    java javac javadoc  jar

   JRE：JAVA Runtime Environment

   JVM: JAVA Virtual Machine（跨平台）

6. 开发环境搭建

   1）官网下载1.8安装文件，需与系统对应

   2）卸载原因JDK：删除环境变量，删除安装目录文件

   3）双击安装文件进行安装

   4）环境变量添加

   JAVA_HOME:

   CLASSPATH：.;%JAVA_HOME%\lib\dt.jar;%JAVA_HOME%\lib\tools.jar;

   PATH:

   java --version

7. 第一个简单的程序HelloWorld

   1）新建一个 .java文件

   ```java
   public class Hello{
     public static void main(String[] args){
       System.out.println("Hello, Word!");
     }
   }
   ```

   JAVA的大小写敏感的，尽量使用英文，文件名和类名保持一致，符号使用英文模式

   2）进入cmd

   ```bash
   javac Hello.java #编译生成class文件
   java Hello #运行 显示结果
   ```

8. java运行机制

   编译型：编译器，执行速度快，操作系统使用

   解释型：解释器，性能低，网页，服务器脚本对速度要求不高

   .java -> java编译器 -> .class -> 类装载器 -> 字节码校验器 -> 解释器 -> 解释器 -> 操作系统

9. IDE   integrated development environment

# 四、JAVA语法

## 注释

书写注释是一个非常好的习惯，不会被执行，是给我们写代码的人看的

1）单行注释  //

2）多行注释 /*  */

3）文档注释 /**   */

~~~java
public class Hello {
    public static void main(String[] args) {
        // 输出 Hello,Word!
        System.out.println("Hello,Word!");
        /*
        124324234
         */
    }
}
~~~

## 标识符和关键字

- 关键字：

  abstract 、assert、boolean 、break、byte、case、catch、char、class、const、continue、default、do、double、else、enum、extends、final、finally、float、for、goto、if、implements、import、instanceof、int、interface、long、native、new、package、private、protected、public、return、strictfp、short、static、super、switch、synchronized、this、throw、throws、transient、void、volatile、while

- 标识符

  Java所有的组成部分都需要名字。类名，变量名以及方法名都被称为标识符。

  所有标识符都是以字母和下划线美元符号开头，之后以数字字母下划线和美元符号的任意字符组合

  不能使用关键字作为标识符

  是大小写敏感的

  不建议使用拼音命名

## 数据类型

- 强类型语言：要求变量的使用要严格符合规定，所有变量都必须先定义后使用

  弱类型语言：VB 、JS

- 具体类型

  ​	基本数据类型

  ​		数值类型：

  ​				整数类型：byte、short、int、long

  ​				浮点类型：float、double

  ​				字符类型：char 占2个字符

  ​		boolean类型：占1位，只有true和false两个

  ​	引用数据类型

  ​		类、接口、数组

~~~java
public class JavaBase {
    public static void main(String[] args) {
        // 八大数据类型

        // 整数
        int num1 = 10; //最长用
        byte num2 = 127;
        short num3 = 30;
        long num4 = 30L; //Long类型要在数字后面加L

        // 小数：浮点数
        float num5 = 50.1F; // float类型要在数字后面加上F
        double num6 = 3.14159265358;

        // 字符
        char name = '国';
        // 字符串，String 不是关键字，是类
        // String namea = "qjn"

        // 布尔值：是非
        boolean flag = true;
        // boolean flag = false;
    }
}
~~~

~~~java
public static void number_extends(){
        //整数拓展： 进制   二进制0b 十进制  八进制0  十六进制 0x
        int i = 10;
        int i2 = 010;
        int i3 = 0x11;
        System.out.println(i);
        System.out.println(i2);
        System.out.println(i3);

        // 浮点数拓展？ 银行业务怎么表示： BigDecimal数学工具类
        // float  有限 离散 舍入误差 大约 接近但不等于
        // double
        float f = 0.1f;
        double d = 1.0/10;
        System.out.println(f);
        System.out.println(d);
        System.out.println(f == d);

        float d1 = 1231312312312312f;
        float d2 = d1 + 1;
        System.out.println(d1 == d2);

        // 字符拓展
        char c1 = 'a';
        char c2 = '中';
        System.out.println(c1);
        System.out.println(c2);
        System.out.println((int)c1);  // 强制转换
        System.out.println((int)c2);
        // 所有的字符本质还是数字
        // 编码 Unicode 表 2个字节 0-65535
        char c3 = '\u0061';
        System.out.println(c3);
        //转义字符
        // \t 制表符  \n 换行
        System.out.println("Hello\tWorld!");
  
        // 布尔值扩展
        boolean flag = true;
        if(flag==true){}
        if(flag){}
        // less is more 
    }
~~~

## 类型转换

byte，short，char -> int -> long -> float -> double

运算中，不同类型的数据先转换为同一类型，然后进行运算

- 强制类型转换（高->低）

  ~~~java
  int i = 128;
  //byte b = i;
  // 强制转换  （类型）变量名
  byte b = (byte)i;
  ~~~

- 自动类型转换（低->高）

  ~~~java
  int i1 = 128;
  double b1= i1;
  /**
  * 注意点：
  * 1、不能对布尔值进行转换
  * 2、不能把对象类型转换为不相干的类型
  * 3、在把高容量转换到低容量的时候，强制换行
  * 4、转换的时候可能存在内存溢出、或者精度问题
  */
  ~~~

- 大数据表示

  ~~~java
  // 操作比较大的数的时候，注意溢出问题
  // JDK7新特性，数字之间可以用下划线分割
  int money = 10_0000_0000;
  ~~~

## 变量

- 定义：

  type varName [=value] [{,varName[=value]}]

  //数据类型  变量名 = 值， 可以使用逗号隔开来声明多个同类型变量(不建议)

  每个变量都有类型，类型可以是基本类型或者引用类型

  变量名必须是合法的标识符

  变量声明是一条完整的语句，因此每个声明都必须以分号结束

- 作用域

  类变量、实例变量、局部变量

- **规则**：

  所有 变量、方法、类名：见名知意

  类成员变量：首字母小写和驼峰原则

  局部变量：首字母小写和驼峰原则

  常量：大写字母和下划线

  类名：首字母大写和驼峰原则

  方法名：首字母小写和驼峰原则

## 常量

- 初始化后不能 再改变值，常量名一般用**大写**

  final 数据类型 常量名=值

  final double PI = 3.14;

## 运算符

- 算数运算符：+，-，*，/，%，++，--

- 赋值运算符：=

- 关系运算符：>,<,>=,<=,==,!=,instanceof

- 逻辑运算法：&&,||,!

  ~~~java
  // 短路运算
  int test_a = 5;
  boolean test_flag = (test_a < 4) && (c++ < 4);
  System.out.println(test_flag);
  System.out.println(test_a);
  =======
  false
  5
  ~~~

- 位运算符：&，|，^，~，>>, <<, >>>

  ~~~bash
          A = 0011 1100
          B = 0000 1101
          -----------------
          A&B 0000 1100
          A|B 0011 1101
          A^B 0011 0001
          ~B  1111 0010
          效率极高
          <<  *2
          >>  /2
  ~~~

- 条件运算符：？

  ~~~java
  // 三元运算符 x？y:z
  // 如果x==true  则结果为y，否则结果为z
  String type = score < 60?"不及格":"及格";
  ~~~

- 扩展赋值运算符：+=， -=，*=， /=

  ~~~java
  //一元运算符： 自加、自减
  int m = 4;
  int n = m++; // 执行完这行代码后，再自增
  int q = ++m; // 先自增，再执行这行代码
  //数学操作 Math 很多运算，会使用一些工具类进行
  double pow = Math.pow(3,2);
  ~~~

## 包机制

为了更好的组织类，Java价值提供了包机制，用于区别类名的命名空间

- 包语句
    - 语法    package pkg1[. pkg2[. pkg3...]];
    - 一般利用公司域名倒置作为包名

- 使用某个包的成员，需要再java程序中明确导入该报包，使用 import 语句可完成此功能

  import pkg1[. pkg2[. pkg3...]];

## JavaDoc

- javadoc命令是用来生成自己API文档的
- 参数信息
    - @auther  作者名
    - @version 版本号
    - @since 指明需要最早使用的jdk版本
    - @param 参数名
    - @return 返回值情况
    - @throws 异常抛出情况

- javadoc -encoding UTF-8 -charset UTF-8 JavaDoc.java


