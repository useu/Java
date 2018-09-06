package project2;

import java.util.Comparator;

public class Engineer3 implements Comparator<Engineer>{

	@Override
	public int compare(Engineer o1, Engineer o2) {
		if(o1.getSeniority()<o2.getSeniority()){
			return 1;
		}
		if(o1.getSeniority()==o2.getSeniority()){
			return 0;
		}
	 
		return -1;
	}

}
