package EmailApplication;

import java.util.Scanner;

public class Email {

    private String firstname;
    private String lastname;
    private String passowrd;
    private String department;
    private String email;
    private  int emailCapability = 500;
    private  int defailtPasswordlength = 10;
    private String aletenateEmail;
    private String componySuffix = "qa.com";

    //Constuctor to recive first n last name

    public Email(String firstname, String lastname){

    this.firstname =firstname;
    this.lastname = lastname;

    System.out.println("Email Created by : "+this.firstname+" "+this.lastname);

    //Call the method to asking the  department and return
        this.department = setDepartment();
        System.out.println("Department:" + this.department);

        this.randomPassword(defailtPasswordlength);
        System.out.println("Your password is :" + this.passowrd);

        email= firstname.toLowerCase()+lastname.toLowerCase()+"@" + department+"." + componySuffix;
        System.out.println("Your email is : "+ email);


    }

    private String setDepartment(){
        System.out.println("DEPARTMENT CODES\n1 for sales\n2 for department\n3 for accounting\n0 for none\n Enter department Code: ");
        Scanner in = new Scanner(System.in);
        int  departnementChoice=  in.nextInt();

        if(departnementChoice == 1){
            return "sales";
        }else if(departnementChoice == 2){
            return "dev";
        }else if(departnementChoice == 3){
            return "account";
        }else{
            return "";
        }

    }
    //Call amethod to create random password

    private String randomPassword(int length){
        String passowrdSet = "DADADDAD$$%%$!$@$89";
        char [] password = new char[length];
        for(int i=0;i<length;i++) {
            int rand =  (int) (Math.random()* passowrdSet.length());
            password[i] = passowrdSet.charAt(rand);
        }
        return  new String(password);
    }

    public void setEmailCapability(int capacity) {
        this.emailCapability = capacity;
    }
    public void setAletenateEmail(String altEmail) {
        this.aletenateEmail = altEmail;
    }

    public void ChangePassowrd(String pass){
        this.passowrd =pass;
    }

    //Incapsulation : Data binding and hiding.
    public int getMailboxCapasity(){
        return emailCapability;
    }
    public String getAlternateEmail(){
        return aletenateEmail;
    }

    public String getPassowrd(){
        return passowrd;
    }

    public String ShowInfo(){
        return "Display Name : " +firstname + " " + lastname +
                " \nCompany Email : " +email +
                " \nMailBox Capacity: "+emailCapability + "mb";
    }
}
