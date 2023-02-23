package templates.interpreter.template;

public class TerminalExpressionC extends AbstractExpression{
    @Override
    // input    CD  ---> D  ----->
    // output   12  ---> 123    ----> 1234
    public void interpreter(Context context) {
        if (context.input.startsWith("C")){
            context.output=context.output+"3";
            context.input = context.input.substring(1);
        }
    }
}
