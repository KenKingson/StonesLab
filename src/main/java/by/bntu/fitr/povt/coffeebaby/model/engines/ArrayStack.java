package by.bntu.fitr.povt.coffeebaby.model.engines;

import by.bntu.fitr.povt.coffeebaby.model.Stone;

public class ArrayStack extends CommonArray {

    public Stone pop() {

        if (isEmpty()) {
            return null;
        } else {
            Stone[] helpArray = new Stone[this.size() - 1];
            Stone nextStone = this.array[this.size() - 1];

            for (int i = 0; i < this.size() - 1; i++) {
                helpArray[i] = this.array[i];
            }

            this.array = helpArray;
            return nextStone;
        }

    }


}
