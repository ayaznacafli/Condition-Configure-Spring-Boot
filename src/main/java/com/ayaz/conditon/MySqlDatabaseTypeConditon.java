package com.ayaz.conditon;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class MySqlDatabaseTypeConditon implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        String enabledDBType = System.getProperty("dbType");
        return (enabledDBType != null &&
                enabledDBType.equalsIgnoreCase("MONGODB"));
    }
}
