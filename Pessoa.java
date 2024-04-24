/**
 * FUNDAMENTOS DE ENGENHARIA DE SOFTWARE
 * - Herança
 * 
 * @author Francisco Pedro Morais Gonçalves
 * https://github.com/fgonca
 */

package fundamentos.heranca;

//Superclasse abstracta
public abstract class Pessoa 
{
	protected int numero;
	protected String nome;

	protected int getNumero() 
	{
		return numero;
	}

	protected String getNome() 
	{
		return nome;
	}
}
