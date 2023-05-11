package tk.majestry.telegramclient.clients;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import tk.majestry.KlipperResponse;

@FeignClient(name = "klipper-service", url = "${klipper.hostname}")
public interface KlipperRestClient
{
    @GetMapping(path = "/hello", consumes = "*/*", produces = "application/json")
    KlipperResponse getHello(@RequestHeader("X-Custom-Header") String customHeader,
                             @RequestParam(name = "name") String name);

}
