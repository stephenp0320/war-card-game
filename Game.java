import java.util.ArrayList;
import java.util.List;

class Game {
    Deck deck = new Deck();
    List<String> playerOneHand = deck.getPlayerOneHand();
    List<String> playerTwoHand = deck.getPlayerTwoHand();
    List<String> cardPile = deck.pile;
    
    Player playerOne = new Player("Stephen", playerOneHand);
    Player playerTwo = new Player("Eoin", playerTwoHand);
    
    public void startGame(){
        System.out.println("This is the card game called War!");

        deck.createDeck();
        deck.shuffleDeck(deck.deck);
        deck.dealCards(deck.shuffledDeck);

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
        
        round(cardPile);

    }

    public void round(List<String> cardPile) {
        // draw logic should be in here
        // cards added to the pile
        // compareCard() is called
        while (!playerOneHand.isEmpty() && !playerTwoHand.isEmpty()) {
            cardPile.clear();
            String p1Card = deck.getPlayerOneCard();
            String p2Card = deck.getPlayerTwoCard();

            cardPile.add(p1Card);
            cardPile.add(p2Card);
            compareCard(p1Card, p2Card);
        }
    }

    public void compareCard(String playerOneCard, String playerTwoCard) {
        int playerOneValue = deck.getCardValue(playerOneCard);
        int playerTwoValue = deck.getCardValue(playerTwoCard);
        if (playerOneValue == playerTwoValue) {
            handleWar();
        } else if (playerOneValue > playerTwoValue) {
            System.out.println(playerOne.getName() + " wins the round");
            playerOneHand.add(playerOneCard);
            playerOneHand.add(playerTwoCard);
        } else {
            System.out.println(playerTwo.getName() + " wins the round");
            playerTwoHand.add(playerOneCard);
            playerTwoHand.add(playerTwoCard);
        }
    }

    public void handleWar() {
        
    }
}