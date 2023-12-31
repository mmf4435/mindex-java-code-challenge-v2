package com.mindex.challenge.controller;

import com.mindex.challenge.data.ReportingStructure;
import com.mindex.challenge.service.ReportingStructureService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * ReportingStructureController.java
 * A controller for getting reporting structures
 * @author Matt Favazza
 * @version 7/11/2023
 */
@RestController
public class ReportingStructureController {

    //Fields
    private static final Logger LOG = LoggerFactory.getLogger(ReportingStructureController.class);

    @Autowired
    private ReportingStructureService reportingStructureService;

    //Methods

    //REST mapping for getting a reporting structure from a specified employee id
    @GetMapping("/reportingStructure/{id}")
    public ReportingStructure request(@PathVariable String id){
        LOG.debug("Received employee reporting structure create request for id [{}]", id);

        return reportingStructureService.request(id);
    }
}
