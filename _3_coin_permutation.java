package lecture23;

public class _3_coin_permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] coin = {2,3,5};
		int amount = 8;
		int idx = 0;
		permutation(coin,amount,"",idx);
		
	}
	public static void permutation(int[] coin,int amount,String ans ,int idx) {
		if (amount == 0) {
			System.out.println(ans + " ");
			return;
		}
		
		
		
		for (int i = idx; i < coin.length; i++) {
			if (amount>=coin[i]) {
				permutation(coin,amount - coin[i],ans + coin[i],i);
			}
		}
	}

}
