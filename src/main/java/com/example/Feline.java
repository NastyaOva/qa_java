package com.example;

import java.util.List;

public class Feline extends Animal implements Predator {

    @Override
    public List<String> eatMeat() throws Exception {
        return getFood("Хищник");
    }

    @Override
    public int getOffspring() {
        return getKittens(1);
    }

    @Override
    public String getFamily() {
        return "Кошачьи";
    }

    public int getKittens(int kittensCount) {
        return kittensCount;
    }

}
