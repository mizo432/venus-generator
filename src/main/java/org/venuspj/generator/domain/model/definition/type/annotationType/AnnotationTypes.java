package org.venuspj.generator.domain.model.definition.type.annotationType;

import java.util.Collection;
import java.util.List;

import static org.venuspj.util.collect.Lists2.newArrayList;

public class AnnotationTypes {

    private List<AnnotationType> list = newArrayList();

    public AnnotationTypes() {

    }

    private AnnotationTypes(Collection<? extends AnnotationType> collection) {
        this.list.addAll(collection);

    }

    public static AnnotationTypes of(Collection<? extends AnnotationType> collection) {
        return new AnnotationTypes(collection);
    }

}
