package project2;

import java.util.Scanner;

/*��н�ƹ���ʦ��
 *��н�ƹ���ʦ��
 *��нˮ�� ��������ʡ�12+2�w����Ч����������+��Ч��w�������ޡ�50���±��ս�

 *��н�ƹ���ʦ����Ӧ����нˮ���¼��㷽��������ͻ�������800Ԫ��
 *��нˮ�����������ʣ�10�w����Ч��������������Ч��w�������ޡ�100���w0.9���±��ս�
 */
public class MonthlyPay {
	Scanner s = new Scanner(System.in);
	MainWindow m = new MainWindow();
	
	public MonthlyPay() {
		super();
	}
	private static double pay = 0;
	private double money = 0;//���������
	private int day = 0;//����Ч����������
	private double benifit = 0;//��Ч��
	private double years = 0;//��������
	private double safe = 0;//�±��ս�
	

	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public double getBenifit() {
		return benifit;
	}
	public void setBenifit(double benifit) {
		this.benifit = benifit;
	}
	public double getYears() {
		return years;
	}
	public void setYears(double years) {
		this.years = years;
	}
	public double getSafe() {
		return safe;
	}
	public void setSafe(double safe) {
		this.safe = safe;
	}
	public MonthlyPay(double sum, double money, int day, double benifit, double years, double safe) {
		super();
		this.money = money;
		this.day = day;
		this.benifit = benifit;
		this.years = years;
		this.safe = safe;
	}
	
	
	public static double salary(double money,int day,double benifit,double years,double safe) {
		
		pay = money/12+2*day+benifit*years/50-safe;
		return pay;
	}
	
	public static double salary1(double money,int day,double benifit,double years,double safe) {
		pay = (money+10*day+benifit*years/100)*0.9-safe;
		if(pay<800){
			pay = (800+10*day+benifit*years/100)*0.9-safe;
		}
		
		return pay;
		}
	
	
	
	public void pays(){//��н�ƹ���ʦ
       System.out.println("�����������Ϣ:");
		
		System.out.println("���������:");
		setMoney(s.nextDouble());
		
		System.out.println("����Ч����������:");
		setDay(s.nextInt());
		
		System.out.println("��Ч��:");
		setBenifit(s.nextDouble());
		
		System.out.println("��������:");
		setYears(s.nextInt());
		
		System.out.println("�±��ս�:");
	    setSafe(s.nextDouble());
	    
		salary(getMoney(), getDay(), getBenifit(), getYears(),getSafe());
		//���ü�����н�ķ���
		System.out.println("������нΪ��"+pay);
		System.out.println();
		m.window();
	}
	
	
	
	public void pays1(){//��н�ƹ���ʦ
         System.out.println("�����������Ϣ:");
		
		System.out.println("���������:");
		setMoney(s.nextDouble());
		
		System.out.println("����Ч����������:");
		setDay(s.nextInt());
		
		System.out.println("��Ч��:");
		setBenifit(s.nextDouble());
		
		System.out.println("��������:");
		setYears(s.nextInt());
		
		System.out.println("�±��ս�:");
	    setSafe(s.nextDouble());
	    
		salary1(getMoney(), getDay(), getBenifit(), getYears(),getSafe());
		//���ü�����н�ķ���
		System.out.println("������нΪ��"+pay);
		System.out.println();
		m.window();
	}
	
}
	
	
   
	

