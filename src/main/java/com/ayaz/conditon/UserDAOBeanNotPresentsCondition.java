package com.ayaz.conditon;


import com.ayaz.dao.UserDao;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class UserDAOBeanNotPresentsCondition implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        UserDao userDao = conditionContext.getBeanFactory().getBean(UserDao.class);
        return (userDao == null);
    }
}
