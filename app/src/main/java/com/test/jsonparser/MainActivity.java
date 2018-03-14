package com.test.jsonparser;

import android.app.LoaderManager;
import android.content.Loader;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

public class MainActivity extends AppCompatActivity implements LoaderManager.LoaderCallbacks<Response> {

    private static final int NEWS_LOADER_ID = 1;
    TextView textView;
    BaseLoader baseLoader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.text_result);

        baseLoader = (BaseLoader) getLoaderManager().initLoader(NEWS_LOADER_ID, null, this);

    }

    @Override
    public Loader<Response> onCreateLoader(int i, Bundle bundle) {
        if (i == NEWS_LOADER_ID) {
            baseLoader = new BaseLoader(this, "https://api.dellin.ru/static/catalog/terminals_v3.json");
        }
        return baseLoader;
    }

    @Override
    public void onLoadFinished(Loader<Response> loader, Response warehouses) {
        Response response = warehouses;
        textView.setText(response.toString());
    }

    @Override
    public void onLoaderReset(Loader<Response> loader) {

    }
}
