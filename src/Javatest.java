import java.util.Scanner;
public class Javatest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long a;
        long n = sc.nextLong();
    for(a=1 ;a<=n; a++)
    {
        a+=n;
        System.out.println(a);
    }

    sc.close();
}
}