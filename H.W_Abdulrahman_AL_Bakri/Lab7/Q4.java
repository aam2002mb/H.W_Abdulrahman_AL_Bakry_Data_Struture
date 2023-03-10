package H.W.Lab7;

public class Q4 {
    public static void main(String[] args)
    {  PostFix list=new PostFix();
        String express="132*+11-";
        System.out.println("OutPut :" +list.evalPostfix(express));
    }
}
