package org.ws.rm;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.xml.ws.soap.Addressing;

import org.apache.cxf.interceptor.InInterceptors;

@WebService(targetNamespace = "https://quarkiverse.github.io/quarkiverse-docs/quarkus-cxf/test/ws-rm")
@Addressing(required = true)
@InInterceptors(interceptors = { "org.ws.rm.RMStoreCheckInterceptor" })
public interface WsrmHelloService {
    @WebMethod
    String sayHello();
}