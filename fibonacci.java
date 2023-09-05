class Fibonacci
{
  public static void main(String args[])
  {
    int i=1,n1=0,n2=1,n3,num=10;
    while(i<=num)
    {
      n3=n1+n2;
      n1=n2;
      n2=n3;
      System.out.println(n2);
       
      i++;
    }
  }
}

     
    
