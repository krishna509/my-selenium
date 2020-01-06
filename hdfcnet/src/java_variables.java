
public class java_variables {

	public static void main(String[] args)
	{
		
     //int only accept numeric
		int a=100;
		int b=200;
		int c=a+b;
		System.out.println("show the result==>"+c);
		// by using string
		String name="krishna";
		System.out.println("show string==>"+name);
		//string comparision command
		/* equals two string equal comparison
		 * and return true(or)false
		 */
		String Act_result="hellokrishna";
		String Exp_result="HelloKrishna";
         Boolean flag=Act_result.equals(Exp_result);
         System.out.println("flag value==>"+flag);
         //string ingore case
         boolean flag2=Act_result.equalsIgnoreCase(Exp_result);
         System.out.println("igorecase==>"+flag2);
         //trim trim is used method reduce space
         String mobileno="  9502361974  ";
         System.out.println("string mobile no length==>"+mobileno.length());
         //after we use trim
         String AfterTrim=mobileno.trim();
         System.out.println("String after trim vale==>"+AfterTrim.length());
         /*
         isempty

             method is to no wheather string contain any character
        */
         String n="";
         String n1="hi";
         System.out.println("n is empty status ==>"+n.isEmpty());   
         System.out.println("n1 is empty or status==>"+n1.isEmpty());
         /* containsoun
          * 
          */
          String results= "1000 account created complete";
          Boolean flag3=results.contains("account created complete");
          System.out.println(" flag3 results==>"+flag3);
          
         //sub string
            String acctno="04181000111982";
            String sub=acctno.substring(5,10);
            System.out.println("result of sub string==>"+sub);
          //last string
            String sub2=acctno.substring(13);
            System.out.println("result of sub string==>"+sub2);
            //lenght
            int lenght_of_account=acctno.length();
            System.out.println("lenght==>"+lenght_of_account);
        		  
	}

}
