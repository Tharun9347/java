public class Prime
{
public static void main(String args[])
{
int i=1,num=5,count=0;
while(i<=num)
{
if(num%i==0)
{
count=count+1;
}
i++;
}
if(count==2)
{
System.out.println(num+"is a prime");
}
else
{
System.out.println(num +"is not a prime");
}
}
}


