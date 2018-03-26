package by.bntu.fitr.povt.coffeebaby.model;

public class StoneMaster {

    public Necklace createNecklace(Necklace necklace, int numberOfStones) {
        Mine mine = Mine.getMine();
        for (int i = 0; i < numberOfStones; i++) {
            necklace.setStone(i, mine.extractionStone());
        }
        return necklace;
    }
}
