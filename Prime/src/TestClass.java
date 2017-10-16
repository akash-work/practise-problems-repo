import java.io.*;
import java.util.*;


public class TestClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        String N = br.readLine();
        
        try{
        if(N.matches("\\d+") && Integer.valueOf(N)>=2 && Integer.valueOf(N)<100000){
         String out_ = PrimeDigitNumber(N);
         System.out.println(out_);
        }
        }
        catch(NumberFormatException e){
        	e.printStackTrace();
        }

         wr.close();
         br.close();
    }
    static String PrimeDigitNumber(String N){
        
            
    		int n;
            int limit;
            StringBuilder sb = new StringBuilder();
            String line = N.trim();
             limit = Integer.valueOf(line);
             for (int i = 2; i <= limit; i++){
            
            	 String prime = "";
            	 int j = i;
            	 while(j>0){
            		 n = j%10;
            		 if(isPrime(n)){
            			 prime = prime + String.valueOf(n);
            		 }
            		 j = j/10;
            	 }
            	 if(prime!=""){
            		 prime = new StringBuilder(prime).reverse().toString();
            		 if(prime.equals(String.valueOf(i))){
            		 sb.append(prime + ",");
            		 }
            	 }
            	 
            	 
             }
             sb.deleteCharAt(sb.length()-1);
             return sb.toString();
             }
    
    
    static boolean isPrime(int n) {
		if(n == 1)
			return false;
        if (n % 2 == 0 && n!=2) 
            return false;
        for (int i = 3; i*i <= n; i += 2)
            if (n % i == 0) 
                return false;
        return true;
    }
    
    
}