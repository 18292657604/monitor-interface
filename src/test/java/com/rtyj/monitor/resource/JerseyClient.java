package com.rtyj.monitor.resource;



import org.glassfish.jersey.client.authentication.HttpAuthenticationFeature;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import static org.glassfish.jersey.client.authentication.HttpAuthenticationFeature.HTTP_AUTHENTICATION_BASIC_PASSWORD;
import static org.glassfish.jersey.client.authentication.HttpAuthenticationFeature.HTTP_AUTHENTICATION_BASIC_USERNAME;


/**
 * Created by lsy on 2017/12/6.
 * 调用Jersey的服务的客户端
 */
public class JerseyClient {

    public static String REST_URL = "http://localhost:8888/monitor-interface/rest";


    public static void main(String args[]) throws Exception{
        String url = "http://localhost:8888/monitor-interface/rest/admin";
        Client client = ClientBuilder.newClient();
        Invocation.Builder bulider = client.target(url).request()
                .property(HTTP_AUTHENTICATION_BASIC_USERNAME, "homer")
                .property(HTTP_AUTHENTICATION_BASIC_PASSWORD, "p1swd745");
//        Invocation.Builder bulider = webtarget.request(MediaType.TEXT_PLAIN);
        String result = bulider.get(String.class);
        System.out.println("结果是："+result);
    }

}
