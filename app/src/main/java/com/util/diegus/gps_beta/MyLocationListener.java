package com.util.diegus.gps_beta;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;

/**
 * Created by HP on 27/08/2015.
 */
public class MyLocationListener implements LocationListener {
    MainActivity mainActivity;

    public MainActivity getMainActivity() {
        return mainActivity;
    }

    public void setMainActivity(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
    }


    @Override
    public void onLocationChanged(Location location) {
        location.getLatitude();
        location.getLongitude();

        String info = "MI unicacion antual es: " + "\n latitud = "
                + location.getLatitude() + "\n Longitud = " + location.getLongitude();

        mainActivity.messageTextView.setText(info);
        this.mainActivity.setLocation(location);
    }

    @Override
    public void onProviderDisabled(String s) {
        // Este mŽtodo se ejecuta cuando el GPS es desactivado
        mainActivity.messageTextView.setText("GPS Desactivado");
    }

    @Override
    public void onProviderEnabled(String s) {
        // Este mŽtodo se ejecuta cuando el GPS es activado
        mainActivity.messageTextView.setText("GPS Activado");
    }

    @Override
    public void onStatusChanged(String s, int i, Bundle bundle) {
        // Este metodo se ejecuta cada vez que se detecta un cambio en el
        // status del proveedor de localizaci—n (GPS)
        // Los diferentes Status son:
        // OUT_OF_SERVICE -> Si el proveedor esta fuera de servicio
        // TEMPORARILY_UNAVAILABLE -> Temp˜ralmente no disponible pero se
        // espera que este disponible en breve
        // AVAILABLE -> Disponible
    }

}
