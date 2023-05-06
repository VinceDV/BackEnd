package LettoreMultimediale;

public interface Riproducibile {

	static void alzaVolume(int volume, int x) {
		volume = volume + x;
	};
	static void abbassaVolume(int volume, int x) {
		volume = volume - x;
	};
}
