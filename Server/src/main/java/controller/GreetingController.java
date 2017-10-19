package controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
@RequestMapping("/api")
public class GreetingController {

    @RequestMapping(method = RequestMethod.GET, value = "/greeting")
    public @ResponseBody
    String greeting(@RequestParam(value="name", defaultValue="hans") String name) {
        return "Hallo " + name;
    }

    @ExceptionHandler
    void handleIllegalArgumentException(
            IllegalArgumentException e, HttpServletResponse response) throws IOException {

        response.sendError(HttpStatus.BAD_REQUEST.value());

    }

}
