package by.bntu.fitr.povt.coffeebaby.model.engines;

import by.bntu.fitr.povt.coffeebaby.model.Stone;

public abstract class CommonArray extends Checker {
    protected Stone[] array;


    public void push(Stone element) {
        Stone[] nextArray = new Stone[this.size() + 1];
        System.arraycopy(this.array, 0, nextArray, 0, this.array.length);
        nextArray[nextArray.length - 1] = element;
        this.array = nextArray;
    }

    public int size() {
        return (array.length);
    }


}


