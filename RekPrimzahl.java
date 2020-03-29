package cor;


public class RekPrimzahl {

	public static boolean Primzahl(int zahl, int zahl2) {
        if (zahl == 1) {
        	return false;
        }
        
		if (zahl2 == 1) {
            return true;
        }
		
        for (int i = 2; i * i <= zahl; i++) {
            if (zahl % i == 0) {
                return false;
            }
        }
        
        return Primzahl(zahl,zahl2-1);
	}

	public static void main(String[] args) {
		System.out.println(Primzahl(2,2));
	}

}
