package com.ironyard.data;

/**
 * an implementation of a card type
 * <p>
 * Created by nathanielellsworth on 10/15/16.
 */
public class Card {
    //one of the four valid suites for this card


    private Suit mySuit;
    //the number of hits card, where ace:11 jack-king:10


    private int myNumber;

    /**
     * @param aSuit   the suit of the card
     * @param aNumber the number of the card
     */
    public Card(Suit aSuit, int aNumber) {

        this.mySuit = aSuit;

        if (aNumber >= 1 && aNumber <= 13) {
            //ensures we have a valid *positive* number
            this.myNumber = aNumber;
        } else {
            System.err.println(aNumber + " is not a valid Card number");
            //print standard error, exit with status 1 (basically exits the program), 1 is whatever the program calls, says our blackjack program there was an error.
            System.exit(1);
        }
    }

    /**
     * Return the number of the card
     *
     * @return the number
     */
    public int getNumber()
    {
        return myNumber;
    }

    public String toString() {
        String numStr = "Error";

        switch (this.myNumber) {

            case 1:
                numStr = "Ace";
                break;

            case 2:
                numStr = "Two";
                break;

            case 3:
                numStr = "Three";
                break;

            case 4:
                numStr = "Four";
                break;

            case 5:
                numStr = "Five";
                break;

            case 6:
                numStr = "Six";
                break;

            case 7:
                numStr = "Seven";
                break;

            case 8:
                numStr = "Eight";
                break;

            case 9:
                numStr = "Nine";
                break;

            case 10:
                numStr = "Ten";
                break;

            case 11:
                numStr = "Jack";
                break;

            case 12:
                numStr = "Queen";
                break;

            case 13:
                numStr = "King";
                break;


             }

        return numStr + " of " + mySuit.toString();
    }

}
