
public class Countofdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=123456,count=0;
		while(number>0) {
			number=number/10;
			count++;
		}
		System.out.println("the total count of digits is " +count);

	}

}
