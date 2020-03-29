package cor;


public class RekQuersumme {

	
public static int sumOfDigits (int x) {
	if ( x == 0 ) {
		return 0;
	}
	
	return sumOfDigits(x/10) + x%10;
}
	public static void main(String[] args) {
		
		System.out.println(sumOfDigits(39));
	}

}

//Das mit x = negativ ist eher nach hinten losgegangen :)