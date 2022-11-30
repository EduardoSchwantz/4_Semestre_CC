package uno;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.ImageIcon;

public class UnoDeck
{
  private UnoCard[] cards;
  private int cardsInDeck;

    public UnoDeck()
  {
    //inicializa o array das cartas
    cards = new UnoCard[108];
    reset();
  }
    
    public void reset() {
    //cria uma vetor de cores para armazenar os valores da enum color
    
    UnoCard.Color[] colors = UnoCard.Color.values();
    //index do array das card            
    cardsInDeck = 0;
    //peercorre o array das cores.
    //-1 por que estamo excluido a wild(coringa)
    for (int i = 0; i < colors.length-1; i++)
    {
      //a cor do cartão será o índice atual do array de cards
      UnoCard.Color color = colors[i];

      // adiciona 1 zero
      cards[cardsInDeck++] = new UnoCard(color, UnoCard.Value.getValue(0));
      // adiciona 2 cards para 1-9
      for (int j = 1; j < 10; j++)
      {
        cards[cardsInDeck++] = new UnoCard(color, UnoCard.Value.getValue(j));
        cards[cardsInDeck++] = new UnoCard(color, UnoCard.Value.getValue(j));
      }
      // adiciona a carta Draw Two (+ 2), Skip, e Reverse
      UnoCard.Value[] values = new UnoCard.Value[]{UnoCard.Value.DrawTwo, UnoCard.Value.Skip, UnoCard.Value.Reverse};
      for (UnoCard.Value value : values)
      {
        cards[cardsInDeck++] = new UnoCard(color, value);
        cards[cardsInDeck++] = new UnoCard(color, value);
      }
    }

    // adiciona as Wild Cards: Wild Wild e Wild DrawFour
    UnoCard.Value[] values = new UnoCard.Value[]{UnoCard.Value.Wild, UnoCard.Value.Wild_Four};
    for (UnoCard.Value value : values)
    {
      for (int i = 0; i < 4; i++)
      {
        cards[cardsInDeck++] = new UnoCard(UnoCard.Color.Wild, value);
      }
    }
  }

    public void replaceDeckWith(ArrayList<UnoCard> cards) {
      this.cards = cards.toArray(new UnoCard[cards.size()]);
      this.cardsInDeck = this.cards.length;
    }

    public boolean isEmpty() {
      return cardsInDeck == 0;
    }

    public void shuffle() {
      int n = cards.length;
      Random random = new Random();

      for (int i = 0; i < cards.length; i++) {

        // Pega um indice aleatorio do array apos o indice atual
        // ... O argumento é um limite exclusivo
        // faz a troca

        int randomValue = i + random.nextInt(n - i);
        UnoCard randomCard = cards[randomValue];
        cards[randomValue] = cards[i];
        cards[i] = randomCard;
      }

    }

    public UnoCard drawCard() throws IllegalArgumentException {
      if (isEmpty()) {
        throw new IllegalArgumentException(" Não é possível comprar uma carta porque não há cartas no baralho ");
      }
      return cards[--cardsInDeck];
    }

    public ImageIcon drawCardImage() throws IllegalArgumentException {
      if(isEmpty()) {
        throw new IllegalArgumentException(" Não é possível comprar uma carta porque o baralho está vazio ");
      }
      return new ImageIcon(cards[--cardsInDeck].toString() + ".png");
    }

    public UnoCard[] drawCard(int n) {
      if (n < 0) {
        throw new IllegalArgumentException(" Deve comprar cartas positivas, mas tentou comprar " + n + " cartas.. ");
      }

      if (n > cardsInDeck) {
        throw new IllegalArgumentException( "Não é possivel comprar" + n + " cartas, pois só existem " + cardsInDeck + " cartas. ");
      }

      UnoCard[] ret = new UnoCard[n];

      for (int i = 0; i < n; i++) {
        ret[i] = cards[--cardsInDeck];
      }
      return ret;
    }
}
