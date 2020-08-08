package week3.day2;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		 String str1="We learn java basics as part of java sessions in java week1",str2="";      
		    for(int i=0; i<=str1.length()-1;i++) {
		        int count=0;
		        for(int j=0;j<=i;j++) {
		            if(str1.charAt(i)==str1.charAt(j)) 
		                count++;
		            if(count >1)
		                break;
		        }
		        if(count==1) 
		            str2=str2+str1.charAt(i);
		    }
		    System.out.println(str2);
		
		
		
		/*String text = "We learn java basics as part of java sessions in java week1";
        int count = 0;
		
		char[] chrArray = text.toCharArray();
		
        int x = chrArray.length;

        for (int i = 0; i <= x-1; i++) {

        	char s = chrArray[i];
           	for (int j = 1; j <= x-1; j++) {
				
        		char t = chrArray[j];
                		
        		if (s == t){
        			count = count + 1;
        			if (count > 1)
        			{
                       System.out.println("duplicate found");     
        			}
        			
        		}
			}
        	
		}
*/		
	}

}
