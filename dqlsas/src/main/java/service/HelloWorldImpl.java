package service;
public class HelloWorldImpl implements IhelloWorld {
    @Override
    public String sayHello(String name) {
        return "Hello,"+name;
    }

}