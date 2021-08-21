package cz.vutbr.feec.utko.bpcmds.projekt;

import java.io.File;
        import java.io.IOException;

        import javax.servlet.http.HttpServletRequest;

        import org.springframework.core.io.FileSystemResource;
        import org.springframework.core.io.Resource;
        import org.springframework.stereotype.Component;
        import org.springframework.web.servlet.resource.ResourceHttpRequestHandler;

@Component
public class ProjectResourceComponent extends ResourceHttpRequestHandler {

    final static String ATTR_FILE = ProjectResourceComponent.class.getName() + ".file";

    @Override
    protected Resource getResource(HttpServletRequest request) throws IOException {

        final File file = (File) request.getAttribute(ATTR_FILE);
        return new FileSystemResource(file);
    }

}
