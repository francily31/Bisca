package bisca;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Jogo {
    int jogada=0;
    int jogar=0;
    int comprar=0; 


int contarPontos(int[] mao) {
  // Inicializar variável para armazenar a contagem de pontos
  int pontos = 0;

 // Percorrer cada carta da mão
  for (int i = 0; i < mao.length; i++) {
    // Obter o valor da carta
    int valorCarta = mao[i];
    
    // Adicionar o valor da carta à contagem de pontos
    // (a regra de contar pontos pode variar de acordo com a variante de bisca que está sendo jogada)
    pontos += valorCarta;
  }

  // Retornar a contagem de pontos
  return pontos;

}
