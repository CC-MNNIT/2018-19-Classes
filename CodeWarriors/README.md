# Code Warriors 2k18

Follow this guide as general source for Code Warriors

## Table of Contents

- [Event Description](#EventDescription)
- [Problem Statement](#ProblemStatements)
- [Rules Of Play](#RulesOfPlay)
- [Announcements](#Announcements)
- [Coordinators](#Coordinators)

## Event Description

CodeWarrior is CyberQuest flagship Artificial Intelligence Challenge. It's one of a kind challenge that will be held during Avishkar. There is only one problem statement in the challenge - the game for which you have to write a bot. You will be given a two-player game and you have to write a bot that will play that game against other bots. Your bot has to adhere to the rules of the game given in the problem statement, and play against the other bot.

Teams will compete against each other in a knockout tournament which will be held during Avishkar. Each match in the tournament will have three rounds (This will ensure that every team gets equal opportunity to play as Left as well as Right Player).  The one who wins most number of rounds will be the winner of match. Winning team will proceed further in the tournament whereas the losing team will be knocked out of the tournament.

## Problem Statement

### Domineering

[Domineering](http://en.wikipedia.org/wiki/Domineering) is a partisan game between two players where each turn a domino is placed over two adjacent squares. The Left player must place dominoes horizontally while Right must place them vertically. You may not place dominoes on squares already occupied by a domino. Assuming fair play, the player who cannot place a domino loses.

Board Size : 13x13

So this was the description of normal domineering game. But we have a slight modification. We will give each player one superpower which they may or may not use.

### What is the SuperPower?

Each player will get one bomb each which will explode the entire grid of 5x5 on the board, by explosion we mean that the 5x5 grid will be again available for placing dominoes. But that 5x5 grid must not contain any domino which is partially inside or partially outside that grid area. Exploding a bomb will be considered a single move.

## Rules Of Play

- First player places dominoes horizontally whereas second player places dominoes vertically.

- The player which is unable to place a domino loses.

- Any invalid move will lead to victory of opponent team in that round. Invalid moves include:
 - Placing domino on space covered by other domino.
 - Placing domino on a coordinate which is non existent (eg. -1,-1)
 - Exploding a 5x5 grid containing any domino which is partially outside and partially inside the grid.

- Bomb explosion move is not mandatory. Exploding the bomb depends on player’s will.

- The move must be generated in the given time limit which is 1 sec for c/cpp and 2 sec for java. Failing to produce a move in the given time limit will again lead to victory of opponent team in that round.

- The players must come with a single version of their game. They will not be allowed to change their code in between.


## Announcements

[Arena](Domineering.zip) and [Problem Statement](Domineering .pdf) have been released !!!

## Coordinators

For any doubt related to this event feel free to contact Coordinators.

* [Abhey Rana](https://github.com/Abhey)
* [Manmeet Singh](https://github.com/danishdevil)

## Contributing

Feel free to contribute to content. Follow the existing Readme.md to add information.Make a pull request !!

## License

This repository is licensed under the MIT License - see the LICENSE.md file for details
