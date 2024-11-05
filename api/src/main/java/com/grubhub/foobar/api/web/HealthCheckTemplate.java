package com.grubhub.foobar.api.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public interface HealthCheckTemplate {

    @RequestMapping(value = "/generator/ping", method = RequestMethod.GET)
    ResponseEntity<String> ping();

    @RequestMapping(value = "/generator/healthcheck", method = RequestMethod.GET)
    ResponseEntity<String> healthCheck();
}
