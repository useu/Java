package project2;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;





public class ListTest {
	List<Engineer> list1 =Import.list;
	//������.���������ü���
	Import i = new Import();
	
	
	Scanner s = new Scanner(System.in);
	
	MainWindow m = new MainWindow(); 
	
	Engineer1 ee = new Engineer1();//ʹ��compare���򷽷�ʱ��Ҫ�м̳�������Engineer1��������Engineer;
	
	Iterator<Engineer> iterator = list1.iterator();
	
	//��������
	  void test(){
		//���ó�Ա����list
		for(Engineer e2 : list1){
			System.out.println(e2);
	  }
	}
	  
	  //�������
	  void test1(){
			//���ó�Ա����list
			while(iterator.hasNext()){
				Engineer e1 = iterator.next();
				iterator.remove();
				System.out.println(list1);
				System.out.println("�ɹ��������");
			}
		  }
	  
	  
	 //��ӡ����ʦ��Ϣ����
	  void print(){
		  while(iterator.hasNext()){
			  Engineer e1 = iterator.next();
			  System.out.println(e1.toString1());
			//����toString1����  ������ʹ��Ĭ�ϵ�toString������ӡ����
			//���Բ���д��e.toString �ٴ�ӡe2;�����ڴ�ӡ��ֱ�Ӵ�ӡe2.toString1
		  }
		  System.out.println("����ʦ��Ϣ�����ӡ�ɹ�");
			System.out.println();
			m.window();
//		 �����䲻��д��ѭ�������ÿ��ӡһ�ε���һ��window()���������ܽ��������ʦ��Ϣȫ�������
	  }
	  
	  
	//����������	
	void sort1(){
		while(iterator.hasNext()){
			Engineer e1 = iterator.next();
			Collections.sort(list1,new  Engineer1());
			System.out.println(list1);              
			System.out.println("����ɹ�");
			System.out.println();
			m.window();
			
	 }
	}
	//��������ʽ�ֱ�д����������дcompare����
	//ʹ��compare��ǰ����Ҫ�м̳й�ϵ
	//�������ǶԱ�š�������н�����ַ�ʽ���򣬷ֱ�д��Engineer1
	//Engineer2��Engineer3�������У��������зֱ�дcompare����
	//�������඼�̳��������Engineer��(���������get��set�������в��޲ι��췽����toString��������)
	void sort2(){
		while(iterator.hasNext()){
			Engineer e1 = iterator.next();
			Collections.sort(list1,new  Engineer2());
			System.out.println(list1);
			System.out.println("����ɹ�");//65��66���е�������ֻ��д�ڷ��������д�������ڵ�case��
			System.out.println();
			m.window();
		}	
	}
	
	void sort3(){
		while(iterator.hasNext()){
			Engineer e1 = iterator.next();
			Collections.sort(list1,new  Engineer3());
			System.out.println(list1);
			System.out.println("����ɹ�");
			System.out.println();
			m.window();
	 }
	}
	
	//ɾ��ָ������ʦ����
	void delete1(){
		while(iterator.hasNext()){
			Engineer e1 = iterator.next();
		if(e1.getNumber()==s.nextInt()){
			list1.remove(e1);
			System.out.println(list1);
			System.out.println("����ɾ���ɹ�");
		}
			else{
			System.out.println("δ�ҵ���������");
			m.window();	
			}
			
		}
	 }
	
		void delete2(){
			while(iterator.hasNext()){
				Engineer e1 = iterator.next();
				if(e1.getName().equals(s.next())){
				iterator.remove();
				//	list1.remove(e1);
				//������list1.remove(e1);���׳��쳣
		
				System.out.println(list1);
				System.out.println("����ɾ���ɹ�");
				}
				else{
					System.out.println("δ�ҵ���������");
					m.window();	
				}
			}
		
	}
	
		
		
	//��ѯָ������ʦ����	
	//��Ȼ���ǲ�ѯ������ͨ����ź�ͨ��������ѯ�Ĳ���д��һ��������
	void check1(){
		while(iterator.hasNext()){
			Engineer e1 = iterator.next();
			if(e1.getNumber()==s.nextInt()){
				//System.out.println(iterator);
				//������ص���iterator,�����̨��ӡ���ǵ�ַ�����Ǽ���
				System.out.println(list1);
				System.out.println("���ϲ�ѯ�ɹ�");
				System.out.println();
				m.window();	
			}
			else{
				System.out.println("�ޱ�����ʦ���ϣ�������");
				System.out.println();
				m.window();	
			}
		}
	}	
	
	 void check2(){
		 Engineer e1 = iterator.next();
		 if(e1.getName().equals(s.next())){
			 System.out.println(list1);
				System.out.println("���ϲ�ѯ�ɹ�");
				System.out.println();
				m.window();	
		 }
		 else{
			 System.out.println("�ޱ�����ʦ���ϣ�������");
			 System.out.println();
				m.window();	
		 }
	 }   
	 
	 
	//���� ָ������ʦ����
	 void change1(){
			while(iterator.hasNext()){
				Engineer e1 = iterator.next();
			if(e1.getNumber()==s.nextInt()){
				System.out.println(list1);
				System.out.println();
				
				iterator.remove();
				//��ɾ����������֮ǰ���޸ĵļ���ɾ��
				//����ֻ���ӡ�޸ĺ�ļ���,�����������϶����ӡ����
				System.out.println("�Թ���ʦ��Ϣ�������޸�:");
				i.import1();
				
				System.out.println(list1);
				System.out.println("�����޸ĳɹ�");
				System.out.println();
				m.window();
			}
				else{
				System.out.println("δ�ҵ���������");
				System.out.println();
				m.window();	
				}
				
			}
			
		}
		
	 
	 
	void change2(){
		while(iterator.hasNext()){
			Engineer e1 = iterator.next();
			if(e1.getName().equals(s.next())){
				System.out.println(list1);
				System.out.println();
				
				iterator.remove();
				//��ɾ����������֮ǰ���޸ĵļ���ɾ�������ֻ��ӡ�޸ĺ�ļ���
				//�����������϶����ӡ����
				
				System.out.println("�Թ���ʦ��Ϣ�������޸�:");
				i.import1();
			
			System.out.println(list1);
			System.out.println("�����޸ĳɹ�");
			System.out.println();
			}
			else{
				System.out.println("δ�ҵ���������");
				System.out.println();
				m.window();	
			}
		}
		
	}
	
	
	
}    
/*������ü��ϵ�ɾ������ʱ�׳�java.util.ConcurrentModificationException �쳣��
 * ԭ��
 * List���͵����ݽ���remove����ʱ�ᱨ�����޸��쳣
 * ConcurrentModificationException���⣬
 * �������ڼ��ϱ�����ʹ��Iterator, Iterator�ǹ�����һ���������߳��У�
 * ����ӵ��һ����������Iterator ������֮��Ὠ��һ��ָ��ԭ������ĵ���������
 * ��ԭ���Ķ������������仯ʱ���������������ݲ���ͬ���ı䣬
 * ���Ե�����ָ�������ƶ���ʱ����Ҳ���Ҫ�����Ķ���
 * ���԰��� fail-fastԭ�� Iterator �������׳�
 * java.util.ConcurrentModificationException �쳣��
 * ���� Iterator �ڹ�����ʱ���ǲ����������Ķ��󱻸ı�ġ�
 *Ҫ���������������ַ�ʽ��
                                        ��ʽ1��
                                       ��ÿ�δ����list�����������һ��list�У��ٶԽ��list���в�����
                                        ��ʽ2��
  Iterator<����> it = Ҫ�����list.iterator();
  while(it.hasNext()){
     it.remove();
  }
 * 
 * */
 

