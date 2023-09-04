class fibonacci
{
public static void main(String args[])
{
int count=8,n1=0,n2=1,i=1,n3;
while(i<=count)
{
n3=n1+n2;
n1=n2;
n2=n3;

i++;
}
System.out.println("Fibonacci series of "+count+"number:");

}
}


