
public class Practice1 {

	public static void main(String[] args) {
		int input=5;
		System.out.println(fact(input));
	}
	
	public static int fact(int n){
		if(n==0){
			return 1;
		}
		else{
			return fact(n-1) * n;
		}
	}

}
