package com.shapesecurity.shift.parser.statements;

import com.shapesecurity.functional.data.ImmutableList;
import com.shapesecurity.shift.ast.*;
import com.shapesecurity.shift.parser.Assertions;
import com.shapesecurity.shift.parser.JsError;
import org.junit.Test;

/**
 * Created by u478 on 6/10/15.
 */
public class BlockStatementTest extends Assertions {
  @Test
  public void testBlockStatement() throws JsError {
    testScript("{ foo }", new BlockStatement(new Block(ImmutableList.list(new ExpressionStatement(
        new IdentifierExpression("foo"))))));

    testScript("{ doThis(); doThat(); }", new BlockStatement(new Block(ImmutableList.list(
        new ExpressionStatement(new CallExpression(new IdentifierExpression("doThis"), ImmutableList.nil())),
        new ExpressionStatement(new CallExpression(new IdentifierExpression("doThat"), ImmutableList.nil()))))));

    testScript("{}", new BlockStatement(new Block(ImmutableList.nil())));
  }
}