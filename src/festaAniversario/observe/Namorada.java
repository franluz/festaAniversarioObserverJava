package festaAniversario.observe;

public class Namorada implements ChegadaAniversarianteObserver {

	@Override
	public void chegou(ChegadaAniversarianteEvent event) {

		System.out.println("Apagar as luzes..");
		System.out.println("Fazer sil�ncio..");
		System.out.println("Surpresa..");
	}

}