package com.adeliarizki202102253.forex;

import com.google.gson.annotations.SerializedName;

public class RootModel {

    @SerializedName("rates")
    private RatesModel ratesModel;

    public RatesModel getRatesModel() { return ratesModel;}

    public void setRatesModel(RatesModel ratesModel) { this.ratesModel = ratesModel; }


}
