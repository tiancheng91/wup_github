
package qrom.component.wup.proxy;

import org.apache.http.Header;
import org.apache.http.HeaderIterator;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolVersion;
import org.apache.http.StatusLine;
import org.apache.http.params.HttpParams;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Locale;

public class HttpResponseWrap implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private int statusCode = 0;
    private HashMap<String, String> mHeaders = null;
    private byte[] mBody = null;

    public HttpResponseWrap(int code, HashMap<String, String> headers, byte[] rspBytes) {
        statusCode = code;
        mHeaders = headers;
        mBody = rspBytes;
    }

    public HttpResponse getResponse() {
        return new HttpResponseObj(this);
    }

    public HashMap<String, String> getAllHeaders() {
        return mHeaders;
    }

    public byte[] getResponseData() {
        return mBody;
    }

    public int getStatusCode() {
        return statusCode;
    }
}
