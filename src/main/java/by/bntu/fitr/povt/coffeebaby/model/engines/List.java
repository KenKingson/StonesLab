package by.bntu.fitr.povt.coffeebaby.model.engines;

import by.bntu.fitr.povt.coffeebaby.model.Stone;

public interface List {
    boolean isEmpty();

    void push(Stone element);

    Stone pop();

    int size();
}
