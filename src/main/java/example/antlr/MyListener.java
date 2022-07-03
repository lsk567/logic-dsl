package example.antlr;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyListener extends MTLParserBaseListener {
    private static final Logger LOG = LoggerFactory.getLogger(MyListener.class);

    // @Override
    public void enterFormula(MTLParser.FormulaContext ctx) {
        LOG.info(ctx.getText());
    }
}
