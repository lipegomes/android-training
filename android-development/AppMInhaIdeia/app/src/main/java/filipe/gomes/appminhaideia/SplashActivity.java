package filipe.gomes.appminhaideia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class SplashActivity extends AppCompatActivity {

    String TAG = "APP_MINHA_IDEIA";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Log.d(TAG, "onCreate: Tela Splash carregada!");

        changeScreen();
    }

    private void changeScreen() {
        Log.d(TAG, "switchScreens: Mudando de tela!");

        Intent switchScreens = new Intent(SplashActivity.this, MainActivity.class);
        // troca da tela SplashActivity para MainActivity
        startActivity(switchScreens);
        // finaliza a ação
        finish();
    }
}