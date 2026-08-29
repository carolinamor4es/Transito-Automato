/* ***************************************************************
* Autor............: Carolina de Moraes Carneiro
* Matricula........: 202410077
* Inicio...........: 24/06/25
* Ultima alteracao.: 04/07/25
* Nome.............: Caminhonete
* Funcao...........: Faz as movimentacoes das caminhonetes e executa o percurso 
****************************************************************/

package model;

import controller.CircuitoController;
import javafx.application.Platform;
import javafx.scene.image.ImageView;

public class Caminhonete extends Thread {

  // declaracoes
  int velocidade;
  private final int identificador; // identifica o carro
  private int eixoX = 0; // Posicao inicial no eixo X
  private final int startX, startY;
  private int eixoY = 0; // Posicao inicial no eixo Y
  public ImageView caminhonete; // imagem do carro

  private CircuitoController controller;

  /*
   * *********************
   * Metodo: Caminhonete
   * Funcao: construtor da classe Caminhonete, inicializa atributos e posiciona a
   * imagem
   * Parametros: int identificador - identifica a caminhonete
   * ImageView caminhonete - imagem associada
   * int eixoX - posicao inicial no eixo X
   * int eixoY - posicao inicial no eixo Y
   * Retorno: nenhum
   **********************
   */
  public Caminhonete(int identificador, ImageView caminhonete, int eixoX, int eixoY) {
    this.identificador = identificador;
    this.caminhonete = caminhonete;
    this.startX = eixoX;
    this.startY = eixoY;
    this.eixoX = eixoX;
    this.eixoY = eixoY;
    // posiciona pela 1 vez
    Platform.runLater(() -> {
      caminhonete.setLayoutX(startX);
      caminhonete.setLayoutY(startY);
    });
  }

  /*
   * *********************
   * Metodo: resetaPosicao
   * Funcao: retorna a imagem para as posicoes iniciais e zera a rotacao
   * Parametros: nenhum
   * Retorno: void
   **********************
   */
  public void resetaPosicao() {
    this.eixoX = startX;
    this.eixoY = startY;
    Platform.runLater(() -> {
      caminhonete.setLayoutX(startX);
      caminhonete.setLayoutY(startY);
      caminhonete.setRotate(0);
    });
  }

  /*
   * *********************
   * Metodo: setController
   * Funcao: associa o controller ao objeto Caminhonete
   * Parametros: CircuitoController controller - instancia do controller
   * Retorno: void
   **********************
   */
  public void setController(CircuitoController controller) {
    this.controller = controller;
  }

  /*
   * *********************
   * Metodo: setVelocidade
   * Funcao: define a velocidade da caminhonete
   * Parametros: int novaVelocidade - novo valor da velocidade
   * Retorno: void
   **********************
   */

  public void setVelocidade(int novaVelocidade) {
    this.velocidade = novaVelocidade;
  }

  /*
   * *********************
   * Metodo: moverParaDireita
   * Funcao: move a caminhonete para a direita na tela
   * Parametros: int quantidade - quantidade de passos
   * Retorno: void
   **********************
   */
  public void moverParaDireita(int quantidade) {
    for (int i = 0; i < quantidade; i++) {
      eixoX++;
      int finalX = eixoX;
      Platform.runLater(() -> caminhonete.setLayoutX(finalX));
      try {
        Thread.sleep(velocidade);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }

  /*
   * *********************
   * Metodo: moverParaEsquerda
   * Funcao: move a caminhonete para a esquerda na tela
   * Parametros: int quantidade - quantidade de passos
   * Retorno: void
   **********************
   */
  public void moverParaEsquerda(int quantidade) {
    for (int i = 0; i < quantidade; i++) {
      eixoX--;
      int finalX = eixoX;
      Platform.runLater(() -> caminhonete.setLayoutX(finalX));
      try {
        Thread.sleep(velocidade);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }

  /*
   * *********************
   * Metodo: moverParaBaixo
   * Funcao: move a caminhonete para baixo na tela
   * Parametros: int quantidade - quantidade de passos
   * Retorno: void
   **********************
   */
  public void moverParaBaixo(int quantidade) {
    for (int i = 0; i < quantidade; i++) {
      eixoY++;
      int finalY = eixoY;
      Platform.runLater(() -> caminhonete.setLayoutY(finalY));
      try {
        Thread.sleep(velocidade);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }

  /*
   * *********************
   * Metodo: moverParaCima
   * Funcao: move a caminhonete para cima na tela
   * Parametros: int quantidade - quantidade de passos
   * Retorno: void
   **********************
   */
  public void moverParaCima(int quantidade) {
    for (int i = 0; i < quantidade; i++) {
      eixoY--;
      int finalY = eixoY;
      Platform.runLater(() -> caminhonete.setLayoutY(finalY));
      try {
        Thread.sleep(velocidade);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }

  /*
   * *********************
   * Metodo: run
   * Funcao: executa continuamente o percurso da caminhonete, reiniciando apos
   * cada ciclo
   * Parametros: nenhum
   * Retorno: void
   **********************
   */
  @Override
  public void run() {
    while (true) {
      try {
        controller.percorrerPercurso(identificador);
        resetaPosicao(); // reposiciona instantaneamente
        Thread.sleep(1);
      } catch (InterruptedException e) {
        e.printStackTrace();
        break;
      }
    }
  }

}
