import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CommonFactor {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        int N = line.length;
        
        try{
        	long a = Long.valueOf(line[0]);
        	long b = Long.valueOf(line[1]);
        	
        	long c = obtainGCD(a,b);
        	int finalCount = countOfCommonFactors(c);
        	
        	System.out.println(finalCount);
            
            
        }
        catch(NumberFormatException e){
        	e.printStackTrace();
        }
        

	}
	
	public static int countOfCommonFactors(long x){
		
		int count = 0;
		
		for(int i=1;i<=Math.sqrt(x);i++){
			if(x%i==0){
				if(x/i==i){
					count +=1;
				}
				else
				{
					count +=2;
				}
			}
		}
		return count;
	}
	
	
	public static long obtainGCD(long p, long q){
		
		long den = p>q?p:q;
		long div = p>q?q:p;
		
		if(div==0){
			return den;
		}
		
		long rem = div;
		
		while(den%div!=0){
			rem = den%div;
			den = div;
			div = rem;
		}
		
		return rem;
		
		
	}


}
