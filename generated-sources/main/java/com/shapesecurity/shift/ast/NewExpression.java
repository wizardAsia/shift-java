// Generated by src/generate-spec-java.js 

/**
 * Copyright 2015 Shape Security, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.shapesecurity.shift.ast;

import org.jetbrains.annotations.NotNull;
import com.shapesecurity.functional.data.HashCodeBuilder;
import com.shapesecurity.functional.data.ImmutableList;
import com.shapesecurity.shift.ast.operators.Precedence;

public class NewExpression extends Expression
{

  @NotNull
  public final Expression callee;

  @NotNull
  public final ImmutableList<SpreadElementExpression> arguments;

  public NewExpression (@NotNull Expression callee, @NotNull ImmutableList<SpreadElementExpression> arguments)
  {
    super();
    this.callee = callee;
    this.arguments = arguments;
  }

  @Override
  public boolean equals(Object object)
  {
    return object instanceof NewExpression && this.callee.equals(((NewExpression) object).callee) && this.arguments.equals(((NewExpression) object).arguments);
  }

  @Override
  public int hashCode()
  {
    int code = HashCodeBuilder.put(0, "NewExpression");
    code = HashCodeBuilder.put(code, this.callee);
    code = HashCodeBuilder.put(code, this.arguments);
    return code;
  }

  @NotNull
  public Expression getCallee()
  {
    return this.callee;
  }

  @NotNull
  public ImmutableList<SpreadElementExpression> getArguments()
  {
    return this.arguments;
  }

  @NotNull
  public NewExpression setCallee(@NotNull Expression callee)
  {
    return new NewExpression(callee, this.arguments);
  }

  @NotNull
  public NewExpression setArguments(@NotNull ImmutableList<SpreadElementExpression> arguments)
  {
    return new NewExpression(this.callee, arguments);
  }

  @Override
  @NotNull
  public Precedence getPrecedence()
  {
    return this.arguments.isEmpty() ? Precedence.NEW : Precedence.MEMBER;
  }

}