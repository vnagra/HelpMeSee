
package com.vijay.helpmesee.network;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class Response_ implements Serializable {

    private final static long serialVersionUID = -8581507235923951351L;
    @SerializedName("labelAnnotations")
    @Expose
    private List<LabelAnnotation> labelAnnotations = null;

    public List<LabelAnnotation> getLabelAnnotations() {
        return labelAnnotations;
    }

    public void setLabelAnnotations(List<LabelAnnotation> labelAnnotations) {
        this.labelAnnotations = labelAnnotations;
    }

}
