package base;

public class JavaBase {

    //类变量
    static double salary = 2500;

    //属性：变量
    //实例变量：从属于对象 如果不初始化，则为默认值。 除基本类型外，其余都为null
    String name;
    int age;

    //其他方法
    public void add(){}

    //主方法
    public static void main(String[] args) {

        //局部变量
        int i = 10;
        System.out.println(i);

        JavaBase jb = new JavaBase();
        System.out.println(jb.age);
        System.out.println(salary);



        numberType_me();
        number_extends();
        typeCharge();
        bigNumber();
    }

    public static void numberType_me(){
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
        System.out.println("base.Hello\tWorld!");

        // 布尔值扩展
        boolean flag = true;
        if(flag==true){}
        if(flag){}
        // less is more
    }

    public static void typeCharge(){
        int i = 128;
        //byte b = i;
        // 强制转换  （类型）变量名
        byte b = (byte)i;
        System.out.println(b);

        int i1 = 128;
        double b1= i1;

        /**
         * 注意点：
         * 1、不能对布尔值进行转换
         * 2、不能把对象类型转换为不相干的类型
         * 3、在把高容量转换到低容量的时候，强制换行
         * 4、转换的时候可能存在内存溢出、或者精度问题
         */


        System.out.println("=========================");
        System.out.println((int)23.7);   //23
        System.out.println((int)-45.89f);   //-45
        System.out.println("=========================");
        char c = 'a';
        int d = c + 1;
        System.out.println(d);
        System.out.println((char)d);
    }

    public static void bigNumber(){
        // 操作比较大的数的时候，注意溢出问题
        // JDK7新特性，数字之间可以用下划线分割
        int money = 10_0000_0000;
        System.out.println(money);
        int years = 20;
        int total = money * years;
        System.out.println(total); // -1474836480
        long total3 = money * (long)years;
        System.out.println(total3);
    }

    public static void varName(){
        int a = 1, b = 2, c = 3;
        String name = "qjn";
        char x = 'x';
        double pi = 3.14;
    }

    public static void constant(){
        final double PI = 3.14;
        System.out.println(PI);
    }
}
