package it.unical.it.provaIngsw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main 
{
	public static void main(String[] args) 
	{
		
		ArrayList<Integer> numeri = new ArrayList<Integer>();
		numeri.addAll(Arrays.asList(1,5,8,4,7,6));
		
		MyListUtil util = new MyListUtil();
		
		List<Integer> l = util.ordineCrescente(numeri);
		
		for(Integer i : l)
		{
			System.out.println(i);
		}
	}
}
