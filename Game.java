import java.util.ArrayList;
import java.util.List;

class Game {
    public void startGame(){
        System.out.println("This is the card game called War!");

        Deck deck = new Deck();
        deck.createDeck();
        deck.shuffleDeck(deck.deck);
        deck.dealCards(deck.shuffledDeck);

        List<String> playerOneHand = deck.getPlayerOneHand();
        List<String> playerTwoHand = deck.getPlayerTwoHand();

        Player playerOne = new Player("Stephen", playerOneHand);
        Player playerTwo = new Player("Eoin", playerTwoHand);

        boolean playing = true;
        int playerOneHasCards = playerOneHand.size();
        int playerTwoHasCards = playerTwoHand.size();

        System.out.println("Player Ones Hand");
        System.out.println(playerOneHand);
        
        System.out.println("Player Ones Card");
        System.out.println(deck.getPlayerOneCard());
        System.out.println(" ");
        System.out.println("Player Twos Hand");
        System.out.println(playerTwoHand);
        System.out.println("Player Twos Card");
        System.out.println(deck.getPlayerTwoCard());

    }

    public void round() {
        // draw logic should be in here
        // cards added to the pile
        // compareCard() is called
    }

    public void compareCard(String playerOneCard, String playerTwoCard) {
        // compare both cards
    }

    public void handleWar() {
        
    }
}