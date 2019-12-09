package com.decathlon.email;

public class EmailApplication {

  public static void main(String[] args) {

    //SpringApplication.run(EmailApplication.class, args);
    Email email1 = new Email("Matthew", "Saw");
    System.out.println(email1.showInfo());
  }

}
