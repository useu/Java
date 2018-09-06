package project2;

import java.util.Comparator;
/*
 * 排序使用三种方式：编号排序（升序）、姓名排序（升序）和工龄排序（降序）。采用哪种排序方式，由用户选择。
 */
public class Engineer1 implements Comparator<Engineer>{

	@Override
	public int compare(Engineer o1, Engineer o2) {
		if(o1.getNumber()>o2.getNumber()){
			return 1;
		}
		if(o1.getNumber()==o2.getNumber()){
			return 0;
		}
	 
		return -1;
	}
}
