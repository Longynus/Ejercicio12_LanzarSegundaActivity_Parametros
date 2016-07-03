package happyapps.ejercicio12_lanzarsegundaactivityparametros;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Activity2 extends AppCompatActivity {

    private WebView webview1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        webview1=(WebView)findViewById(R.id.webview1);

        Bundle bundle = getIntent().getExtras();
        String dato = bundle.getString("direccion");
        webview1.setWebViewClient(new WebViewClient() {
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }});
        webview1.loadUrl("http://"+dato);

    }

    public void finalizar(View view){
        finish();
    }
}
