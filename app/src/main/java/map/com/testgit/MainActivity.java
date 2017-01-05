package map.com.testgit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 *Ganesh...
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Utils.add(10,10);
    }
}
