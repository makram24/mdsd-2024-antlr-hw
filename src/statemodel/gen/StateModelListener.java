// Generated from src/statemodel/StateModel.g4 by ANTLR 4.13.1
package statemodel.gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link StateModelParser}.
 */
public interface StateModelListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link StateModelParser#model}.
	 * @param ctx the parse tree
	 */
	void enterModel(StateModelParser.ModelContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#model}.
	 * @param ctx the parse tree
	 */
	void exitModel(StateModelParser.ModelContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateModelParser#statesBlock}.
	 * @param ctx the parse tree
	 */
	void enterStatesBlock(StateModelParser.StatesBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#statesBlock}.
	 * @param ctx the parse tree
	 */
	void exitStatesBlock(StateModelParser.StatesBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateModelParser#stateDefinition}.
	 * @param ctx the parse tree
	 */
	void enterStateDefinition(StateModelParser.StateDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#stateDefinition}.
	 * @param ctx the parse tree
	 */
	void exitStateDefinition(StateModelParser.StateDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateModelParser#colorList}.
	 * @param ctx the parse tree
	 */
	void enterColorList(StateModelParser.ColorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#colorList}.
	 * @param ctx the parse tree
	 */
	void exitColorList(StateModelParser.ColorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateModelParser#transitionsBlock}.
	 * @param ctx the parse tree
	 */
	void enterTransitionsBlock(StateModelParser.TransitionsBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#transitionsBlock}.
	 * @param ctx the parse tree
	 */
	void exitTransitionsBlock(StateModelParser.TransitionsBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateModelParser#transitionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterTransitionDefinition(StateModelParser.TransitionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateModelParser#transitionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitTransitionDefinition(StateModelParser.TransitionDefinitionContext ctx);
}