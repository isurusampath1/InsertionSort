import java.util.Scanner;
public class InsertionSort
{
	public static void main(String args[])
	{
		int key;
		int previous;
		
		Scanner array = new Scanner(System.in);
		System.out.println("Enter your size of unsorted elements.");
		int size=array.nextInt();
		int elements[] = new int[size];
		//int sorted[] = new int[size];
		
		System.out.println("Now enter your elements:");

		for(int i=0;i<size;i++)
		{
			elements[i]=array.nextInt();
		}
		
		for (int j=1;j<size;j++)
		{
			key=elements[j];
			previous=j-1;
			while(previous>-1 && elements[previous]>key)
			{
				elements[previous + 1]=elements[previous];
				previous -= 1;
			}
			elements[previous + 1]=key;
			/*for (int i=0;i<size;i++)
			{
				sorted[i]=elements[i];
			}*/
		}
	
		for(int k=0;k<size;k++)
		{
			System.out.print(elements[k]+"\t");
			
		}
		System.out.println();
	}
}
