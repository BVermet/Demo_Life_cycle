package be.howest.nmct.android.lifecycle;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;



public class LifeCycleActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_cycle);
        if (savedInstanceState == null){
            getFragmentManager().beginTransaction()
                    .add(R.id.container, new LifeCycleFragment())
                    .commit();
        }
        Log.d(getClass().getSimpleName(), "onCreate");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(getClass().getSimpleName(), "onDestroy");
    }
    @Override
    protected void onPause()
    {
        super.onPause();
        Log.d(getClass().getSimpleName(), "onPause");
    }
    @Override
    protected void onRestart()
    {
        super.onRestart();
        Log.d(getClass().getSimpleName(), "onRestart");
    }
    @Override
    protected void onResume()
    {
        super.onResume();
        Log.d(getClass().getSimpleName(), "onResume");
    }
    @Override
    protected void onStart()
    {
        super.onStart();
        Log.d(getClass().getSimpleName(), "onStart");
    }
    @Override
    protected void onStop()
    {
        super.onStop();
        Log.d(getClass().getSimpleName(), "onStop");
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_life_cycle, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
