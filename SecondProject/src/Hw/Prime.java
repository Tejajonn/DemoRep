package Hw;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=1; i < 100; i++)
				{
                        boolean prime = true;
           
                            for(int j=2; j < i ; j++)
                            {
                    
                    if(i%j == 0)
                    {
                            prime = false;
                            break;
                    }
            }
                            if(prime)
                    System.out.println(i);
                            
                            sum+=i;
                           
    } System.out.println("Sum of 100 prime numbers : "+ sum);
		
        

	}

}
