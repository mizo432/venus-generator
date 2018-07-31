package org.venuspj.generator.domain.model.type.classType;

import org.venuspj.generator.domain.model.diffination.fieldType.FieldTypes;
import org.venuspj.generator.domain.model.diffination.methodType.MethodTypes;
import org.venuspj.generator.domain.model.packageType.PackageType;
import org.venuspj.generator.domain.model.type.AbstractType;
import org.venuspj.generator.domain.model.type.TypeName;

import static org.venuspj.util.objects2.Objects2.nonNull;

public class ClassType extends AbstractType {
    private PackageType packageType = PackageType.newInstance();

    ClassType(PackageType packageType, TypeName typeName, MethodTypes methodTypes, FieldTypes fieldTypes) {
        super(typeName, methodTypes, fieldTypes);
        this.packageType = packageType;
    }

    public ClassType() {

    }

    @Override
    public PackageType getPackage() {
        return packageType;

    }

    public static class ClassTypeBuilder extends AbstractTypeBuilder<ClassType, ClassTypeBuilder> {
        private PackageType packageType = PackageType.newInstance();

        @Override
        protected void apply(ClassType vo, ClassTypeBuilder builder) {
            super.apply(vo, builder);
            withPackageType(vo.getPackage());
        }

        @Override
        protected ClassType createValueObject() {
            return new ClassType(packageType, typeName, methods, fields);
        }

        @Override
        protected ClassTypeBuilder getThis() {
            return this;
        }

        @Override
        protected ClassTypeBuilder newInstance() {
            return new ClassTypeBuilder();
        }

        public ClassTypeBuilder withPackageType(PackageType packageType) {
            addConfigurator(builder -> {
                if (nonNull(packageType))
                    builder.packageType = packageType;
            });
            return getThis();
        }
    }
}
