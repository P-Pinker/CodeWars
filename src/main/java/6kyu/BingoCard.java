//After yet another dispute on their game the Bingo Association decides to change course and automize the game.
//
//Can you help the association by writing a method to create a random Bingo card?
//
//Task:
//
//Finish method:
//
//BingoCard.getCard()
//
//A Bingo card contains 24 unique and random numbers according to this scheme:
//5 numbers from the B column in the range 1 to 15
//5 numbers from the I column in the range 16 to 30
//4 numbers from the N column in the range 31 to 45
//5 numbers from the G column in the range 46 to 60
//5 numbers from the O column in the range 61 to 75
//
//The card must be returned as an array of Bingo style numbers:
//
//{ "B14", "B12", "B5", "B6", "B3", "I28", "I27", ... }
//
//The numbers must be in the order of their column: B, I, N, G, O. Within the columns the order of the numbers is random.

import java.util.HashSet;
import java.util.Collection;
import java.util.Set;
import java.util.Random;
import java.util.Arrays;

import org.apache.commons.lang3.ArrayUtils;
import com.google.common.collect.ObjectArrays;

public class BingoCard {

    public static String[] getCard() {

        Set<String> columnB = new HashSet<String>();
        Set<String> columnI = new HashSet<String>();
        Set<String> columnN = new HashSet<String>();
        Set<String> columnG = new HashSet<String>();
        Set<String> columnO = new HashSet<String>();

        Random generator = new Random();

        while (columnB.size() < 5){
            int b = generator.nextInt(15)+1;
            columnB.add("B" + Integer.toString(b));
        }

        while (columnI.size() < 5){
            int i = generator.nextInt(15)+16;
            columnI.add("I" + Integer.toString(i));
        }

        while (columnN.size() < 4){
            int n = generator.nextInt(15)+31;
            columnN.add("N" + Integer.toString(n));
        }

        while (columnG.size() < 5){
            int g = generator.nextInt(15)+46;
            columnG.add("G" + Integer.toString(g));
        }

        while (columnO.size() < 5){
            int o = generator.nextInt(15)+61;
            columnO.add("O" + Integer.toString(o));
        }

        String[] strB = new String[columnB.size()];
        columnB.toArray(strB);

        String[] strI = new String[columnI.size()];
        columnI.toArray(strI);

        String[] strN = new String[columnN.size()];
        columnN.toArray(strN);

        String[] strG = new String[columnG.size()];
        columnG.toArray(strG);

        String[] strO = new String[columnO.size()];
        columnO.toArray(strO);

        int length = strB.length + strI.length + strN.length + strG.length + strO.length;
        String[] cardBI = ArrayUtils.addAll(strB, strI);
        String[] cardBIN = ArrayUtils.addAll(cardBI, strN);
        String[] cardBING = ArrayUtils.addAll(cardBIN, strG);
        String[] bingoCard = ArrayUtils.addAll(cardBING, strO);

        return bingoCard;
    }
}

