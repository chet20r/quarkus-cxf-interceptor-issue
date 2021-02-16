package io.github.chet20r.cxf.interceptor;

import io.quarkus.arc.Unremovable;
import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.message.Message;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;
import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.inject.Singleton;
import java.util.Collections;
import java.util.List;
import java.util.Map;

@Unremovable
@Singleton
public class BasicAuthInterceptor extends AbstractPhaseInterceptor<SoapMessage> {

    private String someProperty;

    public BasicAuthInterceptor() {
        super(Phase.PRE_PROTOCOL);
    }

    void setup(@ConfigProperty(name = "some.property", defaultValue = "abc") String someProperty) {
        this.someProperty = someProperty;
    }

    @Override
    public void handleMessage(SoapMessage soapMessage) throws Fault {
        var headers = (Map<String, List<?>>) soapMessage.get(Message.PROTOCOL_HEADERS);
        headers.put("User-Agent", Collections.singletonList(someProperty));
    }
}
