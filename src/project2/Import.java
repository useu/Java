package project2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class Import {
	
	static List<Engineer> list = new ArrayList<>();
	//list����Ϊ��Ա���� ����ListTest.java����  ����Ϊ��̬����
	
	//import1()�������巵��ֵ����Ϊ�����ͣ������ڼ���(ListTest.java)�б����ֶ���������ݣ����ܽ��в�ѯɾ���Ȳ���
    //���ҷ����Ǿ�̬��
       static List<Engineer> import1() {
		System.out.println("�����빤��ʦ����");
		Scanner sc = new Scanner(System.in);//�ֶ�����
		Engineer e = new Engineer();
		
		System.out.println("���ţ�");
		e.setNumber(sc.nextInt());
	//	int Number = sc.nextInt();
		
		
		System.out.println("������");
		e.setName(sc.next());
	//	String name = sc.next();
		//�˴���String��next()����ƥ�䲻��String name = sc.next();
		
		System.out.println("�Ա�");
		System.out.println("true����Ů false������");
		e.setSex(sc.nextBoolean());
		//ʹ�ֶ�����ı�������Ҫ�����Engineer�еı���  �����ں���ȽϷ���ʱʹ��;
		
		System.out.println("���գ�");
		System.out.println("��ʽ�磺19900304");
		e.setBirth(sc.nextInt());
		
		System.out.println("���᣺ ");
		e.setAdress(sc.next());
		
		System.out.println("ѧ��()��");
		System.out.println("����0��ѧʿ1��˶ʿ2����ʿ3������Ϊ4��");
		e.setStudy(sc.nextInt());
		
		System.out.println("��ַ");
		e.setPlace(sc.next());
		
		System.out.println("�绰");
		e.setTel(sc.nextLong());
		
		System.out.println("����");
		e.setSeniority(sc.nextInt());
		
		System.out.println("����нˮ");
		e.setMoney(sc.nextInt());
		
		
		list.add(e);
  		return list;
		
  		
  			
  		}
	}
    
	


