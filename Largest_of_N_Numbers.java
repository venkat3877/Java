
public class Largest_of_N_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {15,10,60,12,24,50};
		int max=0;
		for(int i=0;i<array.length-1;i++) {
			if(array[i]>array[i+1]) {
				array[i+1]=array[i];
				max=array[i+1];
			}else {
				max=array[i+1];
			}
			
		}System.out.println(max+ " is the largest number");
		

	}

}
