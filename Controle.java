/**
 * FUNDAMENTOS DE ENGENHARIA DE SOFTWARE
 * - Herança
 * 
 * @author Francisco Pedro Morais Gonçalves
 * https://github.com/fgonca
 */

package fundamentos.heranca;

public class Controle 
{

	public static void main(String[] args) 
	{
		
		// instanciar paciente
		Paciente paciente = new Paciente(1, "Ngola Kiluanji");
		paciente.setEstado("bem");
		
		// obter dados do paciente
		int numeroP = paciente.getNumero(); // utilização de método herdado
		String nomeP = paciente.getNome(); // utilização de método herdado
		String estadoP= paciente.getEstado();
		
		// exibir dados do paciente
		String formularioP = "O(A) paciente %d, %s, está %s.\n";
		System.out.printf(formularioP, numeroP, nomeP, estadoP);

		// instanciar médico
		Medico medico = new Medico(2, "Njinga Mbande");
		medico.setEspecialidade("Fisioterapia");
		
		// obter dados do médico
		int numeroM = medico.getNumero(); // utilização de método herdado
		String nomeM = medico.getNome(); // utilização de método herdado
		String estadoM=  medico.getEspecialidade().toLowerCase();
		
		// exibir dados do médico
		String formularioM = "O(A) médico(a) %d, %s, é especialista em %s.\n";
		System.out.printf(formularioM, numeroM, nomeM, estadoM);
	}
}
