package org.shiva.kotlin.basics.function;

public class FunctionJavaClient {
    public static void main(String[] args) {
        FunctionDefinitionKt.displayCharacter();
        FunctionDefinitionKt.displayCharacter('$');
        FunctionDefinitionKt.displayCharacter('&', 3);
        FunctionDefinitionKt.displayMax(3, 4);
    }
}
