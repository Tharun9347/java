class monthdays
{
public static void main(String args[])
{
int month;
Scanner monthdays=new Scanner(System.in);
System.out.println("enter the month number");

if(month==1||month==3||month==5||month==7||month==8||month==10||month==12)
{
System.out.println("This month has 31 days");
}
else if(month==4||month==6||month==9||month==11)
{
System.out.println("This month has 30 days");
}
else
{
System.out.println("This month has either 28 0r 29 days");
}
}
}
