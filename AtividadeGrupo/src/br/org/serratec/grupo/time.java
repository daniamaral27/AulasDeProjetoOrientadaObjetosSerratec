package br.org.serratec.grupo;

public class time {
private String nomeTime;
private String tecnico;
private String diretor;
public time(String nomeTime, String tecnico, String diretor) {
	super();
	this.nomeTime = nomeTime;
	this.tecnico = tecnico;
	this.diretor = diretor;
}
@Override
public String toString() {
	return "time [nomeTime=" + nomeTime + ", tecnico=" + tecnico + ", diretor=" + diretor + "]";
}
public String getNomeTime() {
	return nomeTime;
}
public String getTecnico() {
	return tecnico;
}
public String getDiretor() {
	return diretor;
}


}
