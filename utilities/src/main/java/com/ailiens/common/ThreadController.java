package com.ailiens.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jayant on 3/6/17.
 */

@RestController
@RequestMapping("/admin")
public class ThreadController {

    @Autowired
    ThreadDumpAnalyzer threadDumpAnalyzer;

    @RequestMapping(value = "/threadDump", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ThreadAnalysisReport threadDump() throws Exception {

        return threadDumpAnalyzer.invoke();
    }
}
