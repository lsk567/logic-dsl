package example.antlr;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MTLListener extends MTLParserBaseListener {
    private static final Logger LOG = LoggerFactory.getLogger(MTLListener.class);

    @Override
    public void enterMtl(MTLParser.MtlContext ctx) {
        LOG.info("Formula: " + ctx.getText());
    }

    @Override
    public void enterEquivalence(MTLParser.EquivalenceContext ctx) {
        LOG.info("Equivalence: " + ctx.getText());
    }
    
    @Override
    public void enterImplication(MTLParser.ImplicationContext ctx) {
        LOG.info("Implication: " + ctx.getText());
    }

    @Override
    public void enterDisjunction(MTLParser.DisjunctionContext ctx) {
        LOG.info("Disjunction: " + ctx.getText());
    }

    @Override
    public void enterConjunction(MTLParser.ConjunctionContext ctx) {
        LOG.info("Conjunction: " + ctx.getText());
    }

    @Override
    public void enterBinaryOp(MTLParser.BinaryOpContext ctx) {
        LOG.info("BinaryOp: " + ctx.getText());
    }

    @Override
    public void enterUnaryOp(MTLParser.UnaryOpContext ctx) {
        LOG.info("UnaryOp: " + ctx.getText());
    }

    @Override
    public void enterPrimary(MTLParser.PrimaryContext ctx) {
        LOG.info("Primary: " + ctx.getText());
    }

    @Override
    public void enterAtomicProp(MTLParser.AtomicPropContext ctx) {
        LOG.info("AtomicProp: " + ctx.getText());
    }
}
