package bisca;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Jogo {
  int jogada = 0;
  int jogar = 0;
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
//⦁120: Se um jogador fizer 120 pontos, ganha-se 2 pontos, se for copas, 3 pontos;     
  if (pontos == 120) {
        System.out.print(pontos+2);
  if else (pontos== 120 && trunfo==nipe.copas);
        System.out.print(pontos+3);
        
 //61: Se um jogador obtiver 61 pontos, automaticamente ele ganha 1 ponto, se for copas, 2 pontos;

        if else (pontosr => 61){
            System.out.print(pontos+1);
            
        if else (pontos>=61 && trunfo==nipe.copas){
            System.out.print(pontos+2);
        
  // Retornar a contagem de pontos
  return pontos;
  

  //Bom Dia
  //Bom Dia
      

}
