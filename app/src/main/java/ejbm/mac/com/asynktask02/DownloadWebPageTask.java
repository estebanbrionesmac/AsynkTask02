package ejbm.mac.com.asynktask02;

import android.os.AsyncTask;
import android.widget.TextView;

/**
 * Created by admin on 2/3/2016.
 */
public class DownloadWebPageTask extends AsyncTask<String, Void, String> {
    private TextView textView ;

    public DownloadWebPageTask () {}

    public DownloadWebPageTask ( TextView tv) {
        textView = tv ;
    }

    public void setTV ( TextView txv ) {
        this.textView = txv ;

    }


    @Override
    protected String doInBackground(String... urls) {
        String response = "";
/*        for (String url : urls) {
            DefaultHttpClient client = new DefaultHttpClient();
            HttpGet httpGet = new HttpGet(url);
            try {
                HttpResponse execute = client.execute(httpGet);
                InputStream content = execute.getEntity().getContent();

                BufferedReader buffer = new BufferedReader(new InputStreamReader(content));
                String s = "";
                while ((s = buffer.readLine()) != null) {
                    response += s;
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return response;
*/

        response = "" + System.currentTimeMillis() ;
        try {

            Thread.sleep( 5 * 1000 );

        } catch ( Exception ex ) { ex.printStackTrace();  }

        return response + " - " + System.currentTimeMillis() ;
    }

    @Override
    protected void onPostExecute(String result) {
        textView.setText(result);
    }
}
