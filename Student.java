package MailingSystem;

import java.util.List;

public class Student extends Client {
    Student(String name,List<Packages> packagesList,List<Mail> mailList){
        super(name,packagesList,mailList);
    }
    public double disCount(){
        return 0.85;
    }

}
