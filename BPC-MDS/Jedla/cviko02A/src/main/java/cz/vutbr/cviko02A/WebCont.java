package cz.vutbr.cviko02A;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class WebCont {

    @GetMapping("form")
    public String helloForm(){
        String html = "<html>"+
                "<body>"+
                "<form method='post' action='hello'>"+
                "<input type='text' name='name'>"+
                "<input type='submit' value='pozdrav'>"+
                "</form>"+
                "</body>"+
                "</html>";
        return html;
    }

    @RequestMapping(value="hello", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public String hello(@RequestParam String name){
        return "ahoj, " + name + " vitej";
    }
}
