package tk.majestry.telegramclient.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "klipper", url = "${klipper.hostName}")
public interface KlipperRestClient {

    @RequestMapping(path = "/hello", method = RequestMethod.GET, consumes = "text/plain",
            produces = "text/plain")
    String getHello(@RequestParam(name = "name") String name);
}
