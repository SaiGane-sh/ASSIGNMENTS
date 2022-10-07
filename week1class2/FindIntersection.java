package week1class2;

public class FindIntersection {

	public static void main(String[] args) {
		
		int[]n=  {3,2,11,4,6,7};
		int[]n1=  {1,2,8,4,9,7};
		System.out.println("the intersections of two arrays are :");
		for(int i=0;i<n.length;i++) {
			for(int j=0;j<n1.length;j++) {
				if (n[i]==n1[j]) {
					System.out.println(n1[j]);
					
				}
			}
		}
	}

}
