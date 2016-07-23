package calculator

object calculator_testing {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(66); 
  println("Hello");$skip(185); 
  def computeValues1(
    namedExpressions: Map[String, Signal[Expr]]): Map[String, Signal[Double]] = {
    println(namedExpressions)
    val x = Map(("Name" -> Signal(2.0)))
    x
  };System.out.println("""computeValues1: (namedExpressions: Map[String,calculator.Signal[calculator.Expr]])Map[String,calculator.Signal[Double]]""");$skip(88); 

  def eval1(expr: Expr, references: Map[String, Signal[Expr]]): Double = {
    ???
  };System.out.println("""eval1: (expr: calculator.Expr, references: Map[String,calculator.Signal[calculator.Expr]])Double""");$skip(322); 

  /**
   * Get the Expr for a referenced variables.
   *  If the variable is not known, returns a literal NaN.
   */
  private def getReferenceExpr1(name: String, references: Map[String, Signal[Expr]]) = {
    references.get(name).fold[Expr] {
      Literal(Double.NaN)
    } { exprSignal =>
      exprSignal()
    }
  };System.out.println("""getReferenceExpr1: (name: String, references: Map[String,calculator.Signal[calculator.Expr]])calculator.Expr""")}
}
