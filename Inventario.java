import java.util.Scanner;
public class Inventario{
	
	public static void main(String [] args){
		Scanner sn=new Scanner(System.in);
		
		
		
		
		int [] quant;
		
		int quanty_product;
		int ubication_house;
		String total_pricehome;
		sn.nextLine();
		System.out.println(" Work expense consumption \n");
		System.out.println("Enter the material amount of materials");
		quanty_product=sn.nextInt();
		
		//Materials name
		
		name_prod=name_product(quanty_product);
		quanty_product=quanty_product(quanty_product,name_prod);
		utility_product=typ_product(quanty_product,name_prod);
		
		//Materials price
		
		price_HomeC=homecenter_price(quanty_product.name_prod);
		price_Cent=center_price(quanty_product,name_prod);
		price_neigh=neighborhood_price(quanty_product,name_prod);
		
		//Total value per house place
		
		hse_price_total=house_price_total(price_total,center_price,neighborhood_price,utility_product);
		
	}
	
	//Information
	
	public static String[] name_product(int quanty_product){
		String[] product=new String(quanty_product);
		System.out.println("Enter the following ");
		for(int i=0;1<product.length;i++){
			System.out.println("Enter the product name +" + 1+1);
			product[i]=sn.nextLine();
		}return product;
		
	}
	
	public static int [] quanty_product(int quanty_product,String [] name_prod);
	public static int [] typ_product(int quanty_product, String [] name_prod);



public static int[] Homecenter(String name_product[],int size){
	
	scanner sn=new Scanner(System.in);
	
	System.out.println(" Homecenter ");
	int [] hm= new  int [size];
	for(int i=0; i<hm.length;i++){
		System.out.println("Enter the material price: "+(name_product[i])+" in the Homecenter");
		hm[i] = sn.nextInt();
		
	}
	
	return hm;
	
}

public static int[] Ferreteriacentro(String name_product[],int size){
	
	Scanner sn=new Scanner(System.in);
	
System.out.println(" Ferreteria del centro ");
	int [] cfr= new  int [size];
	for(int i=0; i<cfr.length;i++){
		System.out.println("Enter the material price: "+(name_product[i])+" in the Ferreteria del centro");
		cfr[i] = sn.nextInt();
		
	}
	
	return cfr;
	
}

public static int[] Ferreteriabarrio(String name_product[],int size){
	
	Scanner sn=new Scanner(System.in);
	
System.out.println(" Ferreteria del barrio ");
	int [] bfr= new  int [size];
	for(int i=0; i<bfr.length;i++){
		System.out.println("Enter the material price: "+(name_product[i])+" in the Ferreteria del barrio");
		bfr[i] = sn.nextInt();
		
	}
	
	return bfr;
	
}

public static int ubicationHouse{}{
	
Scanner sn=new Scanner(System.in);
int ubc=0;
System.out.println("\nEnter the respective number to indicate the house ubication"); 
System.out.println("1.North");
System.out.println("2.South");
System.out.println("3.Center");
ubc =sn.nextInt();

return ubc;

}

public static int price_HomeCenter(int pHome []){
	Scanner sn = new Scanner(System.in);
	
	int hmp= 0;
	for(int i=0; i<pHome.length;i++){
		hmp = hmp+pHome[i];
		
		
	}
	 return hmp;
	 
	 public static int priceFerreteriadelCentro(int pCentro []){
		 Scanner sn= new Scanner(System.in);
		 
		 int fcp=0;
		 for(int i=0; i<pCentro.length;i++){
			 fcp= fcp+pCentro[i];
		 }
		 return fcp;
		 
	 }
	 


public static void total_priceHome(int ubication,int homePrice, int TOTAL_WORK){
	Scanner sc= new Scanner(System.in);
	
	int htp=0;
	int total=0;
	if(homePrice<80000){
		if (ubication==1){
			htp=homePrice+120000;
		}else if (ubication==2){
			htp=homePrice+50000;
		}else if (ubication==3){
			htp= homePrice+120000;
		}
		
		
	}else if (homePrice>=300000){
		if(ubication==1){
			htp= homePrice;
		}else if (ubication==2){
			htp=homePrice;
		}else if (ubication==3){
			htp=homePrice;
			
		}
	}else{
		
		if(ubication==1){
			htp=homePrice+28000;
		}else if (ubication==2){
			htp=homePrice;
		}else if (ubication==3){
			htp=homePrice+55000;
		}
	}
	
	total=htp+TOTAL_WORK;
	System.out.println("The price in  Homecenter");
	System.out.println("The work price in Homecenter is: "+htp+"  Without domicile");
	System.out.println("The work price in Homecenter is: "+htp);
	System.out.println("The total work price in Homecenter is: "+total);
	
}













	
	