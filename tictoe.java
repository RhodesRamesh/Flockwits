import java.util.*; 
import java.lang.*; 
import java.io.*; 
import java.util.Scanner;
class tictoe
{
static char arr[][]={{' ',' ',' ',' ',' ',' ',' '},
		     {' ',' ',' ',' ',' ',' ',' '},		
		     {' ',' ',' ',' ',' ',' ',' '},
		     {' ',' ',' ',' ',' ',' ',' '},
		     {' ',' ',' ',' ',' ',' ',' '},
		     {' ',' ',' ',' ',' ',' ',' '},
		     {' ',' ',' ',' ',' ',' ',' '}};
static int i,j;
static void check(char A,int a,int b)
{

if(arr[a][b]==A&&arr[a+1][b]==A&&arr[a+2][b]==A||arr[a][b]==A&&arr[a][b+1]==A&&arr[a][b+2]==A||arr[a][b]==A&&arr[a+1][b+1]==A&&arr[a+2][b+2]==A||arr[a][b]==A&&arr[a-1][b]==A&&arr[a-2][b]==A||arr[a][b]==A&&arr[a][b-1]==A&&arr[a][b-2]==A||arr[a][b]==A&&arr[a-1][b-1]==A&&arr[a-2][b-2]==A)          
 { System.out.println(A+" is winner");
   display();
   System.exit(0);
 }
/*else if(arr[a][b]==A&&arr[a][b+1]==A&&arr[a][b+2]==A)
 { System.out.println(A+" is winner");
   System.exit(0);
 }
else if(arr[a][b]==A&&arr[a+1][b+1]==A&&arr[a+2][b+2]==A)
 { System.out.println(A+" is winner");
   System.exit(0);
 }
*/
/*else if(arr[a][b]==A&&arr[a][b-1]==A&&arr[a][b-2]==A)
  {System.out.println(A+" is winner");
   System.exit(0);
  }*/
}
static void display()
{
for(i=0;i<7;i++)
  {for(j=0;j<7;j++)
    {System.out.print(" "+arr[i][j]);}
   System.out.println("");
   }

}
public static void main(String[] args)
{

Scanner scan=new Scanner(System.in);
for(i=0;i<7;i++)
  {for(j=0;j<7;j++)
    {System.out.print(" "+arr[i][j]);}
   System.out.println("");
}
while(true)
{
System.out.print("Player X Tune\n");
System.out.print("Enter the position");
int x=scan.nextInt();
int y=scan.nextInt();
x=x+2;
y=y+2;
arr[x][y]='X';
check('X',x,y);
display();
System.out.print("Player O Tune\n");
System.out.print("Enter the position");
x=scan.nextInt();
y=scan.nextInt();
x=x+2;
y=y+2;
arr[x][y]='O';
check('O',x,y);
display();
}
}
}