package MailingSystem;

public class USMail extends Mail {
    @Override
    public double calculateCost(Packages packages) {

        double price = 0;
        if (packages.getWeight() < 3) {
            price = packages.getWeight() * 1;
        } else price = packages.getWeight() * 45;
        return price;

    }
}
