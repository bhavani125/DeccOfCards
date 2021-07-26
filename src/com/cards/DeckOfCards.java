package com.cards;
import java.util.HashSet;
import java.util.Set;

public class DeckOfCards {
    //Main Method
    public static void main(String[] args) {
        //Creating deckOfCards object
        DeckOfCards deckOfCards = new DeckOfCards();
        //calling generateCards method
        deckOfCards.generateCards();

    }
    // Generating the cards
    public String[][] generateCards() {
        Set<String> cards = new HashSet<String>();
        String[] suits = {"Diamond", "Heart", "Spades", "Club"};
        String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        //declaring variables
        int numOfCards = 4;
        int cardsToEachPlayer = 9;
        String[][] totalCards = new String[numOfCards][cardsToEachPlayer];
        for (int i = 0; i < numOfCards; i++) {
            for (int j = 0; j < cardsToEachPlayer; j++) {
                totalCards[i][j] = suits[i] + rank[j];
            }
        }
        return totalCards;
    }
}






