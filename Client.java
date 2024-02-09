package MailingSystem;

import java.util.List;

public class Client {

    private final String name;
    List<Packages> packagesList;
    List<Mail> mailList;

    Client(String name, List<Packages> packagesList, List<Mail> mailList) {
        this.packagesList = packagesList;
        this.name = name;
        this.mailList = mailList;
    }

    public String finalShippingPrice() {
        String result = getName()+"\n";
        for (Packages packages : packagesList) {
            ResultMap resultMap = minCost(packages, mailList);
            result += packages.getNameOfPackage() + "\t" +
                    String.format("%.2f",resultMap.getDoubleValue()) + "\t" +
                    resultMap.getStringValue() + "\n";
        }
        return result;
    }

    public String getName() {
        return name;
    }

    public ResultMap minCost(Packages packages, List<Mail> mailList) {
        String name = "";
        double minPrice = Double.MAX_VALUE;

        for (Mail mail : mailList) {
            if (mail.calculateCost(packages) <= minPrice) {
                minPrice =mail.calculateCost(packages);
                name = mail.getClass().getSimpleName();
            }
        }
        return new ResultMap(name, minPrice*disCount());
    }
    public double disCount(){
        return 1;
    }


}
