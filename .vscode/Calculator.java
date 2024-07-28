// calculator

import java.util.Scanner;
class Calculator {
    public static void main(String[] args) {
        float num1,num2,result;
        int cap=0;
        Scanner obj = new Scanner(System.in);
        while(cap!=6)
        {
           
            System.out.println("Here are the options: \n1.addition\n2.subtraction\n3.multiplication\n4.divison(quotient)\n5.division(remainder)\n6.Quit");
            cap=obj.nextInt();
            if(cap==6)
            {
                System.out.println("Thank You,Visit Again");
                break;
            }
            System.out.println("Enter 2 numbers");
            num1=obj.nextFloat();
            num2=obj.nextFloat();
            if(cap==1)
            {
                result=num1+num2;
                System.out.println("the result is: "+result);
            }
           
            else if(cap==2)
            {
                result=num1-num2;
                System.out.println("the result is: "+result);
            }
            else if(cap==3)
            {
                result=num1*num2;
                System.out.println("the result is: "+result);
            }
            else if(cap==4)
            {
                result=num1/num2;
                System.out.println("the result is: "+result);
            }
            else if(cap==5)
            {
                result=num1%num2;
                System.out.println("the result is: "+result);
            }
           
        }
    }
}