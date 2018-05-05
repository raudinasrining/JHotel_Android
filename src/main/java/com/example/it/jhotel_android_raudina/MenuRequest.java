package com.example.it.jhotel_android_raudina;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class MenuRequest extends StringRequest {
    private static final String Vacant_URL = "http://10.5.73.195/vacantrooms";

    public MenuRequest(Response.Listener<String> listener) {
        super(Method.GET, Vacant_URL, listener, null);

    }


    }



