#include <stdio.h>
#include <stdlib.h>
#include <windows.h>

int main()
{
    SetConsoleOutputCP(65001);
    system("clear||cls");
    printf("Exercício 1 sobre grafos!!\n");
    printf("Eduardo Schwantz.\nCecilia Botelho.\n");
    int i, j, tam, repeat = 1;
    do
    {
        printf("Digite a quantidade de vertices que deseja alocar (máximo 20 e sem numeros negativos!): ");
        scanf("%d", &tam);

        if (tam > 20 || tam < 0)
        {
            printf("\nError!\nLimite de vertices excedido!!");
            printf("\nDigite novamente!!");
        }
        else
        {
            int matriz[tam][tam];
            for (i = 0; i < tam; i++)
            {
                for (j = 0; j < tam; j++)
                {
                    printf("\nDigite o peso do vértice linha %d coluna %d: ", i + 1, j + 1);
                    scanf("%d", &matriz[i][j]);
                }
            }
            printf("     ");
            for (i = 0; i < tam; i++)
            {
                printf(" %d | ", i + 1);
            }

            for (i = 0; i < tam; i++)
            {

                printf("\n");
                printf("%d -", i + 1);
                for (j = 0; j < tam; j++)
                {
                    printf("   %d ", matriz[i][j]);
                }
            }
        }

        printf("\nPara repetir o programa digite 1, para sair 0:");
        scanf("%d", &repeat);
    } while (repeat);
    return 0;
}