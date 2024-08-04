import java.util.Scanner;
class LCM
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        int num1 = obj.nextInt();
        int num2 = obj.nextInt();
        int max = (num1 > num2)? num1:num2;
        while(true)
        {
            if(max%num1==0 && max%num2==0)
            {
                System.out.println("the LCM is "+max);
                break;
            }
            max++;
        }
    }
}