package project2;

import java.io.Serializable;

public class Engineer implements Serializable {

	private int number;
	private String name;
	private boolean sex;
	private int birth;
	private String place;
	private int study;
	private String adress;
	private long tel;
	private int seniority;
	private int money;
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isSex() {
		return sex;
	}
	public void setSex(boolean sex) {
		this.sex = sex;
	}
	public int getBirth() {
		return birth;
	}
	public void setBirth(int birth) {
		this.birth = birth;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public int getStudy() {
		return study;
	}
	public void setStudy(int study) {
		this.study = study;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public long getTel() {
		return tel;
	}
	public void setTel(long tel) {
		this.tel = tel;
	}
	public int getSeniority() {
		return seniority;
	}
	public void setSeniority(int seniority) {
		this.seniority = seniority;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public Engineer(int number, String name, boolean sex, int birth, String place, int study, String adress, long tel,
			int seniority, int money) {
		super();
		this.number = number;
		this.name = name;
		this.sex = sex;
		this.birth = birth;
		this.place = place;
		this.study = study;
		this.adress = adress;
		this.tel = tel;
		this.seniority = seniority;
		this.money = money;
	}
	public Engineer() {
		super();
	}
	@Override
	public String toString() {
		return "工程师资料 [*\n"+"工号:" + number +"\n"+"姓名:" + name  +"\n"+ "性别:" + sex+"\n"+"生日:" + birth+"\n" +"籍贯:"
				+ place  +"\n"+ "学历:" + study +"\n" + "地址:" + adress  +"\n"+ "电话:" + tel  +"\n"+ "工龄:" + seniority
				 +"\n"+ "基本薪水:" + money + "\n"+"]";
	}
	
	public String toString1() {
		return "工程师资料信息报表 [*\n"+"********************"+"\n"+"*工号:" + number+"\n"+"********************"+"\n"+"*姓名:" 
	           + name  +"\n"+"********************"+"\n"+ "*性别:" + sex+"\n"+"********************"+"\n"+"*生日:" + birth+"\n"+"********************"+"\n" 
				+"*籍贯:"+ place  +"\n"+"********************"+"\n"+ "*学历:" + study +"\n" +"********************"+"\n"+ "*地址:" 
	           + adress  +"\n"+"********************"+"\n"+ "*电话:" + tel  +"\n"+"********************"+"\n"+ "*工龄:" + seniority
	           +"\n"+"********************"+"\n"+ "*基本薪水:" + money +"********************"+"\n"+"]";
	}
	


}
