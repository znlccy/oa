package com.youda.oa.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.web.servlet.error.DefaultErrorAttributes;
import org.springframework.stereotype.Controller;

@Controller
public class ErrorController extends AbstractMethodError {

    Log log = LogFactory.getLog(ErrorController.class);

    public ErrorController() {
        super();
    }

}
