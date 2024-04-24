/**
 * FUNDAMENTOS DE ENGENHARIA DE SOFTWARE
 * - Herança
 * 
 * @author Francisco Pedro Morais Gonçalves
 * https://github.com/fgonca
 */

package fundamentos.heranca;

//Declaração de subclasse
public class Medico extends Pessoa
{
	private String especialidade;

	public Medico(int numero, String nome) 
	{
		this.numero = numero;
		this.nome = nome;
	}

	public String getEspecialidade() 
	{
		return especialidade;
	}

	public void setEspecialidade(String especialidade) 
	{
		this.especialidade = especialidade;
	}	
}
