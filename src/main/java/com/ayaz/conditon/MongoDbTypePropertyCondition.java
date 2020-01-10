package com.ayaz.conditon;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class MongoDbTypePropertyCondition implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        String dbType = conditionContext.getEnvironment().getProperty("app.dbType");
        return "MONGO".equalsIgnoreCase(dbType);

    }
}
