package org.mediasoup.droid.lib;

import android.support.annotation.NonNull;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * json 生产处理类
 */
public class JsonUtils {

  public static void jsonPut(JSONObject json, String key, Object value) {
    try {
      json.put(key, value);
    } catch (JSONException e) {
      e.printStackTrace();
    }
  }

  @NonNull
  public static JSONObject toJsonObject(String data) {
    try {
      return new JSONObject(data);
    } catch (JSONException e) {
      e.printStackTrace();
      return new JSONObject();
    }
  }

  @NonNull
  public static JSONArray toJsonArray(String data) {
    try {
      return new JSONArray(data);
    } catch (JSONException e) {
      e.printStackTrace();
      return new JSONArray();
    }
  }
}
