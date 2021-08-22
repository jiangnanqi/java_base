package base;

public class Operator {
    public static void main(String[] args) {
        // 二元运算符
        int a = 10;
        int b = 20;
        int c = 25;
        int d = 25;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / (double) b);

        // 不同类型计算
        long aa = 12343214;
        int bb = 123;
        short cc = 10;
        byte dd = 8;
        System.out.println(aa + bb + cc + dd);
        System.out.println(bb + cc + dd);
        System.out.println(cc + dd);

        // 关系运算符 返回的结果   正确或者错误  布尔值
        int aaa = 10;
        int bbb = 20;
        int ccc = 21;
        System.out.println(aaa > bbb);
        System.out.println(aaa < bbb);
        System.out.println(aaa == bbb);
        System.out.println(aaa != bbb);

        System.out.println(ccc % aaa);

        //一元运算符： 自加、自减
        int m = 4;
        int n = m++; // 执行完这行代码后，再自增
        int q = ++m; // 先自增，再执行这行代码

        System.out.println(m);
        System.out.println(m);
        System.out.println(n);
        System.out.println(n);
        System.out.println(q);
        System.out.println(q);
        //数学操作 Math 很多运算，会使用一些工具类进行
        double pow = Math.pow(3, 2);
        System.out.println(pow);

        // 逻辑运算符:与或非  and  or !
        boolean f = false;
        boolean t = true;
        System.out.println("f && t:" + (f & t));
        System.out.println("f || t:" + (f || t));
        System.out.println("!(f&&t) " + !(f && t));
        // 短路运算
        int test_a = 5;
        boolean test_flag = (test_a < 4) && (c++ < 4);
        System.out.println(test_flag);
        System.out.println(test_a);

        // 位运算
        /*
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
         */
        System.out.println(2<<3);

        a+=b; // a = a+b
        System.out.println(a);
        System.out.println(""+a+b);
        // 三元运算符 x？y:z
        // 如果x==true  则结果为y，否则结果为z
        int score = 50;
        String type = score < 60?"不及格":"及格";
        System.out.println(type);


    }
}
