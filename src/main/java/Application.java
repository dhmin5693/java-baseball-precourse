import domain.BaseballGame;

public class Application {
    public static void main(String[] args) {
        BaseballGame.getInstance()
                    .run();
    }
}
