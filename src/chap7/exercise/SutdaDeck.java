package chap7.exercise;

import java.util.Random;

/**
 * Created by seongjuhyeon on 6/21/16.
 */
public class SutdaDeck {

    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    SutdaDeck() {
        for (int i = 0; i < CARD_NUM; i++) {
            int num = i % 10 + 1;
            if (num == 1 || num == 3 || num == 8) {
                boolean isKwang = Math.random() < 0.5;
                if (i >= 10) {
                    isKwang = !cards[i - 10].isKwang;
                }
                cards[i] = new SutdaCard(num, isKwang);
            } else {
                cards[i] = new SutdaCard(num, false);
            }
        }
    }
}
