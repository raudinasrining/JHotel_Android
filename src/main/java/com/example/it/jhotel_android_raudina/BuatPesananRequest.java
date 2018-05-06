package com.example.it.jhotel_android_raudina;

import android.app.AlertDialog;
import android.view.View;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

public class BuatPesananRequest extends StringRequest {

    private static final String Book_URL = "http://10.5.72.106/bookpesanan";
    private Map<String, String> params;

    public BuatPesananRequest (int jumlah_hari, int id_customer, int id_hotel, String nomor_kamar, Response.Listener<String> listener){
        super(Method.POST, Book_URL, listener, null);
        params = new HashMap<>();
        params.put("Jumlah hari", String.valueOf(jumlah_hari));
        params.put("ID Customer", String.valueOf(id_customer));
        params.put("ID Hotel", String.valueOf(id_hotel));
        params.put("Nomor Kamar", nomor_kamar);

    }

    @Override
    public Map<String, String> getParams(){
        return params;
    }


        };

