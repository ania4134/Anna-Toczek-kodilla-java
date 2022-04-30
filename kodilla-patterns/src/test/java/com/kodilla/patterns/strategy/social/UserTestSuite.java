package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {
        //Given
        User john = new Millenials("john543");
        User ana = new YGeneration("anna.white");
        User michael = new ZGeneration("michu4341");

        //When
        String johnShouldShare = john.sharePost();
        System.out.println("John should share on " + johnShouldShare);
        String anaShouldShare = ana.sharePost();
        System.out.println("Ana should share on " + anaShouldShare);
        String michaelShouldShare = michael.sharePost();
        System.out.println("Michael should share on " + michaelShouldShare);

        //Then
        Assertions.assertEquals("Facebook", johnShouldShare);
        Assertions.assertEquals("Snapchat", anaShouldShare);
        Assertions.assertEquals("Twitter", michaelShouldShare);
    }

    @Test
    void testIndividualSharingStrategy() {
        //Given
        User john = new Millenials("john543");

        //When
        String johnShouldShare = john.sharePost();
        System.out.println("John should share on " + johnShouldShare);
        john.setSocialPublisher(new TwitterPublisher());
        johnShouldShare = john.sharePost();
        System.out.println("Now John should share on " + johnShouldShare);

        //Then
        Assertions.assertEquals("Twitter", johnShouldShare);
    }
}
