package by.bntu.fitr.povt.coffeebaby.model.engines;

import by.bntu.fitr.povt.coffeebaby.model.Stone;

public class ArrayQueue extends CommonArray {


    public Stone pop() {

        if (isEmpty()) {
            return null;
        } else {
            Stone[] helpArray = new Stone[this.size() - 1];
            Stone nextStone = this.array[this.size() - 1];

            for (int i = 1; i < this.size(); i++) {
                helpArray[i - 1] = this.array[i];
            }

            this.array = helpArray;
            return nextStone;
        }

    }
}


