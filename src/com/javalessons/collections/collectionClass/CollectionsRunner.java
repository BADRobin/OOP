package com.javalessons.collections.collectionClass;

import java.util.*;

public class CollectionsRunner {
    public static void main(String[] args) {
//        List<String> colors = new ArrayList<>();
//        colors.add("yellow");
//        colors.add("red");
//        colors.add("blue");
//        colors.add("green");
//        colors.add("black");
//        System.out.println("List перед сортировкой "  + colors);
//        Collections.sort(colors);
//        System.out.println("List после сортировкой "  + colors);

            List<Card> deckOfCards = new ArrayList<>();
            for (Card.Face face: Card.Face.values()){
                for (Card.Suit suit: Card.Suit.values()){
                    deckOfCards.add(new Card(suit, face));
                }
        }
//        System.out.println("Original deck of Cards");
//            for (int i =0; i<deckOfCards.size(); i++){
//                System.out.printf("%-20s %s", deckOfCards.get(i), (i+1)%4 == 0 ? "\n": " ");
//            }
            Collections.shuffle(deckOfCards);
        System.out.println("\n\nCards is auto shuffle");
        for (int i =0; i<deckOfCards.size(); i++){
            System.out.printf("%-20s %s", deckOfCards.get(i), (i+1)%4 == 0 ? "\n": " ");
        }
        Collections.sort(deckOfCards, new CardComparator());
        System.out.println("\n\nCards is auto shuffle");
        for (int i =0; i<deckOfCards.size(); i++){
            System.out.printf("%-20s %s", deckOfCards.get(i), (i+1)%4 == 0 ? "\n": " ");
        }
    }

}
