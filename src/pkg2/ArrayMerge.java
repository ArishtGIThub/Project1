package pkg2;

public class ArrayMerge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a ={5,3,8,10};
		int[] b ={2,4,16};

		int[] c= new int[a.length+b.length];
		int i=0,j=0,k=0;
		
		while(i<a.length && j<b.length)
		{
			if(a[i]<b[j])
			{
				c[k++]=a[i++];
			}
			else
			{
				c[k++]=b[j++];
			}
		}
		while(i<a.length)
		{
			c[k++]=a[i++];
		}
		while(j<b.length)
		{
			c[k++]=b[j++];
		}
		System.out.println("Array after Merging");
		for(i=0;i<a.length+b.length;i++)
		{
		    System.out.println(c[i]);
		}

	}

}
