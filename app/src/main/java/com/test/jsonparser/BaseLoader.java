package com.test.jsonparser;

import android.content.AsyncTaskLoader;
import android.content.Context;

import java.util.List;

/**
 * Created by pyrov on 14.03.2018.
 */

public class BaseLoader extends AsyncTaskLoader<Response> {

    String url;

    public BaseLoader(Context context, String url) {
        super(context);
        this.url = url;
    }

    @Override
    public Response loadInBackground() {
        if (url == null) {
            return null;
        }
        Response warehouses = QueryUtils.fetchWarehouseData(url);
        return warehouses;
    }
    public void setUrl (String url){
        this.url = url;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    @Override
    protected void onForceLoad() {
        super.onForceLoad();
    }
}
