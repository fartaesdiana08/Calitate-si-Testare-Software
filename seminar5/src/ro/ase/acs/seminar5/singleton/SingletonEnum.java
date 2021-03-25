package ro.ase.acs.seminar5.singleton;

import java.util.ArrayList;

public enum SingletonEnum {
INSTANCE;

public ArrayList<String> products;

public ArrayList<String> getProducts(){
	if(products==null) {
		products=new ArrayList<String>();
	}
	return products;
}
//by default constructorii sunt privati pt enum
}
