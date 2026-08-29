/* ***************************************************************
* Autor............: Carolina de Moraes Carneiro
* Matricula........: 202410077
* Inicio...........: 24/06/25
* Ultima alteracao.: 04/07/25
* Nome.............: CircuitoController
* Funcao...........: Eh onde o circuito esta feito, controla todos os botoes, inicializa todos os elementos,
inicializa e faz a aplicacao dos semaforos 
****************************************************************/

package controller;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.concurrent.Semaphore;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.image.ImageView;
import model.*;

public class CircuitoController implements Initializable {

  @FXML
  private ImageView abertoAzul;

  @FXML
  private ImageView abertoBranco;

  @FXML
  private ImageView abertoCiano;

  @FXML
  private ImageView abertoCinza;

  @FXML
  private ImageView abertoPreto;

  @FXML
  private ImageView abertoRosa;

  @FXML
  private ImageView abertoRoxo;

  @FXML
  private ImageView abertoVermelho;

  @FXML
  private Button botaoReset;

  @FXML
  private ImageView carroAzul;

  @FXML
  private ImageView carroBranco;

  @FXML
  private ImageView carroCiano;

  @FXML
  private ImageView carroCinza;

  @FXML
  private ImageView carroPreto;

  @FXML
  private ImageView carroRosa;

  @FXML
  private ImageView carroRoxo;

  @FXML
  private ImageView carroVermelho;

  @FXML
  private ImageView fechadoAzul;

  @FXML
  private ImageView fechadoBranco;

  @FXML
  private ImageView fechadoCiano;

  @FXML
  private ImageView fechadoCinza;

  @FXML
  private ImageView fechadoPreto;

  @FXML
  private ImageView fechadoRosa;

  @FXML
  private ImageView fechadoRoxo;

  @FXML
  private ImageView fechadoVermelho;

  @FXML
  private Button pauseAzul;

  @FXML
  private Button pauseBranco;

  @FXML
  private Button pauseCiano;

  @FXML
  private Button pauseCinza;

  @FXML
  private Button pausePreto;

  @FXML
  private Button pauseRosa;

  @FXML
  private Button pauseRoxo;

  @FXML
  private Button pauseVermelho;

  @FXML
  private ImageView percurso01;

  @FXML
  private ImageView percurso06;

  @FXML
  private ImageView percurso07;

  @FXML
  private ImageView percurso10;

  @FXML
  private ImageView percurso13;

  @FXML
  private ImageView percurso18;

  @FXML
  private ImageView percurso21;

  @FXML
  private ImageView percurso24;

  @FXML
  private Slider sliderAzul;

  @FXML
  private Slider sliderBranco;

  @FXML
  private Slider sliderCiano;

  @FXML
  private Slider sliderCinza;

  @FXML
  private Slider sliderPreto;

  @FXML
  private Slider sliderRosa;

  @FXML
  private Slider sliderRoxo;

  @FXML
  private Slider sliderVermelho;

  @FXML
  private Button verAzul;

  @FXML
  private Button verBranco;

  @FXML
  private Button verCiano;

  @FXML
  private Button verCinza;

  @FXML
  private Button verPreto;

  @FXML
  private Button verRosa;

  @FXML
  private Button verRoxo;

  @FXML
  private Button verVermelho;

  private Semaphore[] SVerAzul = new Semaphore[7];
  private Semaphore SVerAzul1 = new Semaphore(0);
  private Semaphore SVerAzul2 = new Semaphore(0);
  private Semaphore[] SVerBranco = new Semaphore[2];
  private Semaphore SVerBranco1 = new Semaphore(0);
  private Semaphore SVerBranco2 = new Semaphore(0);
  private Semaphore[] SVerRosa = new Semaphore[2];
  private Semaphore SVerRosa1 = new Semaphore(0);
  private Semaphore[] SVerCinza = new Semaphore[4];
  private Semaphore SVerRoxo = new Semaphore(1);
  private Semaphore SVerRoxo1 = new Semaphore(0);
  private Semaphore[] SVerPreto = new Semaphore[3];
  private Semaphore SVerPreto1 = new Semaphore(0);
  private Semaphore SVerPreto2 = new Semaphore(0);
  private Semaphore[] SVerCiano = new Semaphore[5];
  private Semaphore SVerCiano1 = new Semaphore(0);
  private Semaphore SAzulBranco = new Semaphore(1);
  private Semaphore SAzulBranco1 = new Semaphore(0);
  private Semaphore[] SAzulRosa = new Semaphore[2];
  private Semaphore[] SAzulCinza = new Semaphore[9];
  private Semaphore[] SAzulRoxo = new Semaphore[2];
  private Semaphore SAzulRoxo1 = new Semaphore(0);
  private Semaphore[] SAzulPreto = new Semaphore[6];
  private Semaphore SAzulPreto1 = new Semaphore(0);
  private Semaphore SAzulPreto2 = new Semaphore(0);
  private Semaphore[] SAzulCiano = new Semaphore[8];
  private Semaphore SAzulCiano1 = new Semaphore(0);
  private Semaphore[] SBrancoCinza = new Semaphore[2];
  private Semaphore SBrancoCinza1 = new Semaphore(0);
  private Semaphore SBrancoRoxo = new Semaphore(1);
  private Semaphore SBrancoRoxo1 = new Semaphore(0);
  private Semaphore[] SBrancoPreto = new Semaphore[2];
  private Semaphore[] SBrancoCiano = new Semaphore[3];
  private Semaphore[] SRosaCinza = new Semaphore[3];
  private Semaphore SRosaRoxo = new Semaphore(0);
  private Semaphore SRosaPreto = new Semaphore(1);
  private Semaphore SRosaPreto1 = new Semaphore(0);
  private Semaphore[] SRosaCiano = new Semaphore[3];
  private Semaphore SCinzaRoxo = new Semaphore(1);
  private Semaphore SCinzaRoxo1 = new Semaphore(0);
  private Semaphore[] SCinzaPreto = new Semaphore[3];
  private Semaphore SCinzaPreto1 = new Semaphore(0);
  private Semaphore[] SCinzaCiano = new Semaphore[2];
  private Semaphore[] SRoxoPreto = new Semaphore[3];
  private Semaphore[] SRoxoCiano = new Semaphore[2];
  private Semaphore[] SPretoCiano = new Semaphore[6];

  // Instanciando Threads
  private Caminhonete caminhoneteVermelha;
  private Caminhonete caminhoneteAzul;
  private Caminhonete caminhoneteBranca;
  private Caminhonete caminhoneteRosa;
  private Caminhonete caminhoneteCinza;
  private Caminhonete caminhoneteRoxa;
  private Caminhonete caminhonetePreta;
  private Caminhonete caminhoneteCiano;

  int clicadoVermelho = 0;
  int clicadoAzul = 0;
  int clicadoBranco = 0;
  int clicadoRosa = 0;
  int clicadoCinza = 0;
  int clicadoRoxo = 0;
  int clicadoPreto = 0;
  int clicadoCiano = 0;

  int pausadoVermelho = 0;
  int pausadoAzul = 0;
  int pausadoBranco = 0;
  int pausadoRosa = 0;
  int pausadoCinza = 0;
  int pausadoRoxo = 0;
  int pausadoPreto = 0;
  int pausadoCiano = 0;

  /*
   * *********************
   * Metodo: iniciarSemaforos
   * Funcao: inicializa todos os semaforos utilizados no controle de fluxo das
   * caminhonetes
   * Parametros: nenhum
   * Retorno: void
   **********************
   */
  public void iniciarSemaforos() {
    for (int i = 0; i < SVerAzul.length; i++) {
      SVerAzul[i] = new Semaphore(1);
      SVerAzul1 = new Semaphore(0);
      SVerAzul2 = new Semaphore(0);
    }

    for (int i = 0; i < SVerBranco.length; i++) {
      SVerBranco[i] = new Semaphore(1);
      SVerBranco1 = new Semaphore(0);
      SVerBranco2 = new Semaphore(0);

    }

    for (int i = 0; i < SVerRosa.length; i++) {
      SVerRosa[i] = new Semaphore(1);
      SVerRosa1 = new Semaphore(0);
    }

    for (int i = 0; i < SVerCinza.length; i++) {
      SVerCinza[i] = new Semaphore(1);
    }

    SVerRoxo = new Semaphore(1);
    SVerRoxo1 = new Semaphore(0);

    for (int i = 0; i < SVerPreto.length; i++) {
      SVerPreto[i] = new Semaphore(1);
      SVerPreto1 = new Semaphore(0);
      SVerPreto2 = new Semaphore(0);
    }

    for (int i = 0; i < SVerCiano.length; i++) {
      SVerCiano[i] = new Semaphore(1);
      SVerCiano1 = new Semaphore(0);
    }

    SAzulBranco = new Semaphore(1);
    SAzulBranco1 = new Semaphore(0);

    for (int i = 0; i < SAzulRosa.length; i++) {
      SAzulRosa[i] = new Semaphore(1);
    }
    for (int i = 0; i < SAzulCinza.length; i++) {
      SAzulCinza[i] = new Semaphore(1);
    }
    for (int i = 0; i < SAzulRoxo.length; i++) {
      SAzulRoxo[i] = new Semaphore(1);
      SAzulRoxo1 = new Semaphore(0);
    }
    for (int i = 0; i < SAzulPreto.length; i++) {
      SAzulPreto[i] = new Semaphore(1);
      SAzulPreto1 = new Semaphore(0);
      SAzulPreto2 = new Semaphore(0);
    }

    for (int i = 0; i < SAzulCiano.length; i++) {
      SAzulCiano[i] = new Semaphore(1);
      SAzulCiano1 = new Semaphore(0);
    }

    for (int i = 0; i < SBrancoCinza.length; i++) {
      SBrancoCinza[i] = new Semaphore(1);
      SBrancoCinza1 = new Semaphore(0);
    }

    SBrancoRoxo = new Semaphore(1);
    SBrancoRoxo1 = new Semaphore(0);

    for (int i = 0; i < SBrancoPreto.length; i++) {
      SBrancoPreto[i] = new Semaphore(1);
    }

    for (int i = 0; i < SBrancoCiano.length; i++) {
      SBrancoCiano[i] = new Semaphore(1);
    }

    for (int i = 0; i < SRosaCinza.length; i++) {
      SRosaCinza[i] = new Semaphore(1);
    }

    SRosaRoxo = new Semaphore(0);

    SRosaPreto = new Semaphore(1);
    SRosaPreto1 = new Semaphore(0);

    for (int i = 0; i < SRosaCinza.length; i++) {
      SRosaCiano[i] = new Semaphore(1);
    }

    SCinzaRoxo = new Semaphore(1);
    SCinzaRoxo1 = new Semaphore(0);

    for (int i = 0; i < SCinzaPreto.length; i++) {
      SCinzaPreto[i] = new Semaphore(1);
      SCinzaPreto1 = new Semaphore(0);
    }

    for (int i = 0; i < SCinzaCiano.length; i++) {
      SCinzaCiano[i] = new Semaphore(1);
    }

    for (int i = 0; i < SRoxoPreto.length; i++) {
      SRoxoPreto[i] = new Semaphore(1);
    }

    for (int i = 0; i < SRoxoCiano.length; i++) {
      SRoxoCiano[i] = new Semaphore(1);
    }

    for (int i = 0; i < SPretoCiano.length; i++) {
      SPretoCiano[i] = new Semaphore(1);
    }

  }

  /*
   * *********************
   * Metodo: initialize
   * Funcao: metodo chamado na inicializacao da interface; configura sliders,
   * imagens, threads e semaforos
   * Parametros: URL location - nao utilizado
   * ResourceBundle resources - nao utilizado
   * Retorno: void
   **********************
   */
  @Override
  public void initialize(URL location, ResourceBundle resources) {

    iniciarSemaforos();

    // instancia as threads
    this.caminhoneteVermelha = new Caminhonete(0, carroVermelho, 265, 557);
    this.caminhoneteAzul = new Caminhonete(1, carroAzul, 265, 332);
    this.caminhoneteBranca = new Caminhonete(2, carroBranco, 833, 561);
    this.caminhoneteRosa = new Caminhonete(3, carroRosa, 833, 227);
    this.caminhoneteCinza = new Caminhonete(4, carroCinza, 491, 557);
    this.caminhoneteRoxa = new Caminhonete(5, carroRoxo, 525, 231);
    this.caminhonetePreta = new Caminhonete(6, carroPreto, 608, 40);
    this.caminhoneteCiano = new Caminhonete(7, carroCiano, 380, 556);

    // seta os controllers
    caminhoneteVermelha.setController(this);
    caminhoneteAzul.setController(this);
    caminhoneteBranca.setController(this);
    caminhoneteRosa.setController(this);
    caminhoneteCinza.setController(this);
    caminhoneteRoxa.setController(this);
    caminhonetePreta.setController(this);
    caminhoneteCiano.setController(this);

    // Configura sliders e listeners para atualizar velocidades
    configurarSlider(sliderVermelho, caminhoneteVermelha);
    configurarSlider(sliderAzul, caminhoneteAzul);
    configurarSlider(sliderBranco, caminhoneteBranca);
    configurarSlider(sliderRosa, caminhoneteRosa);
    configurarSlider(sliderCinza, caminhoneteCinza);
    configurarSlider(sliderRoxo, caminhoneteRoxa);
    configurarSlider(sliderPreto, caminhonetePreta);
    configurarSlider(sliderCiano, caminhoneteCiano);

    abertoVermelho.setVisible(false);
    abertoAzul.setVisible(false);
    abertoBranco.setVisible(false);
    abertoRosa.setVisible(false);
    abertoCinza.setVisible(false);
    abertoRoxo.setVisible(false);
    abertoPreto.setVisible(false);
    abertoCiano.setVisible(false);

    percurso01.setVisible(false);
    percurso06.setVisible(false);
    percurso10.setVisible(false);
    percurso07.setVisible(false);
    percurso13.setVisible(false);
    percurso18.setVisible(false);
    percurso24.setVisible(false);
    percurso21.setVisible(false);

    // inicia as threads
    caminhoneteVermelha.start();
    caminhoneteAzul.start();
    caminhoneteBranca.start();
    caminhoneteRosa.start();
    caminhoneteCinza.start();
    caminhoneteRoxa.start();
    caminhonetePreta.start();
    caminhoneteCiano.start();
  }

  /*
   * *********************
   * Metodo: resetarTudo
   * Funcao: reinicia todas as threads, sliders, semaforos e visibilidade de
   * elementos graficos
   * Parametros: ActionEvent event - evento gerado pelo clique no botao
   * Retorno: void
   **********************
   */
  @FXML
  void resetarTudo(ActionEvent event) {

    // parar threads
    caminhoneteVermelha.stop();
    caminhoneteAzul.stop();
    caminhoneteBranca.stop();
    caminhoneteRosa.stop();
    caminhoneteCinza.stop();
    caminhoneteRoxa.stop();
    caminhonetePreta.stop();
    caminhoneteCiano.stop();

    iniciarSemaforos();

    // instancia as threads
    this.caminhoneteVermelha = new Caminhonete(0, carroVermelho, 265, 557);
    this.caminhoneteAzul = new Caminhonete(1, carroAzul, 265, 332);
    this.caminhoneteBranca = new Caminhonete(2, carroBranco, 833, 561);
    this.caminhoneteRosa = new Caminhonete(3, carroRosa, 833, 227);
    this.caminhoneteCinza = new Caminhonete(4, carroCinza, 491, 557);
    this.caminhoneteRoxa = new Caminhonete(5, carroRoxo, 525, 231);
    this.caminhonetePreta = new Caminhonete(6, carroPreto, 608, 40);
    this.caminhoneteCiano = new Caminhonete(7, carroCiano, 380, 556);

    // seta os controllers
    caminhoneteVermelha.setController(this);
    caminhoneteAzul.setController(this);
    caminhoneteBranca.setController(this);
    caminhoneteRosa.setController(this);
    caminhoneteCinza.setController(this);
    caminhoneteRoxa.setController(this);
    caminhonetePreta.setController(this);
    caminhoneteCiano.setController(this);

    // Configura sliders e listeners para atualizar velocidades
    configurarSlider(sliderVermelho, caminhoneteVermelha);
    configurarSlider(sliderAzul, caminhoneteAzul);
    configurarSlider(sliderBranco, caminhoneteBranca);
    configurarSlider(sliderRosa, caminhoneteRosa);
    configurarSlider(sliderCinza, caminhoneteCinza);
    configurarSlider(sliderRoxo, caminhoneteRoxa);
    configurarSlider(sliderPreto, caminhonetePreta);
    configurarSlider(sliderCiano, caminhoneteCiano);

    // Reseta posicoes e rotacoes dos carros
    Platform.runLater(() -> {
      carroVermelho.setRotate(0);
      carroAzul.setRotate(0);
      carroBranco.setRotate(0);
      carroRosa.setRotate(0);
      carroCinza.setRotate(0);
      carroRoxo.setRotate(0);
      carroPreto.setRotate(0);
      carroCiano.setRotate(0);
    });

    // Reset sliders
    sliderVermelho.setValue(10);
    sliderAzul.setValue(10);
    sliderBranco.setValue(10);
    sliderRosa.setValue(10);
    sliderCinza.setValue(10);
    sliderRoxo.setValue(10);
    sliderPreto.setValue(10);
    sliderCiano.setValue(10);

    abertoVermelho.setVisible(false);
    abertoAzul.setVisible(false);
    abertoBranco.setVisible(false);
    abertoRosa.setVisible(false);
    abertoCinza.setVisible(false);
    abertoRoxo.setVisible(false);
    abertoPreto.setVisible(false);
    abertoCiano.setVisible(false);

    fechadoVermelho.setVisible(true);
    fechadoAzul.setVisible(true);
    fechadoBranco.setVisible(true);
    fechadoRosa.setVisible(true);
    fechadoCinza.setVisible(true);
    fechadoRoxo.setVisible(true);
    fechadoPreto.setVisible(true);
    fechadoCiano.setVisible(true);

    percurso01.setVisible(false);
    percurso06.setVisible(false);
    percurso10.setVisible(false);
    percurso07.setVisible(false);
    percurso13.setVisible(false);
    percurso18.setVisible(false);
    percurso24.setVisible(false);
    percurso21.setVisible(false);

    pausadoVermelho = 0;
    pausadoAzul = 0;
    pausadoBranco = 0;
    pausadoRosa = 0;
    pausadoCinza = 0;
    pausadoRoxo = 0;
    pausadoPreto = 0;
    pausadoCiano = 0;

    // Iniciar threads
    caminhoneteVermelha.start();
    caminhoneteAzul.start();
    caminhoneteBranca.start();
    caminhoneteRosa.start();
    caminhoneteCinza.start();
    caminhoneteRoxa.start();
    caminhonetePreta.start();
    caminhoneteCiano.start();
  }

  /*
   * *********************
   * Metodo: configurarSlider
   * Funcao: configura o comportamento do slider para alterar a velocidade da
   * caminhonete
   * Parametros: Slider slider - componente de interface
   * Caminhonete caminhonete - objeto cuja velocidade sera alterada
   * Retorno: void
   **********************
   */
  private void configurarSlider(Slider slider, Caminhonete caminhonete) {
    slider.setMin(1);
    slider.setMax(20);
    slider.setValue(10); // valor inicial intermediario

    // define velocidade inicial (inverte a logica: valor alto = mais rapido)
    caminhonete.setVelocidade(25 - (int) slider.getValue());

    // atualiza dinamicamente quando o slider mudar
    slider.valueProperty().addListener((obs, oldVal, newVal) -> {
      caminhonete.setVelocidade(25 - newVal.intValue());
    });
  }

  /*
   * *********************
   * Metodo: vermelhoVer
   * Funcao: alterna entre estado fechado e aberto do semaforo da cor vermelho,
   * mostrando ou ocultando o percurso
   * Parametros: ActionEvent event - evento gerado pelo clique no botao
   * Retorno: void
   **********************
   */
  @FXML
  void vermelhoVer(ActionEvent event) {

    if (clicadoVermelho == 0) {
      fechadoVermelho.setVisible(false);
      abertoVermelho.setVisible(true);
      percurso01.setVisible(true);
      clicadoVermelho++;
    } else if (clicadoVermelho == 1) {
      fechadoVermelho.setVisible(true);
      abertoVermelho.setVisible(false);
      percurso01.setVisible(false);
      clicadoVermelho--;
    }

  }

  /*
   * *********************
   * Metodo: azulVer
   * Funcao: alterna entre estado fechado e aberto do semaforo da cor azul,
   * mostrando ou ocultando o percurso
   * Parametros: ActionEvent event - evento gerado pelo clique no botao
   * Retorno: void
   **********************
   */

  @FXML
  void azulVer(ActionEvent event) {
    if (clicadoAzul == 0) {
      fechadoAzul.setVisible(false);
      abertoAzul.setVisible(true);
      percurso06.setVisible(true);
      clicadoAzul++;
    } else if (clicadoAzul == 1) {
      fechadoAzul.setVisible(true);
      abertoAzul.setVisible(false);
      percurso06.setVisible(false);
      clicadoAzul--;
    }
  }

  /*
   * *********************
   * Metodo: brancoVer
   * Funcao: alterna entre estado fechado e aberto do semaforo da cor branco,
   * mostrando ou ocultando o percurso
   * Parametros: ActionEvent event - evento gerado pelo clique no botao
   * Retorno: void
   **********************
   */

  @FXML
  void brancoVer(ActionEvent event) {
    if (clicadoBranco == 0) {
      fechadoBranco.setVisible(false);
      abertoBranco.setVisible(true);
      percurso10.setVisible(true);
      clicadoBranco++;
    } else if (clicadoBranco == 1) {
      fechadoBranco.setVisible(true);
      abertoBranco.setVisible(false);
      percurso10.setVisible(false);
      clicadoBranco--;
    }
  }

  /*
   * *********************
   * Metodo: rosaVer
   * Funcao: alterna entre estado fechado e aberto do semaforo da cor rosa,
   * mostrando ou ocultando o percurso
   * Parametros: ActionEvent event - evento gerado pelo clique no botao
   * Retorno: void
   **********************
   */

  @FXML
  void rosaVer(ActionEvent event) {
    if (clicadoRosa == 0) {
      fechadoRosa.setVisible(false);
      abertoRosa.setVisible(true);
      percurso07.setVisible(true);
      clicadoRosa++;
    } else if (clicadoRosa == 1) {
      fechadoRosa.setVisible(true);
      abertoRosa.setVisible(false);
      percurso07.setVisible(false);
      clicadoRosa--;
    }
  }

  /*
   * *********************
   * Metodo: cinzaVer
   * Funcao: alterna entre estado fechado e aberto do semaforo da cor cinza,
   * mostrando ou ocultando o percurso
   * Parametros: ActionEvent event - evento gerado pelo clique no botao
   * Retorno: void
   **********************
   */

  @FXML
  void cinzaVer(ActionEvent event) {
    if (clicadoCinza == 0) {
      fechadoCinza.setVisible(false);
      abertoCinza.setVisible(true);
      percurso13.setVisible(true);
      clicadoCinza++;
    } else if (clicadoCinza == 1) {
      fechadoCinza.setVisible(true);
      abertoCinza.setVisible(false);
      percurso13.setVisible(false);
      clicadoCinza--;
    }
  }

  /*
   * *********************
   * Metodo: roxoVer
   * Funcao: alterna entre estado fechado e aberto do semaforo da cor roxo,
   * mostrando ou ocultando o percurso
   * Parametros: ActionEvent event - evento gerado pelo clique no botao
   * Retorno: void
   **********************
   */

  @FXML
  void roxoVer(ActionEvent event) {
    if (clicadoRoxo == 0) {
      fechadoRoxo.setVisible(false);
      abertoRoxo.setVisible(true);
      percurso18.setVisible(true);
      clicadoRoxo++;
    } else if (clicadoRoxo == 1) {
      fechadoRoxo.setVisible(true);
      abertoRoxo.setVisible(false);
      percurso18.setVisible(false);
      clicadoRoxo--;
    }
  }

  /*
   * *********************
   * Metodo: pretoVer
   * Funcao: alterna entre estado fechado e aberto do semaforo da cor preto,
   * mostrando ou ocultando o percurso
   * Parametros: ActionEvent event - evento gerado pelo clique no botao
   * Retorno: void
   **********************
   */

  @FXML
  void pretoVer(ActionEvent event) {
    if (clicadoPreto == 0) {
      fechadoPreto.setVisible(false);
      abertoPreto.setVisible(true);
      percurso24.setVisible(true);
      clicadoPreto++;
    } else if (clicadoPreto == 1) {
      fechadoPreto.setVisible(true);
      abertoPreto.setVisible(false);
      percurso24.setVisible(false);
      clicadoPreto--;
    }
  }

  /*
   * *********************
   * Metodo: cianoVer
   * Funcao: alterna entre estado fechado e aberto do semaforo da cor ciano,
   * mostrando ou ocultando o percurso
   * Parametros: ActionEvent event - evento gerado pelo clique no botao
   * Retorno: void
   **********************
   */

  @FXML
  void cianoVer(ActionEvent event) {
    if (clicadoCiano == 0) {
      fechadoCiano.setVisible(false);
      abertoCiano.setVisible(true);
      percurso21.setVisible(true);
      clicadoCiano++;
    } else if (clicadoCiano == 1) {
      fechadoCiano.setVisible(true);
      abertoCiano.setVisible(false);
      percurso21.setVisible(false);
      clicadoCiano--;
    }
  }
  /*
   * *********************
   * Metodo: pausarVermelho
   * Funcao: pausa ou retoma a execucao da thread da caminhonete da cor vermelho
   * Parametros: ActionEvent event - evento gerado pelo clique no botao
   * Retorno: void
   **********************
   */

  @FXML
  void pausarVermelho(ActionEvent event) {
    if (pausadoVermelho == 0) {
      caminhoneteVermelha.suspend();
      pausadoVermelho++;
    } else {
      caminhoneteVermelha.resume();
      pausadoVermelho--;
    }
  }

  /*
   * *********************
   * Metodo: pausarAzul
   * Funcao: pausa ou retoma a execucao da thread da caminhonete da cor azul
   * Parametros: ActionEvent event - evento gerado pelo clique no botao
   * Retorno: void
   **********************
   */

  @FXML
  void pausarAzul(ActionEvent event) {
    if (pausadoAzul == 0) {
      caminhoneteAzul.suspend();
      pausadoAzul++;
    } else {
      caminhoneteAzul.resume();
      pausadoAzul--;
    }
  }

  /*
   * *********************
   * Metodo: pausarBranco
   * Funcao: pausa ou retoma a execucao da thread da caminhonete da cor branco
   * Parametros: ActionEvent event - evento gerado pelo clique no botao
   * Retorno: void
   **********************
   */

  @FXML
  void pausarBranco(ActionEvent event) {
    if (pausadoBranco == 0) {
      caminhoneteBranca.suspend();
      pausadoBranco++;
    } else {
      caminhoneteBranca.resume();
      pausadoBranco--;
    }
  }

  /*
   * *********************
   * Metodo: pausarRosa
   * Funcao: pausa ou retoma a execucao da thread da caminhonete da cor rosa
   * Parametros: ActionEvent event - evento gerado pelo clique no botao
   * Retorno: void
   **********************
   */

  @FXML
  void pausarRosa(ActionEvent event) {
    if (pausadoRosa == 0) {
      caminhoneteRosa.suspend();
      pausadoRosa++;
    } else {
      caminhoneteRosa.resume();
      pausadoRosa--;
    }
  }

  /*
   * *********************
   * Metodo: pausarCinza
   * Funcao: pausa ou retoma a execucao da thread da caminhonete da cor cinza
   * Parametros: ActionEvent event - evento gerado pelo clique no botao
   * Retorno: void
   **********************
   */

  @FXML
  void pausarCinza(ActionEvent event) {
    if (pausadoCinza == 0) {
      caminhoneteCinza.suspend();
      pausadoCinza++;
    } else {
      caminhoneteCinza.resume();
      pausadoCinza--;
    }
  }

  /*
   * *********************
   * Metodo: pausarRoxo
   * Funcao: pausa ou retoma a execucao da thread da caminhonete da cor roxo
   * Parametros: ActionEvent event - evento gerado pelo clique no botao
   * Retorno: void
   **********************
   */

  @FXML
  void pausarRoxo(ActionEvent event) {
    if (pausadoRoxo == 0) {
      caminhoneteRoxa.suspend();
      pausadoRoxo++;
    } else {
      caminhoneteRoxa.resume();
      pausadoRoxo--;
    }
  }

  /*
   * *********************
   * Metodo: pausarPreto
   * Funcao: pausa ou retoma a execucao da thread da caminhonete da cor preto
   * Parametros: ActionEvent event - evento gerado pelo clique no botao
   * Retorno: void
   **********************
   */

  @FXML
  void pausarPreto(ActionEvent event) {
    if (pausadoPreto == 0) {
      caminhonetePreta.suspend();
      pausadoPreto++;
    } else {
      caminhonetePreta.resume();
      pausadoPreto--;
    }
  }

  /*
   * *********************
   * Metodo: pausarCiano
   * Funcao: pausa ou retoma a execucao da thread da caminhonete da cor ciano
   * Parametros: ActionEvent event - evento gerado pelo clique no botao
   * Retorno: void
   **********************
   */

  @FXML
  void pausarCiano(ActionEvent event) {
    if (pausadoCiano == 0) {
      caminhoneteCiano.suspend();
      pausadoCiano++;
    } else {
      caminhoneteCiano.resume();
      pausadoCiano--;
    }
  }

  /*
   * *********************
   * Metodo: percorrerPercurso
   * Funcao: executa o percurso da caminhonete com base no seu identificador,
   * realizando movimentacoes e controle de semaforos para evitar colisoes
   * Parametros: int identificador - identifica qual caminhonete deve seguir o
   * percurso
   * Retorno: void
   **********************
   */

  public void percorrerPercurso(int identificador) throws InterruptedException {
    switch (identificador) {
      case 0: // caminhonete vermelha
        // carroVermelho.setVisible(false);

        caminhoneteVermelha.moverParaCima(137);
        SVerAzul2.release();// libera 50-51
        caminhoneteVermelha.moverParaCima(48);
        SVerAzul1.acquire();// protege 28-17-2-1-5
        SVerCiano[0].acquire(); // protege 28
        caminhoneteVermelha.moverParaCima(105);
        SVerBranco2.release(); // libera 50-51-39
        SVerPreto2.release(); // libera 50 - 51 - 39
        SVerRosa[0].acquire(); // protege 5 - 1 -2 -17
        caminhoneteVermelha.moverParaCima(100);
        SVerCiano[0].release(); // libera 28
        caminhoneteVermelha.moverParaCima(162);
        Platform.runLater(() -> caminhoneteVermelha.caminhonete.setRotate(90));
        caminhoneteVermelha.moverParaDireita(70);
        SVerCiano[1].acquire(); // protege 05
        caminhoneteVermelha.moverParaDireita(120);
        SVerCinza[0].acquire(); // protege 07
        caminhoneteVermelha.moverParaDireita(36);
        Platform.runLater(() -> caminhoneteVermelha.caminhonete.setRotate(180));
        caminhoneteVermelha.moverParaBaixo(30);
        SVerCiano[1].release(); // libera 05
        SVerAzul1.release();// libera 28-17-2-1-5
        SVerRosa[0].release(); // libera 5 - 1 -2 -17
        caminhoneteVermelha.moverParaBaixo(45);
        SVerPreto1.acquire();// protege 27 - 16 -14 -11-10-9
        SVerAzul[1].acquire();// protege 9
        caminhoneteVermelha.moverParaBaixo(31);
        Platform.runLater(() -> caminhoneteVermelha.caminhonete.setRotate(90));
        caminhoneteVermelha.moverParaDireita(30);
        SVerCinza[0].release(); // libera 07
        caminhoneteVermelha.moverParaDireita(86);
        Platform.runLater(() -> caminhoneteVermelha.caminhonete.setRotate(0));
        caminhoneteVermelha.moverParaCima(36);
        SVerAzul[1].release();// libera 9
        SVerRosa1.acquire(); // protege 11 - 14- 16 -27
        caminhoneteVermelha.moverParaCima(37);
        SVerCiano[2].acquire(); // protege 11
        SVerAzul[0].acquire();// protege 11-14-16
        SVerCinza[1].acquire(); // protege 11
        caminhoneteVermelha.moverParaCima(34);
        Platform.runLater(() -> caminhoneteVermelha.caminhonete.setRotate(90));
        caminhoneteVermelha.moverParaDireita(132);
        SVerCinza[1].release(); // libera 11
        SVerCiano[2].release(); // libera 11
        caminhoneteVermelha.moverParaDireita(93);
        Platform.runLater(() -> caminhoneteVermelha.caminhonete.setRotate(180));
        caminhoneteVermelha.moverParaBaixo(148);
        SVerAzul[0].release();// libera 11-14-16
        SVerAzul[2].acquire(); // protege 38-49-60-59
        SVerBranco1.acquire();// protege 59 - 60- 49
        SVerRoxo.acquire(); // protege 38-49-60-59
        SVerCiano[3].acquire(); // protege 38
        caminhoneteVermelha.moverParaBaixo(120);
        SVerRosa1.release(); // libera 11 - 14- 16 -27
        SVerPreto1.release();// libera 27 - 16 -14 -11-10-9
        caminhoneteVermelha.moverParaBaixo(100);
        SVerCiano[3].release(); // libera 38
        caminhoneteVermelha.moverParaBaixo(190);
        Platform.runLater(() -> caminhoneteVermelha.caminhonete.setRotate(-90));
        caminhoneteVermelha.moverParaEsquerda(70);
        SVerCinza[2].acquire(); // protege 47-58
        SVerCiano[4].acquire(); // protege 58 - 47
        SVerBranco[0].acquire(); // protege 35
        caminhoneteVermelha.moverParaEsquerda(45);
        Platform.runLater(() -> caminhoneteVermelha.caminhonete.setRotate(0));
        caminhoneteVermelha.moverParaCima(50);
        SVerAzul[2].release();// libera 38-49-60-59
        SVerBranco1.release(); // libera 59 - 60- 49
        SVerRoxo.release(); // libera 59 - 60- 49
        SVerAzul[3].acquire(); // protege 35-47
        caminhoneteVermelha.moverParaCima(127);
        SVerPreto[2].acquire(); // protege 35
        caminhoneteVermelha.moverParaCima(47);
        Platform.runLater(() -> caminhoneteVermelha.caminhonete.setRotate(-90));
        caminhoneteVermelha.moverParaEsquerda(30);
        SVerCinza[2].release(); // libera 47-58
        SVerCiano[4].release(); // libera 58 - 47
        caminhoneteVermelha.moverParaEsquerda(80);
        Platform.runLater(() -> caminhoneteVermelha.caminhonete.setRotate(0));
        caminhoneteVermelha.moverParaCima(48);
        SVerBranco[0].release();// libera 35
        SVerPreto[2].release(); // libera 35
        SVerAzul[3].release(); // libera 35-47
        caminhoneteVermelha.moverParaCima(20);
        SVerAzul[4].acquire(); // protege 22
        SVerRosa[1].acquire(); // protege 22
        SVerRoxo1.acquire(); // protege 22-32
        SVerPreto[0].acquire(); // // protege 20, 22 - 21, 32 (cruzamento)
        SVerCinza[3].acquire(); // protege 32
        caminhoneteVermelha.moverParaCima(40);
        Platform.runLater(() -> caminhoneteVermelha.caminhonete.setRotate(-90));
        caminhoneteVermelha.moverParaEsquerda(75);
        // vermelho cinza [3] acquire
        // vermelho preto [0] acquire era aqui
        caminhoneteVermelha.moverParaEsquerda(42);
        Platform.runLater(() -> caminhoneteVermelha.caminhonete.setRotate(-180));
        caminhoneteVermelha.moverParaBaixo(30);
        SVerAzul[4].release(); // libera 22
        SVerRosa[1].release(); // libera 22
        SVerPreto[0].release(); // libera 20, 22 - 21, 32 (cruzamento)
        caminhoneteVermelha.moverParaBaixo(40);
        SVerAzul[5].acquire(); // protege 31

        SVerBranco[1].acquire();// protege 31
        caminhoneteVermelha.moverParaBaixo(37);
        Platform.runLater(() -> caminhoneteVermelha.caminhonete.setRotate(-90));
        caminhoneteVermelha.moverParaEsquerda(20);
        SVerRoxo1.release();// protege 22-32
        SVerCinza[3].release(); // libera a 32
        caminhoneteVermelha.moverParaEsquerda(51);
        SVerCiano1.acquire(); // protege 52-41
        SVerPreto[1].acquire(); // protege 29, 31 - 30 41(cruzamento)
        caminhoneteVermelha.moverParaEsquerda(40);
        Platform.runLater(() -> caminhoneteVermelha.caminhonete.setRotate(-180));
        caminhoneteVermelha.moverParaBaixo(50);
        SVerPreto[1].release(); // libera 29, 31 - 30 41(cruzamento)
        SVerAzul[5].release(); // libera 31
        SVerBranco[1].release();// libera 31
        caminhoneteVermelha.moverParaBaixo(30);
        SVerAzul[6].acquire(); // protege entre 40,42 - 41,52
        caminhoneteVermelha.moverParaBaixo(80);
        SVerAzul[6].release(); // libera - entre 40,42 - 41,52
        caminhoneteVermelha.moverParaBaixo(20);
        SVerAzul2.acquire();// protege 50-51
        SVerBranco2.acquire(); // protege 50-51-39
        SVerPreto2.acquire(); // protege 50 - 51 - 39
        caminhoneteVermelha.moverParaBaixo(45);
        Platform.runLater(() -> caminhoneteVermelha.caminhonete.setRotate(-90));
        caminhoneteVermelha.moverParaEsquerda(30);
        SVerCiano1.release(); // libera 52-41
        caminhoneteVermelha.moverParaEsquerda(81);
        Platform.runLater(() -> caminhoneteVermelha.caminhonete.setRotate(0));

        break;

      case 1: // caminhonete azul
        // carroAzul.setVisible(false);
        caminhoneteAzul.moverParaCima(20);
        SAzulPreto2.release(); // libera 29
        caminhoneteAzul.moverParaCima(40);
        SAzulRosa[0].acquire(); // protege 16 - 14 -11 - 08 -05 - 01 -02 - 17
        caminhoneteAzul.moverParaCima(100);
        SAzulCiano1.release(); // libera 29 - 28
        caminhoneteAzul.moverParaCima(169);
        Platform.runLater(() -> caminhoneteAzul.caminhonete.setRotate(90));
        caminhoneteAzul.moverParaDireita(80);
        SAzulCiano[1].acquire(); // protege 05 - 08 - 11
        caminhoneteAzul.moverParaDireita(100);
        SAzulCinza[0].acquire(); // protege 8 - 11
        caminhoneteAzul.moverParaDireita(82);
        SVerAzul1.release();// libera 28-17-2-1-5
        SVerAzul[0].acquire();// protege 11-14-16
        SAzulPreto1.acquire(); // protege 11 - 14 - 16
        caminhoneteAzul.moverParaDireita(250);
        SAzulCinza[0].release(); // libera 8 - 11
        SAzulCiano[1].release(); // libera 05 - 08 - 11
        caminhoneteAzul.moverParaDireita(55);
        Platform.runLater(() -> caminhoneteAzul.caminhonete.setRotate(-180));
        caminhoneteAzul.moverParaBaixo(106);
        Platform.runLater(() -> caminhoneteAzul.caminhonete.setRotate(-90));
        caminhoneteAzul.moverParaEsquerda(30);
        SVerAzul[0].release();// libera 11-14-16
        SAzulPreto1.release(); // libera 11-14-16
        SAzulRosa[0].release(); // libera 16 - 14 -11 - 08 -05 - 01 -02 - 17
        caminhoneteAzul.moverParaEsquerda(30);
        SAzulCiano[3].acquire(); // protege 13, 25 - 12, 15
        SAzulCinza[1].acquire();// protege 13, 25 - 12, 15
        caminhoneteAzul.moverParaEsquerda(105);
        SAzulCiano[3].release();// libera 13, 25 - 12, 15
        SAzulCinza[1].release();// libera 13, 25 - 12, 15
        caminhoneteAzul.moverParaEsquerda(30);
        SAzulPreto[0].acquire(); // protege 09
        SVerAzul[1].acquire();// protege 9
        caminhoneteAzul.moverParaEsquerda(90);
        SAzulCinza[8].acquire(); // protege 7, 21 - 06, 09
        caminhoneteAzul.moverParaEsquerda(95);
        SVerAzul[1].release();// libera 9
        SAzulPreto[0].release(); // libera 09
        SAzulCinza[8].release(); // libera 7, 21 - 06, 09
        SAzulCiano[0].acquire(); // protege 19
        caminhoneteAzul.moverParaEsquerda(73);
        Platform.runLater(() -> caminhoneteAzul.caminhonete.setRotate(-180));
        caminhoneteAzul.moverParaBaixo(45);
        SAzulRoxo1.acquire(); // protege 22 - 24 - 26 - 38 - 49 - 60 - 59 - 57 - 55
        caminhoneteAzul.moverParaBaixo(30);
        SAzulRosa[1].acquire(); // protege 20 - 22 - 24 -26
        SAzulPreto[1].acquire(); // protege 20
        caminhoneteAzul.moverParaBaixo(46);
        Platform.runLater(() -> caminhoneteAzul.caminhonete.setRotate(90));
        caminhoneteAzul.moverParaDireita(30);
        SAzulCiano[0].release(); // protege 19
        caminhoneteAzul.moverParaDireita(50);
        SAzulCinza[7].acquire(); // protege 20, 22 - 21, 32
        SVerAzul[4].acquire(); // protege 22
        caminhoneteAzul.moverParaDireita(70);
        SAzulCinza[7].release(); // libera 20, 22 - 21, 32
        SAzulPreto[1].release(); // libera 20
        caminhoneteAzul.moverParaDireita(90);
        SVerAzul[4].release(); // libera 22
        caminhoneteAzul.moverParaDireita(40);
        SAzulPreto[5].acquire(); // protege 26
        SAzulCiano[4].acquire();// protege 26 - 38
        SAzulCinza[2].acquire(); // protege 25,36 - 24, 26
        caminhoneteAzul.moverParaDireita(80);
        SAzulCinza[2].release(); // libera 25,36 - 24, 26
        caminhoneteAzul.moverParaDireita(60);
        SVerAzul[2].acquire();// protege 38-49-60-59
        caminhoneteAzul.moverParaDireita(33);
        Platform.runLater(() -> caminhoneteAzul.caminhonete.setRotate(-180));
        caminhoneteAzul.moverParaBaixo(30);
        SAzulPreto[5].release(); // libera 26
        SAzulRosa[1].release(); // libera 20 - 22 - 24 -26
        caminhoneteAzul.moverParaBaixo(35);
        SAzulBranco1.acquire(); // protege 50 - 51 -53 - 55 - 57 - 59 - 60 - 49
        caminhoneteAzul.moverParaBaixo(69);
        SAzulCiano[4].release();// libera 26 - 38
        caminhoneteAzul.moverParaBaixo(200);
        Platform.runLater(() -> caminhoneteAzul.caminhonete.setRotate(-90));
        caminhoneteAzul.moverParaEsquerda(65);
        SAzulCiano[6].acquire(); // protege 53 - 55 - 57
        SAzulCinza[4].acquire(); // protege 55 -- 57
        caminhoneteAzul.moverParaEsquerda(100);
        SVerAzul[2].release();// libera 38-49-60-59
        caminhoneteAzul.moverParaEsquerda(90);
        SAzulPreto[2].acquire(); // protege 50 - 51 - 53
        caminhoneteAzul.moverParaEsquerda(100);
        SAzulCinza[4].release();// libera 55 - 57
        SAzulRoxo1.release(); // libera 22 - 24 - 26 - 38 - 49 - 60 - 59 - 57 - 55
        caminhoneteAzul.moverParaEsquerda(63);
        SVerAzul2.acquire();// protege 50-51
        caminhoneteAzul.moverParaEsquerda(60);
        SAzulCiano[6].release(); // protege 53 - 55 - 57
        caminhoneteAzul.moverParaEsquerda(90);
        Platform.runLater(() -> caminhoneteAzul.caminhonete.setRotate(0));
        caminhoneteAzul.moverParaCima(112);
        Platform.runLater(() -> caminhoneteAzul.caminhonete.setRotate(90));
        caminhoneteAzul.moverParaDireita(40);
        SAzulPreto[2].release(); // protege 50 - 51 - 53
        SAzulBranco1.release(); // libera 50 - 51 -53 - 55 - 57 - 59 - 60 - 49
        SVerAzul2.release();// libera 50-51
        caminhoneteAzul.moverParaDireita(40);
        SVerAzul[6].acquire(); // protege entre 40,42 - 41,52 (cruzamento)
        SAzulCiano[7].acquire(); // protege entre 40,42 - 41,52 (cruzamento)
        caminhoneteAzul.moverParaDireita(60);
        SAzulCiano[7].release(); // libera entre 40,42 - 41,52 (cruzamento)
        SVerAzul[6].release(); // libera entre 40,42 - 41,52 (cruzamento)
        caminhoneteAzul.moverParaDireita(40);
        SAzulPreto[3].acquire(); // protege 44
        SAzulCinza[5].acquire(); // protege 43, 54 - 42, 44
        SAzulRoxo[1].acquire(); // protege 43,54 - 42,44
        caminhoneteAzul.moverParaDireita(100);
        SAzulCinza[5].release(); // libera 43, 54 - 42, 44
        SAzulRoxo[1].release(); // protege 43,54 - 42,44
        caminhoneteAzul.moverParaDireita(80);
        SAzulPreto[3].release(); // libera 44
        caminhoneteAzul.moverParaDireita(45);
        // SAzulCinza[3].acquire(); // protege 47
        SAzulBranco.acquire(); // Protege 29 -31 - 33 - 35
        caminhoneteAzul.moverParaDireita(5);
        SAzulCiano[5].acquire(); // protege 47
        caminhoneteAzul.moverParaDireita(5);
        SVerAzul[3].acquire();// protege 35-47
        caminhoneteAzul.moverParaDireita(38);
        Platform.runLater(() -> caminhoneteAzul.caminhonete.setRotate(0));
        caminhoneteAzul.moverParaCima(80);
        SAzulPreto[4].acquire(); // protege 35
        caminhoneteAzul.moverParaCima(34);
        Platform.runLater(() -> caminhoneteAzul.caminhonete.setRotate(-90));
        caminhoneteAzul.moverParaEsquerda(30);
        // SAzulCinza[3].release(); // libera 47
        SAzulCiano[5].release(); // libera 47
        caminhoneteAzul.moverParaEsquerda(150);
        SAzulPreto[4].release(); // libera 35
        SVerAzul[3].release();// libera 35-47
        SVerAzul[5].acquire(); // protege 31
        SAzulCinza[6].acquire(); // protege 31, 33 - 43, 32
        SAzulRoxo[0].acquire(); // protege 31, 33 - 43, 32
        caminhoneteAzul.moverParaEsquerda(80);
        SAzulCinza[6].release(); // libera 31, 33 - 43, 32
        SAzulRoxo[0].release(); // libera 31, 33 - 43, 32
        caminhoneteAzul.moverParaEsquerda(35);
        SAzulPreto2.acquire(); // protege 29
        SAzulCiano1.acquire(); // protege 29 - 28
        caminhoneteAzul.moverParaEsquerda(65);
        SVerAzul[5].release(); // libera 31
        caminhoneteAzul.moverParaEsquerda(61);
        SVerAzul1.acquire();// protege 28-17-2-1-5
        caminhoneteAzul.moverParaEsquerda(32);
        SAzulBranco.release(); // Protege 29 -31 - 33 - 35

        break;
      case 2: // caminhonete branca
        // carroBranco.setVisible(false);
        caminhoneteBranca.moverParaCima(180);
        SBrancoCiano[0].acquire(); // protege 37
        caminhoneteBranca.moverParaCima(44);
        Platform.runLater(() -> caminhoneteBranca.caminhonete.setRotate(-90));
        caminhoneteBranca.moverParaEsquerda(67);
        SBrancoRoxo1.release(); // libera 55 - 57 - 59 - 60 - 49
        SVerBranco1.release(); // libera 59 - 60- 49
        SAzulBranco1.release(); // libera 50 - 51 -53 - 55 - 57 - 59 - 60 - 49
        SVerBranco[0].acquire(); // protege 35
        SBrancoPreto[0].acquire(); // protege 35
        SAzulBranco.acquire(); // Protege 29 -31 - 33 - 35
        SBrancoCinza[1].acquire(); // protege 35, 37 - 36, 47
        caminhoneteBranca.moverParaEsquerda(80);
        SBrancoCiano[0].release(); // libera 37
        SBrancoCinza[1].release(); // libera 35, 37 - 36, 47
        caminhoneteBranca.moverParaEsquerda(100);
        SVerBranco[0].release();// libera 35
        SBrancoPreto[0].release();// libera 35
        caminhoneteBranca.moverParaEsquerda(50);
        SBrancoRoxo.acquire(); // protege 31, 33 - 43, 32
        SVerBranco[1].acquire(); // protege 31
        SBrancoCinza[0].acquire();// protege 31, 33 - 43, 32
        caminhoneteBranca.moverParaEsquerda(80);
        SBrancoCinza[0].release();// libera 31, 33 - 43, 32 (cruzamento)
        SBrancoRoxo.release();// libera 31, 33 - 43, 32
        caminhoneteBranca.moverParaEsquerda(40);
        SBrancoPreto[1].acquire(); // protege 29 - 39 - 50 - 51 - 53
        SBrancoCiano[1].acquire(); // protege 29
        caminhoneteBranca.moverParaEsquerda(90);
        SVerBranco[1].release(); // libera 31
        SVerBranco2.acquire(); // protege 50-51-39
        SAzulBranco1.acquire(); // protege 50 - 51 -53 - 55 - 57 - 59 - 60 - 49
        SBrancoRoxo1.acquire(); // protege 55 - 57 - 59 - 60 - 49
        caminhoneteBranca.moverParaEsquerda(5);
        SVerBranco1.acquire(); // protege 59 - 60- 49
        SBrancoCiano[2].acquire(); // protege 53 - 55 - 57
        caminhoneteBranca.moverParaEsquerda(5);
        SBrancoCinza1.acquire(); // protege 55 - 57
        caminhoneteBranca.moverParaEsquerda(50);
        Platform.runLater(() -> caminhoneteBranca.caminhonete.setRotate(-180));
        caminhoneteBranca.moverParaBaixo(30);
        SBrancoCiano[1].release(); // libera 29
        SAzulBranco.release(); // libera 29 -31 - 33 - 35
        caminhoneteBranca.moverParaBaixo(50);
        // aazulbranco1 tava aqui
        caminhoneteBranca.moverParaBaixo(144);
        Platform.runLater(() -> caminhoneteBranca.caminhonete.setRotate(90));
        caminhoneteBranca.moverParaDireita(180);
        SVerBranco2.release();// libera 50-51-39
        caminhoneteBranca.moverParaDireita(120);
        SBrancoPreto[1].release(); // libera 29 - 39 - 50 - 51 - 53
        caminhoneteBranca.moverParaDireita(100);
        // sverbranco1 dava acquire aqui
        caminhoneteBranca.moverParaDireita(100);
        SBrancoCiano[2].release(); // libera 53 - 55 - 57
        SBrancoCinza1.release(); // libera 55 - 57
        caminhoneteBranca.moverParaDireita(67);
        break;
      case 3: // caminhonete rosa
        // carroRosa.setVisible(false);
        caminhoneteRosa.moverParaCima(20);
        caminhoneteRosa.moverParaCima(60);
        SAzulRosa[0].acquire(); // protege 16 - 14 -11 - 08 -05 - 01 -02 - 17
        caminhoneteRosa.moverParaCima(144);
        Platform.runLater(() -> caminhoneteRosa.caminhonete.setRotate(-90));
        caminhoneteRosa.moverParaEsquerda(55);
        SRosaCiano[1].acquire(); // protege - 05 - 08 - 11
        SRosaCinza[2].acquire(); // protege 8 - 11
        caminhoneteRosa.moverParaEsquerda(200);
        SRosaPreto1.release(); // libera 11-14-16-27-26
        SVerRosa1.release(); // libera 11 - 14- 16 -27
        caminhoneteRosa.moverParaEsquerda(40);
        SVerRosa[0].acquire(); // protege 5 - 1 -2 -17
        caminhoneteRosa.moverParaEsquerda(50);
        SRosaCinza[2].release(); // libera 8 - 11
        caminhoneteRosa.moverParaEsquerda(142);
        SRosaCiano[1].release(); // libera - 05 - 08 - 11
        caminhoneteRosa.moverParaEsquerda(80);
        Platform.runLater(() -> caminhoneteRosa.caminhonete.setRotate(-180));
        caminhoneteRosa.moverParaBaixo(190);
        SRosaCiano[2].acquire(); // protege 18
        SRosaRoxo.acquire(); // protege 22 - 24 - 26
        caminhoneteRosa.moverParaBaixo(34);
        Platform.runLater(() -> caminhoneteRosa.caminhonete.setRotate(90));
        caminhoneteRosa.moverParaDireita(40);
        SAzulRosa[0].release(); // libera 16 - 14 -11 - 08 -05 - 01 -02 - 17
        SVerRosa[0].release(); // libera 5 - 1 -2 -17
        caminhoneteRosa.moverParaDireita(40);
        SRosaCinza[0].acquire(); // protege 31, 32 - 20, 22
        SAzulRosa[1].acquire(); // protege 20 - 22 - 24 -26
        SVerRosa[1].acquire(); // protege 22
        // rosa roxo tava aqui
        SRosaPreto.acquire(); // protege 20
        caminhoneteRosa.moverParaDireita(70);
        SRosaCiano[2].release(); // libera 18
        caminhoneteRosa.moverParaDireita(100);
        SRosaPreto.release(); // libera 20
        caminhoneteRosa.moverParaDireita(50);
        SRosaCinza[0].release(); // libera 31, 32 - 20, 22
        caminhoneteRosa.moverParaDireita(65);
        SVerRosa[1].release(); // libera 22
        caminhoneteRosa.moverParaDireita(35);
        SRosaPreto1.acquire(); // protege 11-14-16-27-26
        SRosaCiano[0].acquire(); // protege 26
        SRosaCinza[1].acquire(); // protege 24, 26 - 25 36 (cruzamento)
        caminhoneteRosa.moverParaDireita(80);
        SRosaCinza[1].release(); // libera 24, 26 - 25 36 (cruzamento)
        caminhoneteRosa.moverParaDireita(50);
        SVerRosa1.acquire(); // protege 11 - 14- 16 -27
        caminhoneteRosa.moverParaDireita(37);
        SRosaCiano[0].release(); // libera 26
        SAzulRosa[1].release(); // libera 20 - 22 - 24 -26
        SRosaRoxo.release(); // libera 22 - 24 - 26
        break;
      case 4: // caminhonete cinza
        // carroCinza.setVisible(false);
        caminhoneteCinza.moverParaCima(20);
        SBrancoCinza1.release(); // libera 55 - 57
        caminhoneteCinza.moverParaCima(50);
        SAzulCinza[5].acquire(); // protege 43, 54 - 42, 44
        caminhoneteCinza.moverParaCima(50);
        SAzulCinza[5].release(); // libera 43, 54 - 42, 44
        SCinzaPreto1.release(); // libera 54
        caminhoneteCinza.moverParaCima(50);
        SAzulCinza[6].acquire(); // potege 31, 33 - 43, 32
        SVerCinza[3].acquire(); // protege 32
        SBrancoCinza[0].acquire(); // protege 31, 33 - 43, 32
        SRosaCinza[0].acquire(); // protege 31, 32 - 20, 22
        caminhoneteCinza.moverParaCima(90);
        SAzulCinza[6].release();// libera 31, 33 - 43, 32
        SBrancoCinza[0].release();// libera 31, 33 - 43, 32
        caminhoneteCinza.moverParaCima(20);
        SCinzaPreto[0].acquire(); // protege 21
        SAzulCinza[7].acquire(); // protege 20, 22 - 21, 32
        caminhoneteCinza.moverParaCima(70);
        SVerCinza[3].release(); // libera 32
        SRosaCinza[0].release(); // libera 31, 32 - 20, 22
        caminhoneteCinza.moverParaCima(25);
        SAzulCinza[7].release(); // libera 20, 22 - 21, 32
        SRosaCinza[2].acquire(); // protege 8 - 11
        SVerCinza[0].acquire(); // protege 07
        SCinzaRoxo1.release(); // libera 54 - 43 - 32 - 55 - 57
        caminhoneteCinza.moverParaCima(25);
        SAzulCinza[8].acquire(); // protege 7, 21 - 06, 09
        caminhoneteCinza.moverParaCima(70);
        SAzulCinza[8].release();// libera 7, 21 - 06, 09
        SCinzaPreto[0].release(); // libera 21
        caminhoneteCinza.moverParaCima(30);
        SAzulCinza[0].acquire();// protege 8 - 11
        SCinzaCiano[0].acquire(); // protege 08 - 11 -13 - 25
        // Srosa cinza [2] estava aqui
        caminhoneteCinza.moverParaCima(52);
        Platform.runLater(() -> caminhoneteCinza.caminhonete.setRotate(90));
        caminhoneteCinza.moverParaDireita(30);
        SVerCinza[0].release();// libera 07
        caminhoneteCinza.moverParaDireita(50);
        SVerCinza[1].acquire(); // protege 11
        SCinzaPreto[1].acquire(); // protege 11
        caminhoneteCinza.moverParaDireita(147);
        Platform.runLater(() -> caminhoneteCinza.caminhonete.setRotate(180));
        caminhoneteCinza.moverParaBaixo(30);
        SVerCinza[1].release(); // libera 11
        SCinzaPreto[1].release(); // libera 11
        SAzulCinza[0].release(); // libera 8 - 11
        SRosaCinza[2].release(); // libera 8 - 11
        caminhoneteCinza.moverParaBaixo(40);
        SAzulCinza[1].acquire();// protege 13, 25 - 12, 15
        caminhoneteCinza.moverParaBaixo(80);
        SAzulCinza[1].release(); // libera 13, 25 - 12, 15
        SCinzaRoxo1.acquire(); // protege 54 - 43 - 32 - 55 - 57
        caminhoneteCinza.moverParaBaixo(20);
        SCinzaPreto[2].acquire(); // protege 36
        SRosaCinza[1].acquire(); // protege 24, 26 - 25 36 (cruzamento)
        SAzulCinza[2].acquire(); // protege 25,36 - 24, 26 (cruzamento)
        SCinzaRoxo.acquire(); // protege 25, 36 - 24 36 (cruzamento)
        SCinzaCiano[0].release(); // libera 08 - 11 -13 - 25
        caminhoneteCinza.moverParaBaixo(70);
        SAzulCinza[2].release(); // libera 25,36 - 24, 26 (cruzamento)
        SRosaCinza[1].release(); // libera 24, 26 - 25 36 (cruzamento)
        SCinzaRoxo.release(); // libera 25, 36 - 24 36 (cruzamento)
        caminhoneteCinza.moverParaBaixo(20);
        SCinzaCiano[1].acquire(); // protege 47 - 58 - 57 - 55
        caminhoneteCinza.moverParaBaixo(20);
        // SAzulCinza[3].acquire(); // protege 47
        SBrancoCinza[1].acquire(); // protege 35, 37 - 36, 47
        SVerCinza[2].acquire(); // protege 47-58
        caminhoneteCinza.moverParaBaixo(90);
        SBrancoCinza[1].release(); // libera 35, 37 - 36, 47
        SCinzaPreto[2].release(); // libera 36
        caminhoneteCinza.moverParaBaixo(110);
        // SAzulCinza[3].release(); // libera 47
        caminhoneteCinza.moverParaBaixo(30);
        SAzulCinza[4].acquire(); // protege 55 -- 57
        SBrancoCinza1.acquire(); // protege 55 - 57
        caminhoneteCinza.moverParaBaixo(46);
        Platform.runLater(() -> caminhoneteCinza.caminhonete.setRotate(-90));
        caminhoneteCinza.moverParaEsquerda(27);
        SVerCinza[2].release(); // libera 47-58
        caminhoneteCinza.moverParaEsquerda(140);
        SAzulCinza[4].release(); // libera 55 - 57
        caminhoneteCinza.moverParaEsquerda(20);
        SCinzaPreto1.acquire(); // protege 54
        caminhoneteCinza.moverParaEsquerda(40);
        SCinzaCiano[1].release(); // libera 47 - 58 - 57 - 55

        break;
      case 5: // caminhonete roxa
        // carroRoxo.setVisible(false);
        Platform.runLater(() -> caminhoneteRoxa.caminhonete.setRotate(-90));
        SCinzaRoxo1.acquire(); // protege 54 - 43 - 32 - 55 - 57
        caminhoneteRoxa.moverParaEsquerda(1);
        SRoxoPreto[0].acquire(); // protege 21, 32 - 20, 22
        caminhoneteRoxa.moverParaEsquerda(35);
        Platform.runLater(() -> caminhoneteRoxa.caminhonete.setRotate(-180));
        caminhoneteRoxa.moverParaBaixo(20);
        SRosaRoxo.release(); // libera 22 - 24 - 26
        SAzulRoxo1.release(); // libera 22 - 24 - 26 - 38 - 49 - 60 - 59 - 57 - 55
        SRoxoPreto[0].release(); // libera 21, 32 - 20, 22
        caminhoneteRoxa.moverParaBaixo(50);
        SBrancoRoxo.acquire(); // protege 31, 33 - 43, 32
        SAzulRoxo[0].acquire(); // protege 31, 33 - 43, 32
        caminhoneteRoxa.moverParaBaixo(50);
        SAzulRoxo[0].release(); // libera 31, 33 - 43, 32
        SBrancoRoxo.release(); // libera 31, 33 - 43, 32
        SVerRoxo1.release(); // libera 22-32
        caminhoneteRoxa.moverParaBaixo(50);
        SAzulRoxo[1].acquire(); // protege 43,54 - 42,44
        SRoxoPreto[1].acquire(); // protege 54
        caminhoneteRoxa.moverParaBaixo(60);
        SAzulRoxo[1].release(); // libera 43,54 - 42,44
        caminhoneteRoxa.moverParaBaixo(70);
        SAzulRoxo1.acquire(); // protege 22 - 24 - 26 - 38 - 49 - 60 - 59 - 57 - 55
        SBrancoRoxo1.acquire(); // protege 55 - 57 - 59 - 60 - 49
        SRoxoCiano[0].acquire(); // protege 55 - 57
        caminhoneteRoxa.moverParaBaixo(30);
        Platform.runLater(() -> caminhoneteRoxa.caminhonete.setRotate(90));
        caminhoneteRoxa.moverParaDireita(30);
        SRoxoPreto[1].release();// libera 54
        caminhoneteRoxa.moverParaDireita(140);
        SRoxoPreto[2].acquire(); // protege 26
        caminhoneteRoxa.moverParaDireita(10);
        SRosaRoxo.acquire(); // protege 22 - 24 - 26
        caminhoneteRoxa.moverParaDireita(10);
        SVerRoxo.acquire(); // protege 38-49-60-59
        caminhoneteRoxa.moverParaDireita(110);
        SCinzaRoxo1.release();// libera 54 - 43 - 32 - 55 - 57
        SRoxoCiano[0].release(); // libera 55 - 57
        caminhoneteRoxa.moverParaDireita(42);
        Platform.runLater(() -> caminhoneteRoxa.caminhonete.setRotate(0));
        caminhoneteRoxa.moverParaCima(190);
        SRoxoCiano[1].acquire(); // protege 38 - 26
        caminhoneteRoxa.moverParaCima(70);
        SBrancoRoxo1.release(); // libera 55 - 57 - 59 - 60 - 49
        // rosa roxo acquire estava aqui
        caminhoneteRoxa.moverParaCima(70);
        Platform.runLater(() -> caminhoneteRoxa.caminhonete.setRotate(-90));
        caminhoneteRoxa.moverParaEsquerda(30);
        SVerRoxo.release();// libera 38-49-60-59
        caminhoneteRoxa.moverParaEsquerda(60);
        SRoxoPreto[2].release(); // libera 26
        SCinzaRoxo.acquire(); // protege 25, 36 - 24 36 (cruzamento)
        caminhoneteRoxa.moverParaEsquerda(30);
        SRoxoCiano[1].release(); // libera 38 - 26
        caminhoneteRoxa.moverParaEsquerda(60);
        SCinzaRoxo.release();
        SVerRoxo1.acquire(); // protege 22-32
        caminhoneteRoxa.moverParaEsquerda(126);

        break;
      case 6: // caminhonete preta
        // carroPreto.setVisible(false);
        Platform.runLater(() -> caminhonetePreta.caminhonete.setRotate(180));
        caminhonetePreta.moverParaBaixo(20);
        SAzulPreto1.release(); // libera 11 - 14 - 16
        caminhonetePreta.moverParaBaixo(28);
        // caminhonetePreta.moverParaBaixo(55);
        SAzulPreto[0].acquire(); // protege 09
        caminhonetePreta.moverParaBaixo(24);
        // caminhonetePreta.moverParaBaixo(32);
        Platform.runLater(() -> caminhonetePreta.caminhonete.setRotate(-90));
        caminhonetePreta.moverParaEsquerda(88);
        SCinzaPreto[0].acquire(); // protege 21
        caminhonetePreta.moverParaEsquerda(30);
        Platform.runLater(() -> caminhonetePreta.caminhonete.setRotate(180));
        caminhonetePreta.moverParaBaixo(30);
        SAzulPreto[0].release(); // libera 09
        SVerPreto1.release(); // libera 27 - 16 -14 -11-10-9
        caminhonetePreta.moverParaBaixo(40);
        SAzulPreto[1].acquire(); // protege 20
        SRosaPreto.acquire(); // protege 20
        SVerPreto[0].acquire(); // protege 20, 22 - 21, 32 (cruzamento)
        SRoxoPreto[0].acquire(); // protege 21, 32 - 20, 22 (cruzamento)
        caminhonetePreta.moverParaBaixo(47);
        Platform.runLater(() -> caminhonetePreta.caminhonete.setRotate(-90));
        caminhonetePreta.moverParaEsquerda(30);
        SCinzaPreto[0].release(); // libera 21
        SVerPreto[0].release(); // libera 20, 22 - 21, 32 (cruzamento)
        SRoxoPreto[0].release(); // libera 20, 22 - 21, 32 (cruzamento)
        caminhonetePreta.moverParaEsquerda(30);
        SPretoCiano[2].acquire(); // protege 19, 30 - 18, 20
        caminhonetePreta.moverParaEsquerda(50);
        Platform.runLater(() -> caminhonetePreta.caminhonete.setRotate(180));
        caminhonetePreta.moverParaBaixo(30);
        SPretoCiano[2].release(); // libera 19, 30 - 18, 20
        SAzulPreto[1].release(); // libera 20
        SRosaPreto.release(); // libera 20
        caminhonetePreta.moverParaBaixo(50);
        SAzulPreto2.acquire(); // protege 29
        SPretoCiano[1].acquire(); // protege 29
        SBrancoPreto[1].acquire(); // protege 29 - 39 - 50 - 51 - 53
        SVerPreto[1].acquire(); // protege 29, 31 - 30 41(cruzamento)
        caminhonetePreta.moverParaBaixo(28);
        Platform.runLater(() -> caminhonetePreta.caminhonete.setRotate(-90));
        caminhonetePreta.moverParaEsquerda(30);
        SVerPreto[1].release(); // protege 29, 31 - 30 41(cruzamento)
        caminhonetePreta.moverParaEsquerda(35);
        SRoxoPreto[1].acquire(); // protege 54
        SVerPreto2.acquire(); // protege 50 - 51 - 39
        SAzulPreto[2].acquire(); // protege 50 - 51 - 53
        caminhonetePreta.moverParaEsquerda(10);
        SPretoCiano[0].acquire(); // protege 53
        caminhonetePreta.moverParaEsquerda(40);
        Platform.runLater(() -> caminhonetePreta.caminhonete.setRotate(180));
        caminhonetePreta.moverParaBaixo(26);
        SPretoCiano[1].release(); // libera 29
        SAzulPreto2.release(); // libera 29
        caminhonetePreta.moverParaBaixo(60);
        // azulpreto[2] estava aqui
        caminhonetePreta.moverParaBaixo(140);
        Platform.runLater(() -> caminhonetePreta.caminhonete.setRotate(90));
        caminhonetePreta.moverParaDireita(160);
        SVerPreto2.release(); // libera 50 - 51 - 39
        SCinzaPreto1.acquire(); // protege 54
        caminhonetePreta.moverParaDireita(65);
        Platform.runLater(() -> caminhonetePreta.caminhonete.setRotate(0));
        caminhonetePreta.moverParaCima(30);
        SPretoCiano[0].release(); // libera 53
        SBrancoPreto[1].release(); // libera 29 - 39 - 50 - 51 - 53
        SAzulPreto[2].release(); // libera 50 - 51 - 53
        caminhonetePreta.moverParaCima(30);
        SAzulPreto[3].acquire(); // protege 44
        caminhonetePreta.moverParaCima(50);
        Platform.runLater(() -> caminhonetePreta.caminhonete.setRotate(90));
        caminhonetePreta.moverParaDireita(30);
        SCinzaPreto1.release(); // libera 54
        SRoxoPreto[1].release(); // libera 54
        caminhonetePreta.moverParaDireita(88);
        Platform.runLater(() -> caminhonetePreta.caminhonete.setRotate(0));
        caminhonetePreta.moverParaCima(30);
        SAzulPreto[3].release(); // libera 44
        caminhonetePreta.moverParaCima(40);
        SCinzaPreto[2].acquire(); // protege 36
        SVerPreto[2].acquire(); // protege 35
        SBrancoPreto[0].acquire(); // protege 35
        caminhonetePreta.moverParaCima(15);
        SAzulPreto[4].acquire(); // protege 35
        SPretoCiano[5].acquire(); // protege 35, 37 - 36, 47
        caminhonetePreta.moverParaCima(30);
        Platform.runLater(() -> caminhonetePreta.caminhonete.setRotate(90));
        caminhonetePreta.moverParaDireita(80);
        caminhonetePreta.moverParaDireita(30);
        Platform.runLater(() -> caminhonetePreta.caminhonete.setRotate(0));
        caminhonetePreta.moverParaCima(30);
        SPretoCiano[5].release(); // libera 35, 37 - 36, 47
        SVerPreto[2].release(); // libera 35
        SAzulPreto[4].release();// libera 35
        SBrancoPreto[0].release();// libera 35
        caminhonetePreta.moverParaCima(25);
        SAzulPreto[5].acquire(); // protege 26
        SRoxoPreto[2].acquire(); // protege 26
        SRosaPreto1.acquire(); // protege 11-14-16-27-26
        caminhonetePreta.moverParaCima(10);
        SPretoCiano[4].acquire(); // protege 26
        caminhonetePreta.moverParaCima(43);
        Platform.runLater(() -> caminhonetePreta.caminhonete.setRotate(90));
        caminhonetePreta.moverParaDireita(30);
        SCinzaPreto[2].release(); // libera 36
        caminhonetePreta.moverParaDireita(55);
        SVerPreto1.acquire(); // protege 27 - 16 -14 -11-10-9
        caminhonetePreta.moverParaDireita(29);
        Platform.runLater(() -> caminhonetePreta.caminhonete.setRotate(0));
        caminhonetePreta.moverParaCima(30);
        SAzulPreto[5].release(); // libera 26
        SRoxoPreto[2].release(); // libera 26
        SPretoCiano[4].release(); // libera 26
        caminhonetePreta.moverParaCima(45);
        SAzulPreto1.acquire(); // protege 11 - 14 - 16
        caminhonetePreta.moverParaCima(150);
        Platform.runLater(() -> caminhonetePreta.caminhonete.setRotate(-90));
        caminhonetePreta.moverParaEsquerda(70);
        SCinzaPreto[1].acquire(); // protege 11
        SPretoCiano[3].acquire(); // protege 11
        caminhonetePreta.moverParaEsquerda(154);
        Platform.runLater(() -> caminhonetePreta.caminhonete.setRotate(180));
        caminhonetePreta.moverParaBaixo(36);
        SCinzaPreto[1].release(); // libera 11
        SPretoCiano[3].release(); // libera 11
        SRosaPreto1.release(); // release 11-14-16-27-26
        break;
      case 7: // caminhonete ciano
        // carroCiano.setVisible(false);
        caminhoneteCiano.moverParaCima(60);
        SAzulCiano[7].acquire(); // protege 40,42 - 41,52 (cruzamento)
        caminhoneteCiano.moverParaCima(120);
        SAzulCiano[7].release(); // libera 40,42 - 41,52 (cruzamento)
        SAzulCiano1.acquire(); // protege 29 - 28
        SBrancoCiano[1].acquire(); // protege 29
        SPretoCiano[1].acquire(); // protege 29
        caminhoneteCiano.moverParaCima(40);
        Platform.runLater(() -> caminhoneteCiano.caminhonete.setRotate(-90));
        caminhoneteCiano.moverParaEsquerda(30);
        SVerCiano1.release(); // libera 52-41
        caminhoneteCiano.moverParaEsquerda(50);
        SVerCiano[0].acquire(); // protege 28
        caminhoneteCiano.moverParaEsquerda(35);
        Platform.runLater(() -> caminhoneteCiano.caminhonete.setRotate(0));
        caminhoneteCiano.moverParaCima(30);
        SBrancoCiano[1].release(); // libera 29
        SPretoCiano[1].release(); // libera 29
        caminhoneteCiano.moverParaCima(40);
        SRosaCiano[2].acquire(); // protege 18
        caminhoneteCiano.moverParaCima(37);
        Platform.runLater(() -> caminhoneteCiano.caminhonete.setRotate(90));
        caminhoneteCiano.moverParaDireita(30);
        SAzulCiano1.release(); // libera 29 - 28
        SVerCiano[0].release(); // protege 28
        caminhoneteCiano.moverParaDireita(40);
        SAzulCiano[0].acquire(); // protege 19
        SPretoCiano[2].acquire(); // protege 19, 30 - 18, 20
        caminhoneteCiano.moverParaDireita(46);
        Platform.runLater(() -> caminhoneteCiano.caminhonete.setRotate(0));
        caminhoneteCiano.moverParaCima(20);
        SPretoCiano[2].release(); // libera 19, 30 - 18, 20
        caminhoneteCiano.moverParaCima(20);
        SRosaCiano[2].release(); // protege 18
        caminhoneteCiano.moverParaCima(110);
        SCinzaCiano[0].acquire(); // protege 08 - 11 -13 - 25
        caminhoneteCiano.moverParaCima(5);
        SAzulCiano[0].release(); // libera 19
        SRosaCiano[1].acquire(); // protege - 05 - 08 - 11
        caminhoneteCiano.moverParaCima(5);

        SVerCiano[1].acquire(); // protege 05
        caminhoneteCiano.moverParaCima(30);

        SAzulCiano[1].acquire(); // protege 05 - 08 - 11
        caminhoneteCiano.moverParaCima(36);
        Platform.runLater(() -> caminhoneteCiano.caminhonete.setRotate(90));
        caminhoneteCiano.moverParaDireita(140);
        SVerCiano[1].release(); // libera 05
        caminhoneteCiano.moverParaDireita(40);
        SVerCiano[2].acquire(); // protege 11
        SPretoCiano[3].acquire(); // protege 11
        caminhoneteCiano.moverParaDireita(157);
        Platform.runLater(() -> caminhoneteCiano.caminhonete.setRotate(180));
        caminhoneteCiano.moverParaBaixo(20);
        SAzulCiano[1].release(); // libera 05 - 08 - 11
        SRosaCiano[1].release(); // libera 05 - 08 - 11
        SVerCiano[2].release();// libera 11
        SPretoCiano[3].release(); // libera 11
        caminhoneteCiano.moverParaBaixo(40);
        SAzulCiano[3].acquire(); // protege 13, 25 - 12, 15
        caminhoneteCiano.moverParaBaixo(70);
        SAzulCiano[3].release(); // libera 13, 25 - 12, 15
        caminhoneteCiano.moverParaBaixo(40);
        SAzulCiano[4].acquire();// protege 26 - 38
        SRoxoCiano[1].acquire(); // protege 38 - 26
        SRosaCiano[0].acquire(); // protege 26
        SPretoCiano[4].acquire(); // protege 26
        caminhoneteCiano.moverParaBaixo(56);
        Platform.runLater(() -> caminhoneteCiano.caminhonete.setRotate(90));
        caminhoneteCiano.moverParaDireita(30);
        SCinzaCiano[0].release(); // libera 08 - 11 -13 - 25
        caminhoneteCiano.moverParaDireita(50);
        SVerCiano[3].acquire(); // protege 38
        caminhoneteCiano.moverParaDireita(35);
        Platform.runLater(() -> caminhoneteCiano.caminhonete.setRotate(180));
        caminhoneteCiano.moverParaBaixo(30);
        SRosaCiano[0].release(); // libera 26
        SPretoCiano[4].release(); // libera 26
        caminhoneteCiano.moverParaBaixo(38);
        SBrancoCiano[0].acquire(); // protege 37
        caminhoneteCiano.moverParaBaixo(40);
        Platform.runLater(() -> caminhoneteCiano.caminhonete.setRotate(-90));
        caminhoneteCiano.moverParaEsquerda(30);
        SAzulCiano[4].release(); // libera 26 - 38
        SRoxoCiano[1].release(); // libera 38 - 26
        SVerCiano[3].release(); // libera 38
        caminhoneteCiano.moverParaEsquerda(15);
        SRoxoCiano[0].acquire(); // protege 55 - 57
        SAzulCiano[5].acquire(); // protege 47
        caminhoneteCiano.moverParaEsquerda(30);
        SVerCiano[4].acquire(); // protege 58 - 47
        SCinzaCiano[1].acquire(); // protege 47 - 58 - 57 - 55
        SPretoCiano[5].acquire(); // protege 35, 37 - 36, 47
        caminhoneteCiano.moverParaEsquerda(40);
        Platform.runLater(() -> caminhoneteCiano.caminhonete.setRotate(180));
        caminhoneteCiano.moverParaBaixo(30);
        SPretoCiano[5].release(); // libera 35, 37 - 36, 47
        SBrancoCiano[0].release(); // libera 37
        caminhoneteCiano.moverParaBaixo(100);
        SAzulCiano[5].release(); // libera 47
        caminhoneteCiano.moverParaBaixo(60);
        SVerCiano1.acquire(); // protege 52-41
        SAzulCiano[6].acquire(); // protege 53 - 55 - 57
        SBrancoCiano[2].acquire(); // protege 53 - 55 - 57
        caminhoneteCiano.moverParaBaixo(35);
        Platform.runLater(() -> caminhoneteCiano.caminhonete.setRotate(-90));
        caminhoneteCiano.moverParaEsquerda(30);
        SVerCiano[4].release(); // libera 58 - 47
        caminhoneteCiano.moverParaEsquerda(180);
        SPretoCiano[0].acquire(); // protege 53
        caminhoneteCiano.moverParaEsquerda(50);
        // cianovermelho1 tava aqui
        SCinzaCiano[1].release(); // libera 47 - 58 - 57 - 55
        SRoxoCiano[0].release(); // libera 55 - 57
        caminhoneteCiano.moverParaEsquerda(78);
        Platform.runLater(() -> caminhoneteCiano.caminhonete.setRotate(0));
        SAzulCiano[6].release(); // libera 53 - 55 - 57
        SBrancoCiano[2].release(); // libera 53 - 55 - 57
        SPretoCiano[0].release(); // protege 53

        break;

      default:
        break;
    }
  }

} // dispensa comentarios