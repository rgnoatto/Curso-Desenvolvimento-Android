package devandroid.gnoatto.applistacursoronaldo.view;

import androidx.appcompat.app.AppCompatActivity;
import devandroid.gnoatto.applistacursoronaldo.R;
import devandroid.gnoatto.applistacursoronaldo.model.Pessoa;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    Pessoa pessoa;
    Pessoa outraPessoa;

    String dadosPessoa;
    String dadosOutraPessoa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pessoa = new Pessoa();
        //Atribuir Conteúdo, dados, valores para o objeto
        //Conforme template
        pessoa.setPrimeiroNome("Marco");
        pessoa.setSobreNome("Maddo");
        pessoa.setCursoDesejado("Android");
        pessoa.setTelefoneContato("11-99229191");

        outraPessoa=new Pessoa();
        outraPessoa.setPrimeiroNome("Ronaldo");
        outraPessoa.setSobreNome("Gno");
        outraPessoa.setCursoDesejado("Java");
        outraPessoa.setTelefoneContato("41-992250000");

        dadosPessoa = "Primeiro nome: ";
        dadosPessoa += pessoa.getPrimeiroNome();
        dadosPessoa += " Sobrenome: ";
        dadosPessoa += pessoa.getSobreNome();
        dadosPessoa += " Curso Desejado: ";
        dadosPessoa += pessoa.getCursoDesejado();
        dadosPessoa += " Telefone de Contato: ";
        dadosPessoa += pessoa.getTelefoneContato();

        dadosOutraPessoa = "Primeiro nome: ";
        dadosOutraPessoa += outraPessoa.getPrimeiroNome();
        dadosOutraPessoa += " Sobrenome: ";
        dadosOutraPessoa += outraPessoa.getSobreNome();
        dadosOutraPessoa += " Curso Desejado: ";
        dadosOutraPessoa += outraPessoa.getCursoDesejado();
        dadosOutraPessoa += " Telefone de Contato: ";
        dadosOutraPessoa += outraPessoa.getTelefoneContato();

        int parada = 0;

    }
}