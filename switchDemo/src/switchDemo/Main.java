package switchDemo;

public class Main {

	public static void main(String[] args) {
        char grade= 'A';
		

		switch(grade) {
			case 'A':
				System.out.println("mükemmel : geçiniz");
				break;
			case 'B':
			case 'C':
				System.out.println("iyi : geçiniz");
				break;
			case 'D':
				System.out.println("fena değil: geçiniz");
				break;
			case 'F':
				System.out.println("maalesef: kaldınız");
				break;
			default:
					System.out.println("gecersiz not girdiniz");
			
		}
	}


	}


