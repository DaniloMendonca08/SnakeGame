import javax.swing.JFrame;

/*
 * classe que representa uma janela 
 * na qual você pode adicionar 
 * componentes GUI (como botões, rótulos, painéis, etc.)
 * também tem a capacidade de ser exibido na tela do computador com 
 * funcionalidades de janela como minimizar, maximizar e fechar.
 */

public class GameFrame extends JFrame {

    GameFrame() {

        GamePanel panel = new GamePanel();

        this.add(panel);

    }

}
