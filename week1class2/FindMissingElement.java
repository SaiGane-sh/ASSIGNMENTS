package week1class2;

public class FindMissingElement {

	public static void main(String[] args) {
		
		
		int a[] = {1,2,3,4,7,6,8};
		
		//sum1=1+2+3+4+7+6+8=31
		//sum2=1+2+3+4+5+6+7+8=36
        // sum2-sum1=5(missing number)
		
		int sum1=0;
		for(int i=0;i<a.length;i++) {
			
			sum1=sum1+a[i];
		}
		System.out.println("sum of elements in array is :" + sum1);
		
		int sum2=0;
		
		for(int i=1;i<=8;i++) {
			sum2=sum2+i;
			}
		System.out.println("sum of range of elements in array is : "+ sum2);
		System.out.println("Missing element is "+(sum2-sum1));
		
	}

}
