package project2;

import java.util.Scanner;

/*年薪制工程师：
 *年薪制工程师：
 *月薪水＝ 年基本工资÷12+2╳月有效工作日天数+月效益╳工作年限÷50－月保险金

 *月薪制工程师的月应发的薪水如下计算方法：（最低基本工资800元）
 *月薪水＝（基本工资＋10╳月有效工作日天数＋月效益╳工作年限÷100）╳0.9－月保险金
 */
public class MonthlyPay {
	Scanner s = new Scanner(System.in);
	MainWindow m = new MainWindow();
	
	public MonthlyPay() {
		super();
	}
	private static double pay = 0;
	private double money = 0;//年基本工资
	private int day = 0;//月有效工作日天数
	private double benifit = 0;//月效益
	private double years = 0;//工作年限
	private double safe = 0;//月保险金
	

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
	
	
	
	public void pays(){//年薪制工程师
       System.out.println("请输入基本信息:");
		
		System.out.println("年基本工资:");
		setMoney(s.nextDouble());
		
		System.out.println("月有效工作日天数:");
		setDay(s.nextInt());
		
		System.out.println("月效益:");
		setBenifit(s.nextDouble());
		
		System.out.println("工作年限:");
		setYears(s.nextInt());
		
		System.out.println("月保险金:");
	    setSafe(s.nextDouble());
	    
		salary(getMoney(), getDay(), getBenifit(), getYears(),getSafe());
		//调用计算月薪的方法
		System.out.println("您的月薪为："+pay);
		System.out.println();
		m.window();
	}
	
	
	
	public void pays1(){//月薪制工程师
         System.out.println("请输入基本信息:");
		
		System.out.println("年基本工资:");
		setMoney(s.nextDouble());
		
		System.out.println("月有效工作日天数:");
		setDay(s.nextInt());
		
		System.out.println("月效益:");
		setBenifit(s.nextDouble());
		
		System.out.println("工作年限:");
		setYears(s.nextInt());
		
		System.out.println("月保险金:");
	    setSafe(s.nextDouble());
	    
		salary1(getMoney(), getDay(), getBenifit(), getYears(),getSafe());
		//调用计算月薪的方法
		System.out.println("您的月薪为："+pay);
		System.out.println();
		m.window();
	}
	
}
	
	
   
	

