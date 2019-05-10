package com.android.gumeoficial.weatherapp.Models;

import com.google.gson.annotations.SerializedName;

public class Temperature {

    @SerializedName("temp")
    private float temperatura;
    private float presion;
    private float humedad;
    @SerializedName("temp_min")
    private float tempMin;
    @SerializedName("temp_max")
    private float tempMax;


    public Temperature() {
    }

    public Temperature(float temperatura, float presion, float humedad, float tempMin, float tempMax) {
        this.temperatura = temperatura;
        this.presion = presion;
        this.humedad = humedad;
        this.tempMin = tempMin;
        this.tempMax = tempMax;
    }

    public float getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }

    public float getPresion() {
        return presion;
    }

    public void setPresion(float presion) {
        this.presion = presion;
    }

    public float getHumedad() {
        return humedad;
    }

    public void setHumedad(float humedad) {
        this.humedad = humedad;
    }

    public float getTempMin() {
        return tempMin;
    }

    public void setTempMin(float tempMin) {
        this.tempMin = tempMin;
    }

    public float getTempMax() {
        return tempMax;
    }

    public void setTempMax(float tempMax) {
        this.tempMax = tempMax;
    }
}
