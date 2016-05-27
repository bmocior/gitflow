package pl.proacta;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class RestSampleController {
    @RequestMapping("/")
    Map<String, Object> home() {
        Map<String, Object> x = new HashMap<>();
        x.put("a", "b");
        x.put("c", "d");
        return x;
    }
}
