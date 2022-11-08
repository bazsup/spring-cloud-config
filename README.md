# Spring Cloud Config


## Genereate asymmetric key for encrypt/decrypt secret config
```bash
keytool -genkeypair -alias mytestkey -keyalg RSA \
  -dname "CN=Web Server,OU=Unit,O=Organization,L=City,S=State,C=US" \
  -keypass changeme -keystore server.jks -storepass letmein
```


## Clone git with submodule
```bash
git clone --recurse-submodules git@github.com:bazsup/spring-cloud-config.git
```
or 
```
git submodule update --init --recursive
```

