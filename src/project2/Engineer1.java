package project2;

import java.util.Comparator;
/*
 * ����ʹ�����ַ�ʽ������������򣩡������������򣩺͹������򣨽��򣩡�������������ʽ�����û�ѡ��
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
