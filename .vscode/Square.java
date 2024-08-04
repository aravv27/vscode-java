class Sqaure
{
    public static void main(String[] args)
    {
        int r = 5;
        int c = 5;
        int i,j;
        for(i=0;i<=r;i++)
        {
            for(j=0;j<=c;j++)
            {
                if(i == 0 || i == r)
                {
                    System.out.print("*");
                }
                else
                {
                    if(j ==0 || j == c)
                    System.out.print("*");
                    else
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}