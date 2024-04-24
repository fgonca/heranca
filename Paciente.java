/**
 * FUNDAMENTOS DE ENGENHARIA DE SOFTWARE
 * - Herança
 * 
 * @author Francisco Pedro Morais Gonçalves
 * https://github.com/fgonca
 */

package fundamentos.heranca;

//Declaração de subclasse
public class Paciente extends Pessoa
{
	private String estado;

	public Paciente(int numero, String nome) 
	{
		this.numero = numero;
		this.nome = nome;
	}
	
	public String getEstado() 
	{
		return estado;
	}

	public void setEstado(String estado) 
	{
		this.estado = estado;
	}
}
