package accountsguy.net.userpreferences;

import android.annotation.TargetApi;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.preference.PreferenceActivity;
import android.preference.PreferenceManager;
import android.support.annotation.Nullable;

/**
 * Created by advic on 24/03/2018.
 */

public class preferencesClass extends PreferenceActivity //implements SharedPreferences.OnSharedPreferenceChangeListener {
{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preferences);
    }

//    @Override
//    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String key) {
//        MainActivity.password = sharedPreferences.getString("password", "");
//        MainActivity.sex = sharedPreferences.getString("sex", "");
//        MainActivity.occupation = sharedPreferences.getString("occupation","");
//    }
}
