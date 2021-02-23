package hkn.khf.khf;



public class FlashActivity extends AppCompatActivity {

    private static int SPLASH_TIME_OUT = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flash);
        new android.os.Handler().postDelayed(new Runnable() {
            @Override

            public void run() {
                Intent home = new Intent(FlashActivity.this, MainActivity.class);
                startActivity(home);
                finish();

            }


        }, SPLASH_TIME_OUT);


    }


}
