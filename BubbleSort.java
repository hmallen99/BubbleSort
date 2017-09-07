
public class BubbleSort {
	public static void main(string[] args){
		int[] store= {3,6,7,8,9,5,2,1,4,10};
		for(int i=0;i<9;i++){
			for(int j=i+1;j<10;j++){
				if(store[i]>store[j]){
					int temp=store[i];
					store[i]=store[j];
					store[j]=temp;
				}
			}
		}
		for(int out=0;out<10;out++){
			System.out.println(store[out]);
		}
	}
}
