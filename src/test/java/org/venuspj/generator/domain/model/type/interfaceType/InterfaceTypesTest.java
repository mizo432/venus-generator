package org.venuspj.generator.domain.model.type.interfaceType;

import org.junit.Test;

import static org.venuspj.util.objects2.Objects2.toStringHelper;

public class InterfaceTypesTest {

    @Test
    public void constructor() {
        InterfaceTypes target = new InterfaceTypes();
        System.out.println(toStringHelper(target).defaultConfig().toString());
    }

}