import java.util.Scanner;

public class primenumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
    
        boolean status=true;
        if(num<2){
            System.out.println(num+" is not a prime number");
        }
        else{
            for(int x=2; x<num; x++){
                if(num%x==0){
                    status=false;
                }
            }
            if(status==false){
                System.out.println(num+" is not a prime number");
            }
            else{
                System.out.println(num+" is a prime number");
            }
        }
    }
}
