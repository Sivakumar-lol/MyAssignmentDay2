package week1.day2;

public class Missingarray {

	public static void main(String[] args) {
		int[] grp = {1,2,3,4,5,6,8};
		int total=0;  
		int length=grp.length;
		int val=(length*(length+1)/2);
		for(int i=0;i<length-1;i++)
		{
			 total=total+grp[i];
		}
		System.out.println(val-total);
	}

}
