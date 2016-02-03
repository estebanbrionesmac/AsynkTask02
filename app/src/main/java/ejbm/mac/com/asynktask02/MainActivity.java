package ejbm.mac.com.asynktask02;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Fragment4AsyncTasks f4at ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fm = getFragmentManager() ;
        f4at = (Fragment4AsyncTasks) fm.findFragmentByTag("TAG_F1") ;
        FragmentTransaction fragmentTransaction = fm.beginTransaction();

        if ( f4at == null ) {
            f4at = new Fragment4AsyncTasks();
        }

        f4at.setTV( (TextView) findViewById( R.id.tv1 ));

        fragmentTransaction.add( f4at, "TAG_F1") ;

    }

   public void metodo( View v ) {
        f4at.downloadWP( "" + ((TextView) findViewById( R.id.tv1 )).getText()  );
    }
}
