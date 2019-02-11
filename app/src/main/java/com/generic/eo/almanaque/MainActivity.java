package com.generic.eo.almanaque;

import android.os.AsyncTask;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import com.generic.eo.almanaque.Controlador.Adaptador;
import com.generic.eo.almanaque.Controlador.Consola;
import com.generic.eo.almanaque.Controlador.HttpTask;
import com.generic.eo.almanaque.Modelo.AsyncTaskEvents;
import com.generic.eo.almanaque.Modelo.MainMenu;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

public class MainActivity extends AppCompatActivity implements AsyncTaskEvents {

    /**
     * Url para realizar las consultas.
     */
    String strBaseURL = "https://pokeapi.co/api/v2/";

    /**
     * Imprime mensajes en consola.
     */
    Consola consola;

    /**
     * Indica si los datos se cargaron.
     */
    boolean cargado = false;

    /**
     * Lista en pantalla.
     */
    ListView listView;

    /**
     * Lista de opciones.
     */
    MainMenu mainMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        configure();

    }

    /**
     * Configura los elementos que serán usados.
     */
    private void configure() {

        consola = new Consola(System.out);

        listView = findViewById(R.id.lvResultado);

    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);

        if (cargado) {

            // Cargar los datos en pantalla, no los solicita nuevamente
            cargarLista();

            return;

        }

        solicitarDatos();

    }

    /**
     * Solicitar los datos al api.
     */
    public void solicitarDatos() {

        HttpTask httpTask = new HttpTask();

        httpTask.setAsyncTaskEvents(this);

        httpTask.executeOnExecutor(
                AsyncTask.THREAD_POOL_EXECUTOR,
                new String[]{
                        strBaseURL,
                }
        );

    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putString("strBaseURL", strBaseURL);

        outState.putBoolean("cargado", cargado);

    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        strBaseURL = savedInstanceState.getString("strBaseURL");

        cargado = savedInstanceState.getBoolean("cargado");

    }

    @Override
    public void onPostExecute(String response, boolean estado) {

        procesarRespuesta(response, estado);

    }

    /**
     * Se procesa la respuesta.
     *
     * @param response
     * @param estado
     */
    public void procesarRespuesta(String response, boolean estado) {

        if (estado == false) {

            Toast.makeText(this, response, Toast.LENGTH_SHORT).show();

            return;

        }

        JsonParser jsonParser = new JsonParser();

        JsonElement jsonElement = jsonParser.parse(response);

        Gson gson = new Gson();

        mainMenu = gson.fromJson(jsonElement, MainMenu.class);

        cargarLista();

        cargado = true;

    }

    /**
     * Carga los datos en la vista de lista.
     */
    private void cargarLista() {

        consola.println("Cargando los datos a la lista");

        mainMenu.print();

        Adaptador adaptador = new Adaptador(mainMenu.getListaItems(), getLayoutInflater());

        listView.setAdapter(adaptador);

    }

}
