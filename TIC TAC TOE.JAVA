#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main() {
    int toss;
    int currentPlayer;
    char player1Symbol, player2Symbol;

    // Seed random number generator
    srand(time(NULL));

    // Generate random number (0 or 1)
    toss = rand() % 2;

    // Apply logic based on toss result
    if (toss == 0) {
        currentPlayer = 1;
        player1Symbol = 'X';
        player2Symbol = 'O';
        printf("Player 1 wins the toss and will start first.\n");
    } else {
        currentPlayer = 2;
        player2Symbol = 'X';
        player1Symbol = 'O';
        printf("Player 2 wins the toss and will start first.\n");
    }

    // Display assigned symbols
    printf("Player 1 Symbol: %c\n", player1Symbol);
    printf("Player 2 Symbol: %c\n", player2Symbol);

    // Display current player
    printf("Current Player: Player %d\n", currentPlayer);

    return 0;
}
