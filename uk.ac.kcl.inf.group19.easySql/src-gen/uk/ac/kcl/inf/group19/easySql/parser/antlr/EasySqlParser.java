/*
 * generated by Xtext 2.25.0
 */
package uk.ac.kcl.inf.group19.easySql.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import uk.ac.kcl.inf.group19.easySql.parser.antlr.internal.InternalEasySqlParser;
import uk.ac.kcl.inf.group19.easySql.services.EasySqlGrammarAccess;

public class EasySqlParser extends AbstractAntlrParser {

	@Inject
	private EasySqlGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalEasySqlParser createParser(XtextTokenStream stream) {
		return new InternalEasySqlParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "SqlProgram";
	}

	public EasySqlGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(EasySqlGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
