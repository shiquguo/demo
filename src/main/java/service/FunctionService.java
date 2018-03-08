package service;

import org.springframework.stereotype.Service;

@Service
public class FunctionService {
    public String SayHello(String word){
        return "Hello"+word+"!";
    }

}
