package hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import domain.BotRequest;

@Controller
@RequestMapping("/webhook")
public class HelloWorldController {

    @RequestMapping(method = RequestMethod.POST)
    public @ResponseBody WebhookResponse webhook(@RequestBody BotRequest botRequest){

        return new WebhookResponse("Hello! " + botRequest.getResult().getFulfillment().getSpeech(), "Text " + botRequest.getResult().getFulfillment().getSpeech());
    }
}
