package Hw;

public class Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0; 
		int num=123; 
		while (num > 0) 
		{ 
			int rim = num % 10; 
			sum += rim;
			num /= 10;
			} 
		System.out.println("sum of digits  "+sum);
		System.out.println("---------------------");
		System.out.println("3rd Table");
		int t=3;
		
		for(int i=1;i<=10;i++)
		{
			int res=t*i;
			System.out.println(t+"*"+i+"="+res);
		}
}
}
