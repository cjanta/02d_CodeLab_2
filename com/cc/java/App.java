package com.cc.java;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
		List<Mitarbeiter> mitarbeiter = new ArrayList<>();
		
		Mitarbeiter mit1 = new Mitarbeiter("Resterampe", "Rudi", "Türsteher" , 1999);
		mitarbeiter.add(mit1);
		Mitarbeiter mit2 = new Mitarbeiter("Husten", "Saft", "Heiler" , 2014);
		mitarbeiter.add(mit2);
		Mitarbeiter mit3 = new Mitarbeiter("Marathon", "Babara", "Sachbearbeiterin" , 1960);
		mitarbeiter.add(mit3);


		LogHelper.log("*************************************");
		mitarbeiter.forEach(m -> LogHelper.log(m.getInfoDesignation()));
		LogHelper.log("*************************************");
		LogHelper.log(mit3.getInfo(Mitarbeiter.KEY_YEAR_OF_ENTRY));
		LogHelper.log("*************************************");
		LogHelper.log(mit1);
		LogHelper.log(mit2);
		LogHelper.log(mit3);
	}

	

	
};
