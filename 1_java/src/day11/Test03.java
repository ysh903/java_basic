package day11;

import java.util.ArrayList;
import java.util.List;

public class Test03 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(77);
		list.add(90);
		list.add(75);
		list.add(80);
		list.add(49);

		for (Integer data : list) {
			System.out.print(data + " ");

		}
/*
		System.out.println("\n----------------");
		list.forEach(new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.print(t + " ");

			}

		});
*/	
		
		System.out.println("\n----------------");
		list.forEach(t -> System.out.print(t + " "));//callback 함수
		System.out.println("\n----------------");
		list.removeIf(i -> i %2==0);
		list.forEach(t -> System.out.print(t + " "));
		System.out.println("\n----------------");	
		list.replaceAll(i->i*10);
		list.forEach(t -> System.out.print(t + " "));

		
		
		
	}

}



