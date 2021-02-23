package hkn.khf.khf;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {
    Button giris;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


     giris=(Button) findViewById(R.id.giris);

     giris.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             Intent home = new Intent(LoginActivity.this, MainActivity.class);
             startActivity(home);
             finish();

         }
     });



    }
}
