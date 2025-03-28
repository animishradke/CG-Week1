import java.util.Scanner;

public class CardGame {

    public static String[] initializeDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
                "Jack", "Queen", "King", "Ace"};
        int numberOfCards = suits.length * ranks.length;
        String[] deck = new String[numberOfCards];
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    public static String[] shuffleDeck(String[] deck) {
        int numberOfCards = deck.length;
        for (int i = 0; i < numberOfCards; i++) {
            int randomCardIndex = i + (int) (Math.random() * (numberOfCards - i));
            String temp = deck[i];
            deck[i] = deck[randomCardIndex];
            deck[randomCardIndex] = temp;
        }
        return deck;
    }

    public static String[][] distributeCards(String[] deck, int numberOfCards, int numberOfPlayers) {
        if (numberOfCards > deck.length || numberOfPlayers * (numberOfCards / numberOfPlayers) > deck.length) {
            return null;
        }
        int cardsPerPlayer = numberOfCards / numberOfPlayers;
        String[][] players = new String[numberOfPlayers][cardsPerPlayer];
        int cardIndex = 0;
        for (int i = 0; i < numberOfPlayers; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                players[i][j] = deck[cardIndex++];
            }
        }
        return players;
    }

    public static void printPlayers(String[][] players) {
        if (players == null) {
            System.out.println("Cannot distribute cards fairly.");
            return;
        }
        for (int i = 0; i < players.length; i++) {
            System.out.println("Player " + (i + 1) + " has:");
            for (int j = 0; j < players[i].length; j++) {
                System.out.println("  " + players[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] deck = initializeDeck();
        deck = shuffleDeck(deck);
        System.out.print("Enter total number of cards to distribute: ");
        int numberOfCardsToDistribute = scanner.nextInt();
        System.out.print("Enter number of players: ");
        int numberOfPlayers = scanner.nextInt();
        String[][] players = distributeCards(deck, numberOfCardsToDistribute, numberOfPlayers);
        printPlayers(players);
        scanner.close();
    }
}