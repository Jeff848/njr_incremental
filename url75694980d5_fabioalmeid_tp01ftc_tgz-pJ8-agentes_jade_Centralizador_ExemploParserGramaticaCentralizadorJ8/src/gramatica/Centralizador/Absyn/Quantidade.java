package gramatica.Centralizador.Absyn; // Java Package generated by the BNF Converter.

public abstract class Quantidade implements java.io.Serializable {
  public abstract <R,A> R accept(Quantidade.Visitor<R,A> v, A arg);
  public interface Visitor <R,A> {
    public R visit(gramatica.Centralizador.Absyn.EQtde1 p, A arg);

  }

}
