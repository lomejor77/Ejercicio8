package cl.awakelabs.ejercicio8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView = (TextView) this.findViewById(R.id.tvMarquesina);
        textView.setText("Bienvenido al segundo activity");
        textView.setSelected(true);

        initListeners();


    }

    private void initListeners() {
        Button goUrl = findViewById(R.id.btnGoTo);
        Button goBack = findViewById(R.id.btnExit);

        goUrl.setOnClickListener(new View.OnClickListener() {
           //intent implicito
            @Override
            public void onClick(View view) {
                Intent abreUrl = new Intent(Intent.ACTION_VIEW, Uri.parse("https://kotlindoc.blogspot.com/2019/10/android-log-con-timber.html"));
                startActivity(abreUrl);
                Toast.makeText(MainActivity2.this, "Vamos a la URL", Toast.LENGTH_SHORT).show();
            }
        });

        goBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

    }
}