package test01;
public class Test {
    public void run() {
        // TODO Auto-generated method stub
       System.out.println("≤‚ ‘========°∑");
       String s1=this.getClass().getResource("").getPath();
       String s2=this.getClass().getResource("/").getPath();
       System.out.println(s1);
       System.out.println(s2);
       System.out.println("hahahh!!!!");
    }
 
    public static void main(String[] args) {
        new Test().run();
        System.out.println("bbbbbb!!!");
    }
}
