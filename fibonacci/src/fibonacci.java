
public class fibonacci {

	public int check(int num) {
		if(num<=1) {
			return num;
		} else return check(num-1)+check(num-2);
	}

}
