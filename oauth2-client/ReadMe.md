in properties the valus of :
registration:
  oidc-client:==> the value in http://127.0.0.1:8080/login/oauth2/code/oidc-client (redirect-uri)
    client-id: nbs

to be redirected to login page from auth server 
call :  http://127.0.0.1:8080/token call ok
http://localhost:8080/token ko 


http://127.0.0.1:8080/token  ll call auto /authorize + generate code and get token based in prop config 
