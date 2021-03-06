package com.intuit.karate;

import java.util.HashMap;

/**
 *
 * @author pthomas3
 */
public class ScriptValueMap extends HashMap<String, ScriptValue> {

    public static final String VAR_READ = "read";
    public static final String VAR_RESPONSE = "response";
    public static final String VAR_COOKIES = "cookies";
    public static final String VAR_HEADERS = "headers";
    public static final String VAR_RESPONSE_HEADERS = "responseHeaders";
    public static final String VAR_RESPONSE_STATUS = "responseStatus";

    public ScriptValue put(String key, Object value) {
        ScriptValue sv = new ScriptValue(value);
        return super.put(key, sv);
    }

    public <T> T get(String key, Class<T> clazz) {
        ScriptValue sv = get(key);
        if (sv == null) {
            return null;
        }
        return sv.getValue(clazz);
    }

}
