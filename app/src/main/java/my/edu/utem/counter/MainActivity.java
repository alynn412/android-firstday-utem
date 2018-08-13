package my.edu.utem.counter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textView;  //2.create a var for textView
    int num = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.txtCounter);  //3.var look for which id
        num = 0;
    }

    public void btnInc_up(View view) {
        num = num + 1;
        //textView.setText(num+"");  //4.click button then disp based on id set
        textView.setText(Integer.toString(num));
    }

    public void btnInc_down(View view) {
        num = num - 1;
        if (num < 0)
            //where to show, what to show, how long to show
            {
                num = 0;
                Toast.makeText(MainActivity.this, "Cant decrease, count = 0", Toast.LENGTH_LONG).show();
            }
        else
            //textView.setText(num+"");  //4.click button then disp based on id set
            textView.setText(Integer.toString(num));
    }

    public void btnResetCall(View view) {

            textView.setText("0");
    }
}
