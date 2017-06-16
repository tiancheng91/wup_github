
package qrom.component.wup.proxy;

import org.apache.http.params.BasicHttpParams;

public class HttpClientProxy implements IHttpClientInvoke {
    private IHttpClientInvoke mClient = null;

    @Override
    public HttpResponseWrap execute(BasicHttpParams param, HttpPostWrap post) {
        // TODO Auto-generated method stub
        mClient.execute(param, post);
        return null;
    }

}
