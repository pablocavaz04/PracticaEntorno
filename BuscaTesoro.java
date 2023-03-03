/**
* Minijuego "Busca el tesoro"
*
* Se colocan una mina y un tesoro de forma aleatoria en un cuadrante de
* cuatro filas por cinco columnas. El usuario intentará averiguar dónde
* está el tesoro.
*
* @Pablo Camino Vázquez y Carlos Gil Sánchez
*/
public class BuscaTesoro {
    public static void main(String[] args) {
    // se definen constantes para representar el
    // contenido de las celdas
    final int VACIO = 0;
    final int MINA = 1;
    final int TESORO = 2;
    final int INTENTO = 3;
    int x;
    int y;
    int[][] cuadrante = new int[5][4];
    
    
    // inicializa el array
    for(x = 0; x < 4; x++) {
    for(y = 0; y < 3; y++) {
    cuadrante[x][y] = VACIO;
    }
    }
    // coloca la mina
    int minaX = (int)(Math.random() * 5);
    int minaY = (int)(Math.random() * 4);
    cuadrante[minaX][minaY] = MINA;
    // coloca el tesoro
    int tesoroX;
    int tesoroY;
    do {
    tesoroX = (int)(Math.random() * 5);
    tesoroY = (int)(Math.random() * 4);
    } while ((minaX == tesoroX) && (minaY == tesoroY));
    cuadrante[tesoroX][tesoroY] = TESORO;

        // pide las coordenadas
    System.out.print("Coordenada x: ");
    x = Integer.parseInt(System.console().readLine());
    System.out.print("Coordenada y: ");
    y = Integer.parseInt(System.console().readLine());
    }
}