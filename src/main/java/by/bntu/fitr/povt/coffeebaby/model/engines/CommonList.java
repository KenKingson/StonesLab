package by.bntu.fitr.povt.coffeebaby.model.engines;

import by.bntu.fitr.povt.coffeebaby.model.Stone;


public abstract class CommonList extends Checker {
    Node node;
    int size = 0;

    public int size() {
        return size;
    }

    public void push(Stone element) {

        if (node == null) {
            node = new Node(element);
        } else {
            Node help = node;
            for (int i = 0; i < size - 1; i++) {
                help = help.next;
            }
            help.next = new Node(element);
        }
        size++;
    }

    protected class Node {
        Node next;
        Stone element;

        Node(Stone element) {
            this.element = element;
        }
    }

}
