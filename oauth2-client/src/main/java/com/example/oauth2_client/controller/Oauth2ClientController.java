package com.example.oauth2_client.controller;


import org.springframework.security.oauth2.client.OAuth2AuthorizedClient;
import org.springframework.security.oauth2.client.annotation.RegisteredOAuth2AuthorizedClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Oauth2ClientController {

    /* http://127.0.0.1:8080/token call ok
    http://localhost:8080/token ko ! don t use localhost
     */
    @GetMapping("/token")
    public String getToken(@RegisteredOAuth2AuthorizedClient("oidc-client") OAuth2AuthorizedClient authorizedClient) {
        String jwtAccessToken = authorizedClient.getAccessToken().getTokenValue();
        System.out.println("jwtAccessToken =  " + jwtAccessToken);
        return jwtAccessToken;
    }


}
