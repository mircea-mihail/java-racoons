//classes:

//  Player
//  * Card
//  *    StashableCard
//  * TokenCollection
//  * Token
//  * Die
//  * Deck
//  * DiscardPile

import javax.print.attribute.standard.MediaSize;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // just to test discardPile class:
        Deck testDeck = new Deck();
        DiscardPile testDiscardPile = new DiscardPile();

        for(int i = 0; i < 10; i++)
        {
            testDiscardPile.addCard(testDeck.drawCard());
        }
        testDiscardPile.showPileElements();
        // this functionality comes in handy when a player is able to draw any card
        // from the discard pile and this makes it easier for them to just get the card
        // with the appropriate title (the object is not important, only the behaviour of the card)

        System.out.println("how many players? (only 2-4 players allowed)");
        Scanner scanner = new Scanner(System.in);

        int NumberOfPlayers;
        while(!scanner.hasNextInt())
        {
            System.out.println("input a valid number of players");
            scanner.next();
        }

        NumberOfPlayers = scanner.nextInt();
        if(NumberOfPlayers < 2)
        {
            System.out.println("2 player game started.");
            NumberOfPlayers = 2;
        }
        else if(NumberOfPlayers > 4)
        {
            System.out.println("4 player game started.");
            NumberOfPlayers = 4;
        }
        else
        {
            System.out.println(NumberOfPlayers + " player game started.");
        }
        scanner.nextLine();
        List<Player> playerList = new ArrayList<>();
        for(int i = 0; i < NumberOfPlayers; i++)
        {
            System.out.println("Player " + i + " name: ");
            String PlayerName = scanner.nextLine();
            playerList.add(new Player(PlayerName));
        }

        final int CardsToStartWith = 3;

        boolean gameOver = false;
        Deck deck = new Deck();
        Die die = new Die();
        TokenCollection tokens = new TokenCollection();

        for(int i = 0; i < playerList.size(); i++)
        {
            for(int j = 0; j < CardsToStartWith + i; j++)
            {
                Player currentPlayer = playerList.get(i);
                currentPlayer.takeCard(deck.drawCard());
            }
        }

        int currentPlayerIdx = 0;
        Player currentPlayer = playerList.get(currentPlayerIdx);

        while(!gameOver)
        {
            System.out.println("\n\tPlayer " + currentPlayer.getName() + ":");

            currentPlayer.showCards();
            boolean busted = false;
            // roll for as long as you dare
            String shouldRoll;
            do
            {
                shouldRoll = "";
                while(!shouldRoll.equals("y") && !shouldRoll.equals("n"))
                {
                    System.out.println("Roll die? (y/n)");
                    shouldRoll = scanner.next();
                }

                if(shouldRoll.equals("y"))
                {
                    String dieRoll = die.roll();
                    System.out.println(dieRoll);
                    Token receivedToken = tokens.extractToken(dieRoll);
                    if(receivedToken == null)
                    {
                        System.out.println("You BUSTED!");
                        busted = true;
                        Card drawnCard = deck.drawCard();
                        if(drawnCard == null)
                        {
                            gameOver = true;
                        }
                        else
                        {
                            currentPlayer.takeCard(drawnCard);
                            System.out.println("Consolation Card:\n" + drawnCard.getTitle());
                        }
                    }
                    else
                    {
                        currentPlayer.takeToken(receivedToken);
                    }
                }
            } while(shouldRoll.equals("y") && !busted);

            if(!gameOver && !busted && currentPlayer.getTokensNumber() != 0)
            {
                while(currentPlayer.getTokensNumber() != 0)
                {
                    System.out.println("Pick a token to resolve (the number)");
                    currentPlayer.showTokens();
                    Token tokenToResolve = currentPlayer.resolveToken(scanner.nextInt());

                    switch(tokenToResolve.getName())
                    {
                        case("Double Draw"):
                        {
                            for(int i = 0; i < 2; i++)
                            {
                                Card drawnCard = deck.drawCard();
                                if(drawnCard == null)
                                {
                                    gameOver = true;
                                    break;
                                }
                                System.out.println("You got " + drawnCard.getTitle());
                            }
                        }
//                        case("Double Stash"):
//                        {
//                            for(int i = 0; i < 2; i++)
//                            {
//                                System.out.println("Pick a card to stash (the number)");
//                                currentPlayer.showCards();
//
//                            }
//                        }
                        default:
                        {
                            System.out.println("Behaviour not implemented");
                        }
                    }
                }
            }

            currentPlayer.resetTokens();
            tokens.reset();
            // switch to the next player
            currentPlayerIdx ++;
            if(currentPlayerIdx >= playerList.size())
            {
                currentPlayerIdx = 0;
            }
            currentPlayer = playerList.get(currentPlayerIdx);
        }
    }
}

// Actions
//      initialise and shuffle deck of cards
//      take card from deck
//      put card in player hand
//      show cards in hand
//      roll die
//      extract token from token pile
//      put token in player hand
//      show tokens in player hand
//      resolve a token
//      show unique discard pile elements