package filipe.gomes.appminhaideia.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import filipe.gomes.appminhaideia.R;
import filipe.gomes.appminhaideia.model.Client;

public class MainActivity extends AppCompatActivity {

    String TAG = "APP_MINHA_IDEIA";

    Client client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "onCreate: Tela MainActivity carregada!");

        client = new Client(
                "Ada",
                "Lovelace",
                70,
                'F'
        );
        Log.d(TAG, client.toString());
    }
}