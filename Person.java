public Person
{
      public static void main(String[] args) 
     {
    	   int n=13;
    	   
    	   for(int i=n;i>=1;i--)
    	   {
    		  for(int j=1;j<=n-i;j++)
    		  {
    			  System.out.print(" ");
    		  }
    		  
    		  for(int k=1;k<=i;k++)
    		  {
    			  if(i%2!=0)
    			  {
    			    System.out.print(" *");
    		  
    			  }
    		  }	  
    		      System.out.println();		  
    	  }   
   }
}
