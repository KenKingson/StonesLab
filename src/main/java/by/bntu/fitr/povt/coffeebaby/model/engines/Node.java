package by.bntu.fitr.povt.coffeebaby.model.engines;

import by.bntu.fitr.povt.coffeebaby.model.Stone;

public class Node {
    private Stone stone;
    private Node next;

    public Node(){}

    public Node(Stone stone, Node next){
        this.next = next;
        this.stone = stone;
    }

    public Stone getElement(){
        return stone;
    }

    public Node getNext(){
        return next;
    }

    public void setElement(Stone stone){
        this.stone = stone;
    }
    public void setNext(Node next){
        this.next = next;
    }


}
