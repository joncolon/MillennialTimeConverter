package nyc.c4q.jonathancolon.millennial_time_converter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private Button convertButton;
    private EditText weeksPassed;
    private TextView result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        weeksPassed = (EditText) findViewById(R.id.weeksPassed);
        result = (TextView) findViewById(R.id.result);

        convertButton = (Button) findViewById(R.id.convertButton);
        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String numInString = String.valueOf(weeksPassed.getText());
                if (numInString.isEmpty()) {
                    Toast errorToast = Toast.makeText(getApplicationContext(), "Please Enter a Number. Try Again.", Toast.LENGTH_SHORT);
                    errorToast.show();
                    return;
                }
                int num = Integer.parseInt(numInString);
                double millennialWeek = 17.33;
                double millennialWeeksPassed = ((num * millennialWeek) / 52);

                millennialWeeksPassed = Math.round(millennialWeeksPassed * 4) / 4f;
                String resultString = num + " weeks is " + millennialWeeksPassed + " year/years in millennial time.";


                // if (text.isEmpty() {
//                mResponse.setText("You done messed up");
//                return;
//            }

                result.setText(resultString);
            }
        });
    }

}
