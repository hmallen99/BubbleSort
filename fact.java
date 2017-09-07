
public class fact {
	public static void main(String[] args) {
		int input=6;
		System.out.println(tor(input));
	}
	
	public static int tor(int n){
		if(n==0){
			return 1;
		}
		else{
			return tor(n-1) * n;
		}
	}
}
