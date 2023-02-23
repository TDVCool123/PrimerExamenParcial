package templates.interpreter.template;

public class TerminalExpressionD extends AbstractExpression{
    @Override
    // input     D  ----->
    // output    123    ----> 1234
    public void interpreter(Context context) {
        if (context.input.startsWith("D")){
            context.output=context.output+"4";
            context.input = context.input.substring(1);
        }
    }
}
