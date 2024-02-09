package MailingSystem;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        Packages packages1 = new Packages(2.5, "NY", "Package1");
        Packages package2 = new Packages(18, "MA", "Package2");
        Packages package3 = new Packages(3.0, "TX", "Package2");
        List<Packages> packagesList = new ArrayList<>();
        packagesList.add(packages1);
        packagesList.add(package2);
        packagesList.add(package3);

        Mail fedEx=new FedEx();
        Mail US= new USMail();
        Mail USP = new UPSMail();
        List<Mail> mailList = new ArrayList<>();

        mailList.add(US);
        mailList.add(fedEx);
        mailList.add(USP);

        Client jhon = new Student("Jhon",packagesList,mailList);
//        Client jhon = new Senior("Jhon",packagesList,mailList,78);

        System.out.println(jhon.finalShippingPrice());

    }
}
