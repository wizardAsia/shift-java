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
import com.shapesecurity.functional.data.Maybe;

import org.jetbrains.annotations.NotNull;

public class IfStatement extends Statement implements Node {

    @NotNull
    public final Expression test;

    @NotNull
    public final Statement consequent;

    @NotNull
    public final Maybe<Statement> alternate;

    public IfStatement(@NotNull Expression test, @NotNull Statement consequent, @NotNull Maybe<Statement> alternate) {
        super();
        this.test = test;
        this.consequent = consequent;
        this.alternate = alternate;
    }

    @Override
    public boolean equals(Object object) {
        return object instanceof IfStatement && this.test.equals(((IfStatement) object).test) && this.consequent.equals(
            ((IfStatement) object).consequent) && this.alternate.equals(((IfStatement) object).alternate);
    }

    @Override
    public int hashCode() {
        int code = HashCodeBuilder.put(0, "IfStatement");
        code = HashCodeBuilder.put(code, this.test);
        code = HashCodeBuilder.put(code, this.consequent);
        code = HashCodeBuilder.put(code, this.alternate);
        return code;
    }

    @NotNull
    public Expression getTest() {
        return this.test;
    }

    @NotNull
    public IfStatement setTest(@NotNull Expression test) {
        return new IfStatement(test, this.consequent, this.alternate);
    }

    @NotNull
    public Statement getConsequent() {
        return this.consequent;
    }

    @NotNull
    public IfStatement setConsequent(@NotNull Statement consequent) {
        return new IfStatement(this.test, consequent, this.alternate);
    }

    @NotNull
    public Maybe<Statement> getAlternate() {
        return this.alternate;
    }

    @NotNull
    public IfStatement setAlternate(@NotNull Maybe<Statement> alternate) {
        return new IfStatement(this.test, this.consequent, alternate);
    }

}