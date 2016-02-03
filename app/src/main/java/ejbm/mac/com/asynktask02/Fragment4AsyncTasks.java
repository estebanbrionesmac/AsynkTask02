package ejbm.mac.com.asynktask02;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by admin on 2/3/2016.
 */
public class Fragment4AsyncTasks extends Fragment {

    DownloadWebPageTask dwpt = null ;
    TextView tv = null ;

    public Fragment4AsyncTasks () {
        // Required empty public constructor

        dwpt = new DownloadWebPageTask ( ) ;
    }


/*    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return null ;
    }
*/

    public void setTV ( TextView txv ) {
        this.tv = txv ;

    }

    public void downloadWP ( String x ) {
        dwpt.setTV( this.tv );
        dwpt.execute( ) ;
    }



}
