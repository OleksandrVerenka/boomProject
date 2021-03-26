package boomproject.demo.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DemoTestService {

    public String getRandomShit() {
        return "Bla bla bla";
    }

    public List<Demo> getDemoList() {
        List<Demo> demos = new ArrayList<Demo>();
        demos.add(new Demo("1", getRandomShit(), 13));
        demos.add(new Demo("2", getRandomShit(), 33));
        return demos;
    }

}
