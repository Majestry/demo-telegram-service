//package tk.majestry.telegramclient.clients;
//
//import feign.RequestInterceptor;
//import feign.RequestTemplate;
//import jakarta.servlet.http.HttpServletRequest;
//import org.springframework.stereotype.Component;
//import org.springframework.web.context.request.RequestContextHolder;
//import org.springframework.web.context.request.ServletRequestAttributes;
//
//@Component
//public class CustomHeaderInterceptor implements RequestInterceptor
//{
//    @Override
//    public void apply(RequestTemplate requestTemplate)
//    {
//        HttpServletRequest request =
//                ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
//        requestTemplate.header("X-Intercepted-Header", request.getHeader("X-Introduced-Header"));
//    }
//}
