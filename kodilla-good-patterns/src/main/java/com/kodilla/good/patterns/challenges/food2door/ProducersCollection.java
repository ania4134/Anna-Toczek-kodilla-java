package com.kodilla.good.patterns.challenges.food2door;

import java.util.HashSet;
import java.util.Set;

public class ProducersCollection {

    private Producer producer;
    Set<Producer> producersSet = new HashSet<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProducersCollection)) return false;

        ProducersCollection that = (ProducersCollection) o;

        return producer != null ? producer.equals(that.producer) : that.producer == null;
    }

    @Override
    public int hashCode() {
        return producer != null ? producer.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "ProducersCollection{" +
                "producersSet=" + producersSet +
                '}';
    }

    public boolean addProducer(Producer producer) {
        producersSet.add(producer);
        return true;
    }

    public boolean removeProducer(Producer producer) {
        if(producersSet.contains(producer)) {
            producersSet.remove(producer);
            return true;
        } else {
            System.out.println("No data found");
            return false;
        }
    }
}