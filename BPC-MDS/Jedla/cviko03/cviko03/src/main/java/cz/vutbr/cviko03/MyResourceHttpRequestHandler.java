package cz.vutbr.cviko03;

import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.resource.ResourceHttpRequestHandler;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

@Component
public class MyResourceHttpRequestHandler extends ResourceHttpRequestHandler {

    final static String ATTR_FILE = MyResourceHttpRequestHandler.class.getName() + ".file";

    @Override
    protected Resource getResource(HttpServletRequest request) throws IOException{
        final File file = (File) request.getAttribute(ATTR_FILE);
        return new FileSystemResource(file);
    }
}
