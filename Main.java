package project1;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	static int Userno;
	
	static  String firstName;
	static String lastName;
	static int age;
	static String gender;
	static int date;
	static int month;
	static int year;
	static String phoneNum;
	static String email;
	static String password;
	static String passwordConfirm;
	static int pinNum;
	
	
	
	
	static int processNumber1;
	static int processNumber2;
	static int loginBack;
	static int usernamePasswordRelation;
	static int withdrawn;
	
	static List<User> Users = new ArrayList<User>();
	
	
	
	static Boolean NameVerification(String name) {
		String namePattern = "[A-Za-z]+";
		Pattern pattern = Pattern.compile(namePattern);
		Matcher m = pattern.matcher(name);
		return m.matches();
		//return matches;
		
		
	}
	static Boolean phoneNumVerfication(String phonenum) {
		String phoneNumPattern = "0[\\d]{9}";
		Pattern pattern = Pattern.compile(phoneNumPattern);
		Matcher m = pattern.matcher(phonenum);
		return m.matches();
		//return matches;
	}
	
	static Boolean emailVerification(String email) {
		String emailPattern="[\\w\\W]+@\\w+.\\w+";
		Pattern pattern = Pattern.compile(emailPattern);
		Matcher m = pattern.matcher(email);
		return m.matches();
	}
	
	
	static Boolean PasswordVerification(String pass) {
		String simpleStr ="[a-z]";
		String capitalStr="[A-Z]";
		String numberStr = "[0-9]";
		String specialStr = "[\\.\\?<>:'!@#$%^&*\\-_=+/,;\"\\(\\)\\{\\}\\[\\]]"/*"[!@#$%^&*\\(\\)-_=+\\{\\}\\[\\];':\",<\\.>/\\?]"*/;
		String lengthStr = ".{15,}";
		
		Pattern p1 = Pattern.compile(simpleStr);
		Matcher m1 = p1.matcher(pass);
		Boolean simple = m1.find();
		//System.out.println(simple);
		
		Pattern p2 = Pattern.compile(capitalStr);
		Matcher m2 = p2.matcher(pass);
		Boolean capital = m2.find();
		//System.out.println(capital);
		
		Pattern p3 = Pattern.compile(numberStr);
		Matcher m3 = p3.matcher(pass);
		Boolean numbers = m3.find();
		//System.out.println(numbers);
		
		Pattern p4 = Pattern.compile(specialStr);
		Matcher m4 = p4.matcher(pass);
		Boolean special = m4.find();
		//System.out.println(special);
		
		Pattern p5 = Pattern.compile(lengthStr);
		Matcher m5 = p5.matcher(pass);
		Boolean length = m5.find();
		//System.out.println(length);
		return simple==true && capital == true && numbers==true && special == true && length == true;
		
		
		
	}
	/*Boolean depositVerfication() {
		
	}*/
	static Boolean numberVerfication(String number) {
		String numberPattern = "[\\d]+";
		Pattern p = Pattern.compile(numberPattern);
		Matcher m = p.matcher(number);
		return m.matches();
		
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		//test
	/*	LocalDate dd = LocalDate.now();
		DateTimeFormatter oo = DateTimeFormatter.ofPattern("yyyy");
		System.out.println(oo);*/
		
		for(;;) {
			System.out.println();
			System.out.println("*******WELCOME TO AI ATM SOFTWARE*******");
			System.out.println();
			System.out.println("Please enter the number of the process you wish to get done");
			System.out.println();
			System.out.println("1. Signup");
			System.out.println("2. Login");
			System.out.println("3. Exit");
			System.out.println();
			/*for(;;) {
				int check=0;
			try {*/
			String processNumVerif = in.next();
			for(;;) {
				if(numberVerfication(processNumVerif)) {
					processNumber1 = Integer.parseInt(processNumVerif);
					if(processNumber1>3 || processNumber1<1) {
						System.out.println("Please enter a valid number");
						processNumVerif = in.next();
					}else {
						break;
					}
					
				}else {
					System.out.println("Please enter a valid number");
					processNumVerif = in.next();
				}
			}
			
		
			
			switch(processNumber1) {
				case 1:
					Userno++;
					System.out.println();
					System.out.println("-----Signup-----");
					System.out.println();
					System.out.println("Please fill the following details");
					System.out.println("Enter your First Name : ");
					firstName = in.next();
					for(;;) {
						if(NameVerification(firstName)) {
							break;
						}else {
							System.out.println("Please enter a valid name");
							firstName = in.next();
						
						}
					}
					firstName = firstName.toLowerCase();
				
				/*if(NameVerification(firstName)) {
					
				}*/
					System.out.println();
					System.out.println("Enter your Last Name : ");
					lastName = in.next();
				
					for(;;) {
						if(NameVerification(lastName)) {
							break;
						}else {
							System.out.println("Please enter a valid name");
							lastName = in.next();
						
						}
					}
				
				
					lastName = lastName.toLowerCase();
					
					System.out.println();
					System.out.println("Enter your Age : ");
					//***
					String ageVerif = in.next();
					for(;;) {
						if(numberVerfication(ageVerif)) {
							age = Integer.parseInt(ageVerif);
						
							break;
							
						}else {
							System.out.println("Please enter a valid age");
							ageVerif = in.next();
						}
					}
					//***
					//***age = in.nextInt();
					for(;;) {
						if(age>0 && age<150) {
							if(age>17) {
								break;
							}else {
								System.out.println("Dear customer you have to be 18 years old or higher to use this service");
								System.out.println("Enter your Age : ");
								
								//***age = in.nextInt();
								 ageVerif = in.next();
									for(;;) {
										if(numberVerfication(ageVerif)) {
											age = Integer.parseInt(ageVerif);
										
											break;
											
										}else {
											System.out.println("Please enter a valid age");
											ageVerif = in.next();
										}
									}
							}
						
						}else {
							System.out.println("Please enter a valid Age");
							//****age = in.nextInt();
							 ageVerif = in.next();
								for(;;) {
									if(numberVerfication(ageVerif)) {
										age = Integer.parseInt(ageVerif);
									
										break;
										
									}else {
										System.out.println("Please enter a valid number");
										ageVerif = in.next();
									}
								}
						
						}
					}
					System.out.println();
					System.out.println("Enter your Gender(Enter 'Other' if you do not prefer to mention your gender) : ");
				gender = in.next().toLowerCase();
				
				for(;;) {
					if(gender.equals("male")) {
						break;
					}else if(gender.equals("female")) {
						break;
					}else if(gender.equals("other")) {
						break;
					}else {
						System.out.println("Please enter a valid gender");
						gender = in.next().toLowerCase();
					}
				}
				
				System.out.println();
				System.out.println("Enter your NIC number : ");
				String nic = in.next();
				
				System.out.println();
				System.out.println("Enter your Date of birth(use the following format - date month year (Eg:13 09 1993)) : ");
				//******
				String dateVerif = in.next();
				
				String monthVerif = in.next();
				
				String yearVerif = in.next();
			
				for(;;) {
					int datecount=0;
					int monthcount=0;
					int yearcount=0;
					if(numberVerfication(dateVerif)) {
						date = Integer.parseInt(dateVerif);
						datecount++;
						//break;
						
					}
					if(numberVerfication(monthVerif)) {
						month = Integer.parseInt(monthVerif);
						monthcount++;
						//break;
						
					}
					if(numberVerfication(yearVerif)) {
						year = Integer.parseInt(yearVerif);
						yearcount++;
						//break;
						
					}
					if(datecount>0 && monthcount>0 && yearcount>0 ) {
						break;
					}
					
					else {
						System.out.println("Please enter a valid Date of birth");
						dateVerif = in.next();
						
						 monthVerif = in.next();
						
						 yearVerif = in.next();
					}
				}
				//*****
				
				
			/*	int date = in.nextInt();
				int month = in.nextInt();
				int year = in.nextInt();*/
				
				for(;;) {
					if(date>0 && date<=31 && month>0 && month<=12 && year<=2022) {
						
							break;
						
					}else {
						System.out.println("Please enter a valid Date of birth");
						date = in.nextInt();
						month = in.nextInt();
						year = in.nextInt();
						
					}
				}
				
				in.nextLine();
				System.out.println();
				System.out.println("Enter your Phone number : ");
				phoneNum = in.nextLine();
				for(;;) {
					if(phoneNumVerfication(phoneNum)) {
						break;
					}else {
						System.out.print("Please enter a valid Phone number");
						phoneNum = in.nextLine();
					}
					
				}
				
				System.out.println();
				System.out.println("Enter your E-mail address");
				email = in.nextLine();
				for(;;) {
					if(emailVerification(email)) {
						break;
					}else {
						System.out.print("Please enter a valid email address");
						email = in.nextLine();
					}
					
				}
				
				
				
				
				
				System.out.println();
				System.out.println("Enter Password :");
				/*Password alredy taken*/
				password = in.nextLine();
				
				for(;;) {
					int passcount =0;
					if( PasswordVerification(password)) {
						if(Users.isEmpty()) {
							break;
						}else {
							for(int j =0;j<Users.size();j++) {
								if(password.equals(Users.get(j).getPassword())) {
									System.out.println("The password you entered is already being used. Please try a new one");
									password = in.nextLine();
									break;
								}else {
									passcount++;
									//break;
								}
							}
						}
						if(passcount>0)
						break;
					}else {
						System.out.println("Password must contain at least 1 Upper case character(A-Z), 1 lower case character(a-z), 1 special character(eg: ?#$), 1 number and must be at least 15 characters in length");
						password = in.nextLine();
						
					}
				}
				
				System.out.println();
				System.out.println("Confirm Password :");
				passwordConfirm = in.nextLine();
				
				for(;;) {
					if( password.equals(passwordConfirm)) {
						break;
					}else {
						System.out.println("The password you confirmed doesn't match with the previous. Please try again");
						passwordConfirm = in.next();
						
					}
				}
				
				
				/* Create account numb and pin num*/
				String pinPrt1 = nic.substring(5,nic.length()-1);
				String pinPrt2 = Integer.toString(Userno);
				pinNum = Integer.parseInt(pinPrt1+pinPrt2);
				
				
				
				User user = new User(firstName,lastName,age,gender,nic,date,month,year,phoneNum,email,password,pinNum);
				Users.add(user);
			//	System.out.println(Users.get(Userno-1).getPinNumber());
				
				usernamePasswordRelation=Users.size()-1;

				System.out.println();
				System.out.println("Dear customer please remember the following pin number as it is required in doing transactions using our services"+"\nPin number : "+Users.get(usernamePasswordRelation).getPinNumber());
				loginBack=0;
				
				/*System.out.println("Date of birth : "+Users.get(0).getDateBirth()+" "+Users.get(0).getMonthBirth()+" "+Users.get(0).getYearBirth());
				System.out.println("Full name : "+Users.get(0).getFirstName()+" "+Users.get(0).getLastName());
				System.out.println("NIC : "+Users.get(0).getNIC());
				System.out.println("email : "+Users.get(0).getEmail());*/
				
				
				
				
				
				
				break;
			case 2:
				loginBack=0;
				System.out.println();
				System.out.println("-----Login-----");
				System.out.println("Enter 'back' to go back");
				System.out.println("Enter your User name/E-mail/Phone number :");
				in.nextLine();
				String usernameVerfiy = in.nextLine();
				if(usernameVerfiy.equals("Back")||usernameVerfiy.equals("back")) {
					loginBack++;
					
					break;
				}else {
				for(;;) {
					int count = 0;
						for(int i =0;i<Users.size();i++) {
						
						if(usernameVerfiy.equals(Users.get(i).getEmail()) || usernameVerfiy.equals(Users.get(i).getPhoneNum()) || usernameVerfiy.toLowerCase().equals((Users.get(i).getFirstName())+" "+Users.get(i).getLastName())){
							count++;
							usernamePasswordRelation = i;
							break;
						}
					}
					if(count==1) {
						break;
					}else if(usernameVerfiy.equals("Back")||usernameVerfiy.equals("back")) {
						loginBack++;
						
						break;
					}
					else {
						System.out.println("User name/ Phone Number/ Email you entered has not been registered for this service");
						usernameVerfiy = in.nextLine();
					}
				}
				}
				
					
					
				
				if(loginBack>0) {
					break;
				}else {
				System.out.println("Enter your Password :");
				String passwordVerify = in.nextLine();
				if(passwordVerify.equals("Back")||passwordVerify.equals("back")) {
					loginBack++;
					//test
					//System.out.println("go baaaak "+loginBack);
					break;
				}else {
				for(;;) {
					int count = 0;
						for(int i =usernamePasswordRelation;i<Users.size();i++) {
						
						if(passwordVerify.equals(Users.get(/*usernamePasswordRelation*/i).getPassword()) && 
							(usernameVerfiy.equals(Users.get(i).getEmail()) || usernameVerfiy.equals(Users.get(i).getPhoneNum()) || usernameVerfiy.toLowerCase().equals((Users.get(i).getFirstName())+" "+Users.get(i).getLastName())) ){
							usernamePasswordRelation=i;
							count++;
							break;
						}
					}
					if(count==1) {
						//System.out.println("hows dis");
						break;
					}else if(passwordVerify.equals("Back")||passwordVerify.equals("back")) {
						loginBack++;
						break;
					}
					else {
						System.out.println("The password you entered is incorrect. Please try again");
						passwordVerify = in.nextLine();
					}
				}
				}
				}
				
				break;
	
			}
		
			/*if(!Integer.toString(processNumber1).equals("1") && !Integer.toString(processNumber1).equals("2") && !Integer.toString(processNumber1).equals("3")) {
				//------------processNumber1>3 || processNumber1<1
				System.out.println("Please enter a valid number");
			
			}*/
			
			/*else*/ if(processNumber1>=1 && processNumber1<3 && loginBack!=1) {
				
								
				for(;;) {
					System.out.println();
					System.out.println("======Dashboard======");
					System.out.println();
					System.out.println("Please enter the number of the process you wish to get done");
					System.out.println();
					System.out.println("1. Account");
					System.out.println("2. Deposit Money");
					System.out.println("3. Withdraw Money");
					System.out.println("4. Logout");
					
					//*****
					String processNum2Verif = in.next();
					for(;;) {
						if(numberVerfication(processNum2Verif)) {
							processNumber2 = Integer.parseInt(processNum2Verif);
							if(processNumber2>4 || processNumber2<1) {
								System.out.println("Please enter a valid number");
								processNum2Verif = in.next();
							}else {
								break;
							}
							
						}else {
							System.out.println("Please enter a valid number");
							processNum2Verif = in.next();
						}
					}
					
					//*****
					
					
					
					//******processNumber2 = in.nextInt();
					if(processNumber2==1) {
						System.out.println();
						System.out.println("-------Account-------");
						System.out.println();
						System.out.println("User name : "+Users.get(usernamePasswordRelation).getFirstName().toUpperCase()+" "+Users.get(usernamePasswordRelation).getLastName().toUpperCase());
						System.out.println("Age : "+Users.get(usernamePasswordRelation).getAge()+" years old");
						System.out.println("Gender : "+Users.get(usernamePasswordRelation).getGender());
						System.out.println("National Identity Card number : "+Users.get(usernamePasswordRelation).getNIC());
						System.out.println("Date of birth : "+Users.get(usernamePasswordRelation).getDateBirth()+" "+Users.get(usernamePasswordRelation).getMonthBirth()+" "+Users.get(usernamePasswordRelation).getYearBirth());
						System.out.println("Contact Number : "+Users.get(usernamePasswordRelation).getPhoneNum() );
						System.out.println("Email : "+Users.get(usernamePasswordRelation).getEmail());
						System.out.println();
						
						System.out.println("Account Balance : Rs."+Users.get(usernamePasswordRelation).getAccountBalance());
						
						
						System.out.println();
						System.out.println("Do you wish to see the statistics of your transactions? Press y if yes or press n if no");
						String stat = in.next();
						int count=0;
						for(;;) {
							//int count=0;
							if(stat.equals("y")) {
								count++;
								break;
							}else if(stat.equals("n")) {
								break;
							}else {
								System.out.println("Please enter a valid command");
								 stat = in.next();
							}
						}
						if(count>0) {
							if(Users.get(usernamePasswordRelation).DateTimes.isEmpty()) {
								System.out.println("Dear customer you haven't done any transactions yet");
							}else {
								System.out.println("    Date     Time        Transaction         Amount         Balance");
								for(/*Object y:Users.get(usernamePasswordRelation).DepositTimes */ int i =0;i<Users.get(usernamePasswordRelation).DateTimes.size();i++) {
									System.out.println(Users.get(usernamePasswordRelation).DateTimes.get(i)+"        "+Users.get(usernamePasswordRelation).Transaction.get(i)+"        "
											+"Rs."+Users.get(usernamePasswordRelation).Amount.get(i)+"        "+"Rs."+Users.get(usernamePasswordRelation).Balance.get(i));
								}
								System.out.println();
							}
						}
						
						
					}
					else if(processNumber2==2) {
						System.out.println("Enter your pin number or type 'back' to go back to the dashboard");
						String pinNum = in.next();
						int LoginBackDeposit=0;
						//******
						for(;;) {
							//int count = 0;
								/*for(int i =usernamePasswordRelation;i<Users.size();i++) {
								
								if(pinNum.equals(Integer.toString(Users.get(i).getPinNumber())) ){
									//usernamePasswordRelation=i;
									count++;
									break;
								}
							}*/
							if(pinNum.equals(Integer.toString(Users.get(usernamePasswordRelation).getPinNumber()))/*count==1*/) {
								//System.out.println("hows dis");
								break;
							}else if(pinNum.equals("Back")||pinNum.equals("back")) {
								LoginBackDeposit++;
								break;
							}
							else {
								System.out.println("The pin number you entered is incorrect, please try again");
								pinNum = in.next();
							}
						}
						if(LoginBackDeposit!=1) {
							System.out.println("Enter the amount to be Deposited : ");
							int depositBackCount = 0;
							
							String depositVerif = in.next();
							for(;;) {
								if(numberVerfication(depositVerif)) {
									int deposit = Integer.parseInt(depositVerif);
									Users.get(usernamePasswordRelation).setAccountBalance(Users.get(usernamePasswordRelation).getAccountBalance()+deposit);
									
									LocalDateTime dateTime = LocalDateTime.now();
									DateTimeFormatter dateTimeFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
									String formattedDate = dateTime.format(dateTimeFormat);
									Users.get(usernamePasswordRelation).DateTimes.add(formattedDate);
									
									Users.get(usernamePasswordRelation).Amount.add(deposit);
									Users.get(usernamePasswordRelation).Transaction.add("Deposit   ");
									if(Users.get(usernamePasswordRelation).Balance.isEmpty()) {
										Users.get(usernamePasswordRelation).Balance.add(deposit);
									}else {
										Users.get(usernamePasswordRelation).Balance.add((Users.get(usernamePasswordRelation).Balance.get(Users.get(usernamePasswordRelation).Balance.size()-1))+deposit);
									}
									
									System.out.printf("Rs.%d have been successfully deposited into your account",deposit);
									//LocalDate date = LocalDate.
									System.out.println();
									break;
								}else if(depositVerif.equals("back") || depositVerif.equals("Back")) {
									depositBackCount++;
									break;
								}else {
									System.out.println("Enter a valid number");
									depositVerif = in.next();
								}
							}
						}
						//******
						
						
						
						
					}
					else if(processNumber2==3) {
						System.out.println("Enter your pin number or type 'back' to go back to the dashboard");
						String pinNum = in.next();
						int LoginBackWithdraw=0;
						//******
						for(;;) {
							int count = 0;
								for(int i =usernamePasswordRelation;i<Users.size();i++) {
								
								if(pinNum.equals(Integer.toString(Users.get(i).getPinNumber()))){
									//usernamePasswordRelation=i;
									count++;
									break;
								}
							}
							if(count==1) {
								//System.out.println("hows dis");
								break;
							}else if(pinNum.equals("Back")||pinNum.equals("back")) {
								LoginBackWithdraw++;
								break;
							}
							else {
								System.out.println("The pin you entered is incorrect, please try again");
								pinNum = in.next();
							}
						}
						if(LoginBackWithdraw!=1) {
							System.out.println("Enter the amount to be withdrawn : ");
							int withdrawBackCount = 0;
							//***
							String withdrawVerif = in.next();
							for(;;) {
								if(numberVerfication(withdrawVerif)) {
									withdrawn = Integer.parseInt(withdrawVerif);
									if( withdrawn<1) {
										System.out.println("Please enter a valid number");
										withdrawVerif = in.next();
									}else {
										break;
									}
									
								}else if(withdrawVerif.equals("back") || withdrawVerif.equals("Back") ){
									
									withdrawBackCount++;
									break;
								}else {
									System.out.println("Please enter a valid number");
									withdrawVerif = in.next();
								}
							}
							if(withdrawBackCount>0) {
								
							}else
							//***
							// withdrawn = in.nextInt();
							//in.nextLine();
							
							if(Users.get(usernamePasswordRelation).getAccountBalance()<withdrawn) {
								System.out.println("Dear customer, your balance is not sufficient to make the above withdrawal");
							}else {
							Users.get(usernamePasswordRelation).setAccountBalance(Users.get(usernamePasswordRelation).getAccountBalance()-withdrawn);
							LocalDateTime dateTime = LocalDateTime.now();
							DateTimeFormatter dateTimeFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
							String formattedDate = dateTime.format(dateTimeFormat);
							Users.get(usernamePasswordRelation).DateTimes.add(formattedDate);
							
							Users.get(usernamePasswordRelation).Amount.add(withdrawn);
							Users.get(usernamePasswordRelation).Transaction.add("Withdrawal");
							//***Users.get(usernamePasswordRelation).Balance.add(Users.get(usernamePasswordRelation).Balance.get(Users.get(usernamePasswordRelation).Balance.size()-1)-withdrawn));
							Users.get(usernamePasswordRelation).Balance.add((Users.get(usernamePasswordRelation).Balance.get(Users.get(usernamePasswordRelation).Balance.size()-1))-withdrawn);
							System.out.printf("Rs.%d have been successfully withdrawn from your account",withdrawn);
							System.out.println();
							}
							
						}
						
						
						
						
						
						
					}
					else if(processNumber2==4) {
						break;
					}
					/*else {
						System.out.println("Please enter a valid number");
					}*/
					
					
				}
			}else if(processNumber1==3) {
				System.out.println();
				System.out.println("Thank You for using our services. Good Luck!");
				break;
			}
			

			
		}
		in.close();
	}

}
