package com.ailiens.common;

import com.codahale.metrics.annotation.*;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jayant on 1/1/17.
 */

@RestController
@RequestMapping(value = "/graphite")
public class GraphiteTestController {

    @RequestMapping(value = "/test", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @Timed
    @ExceptionMetered
    public ResponseEntity<?> test() {
        return ResponseEntity.ok("reported to graphite");
    }
}
