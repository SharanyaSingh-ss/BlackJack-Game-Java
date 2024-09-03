# Blackjack Game

This is a simple command-line Blackjack game written in Java. The game allows a player to compete against a dealer in a classic game of Blackjack.

## Features

- Single-player mode against a dealer.
- Option to "Hit" or "Stay" during your turn.
- Automated dealer actions based on standard Blackjack rules.
- Support for multiple decks.
- Simple and intuitive command-line interface.

## How to Play

* After the game starts, you will be dealt two cards and so will the dealer.
* You can choose to "Hit" (draw another card) or "Stay" (keep your current hand).
* The dealer will then reveal their cards and draw additional cards if their hand is below 17.
*The game will determine the winner based on who has the hand closest to 21 without going over.

## Game Rules

* Number cards are worth their face value.
* Face cards (Jack, Queen, King) are worth 10 points.
* Aces can be worth 1 or 11 points, depending on which value benefits the hand more.
* The goal is to have a hand value as close to 21 as possible without exceeding it.
* If your hand exceeds 21, you bust and lose the game.

# Code Structure

* **Card.java**: Represents a playing card, with a suit and a number.
* **Deck.java**: Manages the deck(s) of cards, including shuffling and dealing.
* **Player.java**: Represents a player in the game, holding their hand and managing actions.
* **Suit.java**: Enum representing the four suits of cards (Clubs, Diamonds, Spades, Hearts).
* **GameRunner.java**: The main class that runs the game.
