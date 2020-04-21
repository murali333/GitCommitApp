package com.example.git;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class VersionController {
	@RequestMapping(value = "/version", method= GET)
    public String versionInformation() {
        return "Version 1.0-SNAPSHOT";
    }
}