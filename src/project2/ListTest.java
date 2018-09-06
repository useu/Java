package project2;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;





public class ListTest {
	List<Engineer> list1 =Import.list;
	//用类名.对象名调用集合
	Import i = new Import();
	
	
	Scanner s = new Scanner(System.in);
	
	MainWindow m = new MainWindow(); 
	
	Engineer1 ee = new Engineer1();//使用compare排序方法时，要有继承所以用Engineer1，而不是Engineer;
	
	Iterator<Engineer> iterator = list1.iterator();
	
	//输入资料
	  void test(){
		//调用成员变量list
		for(Engineer e2 : list1){
			System.out.println(e2);
	  }
	}
	  
	  //清空资料
	  void test1(){
			//调用成员变量list
			while(iterator.hasNext()){
				Engineer e1 = iterator.next();
				iterator.remove();
				System.out.println(list1);
				System.out.println("成功清除资料");
			}
		  }
	  
	  
	 //打印工程师信息报表
	  void print(){
		  while(iterator.hasNext()){
			  Engineer e1 = iterator.next();
			  System.out.println(e1.toString1());
			//调用toString1方法  而不会使用默认的toString方法打印报表
			//所以不是写作e.toString 再打印e2;而是在打印处直接打印e2.toString1
		  }
		  System.out.println("工程师信息报表打印成功");
			System.out.println();
			m.window();
//		 这三句不能写在循环里。否则每打印一次调用一次window()方法，不能将多个工程师信息全部打出来
	  }
	  
	  
	//对资料排序	
	void sort1(){
		while(iterator.hasNext()){
			Engineer e1 = iterator.next();
			Collections.sort(list1,new  Engineer1());
			System.out.println(list1);              
			System.out.println("排序成功");
			System.out.println();
			m.window();
			
	 }
	}
	//三种排序方式分别写到三个类中写compare方法
	//使用compare的前提是要有继承关系
	//本例就是对编号、姓名、薪资三种方式排序，分别写在Engineer1
	//Engineer2、Engineer3三个类中，三个类中分别写compare方法
	//这三个类都继承最根本的Engineer类(定义变量、get、set方法、有参无参构造方法、toString方法的类)
	void sort2(){
		while(iterator.hasNext()){
			Engineer e1 = iterator.next();
			Collections.sort(list1,new  Engineer2());
			System.out.println(list1);
			System.out.println("排序成功");//65、66两行的这两句只能写在方法里，不能写在主窗口的case中
			System.out.println();
			m.window();
		}	
	}
	
	void sort3(){
		while(iterator.hasNext()){
			Engineer e1 = iterator.next();
			Collections.sort(list1,new  Engineer3());
			System.out.println(list1);
			System.out.println("排序成功");
			System.out.println();
			m.window();
	 }
	}
	
	//删除指定工程师资料
	void delete1(){
		while(iterator.hasNext()){
			Engineer e1 = iterator.next();
		if(e1.getNumber()==s.nextInt()){
			list1.remove(e1);
			System.out.println(list1);
			System.out.println("资料删除成功");
		}
			else{
			System.out.println("未找到，请重输");
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
				//不能用list1.remove(e1);会抛出异常
		
				System.out.println(list1);
				System.out.println("资料删除成功");
				}
				else{
					System.out.println("未找到，请重输");
					m.window();	
				}
			}
		
	}
	
		
		
	//查询指定工程师资料	
	//虽然都是查询，但是通过编号和通过姓名查询的不能写在一个方法中
	void check1(){
		while(iterator.hasNext()){
			Engineer e1 = iterator.next();
			if(e1.getNumber()==s.nextInt()){
				//System.out.println(iterator);
				//如果返回的是iterator,则控制台打印的是地址，不是集合
				System.out.println(list1);
				System.out.println("资料查询成功");
				System.out.println();
				m.window();	
			}
			else{
				System.out.println("无本工程师资料，请重输");
				System.out.println();
				m.window();	
			}
		}
	}	
	
	 void check2(){
		 Engineer e1 = iterator.next();
		 if(e1.getName().equals(s.next())){
			 System.out.println(list1);
				System.out.println("资料查询成功");
				System.out.println();
				m.window();	
		 }
		 else{
			 System.out.println("无本工程师资料，请重输");
			 System.out.println();
				m.window();	
		 }
	 }   
	 
	 
	//更改 指定工程师资料
	 void change1(){
			while(iterator.hasNext()){
				Engineer e1 = iterator.next();
			if(e1.getNumber()==s.nextInt()){
				System.out.println(list1);
				System.out.println();
				
				iterator.remove();
				//有删除方法，将之前被修改的集合删掉
				//这样只会打印修改后的集合,否则两个集合都会打印出来
				System.out.println("对工程师信息做以下修改:");
				i.import1();
				
				System.out.println(list1);
				System.out.println("资料修改成功");
				System.out.println();
				m.window();
			}
				else{
				System.out.println("未找到，请重输");
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
				//有删除方法，将之前被修改的集合删掉，则会只打印修改后的集合
				//否则两个集合都会打印出来
				
				System.out.println("对工程师信息做以下修改:");
				i.import1();
			
			System.out.println(list1);
			System.out.println("资料修改成功");
			System.out.println();
			}
			else{
				System.out.println("未找到，请重输");
				System.out.println();
				m.window();	
			}
		}
		
	}
	
	
	
}    
/*上面调用集合的删除方法时抛出java.util.ConcurrentModificationException 异常。
 * 原因：
 * List类型的数据进行remove操作时会报并发修改异常
 * ConcurrentModificationException问题，
 * 这是由于集合遍历是使用Iterator, Iterator是工作在一个独立的线程中，
 * 并且拥有一个互斥锁。Iterator 被创建之后会建立一个指向原来对象的单链索引表，
 * 当原来的对象数量发生变化时，这个索引表的内容不会同步改变，
 * 所以当索引指针往后移动的时候就找不到要迭代的对象，
 * 所以按照 fail-fast原则 Iterator 会马上抛出
 * java.util.ConcurrentModificationException 异常。
 * 所以 Iterator 在工作的时候是不允许被迭代的对象被改变的。
 *要解决这个问题有两种方式：
                                        方式1：
                                       将每次处理的list结果放在另外一个list中，再对结果list进行操作；
                                        方式2：
  Iterator<泛型> it = 要处理的list.iterator();
  while(it.hasNext()){
     it.remove();
  }
 * 
 * */
 

