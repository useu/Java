package project2;


import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Iterator;
import java.util.List;



public class Test {

	static void test(){
		MainWindow m = new MainWindow(); 
		//�Ƚ�I\O������Ϊ��
				FileOutputStream fos = null;
				ObjectOutputStream oos = null;
				
				//�ȱ���������IO�����
				List<Engineer> list1 =Import.list;
				Iterator<Engineer> iterator = list1.iterator();
				while(iterator.hasNext()){
					Engineer e = iterator.next();
				    System.out.println(e);
				
				try {
				    fos = new FileOutputStream("D:\\�����1\\eclipse\\JavaProject\\src\\project2\\text",true);
				    
				    oos = new ObjectOutputStream(fos);
				    
					    oos.writeObject(e);
					    oos.writeObject(null);  
                        
				} catch (IOException e1) {
					e1.printStackTrace();
			  }
	    		
		}
				 System.out.println("���ϱ���ɹ�");
	            	m.window();
	}
	
	
	
	
	static void test1(){
		MainWindow m = new MainWindow(); 
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		List<Engineer> list1 =Import.list;
		Iterator<Engineer> iterator = list1.iterator();
		while(iterator.hasNext()){
			Engineer e = iterator.next();
		    
		try {
			fis = new FileInputStream("D:\\�����1\\eclipse\\JavaProject\\src\\project2\\text");
		    ois = new ObjectInputStream(fis);
		    
		    
		    Engineer e1 = null;
		    while(true){
		    	
				e1 = (Engineer)ois.readObject();
				
		    	if(e1==null)
		    		break;
		    	System.out.println(e1);
		    }
		    
			}  catch (ClassNotFoundException e2) {
				e2.printStackTrace();
			}catch (IOException e1) {
				e1.printStackTrace();
			}
		}
		System.out.println();
		 System.out.println("�������»�ȡ�ɹ�");
		 System.out.println();
     	 m.window();
	}
}

	
