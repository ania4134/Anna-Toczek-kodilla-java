package com.kodilla.good.patterns.challenges.food2door;

import java.util.List;
import java.util.Map;

public interface Producer {

    String getName();

    Map<String, Product> getListOfProducts();
}
