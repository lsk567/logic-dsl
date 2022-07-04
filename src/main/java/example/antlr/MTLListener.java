package example.antlr;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MTLListener extends MTLParserBaseListener {
    private static final Logger LOG = LoggerFactory.getLogger(MTLListener.class);

    @Override
    public void enterFormula(MTLParser.FormulaContext ctx) {
        LOG.info(ctx.getText());
    }

    @Override
    public void enterDisjunction(MTLParser.DisjunctionContext ctx) {
        LOG.info(ctx.getText());
    }

    @Override
    public void enterConjunction(MTLParser.ConjunctionContext ctx) {
        LOG.info(ctx.getText());
    }
}
