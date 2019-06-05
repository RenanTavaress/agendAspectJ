package agendAspectJ;
import agendAspectJ.Trab1;

public aspect Pessoa {
	
	pointcut adicionar() : execution(* Trab1.adicionar(..));
	pointcut remover() : execution(* Trab1.remover(..));
	
	after() returning() : adicionar(){
		
		Trab1.adicionaLog();
	}
	
	after() returning() : remover(){
		Trab1.removerLog();
	}
	
	
	
}