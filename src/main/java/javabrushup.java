public class javabrushup {
    public static void main(String[] args) {
//integers,datatypes
        int mynum=6;
        char letter='k';
        String name="my daughter name is Anvika";
        double dec=4.55;
        boolean mycard=true;
        System.out.println(mynum+"the variable number is saved in mynum");
        System.out.println(letter);
        System.out.println(dec);
        System.out.println(mycard);
        //arrays
        //one way of defining array
        int[] arr=new int[5];
        arr[0]=1;
        arr[1]=2;
        arr[2]=4;
        arr[3]=6;
        arr[4]=9;
        System.out.println(arr[3]);
        //another way
        int[] arr2={2,4,6,8,10,89,111,333};
        System.out.println("the array length is " + arr2.length);
        System.out.println(arr2[5]);
        //for loop for integers
        System.out.println("for loop testing");
        for(int i=0;i<arr2.length;i++)
        {
            //System.out.println(Integer.valueOf(arr2[i]));
            System.out.println(arr2[i]);
        }
        //for loop for strings

        String[] Names={"vishva","keerthi","anvika"};
        //String[] Names={"vishva,keerthi,anvika"}; wrong one


        for(int i=0;i<Names.length;i++)
        {
            System.out.println(Names[i]);
        }
        //enhanced for loop(iterartes eachb elememt each time,another way of for loop)
        for( String s:Names)
        {
            System.out.println(s);
        }

}
    }