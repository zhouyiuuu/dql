package service;

import javax.jws.WebService;

@WebService
public interface IhelloWorld {
    String sayHello(String name);
}