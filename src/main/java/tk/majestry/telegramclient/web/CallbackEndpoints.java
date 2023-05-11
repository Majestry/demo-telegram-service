package tk.majestry.telegramclient.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import tk.majestry.telegramclient.clients.KlipperRestClient;

@RestController
public class CallbackEndpoints {

    @Autowired
    KlipperRestClient klipperRestClient;

    @Value("${application.version}")
    private String appVersion;

    @RequestMapping(path = "/hello", method = RequestMethod.GET, consumes = "*/*",
            produces = "text/plain")
    public String getVersion(@RequestParam(name = "name", defaultValue = "NaN") String name) {
        var responsePayload = "Used version is %s%nResponse from klipper service is %s";
        return String.format(responsePayload, appVersion, klipperRestClient.getHello("my-custom-header", name));
    }
}
