#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main() {
    int toss;
    char player1Symbol, player2Symbol;
    int currentPlayer;

    // Seed the random number generator
    srand(time(0));

    // Generate random number (0 or 1)
    toss = rand() % 2;

    // Decide who starts and assign symbols
    if (toss == 0) {
        currentPlayer = 1;
        player1Symbol = 'X';
        player2Symbol = 'O';
        printf("Player 1 wins the toss and starts first!\n");
    } else {
        currentPlayer = 2;
        player2Symbol = 'X';
        player1Symbol = 'O';
        printf("Player 2 wins the toss and starts first!\n");
    }

    // Display assigned symbols
    printf("Player 1 symbol: %c\n", player1Symbol);
    printf("Player 2 symbol: %c\n", player2Symbol);

    // Store current player info
    printf("Current Player: Player %d\n", currentPlayer);

    return 0;
}
