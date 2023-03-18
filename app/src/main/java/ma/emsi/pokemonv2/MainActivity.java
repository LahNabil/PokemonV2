package ma.emsi.pokemonv2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private CardView cardView1;
    private CardView cardView2;
    private CardView cardView3;
    private CardView cardView4;
    private CardView cardView5;
    private CardView cardView6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cardView1 = findViewById(R.id.poke1);
        cardView2 = findViewById(R.id.poke2);
        cardView3 = findViewById(R.id.poke3);
        cardView4 = findViewById(R.id.poke4);
        cardView5 = findViewById(R.id.poke5);
        cardView6 = findViewById(R.id.poke6);
        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityPoke1();
            }
        });
        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityPoke2();
            }
        });
        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityPoke3();
            }
        });
        cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityPoke4();
            }
        });
        cardView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityPoke5();
            }
        });
        cardView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityPoke6();
            }
        });
    }
    public void openActivityPoke1(){
        Intent intent = new Intent(this, Poke1Activity.class);
        startActivity(intent);
    }
    public void openActivityPoke2(){
        Intent intent = new Intent(this, Poke2Activity.class);
        startActivity(intent);
    }
    public void openActivityPoke3(){
        Intent intent = new Intent(this, Poke3Activity.class);
        startActivity(intent);
    }
    public void openActivityPoke4(){
        Intent intent = new Intent(this, Poke4Activity.class);
        startActivity(intent);
    }
    public void openActivityPoke5(){
        Intent intent = new Intent(this, Poke5Activity.class);
        startActivity(intent);
    }
    public void openActivityPoke6(){
        Intent intent = new Intent(this, Poke6Activity.class);
        startActivity(intent);
    }
}