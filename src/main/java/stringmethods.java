public class stringmethods {
    public static void main(String[] args)
    {
        String s1="welcome to my home";
        System.out.println(s1);
        String s2 ="welcome to my home";
        System.out.println(s2);
        //now it  take exist object it wil not create new one because in both strings value is same
        String s3=new String("you are always welcome");
        System.out.println(s3);
        String s4=new String("you are always welcome");
        System.out.println(s4);
        //now it create both the objects because here explicitly we are creating new object by using "new" keyword
        String s="i love my india";
        String[] splittedstring= s.split(" ");
        System.out.println(splittedstring[0]);
        System.out.println(splittedstring[1]);
        System.out.println(splittedstring[2]);
        System.out.println(splittedstring[3]);
        String k="my name is keerthi";
        String[] splittstring=k.split("is");
        System.out.println(splittstring[0]);
        System.out.println(splittstring[1]);
        System.out.println(splittstring[1].trim());






    }
}

