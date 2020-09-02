package com.javalessons.collections.StackQueue;

import com.javalessons.collections.collectionClass.Card;
import com.javalessons.collections.collectionClass.CardComparator;

import java.util.*;

public class StackQueueLauncher {
    public static void main(String[] args) {
//      passengerProcessing();

        Queue<Integer> q = new PriorityQueue<>();
//        q.offer(4);
//        q.offer(5);
//        q.offer(22);
//        q.offer(2);
//
//        System.out.println(q.poll());
//        System.out.println(q.poll());

        Queue<Card> cardDeck = new PriorityQueue<>(52, new CardComparator());
        for (Card.Face face: Card.Face.values()){
            for (Card.Suit suit: Card.Suit.values()){
                cardDeck.offer(new Card(suit, face));
            }
        }

//        for (int i = 0; i<10; i++){
//            System.out.println(cardDeck.poll());
//        }
//        System.out.println("Deck size is " + cardDeck.size());
////        System.out.println(cardDeck);
//
////        Iterator<Card> iterator = cardDeck.iterator();
////        while (iterator.hasNext()){
////            System.out.println(iterator.next());
////        }
//        System.out.println(cardDeck.peek());
//        cardDeck.clear();
//        System.out.println("Deck size is " + cardDeck.size());

        Deque<Card> cards = new ArrayDeque<>();
        for (int i = 0; i<10; i++){
            cards.offerLast(cardDeck.poll());
        }
//        for (int i = 0; i < 10; i++) {
//            System.out.println(cards.pollLast());
//        }
        Card card = new Card(Card.Suit.SPADES, Card.Face.Ten);
        cards.removeFirstOccurrence(card);
        cards.removeLastOccurrence(card);
    }

    private static void passengerProcessing(){
        Stack<Passenger> bus = new Stack<>();
        Passenger passenger = new Passenger("Katerina", "Ivanova");
        bus.push(new Passenger("Vanya","Vano"));
        bus.push(new Passenger("Bunjee","Bingo"));
        bus.push(new Passenger("Nikola","Tesla"));
        bus.push(passenger);
        bus.push(new Passenger("Oleg","Me"));

        System.out.println("Passenger found in position " + bus.search(passenger));

        System.out.println("Last entered passenger is " + bus.peek());
        while (!bus.empty()){
            System.out.println("Passenger " + bus.pop());
        }
    }

    private static class Passenger{
        private static int number = 1;
        private String name;
        private String surname;

        public Passenger(String name, String surname) {
            number++;
            this.name = name;
            this.surname = surname;
        }

        public static int getNumber() {
            return number;
        }

        public String getName() {
            return name;
        }

        public String getSurname() {
            return surname;
        }

        @Override
        public String toString() {
            return "Passenger: " +
                    "name='" + name + '\'' +
                    ", surname='" + surname;
        }
    }
    }

