package org.example.sandbox.comparable;

import java.util.ArrayList;

public class FruitDriver {
    public static void main(String[] args) {

        Fruit fruit1 = Fruit.grower()
                .withName("Apple")
                .withQuantity(2)
                .withColor("blue")
                .build();
    }
    Fruit fruit2 = new Fruit("Banana", 1.1);
    Fruit fruit3 = new Fruit("Orange" , 1.3);
    Fruit fruit4 = new Fruit("Grapes", 1.0);
    Fruit fruit5 = new Fruit("Mango", 1.5);
    Fruit fruit6 = new Fruit("Pineapple", 1.4);

    List<Fruit> fruitList = new ArrayList<>();

    fruitList.add(fruit1);
    fruitList.add(fruit2);
    fruitList.add(fruit3);
    fruitList.add(fruit4);
    fruitList.add(fruit5);
    fruitList.add(fruit6);
}
