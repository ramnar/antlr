

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class PBMain {

	public static void main(String[] args) throws FileNotFoundException, IOException {
	
    ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(new File("examples/sample.pba")));

    powerbuilderLexer lexer = new powerbuilderLexer(input);
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    powerbuilderParser parser = new powerbuilderParser(tokens);
    ParseTree tree = parser.start_rule(); // parse

    ParseTreeWalker walker = new ParseTreeWalker(); // create standard walker
    powerbuilderBaseListener extractor = new powerbuilderBaseListener();
    walker.walk(extractor, tree); // initiate walk of tree with listener
	}

}
