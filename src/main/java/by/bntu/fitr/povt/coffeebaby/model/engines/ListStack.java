package by.bntu.fitr.povt.coffeebaby.model.engines;

import by.bntu.fitr.povt.coffeebaby.model.Stone;

public class ListStack extends CommonList {


    public Stone pop() {

        Node help = node;

        for (int i = 1; i < size() - 1; i++) {
            help = help.next;
        }
        Stone helpStone = help.next.element;
        help.next = null;
        return helpStone;
    }


}
