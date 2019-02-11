package com.generic.eo.almanaque.Controlador;

import android.os.AsyncTask;

import com.generic.eo.almanaque.Modelo.AsyncTaskEvents;

public class HttpTask extends AsyncTask {

    /**
     * Realiza las llamadas https.
     */
    HttpsUtils httpsUtils = new HttpsUtils();

    AsyncTaskEvents asyncTaskEvents;

    boolean estado = false;

    public void setAsyncTaskEvents(AsyncTaskEvents asyncTaskEvents) {

        this.asyncTaskEvents = asyncTaskEvents;

    }

    @Override
    protected Object doInBackground(Object[] objects) {

        String response;

        try {
            String type;

            String url = (String) objects[0];

            String content = null;

            if (objects.length > 1)
                content = (String) objects[1];

            type = url.contains("https:") ? "https" : "http";

            switch (type.trim().toLowerCase()) {

                case "https":
                    response = httpsUtils.getHttpsResponse(url, content);
                    estado = true;

                    break;

                default:
                    response = "No se reconoce el protocolo en la URL proporcionada!";

            }

        } catch (Exception e) {

            e.printStackTrace();

            response = Loger.getStackTrace(e);

            estado = false;

        }

        return response;

    }

    @Override
    protected void onPostExecute(Object result) {
        super.onPostExecute(result);

        if (asyncTaskEvents != null) {

            asyncTaskEvents.onPostExecute((String) result, estado);

        }

    }

}
