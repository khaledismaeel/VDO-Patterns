package test;

import rqcode.concepts.Checkable;
import rqcode.stigs.win10.Windows10SecurityTechnicalImplementationGuide;

public class SimpleTest {
    for (Checkable r: Windows10SecurityTechnicalImplementationGuide.allSTIGs()){
        r.check();

    }
}
