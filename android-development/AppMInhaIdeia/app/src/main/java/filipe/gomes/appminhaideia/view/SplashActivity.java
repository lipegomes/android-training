package filipe.gomes.appminhaideia.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

import filipe.gomes.appminhaideia.R;

public class SplashActivity extends AppCompatActivity {

    String TAG = "APP_MINHA_IDEIA";

    int waitingTime = 1000 * 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Log.d(TAG, "onCreate: Tela Splash carregada!");

        changeScreen();
    }

    private void changeScreen() {
        Log.d(TAG, "switchScreens: Mudando de tela!");

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Log.d(TAG, "switchScreens: Esperando o tempo...");

                Intent switchScreens = new Intent(SplashActivity.this, MainActivity.class);
                // Troca da tela SplashActivity para MainActivity
                startActivity(switchScreens);
                // Finaliza a ação
                finish();
            }
        }, waitingTime);
    }
}