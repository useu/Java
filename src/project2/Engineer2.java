package project2;

import java.util.Comparator;

public class Engineer2 implements Comparator<Engineer>{

	@Override
	public int compare(Engineer o1, Engineer o2) {
		//����������compareTo   >0��ʾ����
		if(o1.getName().compareTo(o2.getName())>0){
			return 1;
		}
		if(o1.getName()==o2.getName()){//����==�𣿲���Ӧ����.equals
			return 0;
		}
	 
		return -1;
	}

}
