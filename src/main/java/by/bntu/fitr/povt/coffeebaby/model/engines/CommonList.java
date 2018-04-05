package by.bntu.fitr.povt.coffeebaby.model.engines;

import by.bntu.fitr.povt.coffeebaby.model.Stone;


public abstract class CommonList extends Checker {

    protected Node node = null;


    public int size() {
        int count = 0;
        Node help = node;
        while (help != null) {
            count++;
            help = help.next;
        }
        return count;
    }

    public void push(Stone element) {

        if (node == null) {
            node = new Node(element);
        } else {
            Node help = node;
            for (int i = 1; i < size(); i++) {
                help = help.next;
            }
            help.next = new Node(element);

        }

    }

    public Stone getElement(int index){
        for(int i = 0; i < index;i++){
            node = node.next;
        }
        return node.element;
    }

    @Override
    public String toString() {
        Node help = node;
        StringBuffer result = new StringBuffer();
        while (help != null) {
            result.append(help.element.toString());
            help = help.next;


        }
        return result.toString();

    }


    protected class Node {
        Node next;
        Stone element;

        Node(Stone element) {
            this.element = element;
        }
    }

}
