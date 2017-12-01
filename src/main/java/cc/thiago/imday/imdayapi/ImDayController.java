package cc.thiago.imday.imdayapi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ImDayController {

    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public List<String> imday() {
        return Arrays.asList("Maicon", "Cezar", "Thiago", "Gustavo", "Caio", "Glauber");
    }
}
