package day_01;

class  SuperClass{

    static {
        System.out.println("SuperClass init!");
    }
    public  static  int value=123;

}
class  SubClass extends  SuperClass{

    static {
        System.out.println("SubClass init!");
    }

}

public class Test {
    public static void main(String[] args)throws  Exception{
      System.out.println(SubClass.value); 
      //输出:
      //SuperClass init!
      //123

    }
}
