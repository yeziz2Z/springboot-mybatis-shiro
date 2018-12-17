package com.liuk.springboot.common.thymeleaf.dialect;

import com.liuk.springboot.common.SpringContextHolder;
import com.liuk.springboot.sys.service.IDictValueService;
import org.thymeleaf.context.IExpressionContext;
import org.thymeleaf.expression.IExpressionObjectFactory;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class DictExpressionObjectFactory implements IExpressionObjectFactory {

    private static final String DICT_EVALUATION_VARIABLE_NAME = "dictUtils";

    private static final Set<String> ALL_EXPRESSION_OBJECT_NAMES = Collections.unmodifiableSet(
            new HashSet<>(Arrays.asList(DICT_EVALUATION_VARIABLE_NAME)));

    @Override
    public Set<String> getAllExpressionObjectNames() {
        return ALL_EXPRESSION_OBJECT_NAMES;
    }

    @Override
    public Object buildObject(IExpressionContext context, String expressionObjectName) {
        return DICT_EVALUATION_VARIABLE_NAME.equals(expressionObjectName)?SpringContextHolder.getBean(IDictValueService.class):null;
    }

    @Override
    public boolean isCacheable(String expressionObjectName) {
        return expressionObjectName != null && expressionObjectName.equals(DICT_EVALUATION_VARIABLE_NAME);
    }
}
