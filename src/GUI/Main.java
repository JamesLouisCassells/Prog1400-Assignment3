/*Main is just a launcher. All application setup happens in GameFrame.

CreationPanel -> collect input
GameFrame -> manage screens using cardlayout
Player -> store character data
BattlePanel -> display results
 */
package GUI;

public class Main {
    public static void main(String[] args) {
        new GameFrame();

    }
}
