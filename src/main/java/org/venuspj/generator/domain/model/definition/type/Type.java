package org.venuspj.generator.domain.model.definition.type;

import org.venuspj.generator.domain.model.definition.fieldType.FieldTypes;
import org.venuspj.generator.domain.model.definition.methodType.MethodTypes;

public interface Type {

    TypeName getTypeName();

    MethodTypes getMethods();

    FieldTypes getFields();

}
