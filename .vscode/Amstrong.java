import java.util.Scanner;
class Amstrong
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter numbers: \n");
        int start = obj.nextInt();
        int fin = obj.nextInt();
        for(int i=start;i<=fin;i++)
        {
    
            int pow = 0; int rem = 0;int temp = i;
            while(temp>0)
            {
                temp/=10;
                pow++;
            }
            temp = i;
            int sum = 0;
            while(temp>0)
            {
                rem = temp %10;
                temp = temp/10;
                sum+=Math.pow(rem,pow);
            }
            if(i==sum)
            System.out.println(i+" is a amstrong number");
        }
        
    }
}