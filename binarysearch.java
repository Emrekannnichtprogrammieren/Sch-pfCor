package cor;

public class binarysearch {
	
	public static int suche(int[] arr, int gesucht) {
		int n = arr.length;
		int mitte = arr[n/2];
		if (mitte == gesucht) {
			return mitte;
		}
		else if(gesucht<mitte) {
			mitte = arr[(n/2)-n];
			return suche(mitte,gesucht);
		}
		else if(gesucht>mitte) {
			mitte = arr[0-(n/2)];
			return suche(mitte,gesucht);
		}
		else {
			return -1;
		}
		return mitte;
	}

	public static void main(String[] args) {
		int [] arr = new int [] {1,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59};

	}

}
