
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class javabrushup2 {
    public static void main(String[] args) {

        int[] num={1,2,4,6,7,8,9,10,11,22,110};
        //how many numbers are of multiple 2
        //check does it has multiple of 2 ,if it has then stop the iteration(by using Break)
        for(int i=0;i< num.length;i++)
        {
            if(num[i]%2==0)
            {
                System.out.println(num[i]);
                break;

            }
            else
            {
                System.out.println(num[i]+ " is not mul of 2");
            }
        }
        ArrayList<String> a=new ArrayList<String>();
        a.add("vishva");
        a.add("keerti");
        a.add("Anvika");
        a.add("Hiremath");
        a.add("selenium");

        System.out.println(a.get(2));
        for(int i=0;i<a.size();i++)
        {
            System.out.println(a.get(i));
        }
        System.out.println("**************");
        for( String val:a)
        {
         System.out.println(val);
        }
        //if we want to check anything in arraylist just we can use contains() method need not use if else conditional statments.
        //in normal arrays if we want to check something we should use if else cond stmt.
        System.out.println(a.contains("Hiremath"));
        System.out.println(a.contains("my"));

       //to check element present in normal arrays
         String[] arr5 = {"vhh","khh","Ahh","Hhh","Shh"};
        for( int i=0;i<arr5.length;i++)
        {

         if (arr5[i] == "vhh")
         {
             System.out.println(arr5[i]);
           }
         else
             {
              System.out.println(arr5[i] + "not found");
            }

         }


//to convert arrays to arraylist

         String[] Names = {"vishva","keerthi","anvika"};
        List<String> NamesArrayList= Arrays.asList(Names);
         System.out.println(NamesArrayList.contains("anvika1"));

    }

}
