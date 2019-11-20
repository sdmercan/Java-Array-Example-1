
import java.util.Scanner;

public class SesliSessizHarf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner girdi=new Scanner(System.in);
		System.out.println("�simleri girin, bitirmek i�in bo� sat�r girin :");
		String[] isimler=new String[50];
		String[] sesliHarfler=new String[50];
		String[] sessizHarfler=new String[50];
		String isim,sesliler,sessizler;
		String sesliHarf="ae�io�u�";
		int i=0;
		while(girdi.hasNextLine())
		{
			isim=girdi.nextLine();
			if(isim==null || isim.isEmpty()) 
			{
				break;
			}
			else
			{
			  isimler[i]=isim;
			  sesliler="";
			  sessizler="";
				for(int j=0;j<isim.length();j++) 
				{
					if(sesliHarf.contains(Character.toString(isim.charAt(j)))) //contains metodu bir string i�inde arama yapmam�z� sa�lar
					{
						sesliler+=isim.charAt(j);
					}
					else
					{
						sessizler+=isim.charAt(j);
					}
					
				}
				sesliHarfler[i]=sesliler;
				sessizHarfler[i]=sessizler;
			    i++;
			}
		}
		
		System.out.println("\nSesli Harfler :");
		for(String sesli:sesliHarfler) 
		{
			if(sesli!=null)
				System.out.println(sesli);
		}
		
		System.out.println("\nSessiz Harfler :");
		for(String sessiz:sessizHarfler) 
		{
			if(sessiz!=null)
				System.out.println(sessiz);
		}
	}

}