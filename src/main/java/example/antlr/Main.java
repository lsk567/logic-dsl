package example.antlr;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger LOG = LoggerFactory.getLogger(Main.class);

    public static void main(String... args) {
        LOG.info("Running the example...");

        MTLLexer lexer = new MTLLexer(CharStreams.fromString("((a_0 && b_1) || c_2) ==> d_3"));

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MTLParser parser = new MTLParser(tokens);
        ParseTree parseTree = parser.mtl();

        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new MTLListener(), parseTree);
    }
}
