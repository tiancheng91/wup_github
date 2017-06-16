
package qrom.component.wup.proxy;

import org.apache.http.params.BasicHttpParams;

public interface IHttpClientInvoke {
    public HttpResponseWrap execute(BasicHttpParams param, HttpPostWrap post);
}
