package clases;

public class CD  extends Elemento
{
	private String interprete;
	private int numeroDeTemas;


	/**
	 * Inicializa el CD.
	 * 
	 * @param elTitulo
	 *            El t�tulo del CD.
	 * @param elInterprete
	 *            El int�rprete del CD.
	 * @param temas
	 *            El n�mero de temas del CD.
	 * @param tiempo
	 *            El tiempo que dura el CD.
	 */
	public CD(String elTitulo, String elInterprete, int temas, int tiempo)
	{
		super(elTitulo, tiempo);
		interprete = elInterprete;
		numeroDeTemas = temas;
	}
	
	/*
	 * invocacion directa al abuelo, porque metodo no esta en mi clase ni en la super
	 */
	

	
	public String getInterprete() {
		return interprete;
	}
	
	public int getNumeroDeTemas() {
		return numeroDeTemas;
	}
	
	@Override
	public void imprimir() {
		System.out.println("interprete: "+interprete);

		
	}

	
}