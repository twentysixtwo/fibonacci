
public class fibonacci {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public int check(int num) {
		// works for cases num >= 0
		if(num>0) {
			switch(num) {
			case 0:
				return 0;
			case 1:
				return 1;
			default:
				return (check(num-1)+check(num-2));
			}
		} else {
			//If num is negative - undefined. Return 0
			return 0;
		}
	}

}
