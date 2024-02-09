package MailingSystem;

import java.util.Map;

public class FedEx extends Mail {
    private final Map<String, Double> stateValue = Map.of(
            "IW", 0.35,
            "CA", 0.35,
            "MT", 0.35,
            "OR", 0.35,
            "TX", 9.30,
            "UT", 0.30,
            "FL", 0.55,
            "MA", 5.65,
            "OH", 0.55
    );


    @Override
    public double calculateCost(Packages packages) {
        double price = 0;
        if (stateValue.containsKey(packages.getZone())) {
            price = packages.getWeight() * stateValue.get(packages.getZone());
        } else price = packages.getWeight() * 0.45;
        return price;
    }
}
