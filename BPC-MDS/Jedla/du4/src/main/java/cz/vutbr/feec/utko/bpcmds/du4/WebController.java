package cz.vutbr.feec.utko.bpcmds.du4;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class WebController {


    @GetMapping(value = {"", "/", "/index"})
    public String Home(){
        return "index";
    }

    @RequestMapping(value="/player", method = RequestMethod.POST)
    public String player(@RequestParam String video, Model model){
        model.addAttribute("vid", video);
        return "player";
    }


    /*
    Test streams:
http://rdmedia.bbc.co.uk/dash/ondemand/testcard/1/client_manifest-events.mpd
http://rdmedia.bbc.co.uk/dash/ondemand/elephants_dream/1/client_manifest-all.mpd
https://dash.akamaized.net/akamai/bbb_30fps/bbb_30fps.mpd
     */
}
