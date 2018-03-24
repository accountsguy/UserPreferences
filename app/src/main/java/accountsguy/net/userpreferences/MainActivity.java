package accountsguy.net.userpreferences;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static String updatedPreference, password, sex, occupation;
    SharedPreferences sharedPreferences;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);

        password = sharedPreferences.getString("password", "TestPassword");
        sex = sharedPreferences.getString("sex", "Male");
        occupation = sharedPreferences.getString("occupation","Business");

        updatedPreference = "Password : "+ password+" - Sex : "+sex+" - Occupation : " + occupation;
        textView = (TextView) findViewById(R.id.result);
        textView.setText(updatedPreference);
    }

    public void change(View view) {
        startActivity(new Intent(this, preferencesClass.class));
    }

    public void show(View view) {
        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(MainActivity.this);
        password = sharedPreferences.getString("password", "TestPassword");
        sex = sharedPreferences.getString("sex", "Male");
        occupation = sharedPreferences.getString("occupation", "Business");

        updatedPreference = "Password : "+ password+" - Sex : "+sex+" - Occupation : " + occupation;
        textView.setText(updatedPreference);
    }
}
