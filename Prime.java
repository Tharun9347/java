class prime
{
  public static void main(String args[])
  {
    int num=27,i=27,count=0;
    while(i<=num)
    {
      if(num%i==0)
      {
        count=count+1;
      }
       
      i--;
    }
    if(count==2)
    {
           System.out.println("it's a prime number");
    }
    else
    {
             System.out.println("it's not a prime  number");
    }
   }
}

     
    
