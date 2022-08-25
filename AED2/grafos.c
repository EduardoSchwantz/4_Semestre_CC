#include <stdio.h>
#include <stdlib.h>
#include <windows.h>
#define maxTam 20
int matriz[maxTam][maxTam];
void imprimir(int tam);
void addPeso(int tam);
int main()
{
    SetConsoleOutputCP(65001);
    system("clear||cls");
    printf("Eduardo Schwantz.\nCecilia Botelho.\nPedro Henrique Lima de Mesquita\n");
    int i, j, tam = 0, option;
    while (tam <= 0 || tam > maxTam)
    {
        printf("Digite a quantidade de pontos deseja no grafo. (máximo 20 e sem numeros negativos!): ");
        scanf("%d", &tam);
    }

    for (i = 0; i < tam; i++)
    {
        for (j = 0; j < tam; j++)
        {
            matriz[i][j] = 0;
        }
    }
    for (;;)
    {
        printf("\n\n\n             Selecione uma opção:             \n");
        printf(" 1 - Adicionar peso a uma aresta.\n");
        printf(" 2 - imprimir\n");
        printf(" 0 - Sair.\n");
        printf("\n             Digite uma opção:             \n");
        scanf("%d", &option);
        system("clear||cls");
        switch (option)
        {
        case 1:
            addPeso(tam);
            break;
        case 2:
            imprimir(tam);
            break;
        case 0:
            exit(0);
            break;

        default:
            break;
        }
    }

    return 0;
}
void imprimir(int tam)
{
    int i, j;

    for (i = 0; i < tam; i++)
    {
        printf("\t%d\t", i + 1);
    }
    printf("\n");
    for (i = 0; i < tam; i++)
    {
        printf("\t|\t");
    }

    printf("\n");
    for (i = 0; i < tam; i++)
    {

        printf("\n");
        printf("%d ->", i + 1);
        for (j = 0; j < tam; j++)
        {
            printf("\t%d\t|", matriz[i][j]);
        }
    }
}
void addPeso(int tam)
{
    int v1, v2;
    int peso;
    char confirm[2];
    do
    {
        printf("Inserir vértice 1: ");
        scanf("%d", &v1);

        printf("Inserir vértice 2: ");
        scanf("%d", &v2);

        v1--;
        v2--;
    } while ((v1 < 0 || v1 >= tam) && (v2 < 0 || v2 >= tam));

    if (matriz[v1][v2] != 0)
    {
        printf("Já existe uma aresta entre os vértices [%d][%d], deseja alterar?. Y || N\n", v1, v2);
        scanf("%s", confirm);

        if (strcmp(confirm, "Y") == 0 || strcmp(confirm, "y") == 0)
        {
            printf("Inserir peso:");
            scanf("%d", &peso);
            matriz[v1][v2] = peso;
        }
        else
        {
            printf("Aresta não alterada.\n");
        }
    }
    else
    {
        printf("Qual o peso da aresta?\n");
        scanf("%d", &peso);

        while (peso < 0)
        {
            printf("Peso inválido.\n");
            printf("Qual o peso da aresta?\n");
            scanf("%d", &peso);
        }
        matriz[v1][v2] = peso;
    }
}