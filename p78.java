import java.util.*;
class Duplicate
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements : ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the elements : ");
		TreeSet<Integer> ts= new TreeSet<Integer>();
		for(int i=0;i<size;i++)
		{
			arr[i] = sc.nextInt();
			ts.add(arr[i]);
		}
		System.out.println("Distinct element : "+ts);
	}
}
