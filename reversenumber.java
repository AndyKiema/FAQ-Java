import java.util.Scanner;

public class reversenumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        String no=String.valueOf(number); //Convert number to string
        String rev="";
        char a[]=no.toCharArray();//Convert string to array
        for(int x=a.length-1; x>=0; x--){
            rev+=a[x];
        }
        System.out.println(Integer.parseInt(rev));//Convert rev to integer

    }
}
