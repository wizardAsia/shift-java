// Generated by src/generate-spec-java.js 

/*
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

import com.shapesecurity.functional.data.HashCodeBuilder;
import com.shapesecurity.shift.ast.operators.Precedence;

import org.jetbrains.annotations.NotNull;

public class StaticMemberExpression extends MemberExpression implements Node {

    @NotNull
    public final String property;

    @NotNull
    public final ExpressionSuper _object;

    public StaticMemberExpression(@NotNull String property, @NotNull ExpressionSuper _object) {
        super(_object);
        this.property = property;
        this._object = _object;
    }

    @Override
    public boolean equals(Object object) {
        return object instanceof StaticMemberExpression && this.property.equals(
            ((StaticMemberExpression) object).property) && this._object.equals(
            ((StaticMemberExpression) object)._object);
    }

    @Override
    public int hashCode() {
        int code = HashCodeBuilder.put(0, "StaticMemberExpression");
        code = HashCodeBuilder.put(code, this.property);
        code = HashCodeBuilder.put(code, this._object);
        return code;
    }

    @NotNull
    public String getProperty() {
        return this.property;
    }

    @NotNull
    public StaticMemberExpression setProperty(@NotNull String property) {
        return new StaticMemberExpression(property, this._object);
    }

    @NotNull
    public ExpressionSuper get_object() {
        return this._object;
    }

    @NotNull
    public StaticMemberExpression set_object(@NotNull ExpressionSuper _object) {
        return new StaticMemberExpression(this.property, _object);
    }

    @Override
    @NotNull
    public Precedence getPrecedence() {
        return Precedence.MEMBER;
    }

}