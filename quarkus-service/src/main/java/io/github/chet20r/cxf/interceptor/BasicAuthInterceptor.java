package io.github.chet20r.cxf.interceptor;

import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.message.Message;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class BasicAuthInterceptor extends AbstractPhaseInterceptor<Message> {
    public BasicAuthInterceptor() {
        super(Phase.PRE_PROTOCOL);
        System.out.println("**************Initializing the basic auth interceptor**************");
    }

    @Override
    public void handleMessage(Message message) throws Fault {
        System.out.println("=====================Initializing the basic auth interceptor========================");
    }
}
