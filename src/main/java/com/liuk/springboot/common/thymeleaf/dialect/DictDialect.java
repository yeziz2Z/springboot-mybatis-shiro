package com.liuk.springboot.common.thymeleaf.dialect;

import org.thymeleaf.dialect.AbstractDialect;
import org.thymeleaf.dialect.IExpressionObjectDialect;
import org.thymeleaf.expression.IExpressionObjectFactory;

public class DictDialect extends AbstractDialect implements IExpressionObjectDialect {

    private final IExpressionObjectFactory DICT_EXPRESSION_OBJECT_FACTORY = new DictExpressionObjectFactory();

    public DictDialect() {
        super("dictUtils");
    }

    @Override
    public IExpressionObjectFactory getExpressionObjectFactory() {
        return this.DICT_EXPRESSION_OBJECT_FACTORY;
    }
}
