package service;

import datastr.MyGraph;

public class MainService {

	public static void main(String[] args) {
		MyGraph<String> map = new MyGraph<>();
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

	}

}
