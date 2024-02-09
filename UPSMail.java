package MailingSystem;

import java.util.*;

public class UPSMail extends Mail {
    public double calculateCost(Packages packages) {
            return packages.getWeight();
    }
}
