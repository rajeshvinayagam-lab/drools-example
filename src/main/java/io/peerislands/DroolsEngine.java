package io.peerislands;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class DroolsEngine {

    private KieContainer kContainer;

    public DroolsEngine() {
        try {
            KieServices ks = KieServices.Factory.get();
            kContainer = ks.getKieClasspathContainer();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void executeRules(Object... facts) {
        try {
            KieSession kSession = kContainer.newKieSession("ksession-rules");
            for (Object fact : facts) {
                kSession.insert(fact);
            }
            kSession.fireAllRules();
            kSession.dispose();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}