package com.decathlon.email;

import java.util.Scanner;

public class Email {

  private String firstName;
  private String lastName;
  private String password;
  private String department;
  private String email;
  private String alternateEmail;
  private int mailboxCapacity;
  private int defaultPasswordLength = 10;
  private String companySuffix = "acme.com";

  //Constructor ot receive first name last name.
  Email(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
    System.out.println("Create an account for " + firstName + " " + lastName);

    this.department = setDepartment();
    System.out.println("Department is " + this.department);

    this.email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department.toLowerCase() + "." + companySuffix;
    System.out.println("Your email address is " + email);

    this.password = randomPassword(defaultPasswordLength);
    System.out.println("Your password is " + this.password);


  }

  //ask for department
  private String setDepartment() {
    System.out.print("Departments:\n1 Sales\n2 Marketing\n3 Accounting \n0 No department declared\nEnter department: ");
    Scanner in = new Scanner(System.in);
    int departmentChoice = in.nextInt();
    if (departmentChoice == 1) {
      return "Sales";
    } else if (departmentChoice == 2) {
      return "Marketing";
    } else if (departmentChoice == 3) {
      return "Accounting";
    } else {
      return "";
    }
  }


  //Generate password
  private String randomPassword(int length) {
    String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$@";
    char[] password = new char[length];
    for (int i = 0; i < length; i++) {
      int rand = (int) (Math.random() * passwordSet.length());
      password[i] = passwordSet.charAt(rand);
    }
    return new String(password);
  }
//Set mailbox capacity

//Set alternate email address

//Change password
}
