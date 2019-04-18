package sg.edu.rp.c346.demoradiobutton;

import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         Button btn = findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 RadioGroup rg = findViewById(R.id.radioGroup);

                 int selectedID = rg.getCheckedRadioButtonId();
                 RadioButton rb1 = findViewById(selectedID);

                Toast.makeText(getBaseContext(), rb1.getText(), Toast.LENGTH_LONG).show();
            }
        });

    }
}
