package screens;

import com.badlogic.gdx.graphics.Texture;
import net.nosek.tutorialclicker.TutorialClickerGame;

/**
 * Created by piternet on 24.05.16.
 */
public class SplashScreen extends AbstractScreen {

    private Texture splashImage;

    public SplashScreen(TutorialClickerGame game) {
        super(game);
        init();
    }

    private void init() {
        // TODO implement better asset loading
        splashImage = new Texture("badlogic.jpg");
    }

    @Override
    public void render(float delta) {
        super.render(delta);
        spriteBatch.begin();
        spriteBatch.draw(splashImage, 0, 0);
        spriteBatch.end();
    }
}
