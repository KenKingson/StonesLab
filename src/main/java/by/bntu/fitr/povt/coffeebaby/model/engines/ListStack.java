package by.bntu.fitr.povt.coffeebaby.model.engines;

import by.bntu.fitr.povt.coffeebaby.model.Stone;

public class ListStack extends CommonList {


    public Stone pop() {

        Node help = node;

        if (size == 1) {
            Stone element = help.element;
            help.next = null;
            size--;
            return element;
        }

        for (int i = 0; i < size - 2; i++) {
            help = help.next;
        }
        Stone element = help.element;
        help.next = null;
        size--;
        return element;
    }


}
