#include <stdio.h>

int main() {
    char board[3][3];
    int i, j;

    // Initialize the board with '-'
    for (i = 0; i < 3; i++) {
        for (j = 0; j < 3; j++) {
            board[i][j] = '-';
        }
    }

    // Print the board
    printf("Tic-Tac-Toe Board:\n\n");
    for (i = 0; i < 3; i++) {
        for (j = 0; j < 3; j++) {
            printf("%c ", board[i][j]);
        }
        printf("\n");
    }

    return 0;
}
