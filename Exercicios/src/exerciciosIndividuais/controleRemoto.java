package exerciciosIndividuais;

public class controleRemoto implements controladorControleRemoto {
	private Double volume;
	private Boolean ligado;
	private Boolean tocando;
	public controleRemoto(Double volume, Boolean ligado, Boolean tocando) {
		this.volume = 50.;
		this.ligado = false;
		this.tocando = false;
	}
	//override (sobreescrita)
	@Override
	public void ligar() {
		this.setLigado(true);
		
	}
	@Override
	public void desligar() {
		this.setLigado(false);
		
	}
		
	@Override
	public void abrirMenu() {
		System.out.println("Está ligado?" + this.getLigado());
		System.out.println("Está tocando?" + this.getTocando());
		System.out.println("Volume" + this.getVolume());
	for (int i = 0; i <= this.getVolume(); i+=10.) {
		System.out.println("|");
	}	
		System.out.println("Fechando menu");
	}
	
	@Override
	public void fecharMenu() {
		System.out.println("Fechando menu");
	}
	
	@Override
	public void maisVolume() {
		if (this.getLigado()) {
	}	this.setVolume(getVolume() + 5);
		}
		
	@Override
	public void menosVolume() {
		if (this.getLigado()) {
	}	this.setVolume(getVolume() - 5);
			}
	
	@Override
	public void ligarMudo() {
		if (this.getLigado() && this.getVolume() > 0.0);
			}
		
	@Override
	public void desligarMudo() {
		if (getLigado() && getVolume() < 0.0);
			}
	
	@Override
	public void play() {
		if (this.getLigado() &&	! (this.getTocando()));
			this.setTocando(tocando);
			}

	@Override
	public void pause() {
		if (this.getLigado() && (this.getTocando()));
		
			}
	
	public Double getVolume() {
		return volume;
	}
	public void setVolume(Double volume) {
		this.volume = volume;
	}
	public Boolean getLigado() {
		return ligado;
	}
	public void setLigado(Boolean ligado) {
		this.ligado = ligado;
	}
	public Boolean getTocando() {
		return tocando;
	}
	public void setTocando(Boolean tocando) {
		this.tocando = tocando;
	}
	
}
	