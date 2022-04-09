package com.kodilla.good.patterns.challenges.orderService;

public class MailService implements InformationService {

    public void inform( Customer customer) {
        System.out.println("Informing customer about order by email");
    }
}
