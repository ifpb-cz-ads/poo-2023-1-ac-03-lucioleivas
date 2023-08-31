public class exercicio_02{
	public static void main(String[] args){
	
	double item_1=2.95;
	double item_2=3.50;
	
	System.out.println("O item 1 custa "+item_1+" e o item 2 custa "+item_2);
	
	double result=item_1+item_2;
		
	System.out.println("A soma dos itens eh:"+result);
	
	double taxa=0.825;
	double TaxaCalculada=result*taxa;
	
	System.out.println("O resultado com a taxa eh:"+TaxaCalculada);
	
	double soma_item1=item_1+TaxaCalculada;
	double soma_item2=item_2+TaxaCalculada;
	
	double novoCusto=soma_item1+soma_item2;
	boolean muitoCaro=novoCusto>10;

	System.out.println(muitoCaro);
	
	}
}
