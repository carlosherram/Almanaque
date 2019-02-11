package com.generic.eo.almanaque.Controlador;

import android.webkit.CookieManager;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;

public class HttpsUtils {

    Consola consola = new Consola(System.out);

    public HttpsUtils() {


    }

    /**
     * Obtener el response desde la url especificada.
     *
     * @param strUrl
     * @param content
     * @return
     */
    public String getHttpsResponse(String strUrl, String content) {

        String response = null;

        try {

            // Obteniendo la conexión
            HttpsURLConnection httpsURLConnection = getHttpsConnection(strUrl);

            try {

                // Obteniendo response
                response = getString(
                        httpsURLConnection.getInputStream()
                );

            } catch (Exception e) {

                e.printStackTrace();

                response = Loger.getStackTrace(e);

            } finally {

                httpsURLConnection.disconnect();

            }


        } catch (Exception e) {

            e.printStackTrace();

        }

        return response;

    }

    /**
     * Obtiene una cadena de texto.
     *
     * @param IS
     * @return
     * @throws IOException
     */
    private String getString(InputStream IS) throws IOException {

        InputStreamReader ISR = new InputStreamReader(IS);

        int data;

        StringBuilder SB = new StringBuilder("");

        while ((data = ISR.read()) != -1) {

            SB.append(
                    (char) data
            );

        }

        return SB.toString();
    }

    /**
     * Crea una conexión https.
     *
     * @param strURL
     * @return
     * @throws MalformedURLException
     */
    public HttpsURLConnection getHttpsConnection(String strURL) throws MalformedURLException {

        URL url = new URL(strURL);

        HttpsURLConnection urlConnection = null;

        try {

            urlConnection = (HttpsURLConnection) url.openConnection();

            urlConnection.setRequestMethod("GET");

            urlConnection.setReadTimeout(30 * 1000);

            urlConnection.setConnectTimeout(30 * 1000);

            urlConnection.setRequestProperty("Accept", "application/json");

            urlConnection.setRequestProperty("X-Environment", "android");

            urlConnection.setSSLSocketFactory((SSLSocketFactory) SSLSocketFactory.getDefault());

            urlConnection.connect();

        } catch (Exception e) {

            e.printStackTrace();

        }

        return urlConnection;

    }

}
