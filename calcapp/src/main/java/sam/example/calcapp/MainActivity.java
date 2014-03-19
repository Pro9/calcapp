package sam.example.calcapp;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            final View rootView = inflater.inflate(R.layout.fragment_main, container, false);

            Button btAdd = (Button)rootView.findViewById(R.id.btAdd);
            Button btSub = (Button)rootView.findViewById(R.id.btSub);

            btAdd.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int n1, n2;

                    EditText numberField1 = (EditText)rootView.findViewById(R.id.numberField1);
                    EditText numberField2 = (EditText)rootView.findViewById(R.id.numberField2);

                    n1 = Integer.parseInt(numberField1.getText().toString());
                    n2 = Integer.parseInt(numberField2.getText().toString());

                    TextView tvResult = (TextView)rootView.findViewById(R.id.tvResult);
                    tvResult.setText("Result: "+(n1+n2));
                }
            });

            btSub.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int n1, n2;

                    EditText numberField1 = (EditText)rootView.findViewById(R.id.numberField1);
                    EditText numberField2 = (EditText)rootView.findViewById(R.id.numberField2);

                    n1 = Integer.parseInt(numberField1.getText().toString());
                    n2 = Integer.parseInt(numberField2.getText().toString());

                    TextView tvResult = (TextView)rootView.findViewById(R.id.tvResult);
                    tvResult.setText("Result: "+(n1-n2));
                }
            });

            return rootView;
        }
    }

}
