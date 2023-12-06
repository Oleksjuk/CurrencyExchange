package com.itstep.currencyexchange.network;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Currency {
    @SerializedName("currencyCodeA")
    @Expose
    private int codeA;

    @SerializedName("currencyCodeB")
    @Expose
    private int codeB;

    @SerializedName("date")
    @Expose
    private long date;
    @SerializedName("rateBuy")
    @Expose
    private double rateBuy;

    @SerializedName("rateCross")
    @Expose
    private double rateCross;

    @SerializedName("rateSell")
    @Expose
    private double rateSell;

    private String code = "";

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getCodeA() {
        return codeA;
    }

    public void setCodeA(int codeA) {
        this.codeA = codeA;
    }

    public int getCodeB() {
        return codeB;
    }

    public void setCodeB(int codeB) {
        this.codeB = codeB;
    }

    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
    }

    public double getRateBuy() {
        return rateBuy;
    }

    public void setRateBuy(double rateBuy) {
        this.rateBuy = rateBuy;
    }

    public double getRateCross() {
        return rateCross;
    }

    public void setRateCross(double rateCross) {
        this.rateCross = rateCross;
    }

    public double getRateSell() {
        return rateSell;
    }

    public void setRateSell(double rateSell) {
        this.rateSell = rateSell;
    }
}
