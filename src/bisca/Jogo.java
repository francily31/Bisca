package bisca;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Jogo {

// Cria um gerador de números aleatórios
    Random random = new Random();

// Gera um número aleatório entre 1 e 40
    int numeroSorteado = random.nextInt(40) + 1;

   // Converte o número sorteado em um naipe
    String naipeSorteado;
    if (numeroSorteado >= 0 && numeroSorteado <= 10) {
      naipeSorteado = "Espadas";
    } else if (numeroSorteado >= 11 && numeroSorteado <= 20) {
      naipeSorteado = "Copas";
    } else if (numeroSorteado >= 21 && numeroSorteado <= 30) {
      naipeSorteado = "Ouros";
    } else {
      naipeSorteado = "Paus";
    }

    //era pra retornar 

return this.nipe;

    // Imprime o naipe sorteado
    System.out.println("O naipe sorteado foi: " + naipeSorteado);

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
  if (pontosr == 120) {
        System.out.print(pontos+2);
  if else (pontosr== 120 && trunfo==nipe.copas);
        System.out.print(pontos+3);
        
 //61: Se um jogador obtiver 61 pontos, automaticamente ele ganha 1 ponto, se for copas, 2 pontos;

   if else (pontosr => 61){
            System.out.print(pontos+1);
            
   if else (pontosr>=61 && trunfo==nipe.copas){
            System.out.print(pontos+2);
        
  // Retornar a contagem de pontos
  return pontos;
  

  //Bom Dia2
  //Bom Dia
      

}
