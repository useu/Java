package project2;

import java.util.Comparator;

public class Engineer2 implements Comparator<Engineer>{

	@Override
	public int compare(Engineer o1, Engineer o2) {
		//姓名排序用compareTo   >0表示升序
		if(o1.getName().compareTo(o2.getName())>0){
			return 1;
		}
		if(o1.getName()==o2.getName()){//能用==吗？不是应该用.equals
			return 0;
		}
	 
		return -1;
	}

}
