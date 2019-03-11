package com.jokerkiki.demo.conditional;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class AliCondition implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        Environment env = conditionContext.getEnvironment();
        String desktop = env.getProperty("sun.desktop");
        System.out.println("ali :"  + desktop);
        if(desktop.equals("windows")){
            return true;
        }
        return false;
    }
}
