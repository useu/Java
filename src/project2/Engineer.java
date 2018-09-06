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
		return "����ʦ���� [*\n"+"����:" + number +"\n"+"����:" + name  +"\n"+ "�Ա�:" + sex+"\n"+"����:" + birth+"\n" +"����:"
				+ place  +"\n"+ "ѧ��:" + study +"\n" + "��ַ:" + adress  +"\n"+ "�绰:" + tel  +"\n"+ "����:" + seniority
				 +"\n"+ "����нˮ:" + money + "\n"+"]";
	}
	
	public String toString1() {
		return "����ʦ������Ϣ���� [*\n"+"********************"+"\n"+"*����:" + number+"\n"+"********************"+"\n"+"*����:" 
	           + name  +"\n"+"********************"+"\n"+ "*�Ա�:" + sex+"\n"+"********************"+"\n"+"*����:" + birth+"\n"+"********************"+"\n" 
				+"*����:"+ place  +"\n"+"********************"+"\n"+ "*ѧ��:" + study +"\n" +"********************"+"\n"+ "*��ַ:" 
	           + adress  +"\n"+"********************"+"\n"+ "*�绰:" + tel  +"\n"+"********************"+"\n"+ "*����:" + seniority
	           +"\n"+"********************"+"\n"+ "*����нˮ:" + money +"********************"+"\n"+"]";
	}
	


}
