package project2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;



public class MainWindow {
	static int j ;
	
	 void window(){
		System.out.println("������ָ��"+"\n"+"**********************"+"\n"+"*1.���빤��ʦ����                     *"+"\n"+"*2.ɾ��ָ������ʦ����             *"+"\n"+"*3.��ѯָ������ʦ����             *"+"\n"+"*4.�޸�ָ������ʦ����             *"+"\n"+"*5.���㹤��ʦ��н                     *"+"\n"+"*6.���湤��ʦ����                     *"+"\n"+"*7.�Թ���ʦ���Ͻ�������         *"+"\n"+"*8.�������ʦ����                     *"+"\n"+"*9.������й���ʦ����             *"+"\n"+"*10.��ӡ���ϱ���                      *"+"\n"+"*11.���ļ�����ȡ����              *"+"\n"+"*12.�˳�ϵͳ                              *"+"\n"+"**********************");
		Import i = new Import();
		ListTest lt = new ListTest();
		Engineer e1 = new Engineer();
		MonthlyPay mp = new MonthlyPay();
		
		Scanner s = new Scanner(System.in);
		
		while(true){
			j = s.nextInt();//j����Ϊ��Ա����
			//ѡ�����
			switch(j){
			
			//�������¼�
			case 1:
				i.import1();
				System.out.println("��������ɹ�");
				lt.test();
				System.out.println();
				window();
			case 2:
				System.out.println("ѡ��ɾ������ʦ���ϵķ�ʽ");
				System.out.println("1.���"+"\n"+"2.����");
				System.out.println("����'1'����'2'");
				while(true){
					int a = s.nextInt();
					//������if�ⶨ�� ����if(s.nexInt()==1)
					if(a==1){
						System.out.println("������:");
							lt.delete1();
							window();	
					
					}
					 if(a==2){
						System.out.println("��������:");
						lt.delete2();
						window();	
				}
			}
            case 3:
            	System.out.println("ѡ���ѯ����ʦ���ϵķ�ʽ");
				System.out.println("1.���"+"\n"+"2.����");
				System.out.println("����'1'����'2'");
				while(true){
					int a = s.nextInt();
					if(a==1){
						System.out.println("������");
						lt.check1();
					}
					//������������;��ŵĺ���������Import�з���������д
					if(a==2){
						System.out.println("��������");
						lt.check2();
					}
				}
				
				
				
            case 4:
            	System.out.println("ѡ����Ĺ���ʦ���ϵķ�ʽ");
				System.out.println("1.���"+"\n"+"2.����");
				System.out.println("����'1'����'2'");
				while(true){
					int a = s.nextInt();
					if(a==1){
						System.out.println("������");
						lt.change1();//������������;��ŵĺ���������Import�з���������д
						System.out.println();
						window();
					}
					if(a==2){
						System.out.println("��������");
						lt.change2();
						System.out.println();
						window();
					}
				}
				
				
				
            case 5://���ظ�ϰ
            	System.out.println("���㹤��ʦ��н ");
            	System.out.println("��ѡ��н������");
				System.out.println("1.��н��"+"\n"+"2.��н��");
				System.out.println("����'1'����'2'");
				while(true){
					int a = s.nextInt();
				if(a==1){
					mp.pays();
					
				}
				if(a==2){
					mp.pays1();
			     	}
				}
            	
				
				
				
            case 6://I/O��
            	System.out.println("���湤��ʦ����");
            	 Test.test();
            	//������.���������÷���������һ���Ǿ�̬��
            	//ʹ��IO��������ݵ��ĵ�
            	//Ҫ��Engineer����ʵ����  ������׳��쳣,��
            	//java.io.NotSerializableException: project2.Engineer
            	//����Engineer���implements Serializable ;
            	
              
            	 
            case 7:
            	System.out.println("ѡ��Թ���ʦ��������ķ�ʽ");
				System.out.println("1.���"+"\n"+"2.����"+"\n"+"3.����");
				System.out.println("����'1'����'2'����'3'");
				while(true){
					int a = s.nextInt();
					if(a==1){
						System.out.println("������");
						lt.sort1();
					}
					if(a==2){
						System.out.println("��������");
						lt.sort2();
					}
					if(a==3){
						System.out.println("���빤��");
						lt.sort3();
					}
				}
			
            	
				
				
				
            case 8:
            	
            	lt.test();
            	window();
            
            	
            case 9:
            	lt.test1();
            	window();
            	
            	
            case 10:
            	lt.print();
            	window();
            	
            	
            case 11://I/O��
            	
            	System.out.println("��ȡ����ʦ����");
           	    Test.test1();
            	
            	
            case 12:
            	System.exit(0);
            	break;
           
            	
			//Ĭ�� ����
			default:
				System.out.println("�������������");
				System.out.println();
				window();
			}
	        
		}
	}
	public static void main(String[] args){
		MainWindow m = new MainWindow(); 
		m.window();
		}
}

