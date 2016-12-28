package com.iag1.visitor;

public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}