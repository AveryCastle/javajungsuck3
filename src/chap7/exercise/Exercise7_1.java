package chap7.exercise;

/**
 * Created by seongjuhyeon on 6/21/16.
 */
public class Exercise7_1 {
    public static void main(String[] args) {
        SutdaDeck deck = new SutdaDeck();

        for (int i = 0; i < deck.cards.length; i++) {
            System.out.print(deck.cards[i].toString() + ",");
        }
    }
}
