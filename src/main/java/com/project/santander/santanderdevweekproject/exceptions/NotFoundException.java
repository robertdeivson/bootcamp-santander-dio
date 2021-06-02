package com.project.santander.santanderdevweekproject.exceptions;

import com.project.santander.santanderdevweekproject.util.MessageUtils;

public class NotFoundException extends RuntimeException {
    
    public NotFoundException(){
        super(MessageUtils.NO_RECORDS_FOUND);
    }
}
