package etechoracioferias.com.br.solicitaodeferias;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;

import android.widget.DatePicker;
import android.widget.RadioGroup;
import android.widget.Spinner;

import java.util.Arrays;
import java.util.Calendar;

import etechoracioferias.com.br.solicitaodeferias.Utils.DateTimeUtils;


public class SolicitacaoActivity extends AppCompatActivity {

    private RadioGroup radiosn;
    private Button btnSelecionar;
    private Button btnRegistrar;
    private Spinner spnqntd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solicitacao);

        spnqntd = findViewById(R.id.spnqntd);
        radiosn = findViewById(R.id.radiosn);
        btnSelecionar = findViewById(R.id.btnSelecionar);
        btnRegistrar = findViewById(R.id.btnRegistrar);


    }

    private ArrayAdapter getAbonoSim() {

        return new ArrayAdapter<Integer>(this, R.layout.support_simple_spinner_dropdown_item, Arrays.asList(20, 30));

    }

    private ArrayAdapter getAbonoNao() {

        return new ArrayAdapter<Integer>(this, R.layout.support_simple_spinner_dropdown_item, Arrays.asList(10, 15, 20, 30));
    }

    public void onRadioClick(View v) {

        if (v.getId() == R.id.radioSim) {

            spnqntd.setAdapter(getAbonoSim());

        } else {

            spnqntd.setAdapter(getAbonoNao());

        }


    }

    private DatePickerDialog.OnDateSetListener dataSelecionarListener = new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(DatePicker datePicker, int ano, int mes, int dia) {

            //String data = String.valueOf(dia) + "/" + String.valueOf(mes+1) + "/" + String.valueOf(ano);

            btnSelecionar.setText(DateTimeUtils.formatDate(dia, mes, ano));
        }
    };

    protected Dialog onCreateDialog(int id) {
        Calendar calen = Calendar.getInstance();
        int ano = calen.get(Calendar.YEAR);
        int mes = calen.get(Calendar.MONTH);
        int dia = calen.get(Calendar.DAY_OF_MONTH);

        switch (id) {
            case R.id.btnSelecionar:

                return new DatePickerDialog(this, dataSelecionarListener, dia, mes, ano);
        }
        return null;

    }
    public void onSelecionarData(View view){
        showDialog(view.getId());
    }
}
