/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cossystem.core.util;

import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author TMXIDSJPINAM
 */
public class ManagerJSON {
    public static JSONObject getJSONObjectFromString(String jsonString) throws JSONException{
        return new JSONObject(jsonString);
    }
}
