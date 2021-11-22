import java.io.DataInputStream;
class Q2{
public static void main(String args[])
{
  int a[][];
   int row,col,i,j,sum;
  DataInputStream in=new DataInputStream(System.in);
  for(i=0,i<row,i++)
  {
   for(j=0,j<col,j++)
   {
  try{
     System.out.println("enter your elts: ");
     a[i][j]=Integer.parseInt(in.readLine());
     }
  catch(Exception e){
			}
   }
  }
 
  for(i=0,i<3,i++)
  {
   for(j=0,j<3,j++)
   {
     if(i==j)
     {
       sum=sum+a[i][j];
     }
      System.out.print(" "+sum);
   }
  System.out.println(" ");
  }
}
}