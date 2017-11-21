
package com.vijay.helpmesee.network.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class LabelAnnotation implements Serializable {

    private final static long serialVersionUID = 4731324874716397591L;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("mid")
    @Expose
    private String mid;
    @SerializedName("score")
    @Expose
    private Float score;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public Float getScore() {
        return score;
    }

    public void setScore(Float score) {
        this.score = score;
    }

}
