package kr.hs.emirim.mirim_0614_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {
    ViewFlipper vFlip;
    EditText editInterval;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vFlip = findViewById(R.id.vflip);
        // vFlip.setFlipInterval(1000);
        editInterval = findViewById(R.id.edit_interval);
        Button btnstart = findViewById(R.id.btn_start);
        Button btnstop = findViewById(R.id.btn_stop);
        Button btnsecond = findViewById(R.id.btn_second);

        btnstart.setOnClickListener(btnListener);
        btnstop.setOnClickListener(btnListener);
        btnsecond.setOnClickListener(btnListener);
    }

    View.OnClickListener btnListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.btn_start:
                    vFlip.startFlipping();
                    break;
                case R.id.btn_stop:
                    vFlip.stopFlipping();
                    break;
                case R.id.btn_second:
                    int second = Integer.parseInt(editInterval.getText().toString());
                    vFlip.setFlipInterval(second*1000);
                    break;
            }
        }
    };
}