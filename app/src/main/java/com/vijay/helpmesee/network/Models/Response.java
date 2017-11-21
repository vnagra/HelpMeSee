
package com.vijay.helpmesee.network.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class Response implements Serializable {

    private final static long serialVersionUID = 8305276336921840990L;
    @SerializedName("responses")
    @Expose
    private List<Response_> responses = null;

    public List<Response_> getResponses() {
        return responses;
    }

    public void setResponses(List<Response_> responses) {
        this.responses = responses;
    }

}
