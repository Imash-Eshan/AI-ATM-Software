package project1;

import java.util.ArrayList;

public class User {
	private String FirstName;
	private String LastName;
	private int Age;
	private String Gender;
	private String NIC;
	private int DateBirth;
	
	
	private int MonthBirth;
	private int YearBirth;
	private String Email;
	
	//Special********
	private String DateofBirth;
	private String Password;
	
	private String PhoneNum;
	private int AccountBalance;
	
	//private int AccountNumber;
	private int PinNumber;
	
	 ArrayList<Object> DateTimes = new ArrayList<>();
	 ArrayList<String> Transaction = new ArrayList<>();
	 ArrayList<Integer> Amount = new ArrayList<>();
	 ArrayList<Integer> Balance = new ArrayList<>();
	 
	 //ArrayList<Object> WithdrawTimes= new ArrayList<>();
	
	
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getNIC() {
		return NIC;
	}
	public void setNIC(String nIC) {
		NIC = nIC;
	}
	public int getDateBirth() {
		return DateBirth;
	}
	public void setDateBirth(int dateBirth) {
		DateBirth = dateBirth;
	}
	public int getMonthBirth() {
		return MonthBirth;
	}
	public void setMonthBirth(int monthBirth) {
		MonthBirth = monthBirth;
	}
	public int getYearBirth() {
		return YearBirth;
	}
	public void setYearBirth(int yearBirth) {
		YearBirth = yearBirth;
	}
	
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPhoneNum() {
		return PhoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		PhoneNum = phoneNum;
	}
	public int getAccountBalance() {
		return AccountBalance;
	}
	public void setAccountBalance(int accountBalance) {
		AccountBalance = accountBalance;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	
	public int getPinNumber() {
		return PinNumber;
	}
	public void setPinNumber(int pinNumber) {
		PinNumber = pinNumber;
	}
	
	User(String FirstName,String LastName,int Age, String Gender, String NIC, int DateBirth, int MonthBirth, int YearBirth, String PhoneNum, String Email,String Password, int PinNumber){
		this.FirstName=FirstName;
		this.LastName=LastName;
		this.Age=Age;
		this.Gender=Gender;
		this.NIC=NIC;
		this.DateBirth=DateBirth;
		this.MonthBirth= MonthBirth;
		this.YearBirth=YearBirth;
		this.PhoneNum=PhoneNum;
		this.Email=Email;
		this.Password=Password;
		
		this.PinNumber=PinNumber;
	
		
		
		
	}

}
