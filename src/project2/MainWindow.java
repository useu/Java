package project2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;



public class MainWindow {
	static int j ;
	
	 void window(){
		System.out.println("请输入指令"+"\n"+"**********************"+"\n"+"*1.输入工程师资料                     *"+"\n"+"*2.删除指定工程师资料             *"+"\n"+"*3.查询指定工程师资料             *"+"\n"+"*4.修改指定工程师资料             *"+"\n"+"*5.计算工程师月薪                     *"+"\n"+"*6.保存工程师资料                     *"+"\n"+"*7.对工程师资料进行排序         *"+"\n"+"*8.输出工程师资料                     *"+"\n"+"*9.清空所有工程师资料             *"+"\n"+"*10.打印资料报表                      *"+"\n"+"*11.从文件中重取资料              *"+"\n"+"*12.退出系统                              *"+"\n"+"**********************");
		Import i = new Import();
		ListTest lt = new ListTest();
		Engineer e1 = new Engineer();
		MonthlyPay mp = new MonthlyPay();
		
		Scanner s = new Scanner(System.in);
		
		while(true){
			j = s.nextInt();//j定义为成员变量
			//选择语句
			switch(j){
			
			//案例、事件
			case 1:
				i.import1();
				System.out.println("资料输入成功");
				lt.test();
				System.out.println();
				window();
			case 2:
				System.out.println("选择删除工程师资料的方式");
				System.out.println("1.编号"+"\n"+"2.姓名");
				System.out.println("输入'1'或者'2'");
				while(true){
					int a = s.nextInt();
					//变量在if外定义 不是if(s.nexInt()==1)
					if(a==1){
						System.out.println("输入编号:");
							lt.delete1();
							window();	
					
					}
					 if(a==2){
						System.out.println("输入姓名:");
						lt.delete2();
						window();	
				}
			}
            case 3:
            	System.out.println("选择查询工程师资料的方式");
				System.out.println("1.编号"+"\n"+"2.姓名");
				System.out.println("输入'1'或者'2'");
				while(true){
					int a = s.nextInt();
					if(a==1){
						System.out.println("输入编号");
						lt.check1();
					}
					//调用两个方法;编号的和姓名的在Import中分两个方法写
					if(a==2){
						System.out.println("输入姓名");
						lt.check2();
					}
				}
				
				
				
            case 4:
            	System.out.println("选择更改工程师资料的方式");
				System.out.println("1.编号"+"\n"+"2.姓名");
				System.out.println("输入'1'或者'2'");
				while(true){
					int a = s.nextInt();
					if(a==1){
						System.out.println("输入编号");
						lt.change1();//调用两个方法;编号的和姓名的在Import中分两个方法写
						System.out.println();
						window();
					}
					if(a==2){
						System.out.println("输入姓名");
						lt.change2();
						System.out.println();
						window();
					}
				}
				
				
				
            case 5://着重复习
            	System.out.println("计算工程师月薪 ");
            	System.out.println("请选择薪资类型");
				System.out.println("1.年薪制"+"\n"+"2.月薪制");
				System.out.println("输入'1'或者'2'");
				while(true){
					int a = s.nextInt();
				if(a==1){
					mp.pays();
					
				}
				if(a==2){
					mp.pays1();
			     	}
				}
            	
				
				
				
            case 6://I/O流
            	System.out.println("保存工程师资料");
            	 Test.test();
            	//用类名.方法名调用方法，方法一定是静态的
            	//使用IO流输出数据到文档
            	//要对Engineer进行实例化  否则会抛出异常,即
            	//java.io.NotSerializableException: project2.Engineer
            	//即在Engineer后加implements Serializable ;
            	
              
            	 
            case 7:
            	System.out.println("选择对工程师资料排序的方式");
				System.out.println("1.编号"+"\n"+"2.姓名"+"\n"+"3.工龄");
				System.out.println("输入'1'或者'2'或者'3'");
				while(true){
					int a = s.nextInt();
					if(a==1){
						System.out.println("输入编号");
						lt.sort1();
					}
					if(a==2){
						System.out.println("输入姓名");
						lt.sort2();
					}
					if(a==3){
						System.out.println("输入工龄");
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
            	
            	
            case 11://I/O流
            	
            	System.out.println("重取工程师资料");
           	    Test.test1();
            	
            	
            case 12:
            	System.exit(0);
            	break;
           
            	
			//默认 其他
			default:
				System.out.println("输入错误，请重输");
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

