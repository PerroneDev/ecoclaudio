package ecoclaudio.claudioprojects.com.ecocludio;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText pesoRecycle;
    private Button botaoCalcular;
    private TextView dinheiroGanho;
    private RadioGroup  radioGroup;
    private RadioButton lataRadio;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pesoRecycle = findViewById(R.id.pesoRecycleId);
        botaoCalcular = findViewById(R.id.botaoCalcularId);
        dinheiroGanho = findViewById(R.id.dinheiroGanhoId);
        radioGroup = findViewById(R.id.radio_group);
        lataRadio = findViewById(R.id.radio_lata);
        lataRadio.setChecked(true);


    setListeners()

    ;}

    protected void setListeners() {
        botaoCalcular.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {

                String pesoDigitado = pesoRecycle.getText().toString();

                int id = radioGroup.getCheckedRadioButtonId();

                if (pesoDigitado.isEmpty()) {
                    dinheiroGanho.setText("Digite um peso!");

                } else {
                    Double valorDigitado = Double.parseDouble(pesoDigitado);
                    if (id == R.id.radio_lata)  {
                        Double valorResultado = valorDigitado * 3.20;
                        dinheiroGanho.setText("R$" + String.format("%.2f", valorResultado));
                    } else if (id == R.id.radio_papelao) {
                        Double valorResultado = valorDigitado * 0.20;
                        dinheiroGanho.setText("R$" +  String.format("%.2f", valorResultado));
                    } else if (id == R.id.radio_chapaalum) {
                        Double valorResultado = valorDigitado * 3.20;
                        dinheiroGanho.setText("R$" +  String.format("%.2f", valorResultado));
                    } else if (id == R.id.radio_acoinox) {
                        Double valorResultado = valorDigitado * 1.50;
                        dinheiroGanho.setText("R$" +  String.format("%.2f", valorResultado));
                    } else if (id == R.id.radio_bateria) {
                        Double valorResultado = valorDigitado * 2.20;
                        dinheiroGanho.setText("R$" +  String.format("%.2f", valorResultado));
                    } else if (id == R.id.radio_motorgela) {
                        Double valorResultado = valorDigitado * 12.00;
                        dinheiroGanho.setText("R$" +  String.format("%.2f", valorResultado));
                    } else if (id == R.id.radio_cobre) {
                        Double valorResultado = valorDigitado * 13.00;
                        dinheiroGanho.setText("R$" +  String.format("%.2f", valorResultado));
                    } else {
                        Double valorResultado = valorDigitado * 1.78;
                        dinheiroGanho.setText("R$" +  String.format("%.2f", valorResultado));
                    }

                }
            }

        });
    }

}