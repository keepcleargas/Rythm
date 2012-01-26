package com.greenlaw110.rythm.internal.dialect;

import com.greenlaw110.rythm.internal.parser.build_in.*;

public class Rythm extends DialectBase {

    public String id() {
        return "rythm";
    }

    public String a() {
        return "@";
    }

    protected Class<?>[] buildInParserClasses() {
        return new Class<?>[]{ArgsParser.class, CommentParser.class, DefTagParser.class, ElseIfParser.class,
                ExpressionParser.class, ExtendsParser.class, ForEachParser.class, IfParser.class,
                ImportParser.class, RenderBodyParser.class, RenderSectionParser.class, SectionParser.class};
    }

}