package lecture23;

import java.util.ArrayList;
import java.util.List;

public class _4_combination_sum {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] coin = {2,3,5};
		int amount = 8;
		int idx = 0;
		List<Integer> ll = new ArrayList<>();
		List<List<Integer>> ans = new ArrayList<>();
		permutation(coin,amount,ll,idx,ans);
		System.out.println(ans);
		
	}
	public static void permutation(int[] coin,int amount,List<Integer> ll  ,int idx,List<List<Integer>> ans ) {
		if (amount == 0) {
//			System.out.print(ll + " ");
			ans.add(new ArrayList<>(ll));
			return;
		}
		
		
		
		for (int i = idx; i < coin.length; i++) {
			if (amount>=coin[i]) {
				ll.add(coin[i]);
				permutation(coin,amount - coin[i],ll,i,ans);
				ll.remove(ll.size()-1);
			}
		}
	}

}
