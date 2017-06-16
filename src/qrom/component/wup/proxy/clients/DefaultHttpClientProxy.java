
package qrom.component.wup.proxy.clients;

import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;

import qrom.component.wup.proxy.HttpPostWrap;
import qrom.component.wup.proxy.HttpResponseWrap;
import qrom.component.wup.proxy.IHttpClientInvoke;

public class DefaultHttpClientProxy implements IHttpClientInvoke {
    public DefaultHttpClientProxy() {

    }

    @Override
    public HttpResponseWrap execute(BasicHttpParams param, HttpPostWrap post) {
        HttpClient client = new DefaultHttpClient(param);
        // return client.execute(post.getBody());
        return null;
    }
}
