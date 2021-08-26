package arrayLists;

import java.util.ArrayList;

public class Main {
	
	MainData data = new MainData(new ArrayList<CartItem>(), new CartItem("Powerbank"), new CartItem());
	ArrayList<data> 
	
	public static void main(String[] args) {
		String[] cities = {"Ankara", "İstanbul", "İzmir"};
		//Eleman Sayısı
		//System.out.println(cities.length);
		//elemanlara erişmek için;
		//System.out.println(cities[0]);
		//System.out.println(cities[1]);
		//System.out.println(cities[2]);
		//yeni liste oluşturma
		cities = new String [4];
		//System.out.println(cities[0]);
		
		MyStringList cities = new MyStringList();
		
		cities.add("Ankara");
		cities.add("İzmir");
		
		for (String city : cities.listData()) {
			System.out.println(city);
		}
		
		//Generic
		//Array olarak eski listeyi bozmadan new tanımlamak;
		
		ArrayList<String> cities2= new ArrayList<String>();
		//Eleman sayısını veren formül;
		System.out.println(cities2.size());
		//eleman ekleme;
		cities2.add("Ankara");
		cities2.add("İstanbul");
		cities2.add("İzmir");
		
		System.out.println(cities2.size());
		
		cities2.set(0, "Adana");
		
		System.out.println(cities2.get(0));
		System.out.println(cities2.get(1));
		System.out.println(cities2.get(2));
		
		cities2.add("Bursa");
		System.out.println(cities2.get(3));
	}

}
