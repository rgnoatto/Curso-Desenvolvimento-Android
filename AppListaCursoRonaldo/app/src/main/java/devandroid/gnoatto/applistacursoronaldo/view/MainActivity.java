package devandroid.gnoatto.applistacursoronaldo.view;

import androidx.appcompat.app.AppCompatActivity;
import devandroid.gnoatto.applistacursoronaldo.R;
import devandroid.gnoatto.applistacursoronaldo.model.Pessoa;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    Pessoa pessoa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pessoa = new Pessoa();


    }
}