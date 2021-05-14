package exerciciobootcamp.modelo;

public enum NotaAvaliacao {
	UM(1),DOIS(2),TRES(3),
	QUATRO(4),CINCO(5),SEIS(6),
	SETE(7),OITO(8),NOVE(9),DEZ(10);
	
	private final int value;
	
	NotaAvaliacao(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return this.value;
	}
}
