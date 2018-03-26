package by.bntu.fitr.povt.coffeebaby.model;


import java.util.Arrays;

public class Necklace {
    private final Stone[] matrix;

    public Necklace(Stone[] matrix) {
        this.matrix = matrix;
    }

    public Necklace(int size) {
        matrix = new Stone[size];
    }

    public Stone[] getNecklace() {
        return matrix;
    }

    public Stone getItem(int index) {
        if (index >= 0 && index < matrix.length) {
            return matrix[index];
        }
        throw new IndexOutOfBoundsException();
    }

    public void setStone(int index, Stone stone) {
        if (index < matrix.length) {
            matrix[index] = stone;
        }
    }


    @Override
    public String toString() {
        return "Necklace{" + Arrays.toString(matrix) +
                '}';
    }
}
