package example.edittext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText firstNumberEt , secondNumberEt ;

    private Button addButton;

    private TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstNumberEt = (EditText) findViewById(R.id.first_edittext);

        secondNumberEt = (EditText) findViewById(R.id.second_edittext);

        addButton = (Button) findViewById(R.id.add_button);

        resultText = (TextView) findViewById(R.id.result_text);


        View.OnClickListener onButtonClick = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

              int fisrtNumber = Integer.parseInt(firstNumberEt.getText().toString());

                int secondNumber = Integer.parseInt(secondNumberEt.getText().toString());

                int result = fisrtNumber + secondNumber;

                resultText.setText(String.valueOf(result));
            }
        };

        addButton.setOnClickListener(onButtonClick);



    }
}
