package boomproject.demo.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DemoController {

    @Autowired
    DemoTestService demoTestService;

    @Autowired
    Logger logger;

    @GetMapping("/demo")
    public List<Demo> getAllReservations(){
        logger.log();
        return demoTestService.getDemoList();
    }

    @GetMapping("/demo/{id}")
    public Demo getDemoById(@PathVariable("id") String id) {
        Demo demo = null;
        logger.log();
        for (Demo demo1 : demoTestService.getDemoList()) {
            if(id.equals(demo1.getId())) {
                demo = demo1;
            }
        }
        return demo;
    }

    @GetMapping("/demo/info")
    public String getInfo(@RequestParam(value = "message", required = false) String message) {
        if(message != null) {
            return message;
        } else {
            return "No data";
        }
    }

}
