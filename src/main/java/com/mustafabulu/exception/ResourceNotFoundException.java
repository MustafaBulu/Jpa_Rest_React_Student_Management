package com.mustafabulu.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


// eğer databasede uygun bir kayıt yok ResourceNotFoundException a girecek.
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException{

    private static final long serialVersionUID=1L;

    public ResourceNotFoundException(String message){
        super(message);
    }
}
