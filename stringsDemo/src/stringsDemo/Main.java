package stringsDemo;

public class Main {

	public static void main(String[] args) {
		
		String mesaj="   Bugun hava cok guzel.        ";
		System.out.println(mesaj);

		/*System.out.println("eleman sayisi: " +mesaj.length());
		System.out.println("5.karakter: " + mesaj.charAt(5));
		System.out.println(mesaj.concat(" Yasasinn!"));//birleştirme
		System.out.println(mesaj.startsWith("b"));
		System.out.println(mesaj.endsWith("."));
		
		char[]karakterler= new char[5];
		mesaj.getChars(0,5,karakterler,0);
		System.out.println(karakterler);
		
		System.out.println(mesaj.indexOf("av"));//a kaçıncı karakter
		System.out.println(mesaj.lastIndexOf("e"));*/
		
		
		String yeniMesaj=mesaj.replace(' ', '-');//değiştiriyor 
		System.out.println(yeniMesaj);
		System.out.println(mesaj.substring(2,5));
		
		for(String kelime:mesaj.split(" ")) {
			System.out.println(kelime);
		}
		System.out.println(mesaj.toLowerCase());//küçük harfe çevirir
		System.out.println(mesaj.toUpperCase());//harfleri büyük yazar
		System.out.println(mesaj.trim());//başında ve sonunda olan boşlukları siler

	}

}
