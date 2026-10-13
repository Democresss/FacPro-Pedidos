package org.facturadorproecuador.app;

import android.webkit.JavascriptInterface;

/** Lo que la página puede pedirle al teléfono: window.FacProNativo (solo existe dentro de la app). */
public class Puente {

    private final MainActivity app;

    Puente(MainActivity app) {
        this.app = app;
    }

    @JavascriptInterface
    public String version() {
        return BuildConfig.VERSION_NAME;
    }

    @JavascriptInterface
    public String app() {
        return "pedidos";
    }

    @JavascriptInterface
    public void guardarArchivo(String dataUrl, String nombre) {
        app.guardarArchivo(dataUrl, nombre);
    }
}
