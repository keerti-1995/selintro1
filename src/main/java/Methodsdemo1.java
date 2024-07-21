public class Methodsdemo1 {
    public static void main(String[] args) {
        Methodsdemo1 d1=new Methodsdemo1();
        d1.getdata();
        String name=d1.getdata1();
        System.out.println(name);
        Methoddemo2 d2=new Methoddemo2();
        String name2= d2.getuserdata();
        System.out.println(name2);
        //without creating object directly called
        getuser3();




    }
    //return nothjing so use void
    public void getdata()
    {
        System.out.println("hello world");

    }
    //using return type string
    public String getdata1()
    {
        System.out.println("helloworld");
        return "Java";
    }
    //we can call the method without creating object by using static keyword
    public static String getuser3()
    {
        System.out.println("role model");
        return "Swami vivekananda";
    }
}
