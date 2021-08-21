package cz.vutbr.cviceni02B;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping("/bob")
    public String bob(){
        return "bob";
    }

    @GetMapping("/alice")
    public String alice(Model model){
        model.addAttribute("name", "Alice");
        return "alice";
    }
}
