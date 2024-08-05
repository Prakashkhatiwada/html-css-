import java.util.Scanner;
class JAVA{
void prakash(){
int n,i;
System.out.println("Enter a number: ");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
for(i=1;i<=10;i++)
System.out.println(n+"x"+i+"= "+(n*i));
 
}
public static void main(String args[]){
Java obj=new Java();
obj.prakash();

}
} 
