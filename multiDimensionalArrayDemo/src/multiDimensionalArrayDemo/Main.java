package multiDimensionalArrayDemo;

public class Main {

	public static void main(String[] args) {
		String[][] sehirler = new String[3][3];
		sehirler[0][0]="Ankara";
		sehirler[0][1]="İstanbul";
		sehirler[0][2]="İzmir";
		sehirler[1][0]="Bursa";
		sehirler[1][1]="Antalya";
		sehirler[1][2]="Gaziantep";
		sehirler[2][0]="Konya";
		sehirler[2][1]="Kayseri";
		sehirler[2][2]="Şanlıurfa";
		for(int i=0; i<=2; i++) {
			System.out.println("------------");
			for(int j=0; j<=2; j++) {
			
				System.out.println(sehirler[i][j]);
			}
		}

	}

}
