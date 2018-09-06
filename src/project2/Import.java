package project2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class Import {
	
	static List<Engineer> list = new ArrayList<>();
	//list定义为成员变量 方便ListTest.java调用  定义为静态类型
	
	//import1()方法定义返回值类型为集合型，才能在集合(ListTest.java)中保存手动输入的内容，才能进行查询删除等操作
    //并且方法是静态的
       static List<Engineer> import1() {
		System.out.println("请输入工程师资料");
		Scanner sc = new Scanner(System.in);//手动输入
		Engineer e = new Engineer();
		
		System.out.println("工号：");
		e.setNumber(sc.nextInt());
	//	int Number = sc.nextInt();
		
		
		System.out.println("姓名：");
		e.setName(sc.next());
	//	String name = sc.next();
		//此处是String与next()方法匹配不是String name = sc.next();
		
		System.out.println("性别：");
		System.out.println("true代表女 false代表男");
		e.setSex(sc.nextBoolean());
		//使手动输入的变量就是要保存的Engineer中的变量  方便在后面比较方法时使用;
		
		System.out.println("生日：");
		System.out.println("格式如：19900304");
		e.setBirth(sc.nextInt());
		
		System.out.println("籍贯： ");
		e.setAdress(sc.next());
		
		System.out.println("学历()：");
		System.out.println("高中0、学士1、硕士2、博士3、其他为4：");
		e.setStudy(sc.nextInt());
		
		System.out.println("地址");
		e.setPlace(sc.next());
		
		System.out.println("电话");
		e.setTel(sc.nextLong());
		
		System.out.println("工龄");
		e.setSeniority(sc.nextInt());
		
		System.out.println("基本薪水");
		e.setMoney(sc.nextInt());
		
		
		list.add(e);
  		return list;
		
  		
  			
  		}
	}
    
	


