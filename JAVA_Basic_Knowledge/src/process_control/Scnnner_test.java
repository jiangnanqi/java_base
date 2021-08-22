package process_control;

import java.util.Scanner;

public class Scnnner_test {
    public static void main(String[] args) {
        scanner2();

    }

    public static void scanner1(){
        //创建一个扫描器的对象，用于接收键盘数据
        Scanner scanner = new Scanner(System.in);
        System.out.println("使用next方式接收：");
        if(scanner.hasNext()){
            String str = scanner.next();
            System.out.println("输出的内容为："+str);
        }
        // 凡是属于IO六的类如果不关闭会一直占用资源，要养成好习惯用完就关闭
        scanner.close();
    }

    public static void scanner2(){
        //创建一个扫描器的对象，用于接收键盘数据
        Scanner scanner = new Scanner(System.in);
        System.out.println("使用next方式接收：");
        if(scanner.hasNextLine()){
            String str = scanner.nextLine();
            System.out.println("输出的内容为："+str);
        }
        // 凡是属于IO六的类如果不关闭会一直占用资源，要养成好习惯用完就关闭
        scanner.close();
    }

    public static void scanner3(){
        Scanner scanner = new Scanner(System.in);

        int i = 0;
        float f = 0.0f;
        System.out.println("请输入整数：");
        if(scanner.hasNextInt()){
            i = scanner.nextInt();
            System.out.println(i);
        }else {
            System.out.println("你输入的不是整数数据！");
        }
        System.out.println("请输入小数：");
        if(scanner.hasNextFloat()){
            f = scanner.nextFloat();
            System.out.println(f);
        }else {
            System.out.println("你输入的不是小数数据！");
        }


        scanner.close();
    }
}
