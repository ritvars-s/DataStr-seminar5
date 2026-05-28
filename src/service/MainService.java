package service;

import datastr.MyGraph;
import model.City;
import model.Country;

public class MainService {

	public static void main(String[] args) {
		MyGraph<String> map = new MyGraph<>();
		MyGraph<City> maps = new MyGraph<>();
		try {
			map.addVertice("Atlanta");
			map.addVertice("Dallas");
			map.addVertice("Austin");
			map.addVertice("Chicago");
			map.addVertice("Denver");
			map.addVertice("Houston");
			map.addVertice("Washington");
			map.addEdge("Austin", "Houston", 160);
			map.addEdge("Austin", "Dallas", 200);
			map.addEdge("Dallas", "Austin", 200);
			map.addEdge("Houston", "Atlanta", 800);
			map.addEdge("Atlanta", "Houston", 800);
			map.print();
						
		}
		catch(Exception e) {
			System.out.println(e);
		}
		try {
			City c1 = new City("Kuldiga", 12f, "9001", Country.Latvia);
			City c2 = new City("Ventspils", 35f, "9002", Country.Latvia);
			City c3 = new City("Liepaja", 68f, "9003", Country.Latvia);
			maps.addVertice(c1);
			maps.addVertice(c2);
			maps.addVertice(c3);
			maps.addEdge(c1, c2, 80);
			maps.addEdge(c2, c1, 80);
			maps.addEdge(c1, c3, 110);
			maps.addEdge(c3, c1, 110);
			maps.addEdge(c2, c3, 120);
			maps.addEdge(c3, c2, 120);
			maps.print();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
