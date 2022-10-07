package week1class2;



public class PalindromeNumber {

	public static void main(String[] args) {
		
          int org_num=34343;
          String str=Integer.toString(org_num);
          int temp=org_num;
          int rev=0;
          
          for(int i=str.length();i>0;i--) {
        	  
        	  rev=(rev*10)+(org_num%10);
        	  org_num=org_num/10;
        	  
          }
            if (temp==rev) {
            	System.out.println(temp+" "+"is a palindrome");
				
			} else {
				System.out.println(temp+" "+"is not a palindrome");

			}
		
		}

	}


