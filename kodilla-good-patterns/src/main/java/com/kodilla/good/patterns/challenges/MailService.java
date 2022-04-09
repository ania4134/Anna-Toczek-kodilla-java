package com.kodilla.good.patterns.challenges;

public class MailService implements InformationService {

    public void inform( Customer customer) {
        System.out.println("\nSending email about order to " + customer.getEmail());
    }
}
