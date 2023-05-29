package projetoMequi;

import java.util.Scanner;

public class ProjetoMequi {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		     // INTRODUÇAO DO CARDÁPIO //

     	System.out.println("---------------------------");
     	System.out.println("---------------------------");
    	System.out.println("-------PROJETO MEQUI-------");
    	System.out.println("---------------------------");
     	System.out.println("---------------------------");
	   	System.out.println("");
		System.out.println("");
		System.out.println("----SELECIONE UMA OPÇÃO----");
		System.out.println("");
    	System.out.println("*********Cardápio**********");
     	System.out.println("");
 		System.out.println("1 - Lançamentos");
		System.out.println("2 - Brabos do Méqui");
 		System.out.println("3 - Sanduíches de Carne Bovina");
     	System.out.println("4 - Família Tasty");
    	System.out.println("5 - Sanduíches de Frango");
		System.out.println("6 - Mc Lanche Feliz");
    	System.out.println("7 - Méqui 1000");
 		System.out.println("8 - Acompanhamentos");
		System.out.println("9 - Sobremesas");
    	System.out.println("10 - Bebidas Frias");
    	System.out.println("11 - Café da Manhã");
    	System.out.println("12 - Bebidas Quentes");
    	System.out.println("13 - Mc Ofertas");
    	System.out.println("14 - Méqui Box");
    	System.out.println("15 - Mc Café");

		                        // 1ª OPÇÃO MENU = LANÇAMENTOS //

		    int opcaoMenu = sc.nextInt();
		    switch (opcaoMenu) {
case 1:
	    System.out.println("---VOCÊ SELECIONOU A OPÇÃO 1---");
	    System.out.println("");
	    System.out.println("*********Lançamentos**********");
	    System.out.println("");
	    System.out.println("1 - McCrispy Chicken Legend");
	    System.out.println("2 - McFlurry Trufa Lingua de Gato DUO Kopenhagen Chocolate");
	    System.out.println("3 - McFlurry Trufa Lingua de Gato DUO Kopenhagen Morango");
	    System.out.println("4 - McFlurry Trufa Lingua de Gato DUO Kopenhagen Caramelo");
	    System.out.println("");
	    System.out.println("*********Cardápio**********");
	    System.out.println("");
	
	int opcaoMenuSubMenu1 = sc.nextInt();
	switch (opcaoMenuSubMenu1) {
	case 1:
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 1 --");
		System.out.println("");
		System.out.println("1 - McCrispy Chicken Legend");
		System.out.println("");
		System.out.println("926 kcal");
		System.out.println("Composto por pão tipo brioche com batata, molho do CBO, cebola crispy, bacon em fatias, alface americana, queijo sabor cheddar e carne 100% de peito de frango, temperada e empanada.");
		break;
	case 2:
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 1 --");
		System.out.println("");
		System.out.println("2 - McFlurry Trufa Lingua de Gato DUO Kopenhagen Chocolate");
		System.out.println("");
		System.out.println("319 kcal");
		System.out.println("O novo McFlurry promete toda qualidade que só o Méqui e a Kopenhagen podem oferecer! A sobremesa é composta por espetaculares trufas Língua de Gato DUO Kopenhagen, bebida láctea sabor baunilha e cobertura sabor chocolate.");
		break;
	case 3:
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 1 --");
		System.out.println("");
		System.out.println("3 - McFlurry Trufa Lingua de Gato DUO Kopenhagen Morango");
		System.out.println("");
		System.out.println("479 kcal");
		System.out.println("O novo McFlurry promete toda qualidade que só o Méqui e a Kopenhagen podem oferecer! A sobremesa é composta por espetaculares trufas Língua de Gato DUO Kopenhagen, bebida láctea sabor baunilha e cobertura de morango.");
		break;
	case 4:
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 1 --");
		System.out.println("");
		System.out.println("4 - McFlurry Trufa Lingua de Gato DUO Kopenhagen Caramelo");
		System.out.println("");
		System.out.println("325 kcal");
		System.out.println("O novo McFlurry promete toda qualidade que só o Méqui e a Kopenhagen podem oferecer! A sobremesa é composta por espetaculares trufas Língua de Gato DUO Kopenhagen, bebida láctea sabor baunilha e cobertura de caramelo.");
		break;
}
break;
			
		                     // 2ª OPÇÃO MENU = BRABOS DO MÉQUI //
			
case 2:
        System.out.println("---VOCÊ SELECIONOU A OPÇÃO 2---");
	    System.out.println("");
	    System.out.println("*********Brabos do Méqui**********");
	    System.out.println("");
	    System.out.println("1 - Brabo Melt Crispy");
	    System.out.println("2 - Brabo Bacon Salad");
	    System.out.println("");
	    System.out.println("*********Cardápio**********");
	    System.out.println("");

	 int opcaoMenuSubMenu2 = sc.nextInt();
	 switch (opcaoMenuSubMenu2) {
	 case 1:
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 2 --");
		System.out.println("");
		System.out.println("1 - Brabo Melt Crispy");
		System.out.println("");
		System.out.println("1057 kcal");
		System.out.println("Delicioso molho lácteo cremoso sabor cheddar, hambúrguer de carne 100% bovina, a nova Méquinese, exclusiva maionese especial com sabor de carne defumada, cebola crispy, fatias de bacon, queijo sabor cheddar, tudo isso no pão tipo brioche trazendo uma explosão de sabores a cada mordida!");
		break;
	 case 2:
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 2 --");
		System.out.println("");
		System.out.println("2 - Brabo Bacon Salad");
		System.out.println("");
		System.out.println("1064 kcal");
		System.out.println("Composto pelo nosso pão tipo brioche, hambúrguer de carne 100% bovina, a nova Méquinese, exclusiva maionese especial com sabor de carne defumada, alface, tomate, fatias de bacon e queijo sabor cheddar.");
		break;
} 
break;

		                       // 3ª OPÇÃO MENU = SANDUÍCHES DE CARNE BOVINA //

case 3:
	    System.out.println("---VOCÊ SELECIONOU A OPÇÃO 3---");
	    System.out.println("");
	    System.out.println("*****Sanduíches de Carne Bovina*****");
 		System.out.println("");
    	System.out.println("1 - Big Mac");
	    System.out.println("2 - Duplo Quarteirão");
    	System.out.println("3 - Duplo Quarteirão com Queijo");
 		System.out.println("4 - Mc Nífico Bacon");
    	System.out.println("5 - Duplo Cheddar McMelt");
    	System.out.println("6 - Cheddar McMelt");
    	System.out.println("7 - Duplo Burger Bacon");
    	System.out.println("8 - Duplo Burguer com Queijo");
    	System.out.println("9 - Triplo Burger");
		System.out.println("10 - McFiesta");
		System.out.println("11 - Cheeseburger");
		System.out.println("12 - Hamburger");
		System.out.println("");
		System.out.println("*********Cardápio**********");
		System.out.println("");

	int opcaoMenuSubMenu3 = sc.nextInt();

	switch (opcaoMenuSubMenu3) {
	case 1:
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 3 --");
		System.out.println("");
		System.out.println("1 - Big Mac");
		System.out.println("");
		System.out.println("503 kcal");
		System.out.println("Dois hambúrgueres (100% carne bovina), alface americana, queijo sabor cheddar, molho especial, cebola, picles e pão com gergelim.");
		break;
	case 2:
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 3 --");
		System.out.println("");
		System.out.println("2 - Duplo Quarteirão");
		System.out.println("");
		System.out.println("762 kcal");
		System.out.println("Dois hambúrgueres (100% carne bovina), mostarda, ketchup, cebola, queijo sabor cheddar e pão com gergelim.");
		break;
	case 3:
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 3 --");
		System.out.println("");
		System.out.println("3 - Duplo Quarteirão com Queijo");
		System.out.println("");
		System.out.println("523 kcal");
		System.out.println("Um hambúrguer (100% carne bovina), queijo sabor cheddar, picles, cebola, ketchup, mostarda e pão com gergelim.");
		break;
	case 4:
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 3 --");
		System.out.println("");
		System.out.println("4 - Mc Nífico Bacon");
		System.out.println("");
		System.out.println("571 kcal");
		System.out.println("Um hambúrguer (100% carne bovina), bacon, alface americana, cebola, queijo sabor cheddar, tomate, maionese, ketchup, mostarda e pão com gergelim.");
		break;
	case 5:
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 3 --");
		System.out.println("");
		System.out.println("5 - Duplo Cheddar McMelt");
		System.out.println("");
		System.out.println("786 kcal");
		System.out.println("Dois hambúrgueres (100% carne bovina), molho lácteo cremoso sabor cheddar, cebola ao molho shoyu e pão escuro com gergelim.");
		break;
	case 6:
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 3 --");
		System.out.println("");
		System.out.println("6 - Cheddar McMelt");
		System.out.println("");
		System.out.println("474 kcal");
		System.out.println("Um hambúrguer (100% carne bovina), molho lácteo cremoso sabor cheddar, cebola ao molho shoyu e pão escuro com gergelim.");
		break;
	case 7:
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 3 --");
		System.out.println("");
		System.out.println("7 - Duplo Burger Bacon");
		System.out.println("");
		System.out.println("447 kcal");
		System.out.println("Dois hambúrgueres (100% carne bovina), queijo sabor cheddar, cebola, fatias de bacon, ketchup, mostarda e pão com gergelim.");
		break;
	case 8:
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 3 --");
		System.out.println("");
		System.out.println("8 - Duplo Burguer com Queijo");
		System.out.println("");
		System.out.println("478 kcal");
		System.out.println("Dois hambúrgueres, uma explosão de sabor. Dois deliciosos hambúrgueres de carne 100% bovina, queijo sabor cheddar derretido, picles, cebola picada, ketchup, mostarda e pão com gergelim.");
		break;
	case 9:
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 3 --");
		System.out.println("");
		System.out.println("9 - Triplo Burger");
		System.out.println("");
		System.out.println("559 kcal");
		System.out.println("Três hambúrgueres (100% carne bovina), queijo sabor cheddar, cebola, picles, ketchup, mostarda e pão com gergelim.");
		break;
	case 10:
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 3 --");
		System.out.println("");
		System.out.println("10 - McFiesta");
		System.out.println("");
		System.out.println("272 kcal");
		System.out.println("Hambúrguer de carne 100% bovina, alface, tomate e maionese no pão quentinho.");
		break;
	case 11:
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 3 --");
		System.out.println("");
		System.out.println("11 - Cheeseburger");
		System.out.println("");
		System.out.println("302 kcal");
		System.out.println("Um hamburguer (100% carne bovina), queijo sabor cheddar, cebola, picles, ketchup, mostarda e pão sem gergelim.");
		break;
	case 12:
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 3 --");
		System.out.println("");
		System.out.println("12 - Hamburger");
		System.out.println("");
		System.out.println("247 kcal");
		System.out.println("Um Hamburguer (100% carne bovina), cebola, picles, ketchup, mostarda e pão sem gergelim.");
		break;		
}	
break;
			
			                   // 4ª OPÇÃO MENU = FAMÍLIA TASTY //
			
case 4:
    	System.out.println("---VOCÊ SELECIONOU A OPÇÃO 4 ---");
 		System.out.println("");
		System.out.println("*********Família Tasty**********");
		System.out.println("");
		System.out.println("1 - Big Tasty");
    	System.out.println("");
    	System.out.println("*********Cardápio**********");
    	System.out.println("");

	int opcaoMenuSubMenu4 = sc.nextInt();
	switch (opcaoMenuSubMenu4) {
	case 1:
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 4 --");
		System.out.println("");
		System.out.println("1 - Big Tasty");
		System.out.println("");
		System.out.println("944 kcal");
		System.out.println("Um hambúrguer (100% carne bovina), queijo sabor emental, tomate, alface americana, cebola, molho Tasty e pão com gergelim.");
		break;
}
break;	
					
					     // 5ª OPÇÃO MENU = SANDUÍCHES DE FRANGO //
					
case 5:
		System.out.println("---VOCÊ SELECIONOU A OPÇÃO 5---");
		System.out.println("");
		System.out.println("*********Sanduíches de Frango**********");
		System.out.println("");
		System.out.println("1 - McCrispy Chicken Legend");
		System.out.println("2 - McCrispy Chicken Deluxe");
		System.out.println("3 - McCrispy Chicken Melt & Bacon");
		System.out.println("4 - McChicken Bacon");
		System.out.println("5 - McChicken");
		System.out.println("6 - Chicken Jr.");
		System.out.println("");
		System.out.println("*********Cardápio**********");
		System.out.println("");
		
	int opcaoMenuSubMenu5 = sc.nextInt();
	switch (opcaoMenuSubMenu5) {
	case 1:
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 5 --");
		System.out.println("");
		System.out.println("1 - McCrispy Chicken Legend");
		System.out.println("");
		System.out.println("926 kcal");
		System.out.println("Composto por pão tipo brioche com batata, molho do CBO, cebola crispy, bacon em fatias, alface americana, queijo sabor cheddar e carne 100% de peito de frango, temperada e empanada.");
		break;
	case 2:
	    System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 5 --");
		System.out.println("");
		System.out.println("2 - McCrispy Chicken Deluxe");
		System.out.println("");
		System.out.println("497 kcal");
		System.out.println("Sanduiche composto por tipo brioche com batata, carne 100% de peito de frango, temperada e empanada, maionese, alface americana e tomate.");
		break;
	case 3:
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 5 --");
		System.out.println("");
		System.out.println("3 - McCrispy Chicken Melt & Bacon");
		System.out.println("");
		System.out.println("628 kcal");
		System.out.println("Sanduiche composto por pão tipo brioche com batata, carne 100% de peito de frango, temperada e empanada, molho lácteo cremoso sabor cheddar e fatias de bacon.");
		break;
	case 4:
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 5 --");
		System.out.println("");
		System.out.println("4 - McChicken Bacon");
		System.out.println("");
		System.out.println("430 kcal");
		System.out.println("Frango empanado, maionese, bacon, alface americana e pão com gergelim.");
		break;
	case 5:
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 5 --");
		System.out.println("");
		System.out.println("5 - McChicken");
		System.out.println("");
		System.out.println("396 kcal");
		System.out.println("Frango empanado, maionese, alface americana e pão com gergelim.");
	    break;
	case 6:
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 5 --");
		System.out.println("");
		System.out.println("6 - Chicken Jr.");
		System.out.println("");
		System.out.println("352 kcal");
		System.out.println("Frango empanado, maionese, alface americana e pão com gergelim.");
		break;
}		
break;
		
		                // 6ª OPÇÃO MENU = MCLANCHE FELIZ //
		
case 6:
		
		System.out.println("---VOCÊ SELECIONOU A OPÇÃO 6---");
		System.out.println("");
		System.out.println("*********McLanche Feliz**********");
		System.out.println("");
		System.out.println("*********Cardápio**********");
		System.out.println("");

	int opcaoMenuSubMenu6 = sc.nextInt();
	switch (opcaoMenuSubMenu6) {
	case 1:
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 6 --");
		System.out.println("");
		System.out.println("1 - Hamburguer + McFritas Kids + Del Valle 100% Uva + Petit Suisse Sabor Morango");
	    break;
}
break;
		
		                  // 7ª OPÇÃO MENU = MÉQUI 1000 //
		
case 7:
	
	    System.out.println("---VOCÊ SELECIONOU A OPÇÃO 7---");
	    System.out.println("");
	    System.out.println("*********Méqui 1000**********");
	    System.out.println("");
	    System.out.println("1 - SuperMc");
	    System.out.println("2 - McRings Cheddar Bacon");
	    System.out.println("3 - Caldo&Freddo Chocolate");
	    System.out.println("4 - Caldo&Freddo Morango");
	    System.out.println("5 - Caldo&Freddo Caramelo");
	    System.out.println("6 - McRings Bacon");
	    System.out.println("");
	    System.out.println("*********Cardápio**********");
	    System.out.println("");
	
	int opcaoMenuSubMenu7 = sc.nextInt();
	switch (opcaoMenuSubMenu7) {
	case 1:
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 7 --");
		System.out.println("");
		System.out.println("1 - SuperMc");
		System.out.println("");
		System.out.println("475 kcal");
		System.out.println("Um hamburguer (100% bovino), alface americana, cebola, ketchup, molho tasty, maionese, picles, queijo sabor cheddar, tomate e pão com gergelim.");
		break;
	case 2:
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 7 --");
		System.out.println("");
		System.out.println("2 - McRings Cheddar Bacon");
		System.out.println("");
		System.out.println("1089 kcal");
		System.out.println("A crocante e deliciosa cebola empanada do Méqui, agora com melt sabor cheddar e bacon crispy.");
		break;
	case 3:
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 7 --");
		System.out.println("");
		System.out.println("3 - Caldo&Freddo Chocolate");
		System.out.println("");
		System.out.println("495 kcal");
		System.out.println("Sobremesa composta por mix de baunilha, cobertura sabor chocolate e torta de maçã.");
		break;
	case 4:
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 7 --");
		System.out.println("");
		System.out.println("4 - Caldo&Freddo Morango");
		System.out.println("");
		System.out.println("478 kcal");
		System.out.println("Sobremesa composta por mix de baunilha, cobertura de morango e torta de maçã.");
		break;
	case 5:
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 7 --");
		System.out.println("");
		System.out.println("5 - Caldo&Freddo Caramelo");
		System.out.println("");
		System.out.println("502 kcal");
		System.out.println("Sobremesa composta por mix de baunilha, cobertura de caramelo e torta de maçã.");
		break;
	case 6:
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 7 --");
		System.out.println("");
		System.out.println("6 - McRings Bacon");
		System.out.println("");
		System.out.println("959 kcal");
		System.out.println("Esse delicioso sanduiche é composto por um hambúrguer (100% carne bovina), queijo sabor emental, bacon, cebola frita empanada, maionese, ketchup e pão tipo brioche.)");
		break;
}
break;
	    
	                           // 8ª OPÇÃO MENU = ACOMPANHAMENTOS //
	   
case 8: 
				
	    System.out.println("---VOCÊ SELECIONOU A OPÇÃO 8---");
	    System.out.println("");
	    System.out.println("*********Acompanhamentos**********");
	    System.out.println("");
	    System.out.println("1 - McFritas Cheddar Bacon");
	    System.out.println("2 - McFritas Grande");
	    System.out.println("3 - McFritas Média");
	    System.out.println("4 - McFritas Pequena");
	    System.out.println("5 - McFritas Kids");
	    System.out.println("6 - Chiken McNuggets 4 unidades");
	    System.out.println("7 - Chiken McNuggets 6 unidades");
	    System.out.println("8 - Chiken McNuggets 10 unidades");
	    System.out.println("9 - Molho Agridoce");
	    System.out.println("10 - Molho Barbecue");
	    System.out.println("11 - Molho Ranch");
	    System.out.println("12 - Molho Capipira");
	    System.out.println("13 - Mega McNuggets");
	    System.out.println("14 - Ketchup");
	    System.out.println("15 - Mostarda");
	    System.out.println("16 - Tomatinho");
	    System.out.println("17 - Mega Mcfritas");
	    System.out.println("");
	    System.out.println("*********Cardápio**********");
	    System.out.println("");
	
	int opcaoMenuSubMenu8 = sc.nextInt();
	switch (opcaoMenuSubMenu8) {
	case 1:
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 8 --");
		System.out.println("");
		System.out.println("1 - McFritas Cheddar Bacon");
		System.out.println("");
		System.out.println("525 kcal");
		System.out.println("A batata frita mais famosa do mundo, agora com melt sabor cheddar e bacon crispy.");
		break;
	case 2:
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 8 --");
		System.out.println("");
		System.out.println("2 - McFritas Grande");
		System.out.println("");
		System.out.println("364 kcal");
		System.out.println("A batata frita mais famosa do mundo. Deliciosas batatas selecionadas, fritas, crocantes por fora, macias por dentro, douradas, irresistíveis, saborosas, famosas, e todos os outros adjetivos positivos que você quiser dar.");
		break;
	case 3:
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 8 --");
		System.out.println("");
		System.out.println("3 - McFritas Média");
		System.out.println("");
		System.out.println("254 kcal");
		System.out.println("A batata frita mais famosa do mundo. Deliciosas batatas selecionadas, fritas, crocantes por fora, macias por dentro, douradas, irresistíveis, saborosas, famosas, e todos os outros adjetivos positivos que você quiser dar.");
		break;
	case 4:
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 8 --");
		System.out.println("");
		System.out.println("4 - McFritas Pequena");
		System.out.println("");
		System.out.println("182 kcal");
		System.out.println("A batata frita mais famosa do mundo. Deliciosas batatas selecionadas, fritas, crocantes por fora, macias por dentro, douradas, irresistíveis, saborosas, famosas, e todos os outros adjetivos positivos que você quiser dar.");
		break;
	case 5:
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 8 --");
		System.out.println("");
		System.out.println("5 - McFritas Kids");
		System.out.println("");
		System.out.println("80 kcal");
		System.out.println("Nossas clássicas McFritas douradas e crocantes com toque ideal de sal em uma porção perfeita pras crianças.");
		break;
	case 6:
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 8 --");
		System.out.println("");
		System.out.println("6 - Chiken McNuggets 4 unidades");
		System.out.println("");
		System.out.println("155 kcal");
		System.out.println("Crocantes, leves e deliciosos. Os frangos empanados mais irresistíveis do McDonald’s.");
		break;
	case 7:
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 8 --");
		System.out.println("");
		System.out.println("7 - Chiken McNuggets 6 unidades");
		System.out.println("");
		System.out.println("232 kcal");
		System.out.println("Crocantes, leves e deliciosos. Os frangos empanados mais irresistíveis do McDonald’s.");
		break;
	case 8:
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 8 --");
		System.out.println("");
		System.out.println("8 - Chiken McNuggets 10 unidades");
		System.out.println("");
		System.out.println("387 kcal");
		System.out.println("Crocantes, leves e deliciosos. Os frangos empanados mais irresistíveis do McDonald’s.");
		break;
	case 9:
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 8 --");
		System.out.println("");
		System.out.println("9 - Molho Agridoce");
		System.out.println("");
		System.out.println("44 kcal");
		System.out.println("Blister 23g. O difícil é escolher qual o melhor molho para se deliciar com os McNuggets!");
		break;
	case 10:
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 8 --");
		System.out.println("");
		System.out.println("10 - Molho Barbecue");
		System.out.println("");
		System.out.println("40 kcal");
		System.out.println("Blister 23g. O difícil é escolher qual o melhor molho para se deliciar com os McNuggets!");
		break;
	case 11:
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 8 --");
		System.out.println("");
		System.out.println("11 - Molho Ranch");
		System.out.println("");
		System.out.println("109 kcal");
		System.out.println("Blister 23g. O difícil é escolher qual o melhor molho para se deliciar com os McNuggets!");
		break;
	case 12:
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 8 --");
		System.out.println("");
		System.out.println("12 - Molho Caipira");
		System.out.println("");
		System.out.println("52 kcal");
		System.out.println("Blister 23g. O difícil é escolher qual o melhor molho para se deliciar com os McNuggets!");
		break;
	case 13:
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 8 --");
		System.out.println("");
		System.out.println("13 - Mega McNuggets");
		System.out.println("");
		System.out.println("774 kcal");
		System.out.println("Crocantes, leves e deliciosos. Os frangos empanados mais irresistíveis do McDonald’s agora na versão Mega, ideal para compartilhar. Composto por 15 unidades de Chicken McNuggets.");
		break;
	case 14:
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 8 --");
		System.out.println("");
		System.out.println("14 - Ketchup");
		System.out.println("");
		System.out.println("9 kcal");
		System.out.println("Sachê de ketchup do Méqui");
		break;
	case 15:
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 8 --");
		System.out.println("");
		System.out.println("15 - Mostarda");
		System.out.println("");
		System.out.println("4 kcal");
		System.out.println("Sachê de mostarda do Méqui");
		break;
	case 16:
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 8 --");
		System.out.println("");
		System.out.println("16 - Tomatinho");
		System.out.println("");
		System.out.println("11 kcal");
		System.out.println("Mais um opção leve de acompanhamento: tomatinhos fresquinhos.");
		break;
	case 17:
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 8 --");
		System.out.println("");
		System.out.println("17 - Mega Mcfritas");
		System.out.println("");
		System.out.println("767 kcal");
		System.out.println("A batata frita mais famosa do mundo, agora no tamanho Mega. Deliciosas batatas selecionadas, fritas, crocantes por fora, macias por dentro, douradas, irresistíveis, saborosas, famosas, e todos os outros adjetivos positivos que você quiser dar.");
		break;
 }
break;
		
		                       // 9ª OPÇÃO MENU = SOBREMESAS //
		
case 9: 
				
	    System.out.println("---VOCÊ SELECIONOU A OPÇÃO 9---");
	    System.out.println("");
	    System.out.println("*********Sobremesas**********");
	    System.out.println("");
	    System.out.println("1 - Casquinha Baunilha");
	    System.out.println("2 - Casquinha Chocolate");
	    System.out.println("3 - Casquinha Mista");
	    System.out.println("4 - Sundae Morango");
	    System.out.println("5 - Sundae Chocolate");
	    System.out.println("6 - Sundae Caramelo");
	    System.out.println("7 - Top Sundae Morango");
	    System.out.println("8 - Top Sundae Chocolate");
	    System.out.println("9 - Top Sundae Caramelo");
	    System.out.println("10 - McColosso Chocolate");
	    System.out.println("11 - McColosso Caramelo");
	    System.out.println("12 - Petit Suisse Sabor Morango");
	    System.out.println("13 - Torta de Maçã");
	    System.out.println("14 - Torta de Banana");
	    System.out.println("15 - McShake Morango");
	    System.out.println("16 - McShake Ovomaltine");
	    System.out.println("17 - McShake Kopenhagem");
	    System.out.println("18 - McFlurry Ovomaltine");
	    System.out.println("19 - McFlurry M&Ms Chocolate");
	    System.out.println("20 - McFlurry M&Ms Morango");
	    System.out.println("21 - McFlurry M&Ms Caramelo");
	    System.out.println("22 - McFlurry Ovomaltine Morango");
	    System.out.println("23 - McFlurry Ovomaltine Caramelo");
	    System.out.println("24 - McFlurry Trufa Lingua de Gato DUO Kopenhagen Chocolate");
	    System.out.println("25 - McFlurry Trufa Lingua de Gato DUO Kopenhagen Morango");
	    System.out.println("26 - McFlurry Trufa Lingua de Gato DUO Kopenhagen Caramelo");
	    System.out.println("");
	    System.out.println("*********Cardápio**********");
	    System.out.println("");
	
	int opcaoMenuSubMenu9 = sc.nextInt();
	switch (opcaoMenuSubMenu9) {
	case 1:
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 9 --");
		System.out.println("");
		System.out.println("1 - Casquinha Baunilha");
		System.out.println("");
		System.out.println("170 kcal");
		System.out.println("A sobremesa que o Brasil todo adora. Uma casquinha supercrocante, com bebida láctea sabor baunilha que vai bem a qualquer hora.");
		break;
	case 2:
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 9 --");
		System.out.println("");
		System.out.println("2 - Casquinha Chocolate");
		System.out.println("");
		System.out.println("165 kcal");
		System.out.println("A sobremesa que o Brasil todo adora. Uma casquinha supercrocante, com bebida láctea sabor chocolate que vai bem a qualquer hora.");
		break;
	case 3:
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 9 --");
		System.out.println("");
		System.out.println("3 - Casquinha Mista");
		System.out.println("");
		System.out.println("168 kcal");
		System.out.println("A sobremesa que o Brasil todo adora. Uma casquinha supercrocante, com bebida láctea mista (sabor baunilha e chocolate) que vai bem a qualquer hora.");
		break;
	case 4:
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 9 --");
		System.out.println("");
		System.out.println("4 - Sundae Chocolate");
		System.out.println("");
		System.out.println("273 kcal");
		System.out.println("A medida certa entre cobertura sabor chocolate e bebida láctea sabor baunilha que pode fazer você viver uma experiência explosiva, além de amendoins crocantes.");
		break;
	case 5:
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 9 --");
		System.out.println("");
		System.out.println("5 - Sundae Morango");
		System.out.println("");
		System.out.println("302 kcal");
		System.out.println("A medida certa entre cobertura de morango e bebida láctea sabor baunilha que pode fazer você viver uma experiência explosiva, além de amendoins crocantes.");
		break;
	case 6:
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 9 --");
		System.out.println("");
		System.out.println("6 - Sundae Caramelo");
		System.out.println("");
		System.out.println("307 kcal");
		System.out.println("A medida certa entre cobertura de caramelo e bebida láctea sabor baunilha que pode fazer você viver uma experiência explosiva, além de amendoins crocantes.");
		break;
	case 7:
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 9 --");
		System.out.println("");
		System.out.println("7 - Top Sundae Morango");
		System.out.println("");
		System.out.println("394 kcal");
		System.out.println("Sobremesa com Bebida láctea sabor baunilha e uma supercamada de cobertura de morango e ainda por cima com farofa de paçoca. O canudo completa a tentação.");
		break;
	case 8:
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 9 --");
		System.out.println("");
		System.out.println("8 - Top Sundae Chocolate");
		System.out.println("");
		System.out.println("396 kcal");
		System.out.println("Sobremesa com Bebida láctea sabor baunilha e uma supercamada de cobertura sabor chocolate e ainda por cima com farofa de paçoca. O canudo completa a tentação.");
		break;
	case 9:
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 9 --");
		System.out.println("");
		System.out.println("9 - Top Sundae Caramelo");
		System.out.println("");
		System.out.println("307 kcal");
		System.out.println("Sobremesa com Bebida láctea sabor baunilha e uma supercamada de cobertura de caramelo e ainda por cima com farofa de paçoca. O canudo completa a tentação.");
		break;
	case 10:
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 9 --");
		System.out.println("");
		System.out.println("10 - McColosso Chocolate");
		System.out.println("");
		System.out.println("265 kcal");
		System.out.println("Não é uma sobremesa qualquer, é um verdadeiro colosso. Uma supercasquinha de biscoito em forma de cone, recheada com bebida láctea sabor baunilha e uma sensacional cobertura sabor chocolate. E, além de todo esse sabor, um canudinho de biscoito supercrocante.");
		break;
	case 11:
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 9 --");
		System.out.println("");
		System.out.println("11 - McColosso Caramelo");
		System.out.println("");
		System.out.println("269 kcal");
		System.out.println("Não é uma sobremesa qualquer, é um verdadeiro colosso. Uma supercasquinha de biscoito em forma de cone, recheada com bebida láctea sabor baunilha e uma sensacional cobertura de caramelo. E, além de todo esse sabor, um canudinho de biscoito supercrocante.");
		break;
	case 12:
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 9 --");
		System.out.println("");
		System.out.println("12 - Petit Suisse Sabor Morang");
		System.out.println("");
		System.out.println("38 kcal");
		System.out.println("O mais delicioso iogurte desnatado sabor morango.");
		break;
	case 13:
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 9 --");
		System.out.println("");
		System.out.println("13 - Torta de Maçã");
		System.out.println("");
		System.out.println("251 kcal");
		System.out.println("Boa demais. Parece a receita lá de casa. Massa quentinha e crocante envolvendo deliciosos recheios de banana ou maçã com gostinho de doce caseiro.");
		break;
	case 14:
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 9 --");
		System.out.println("");
		System.out.println("14 - Torta de Banana");
		System.out.println("");
		System.out.println("198 kcal");
		System.out.println("Boa demais! Parece a receita lá de casa. Massa quentinha e crocante envolvendo um delicioso recheio de banana com gostinho de doce caseiro.");
		break;
	case 15:
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 9 --");
		System.out.println("");
		System.out.println("15 - McShake Morango");
		System.out.println("");
		System.out.println("425 kcal");
		System.out.println("Deliciosamente cremoso. O novo McShake Morango é feito com leite e batido na hora. Uma delícia!");
		break;
	case 16:
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 9 --");
		System.out.println("");
		System.out.println("16 - McShake Ovomaltine");
		System.out.println("");
		System.out.println("562 kcal");
		System.out.println("Deliciosamente cremoso. O novo McShake Ovomaltine é feito com leite e batido na hora. Uma delícia!");
		break;
	case 17:
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 9 --");
		System.out.println("");
		System.out.println("17 - McShake Kopenhagem");
		System.out.println("");
		System.out.println("628 kcal");
		System.out.println("Deliciosamente cremoso. O novo McShake Chocolate Kopenhagen é feito com leite e batido na hora. Uma delícia!");
		break;
	case 18:
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 9 --");
		System.out.println("");
		System.out.println("18 - McFlurry Ovomaltine");
		System.out.println("");
		System.out.println("426 kcal");
		System.out.println("Para sua #FomeGeladinhadeMéqui nosso delicioso McFlurry Ovomaltine, com bebida láctea sabor baunilha, flocos de ovomaltine e cobertura sabor chocolate.");
		break;
	case 19:
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 9 --");
		System.out.println("");
		System.out.println("19 - McFlurry M&Ms Chocolate");
		System.out.println("");
		System.out.println("519 kcal");
		System.out.println("Composto por bebida láctea sabor baunilha, cobertura sabor chocolate e M&M´s ® chocolate ao leite.");
		break;
	case 20:
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 9 --");
		System.out.println("");
		System.out.println("20 - McFlurry M&Ms Morango");
		System.out.println("");
		System.out.println("504 kcal");
		System.out.println("Composto por bebida láctea sabor baunilha, cobertura de morango e M&M´s ® chocolate ao leite.");
		break;
	case 21:
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 9 --");
		System.out.println("");
		System.out.println("21 - McFlurry M&Ms Caramelo");
		System.out.println("");
		System.out.println("524 kcal");
		System.out.println("Composto por bebida láctea sabor baunilha, cobertura de caramelo e M&M´s ® chocolate ao leite.");
		break;
	case 22:
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 9 --");
		System.out.println("");
		System.out.println("22 - McFlurry Ovomaltine Morango");
		System.out.println("");
		System.out.println("438 kcal");
		System.out.println("Para sua #FomeGeladinhadeMéqui nosso delicioso McFlurry Ovomaltine, com bebida láctea sabor baunilha, flocos de ovomaltine e cobertura de morango.");
		break;
	case 23:
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 9 --");
		System.out.println("");
		System.out.println("23 - McFlurry Ovomaltine Caramelo");
		System.out.println("");
		System.out.println("462 kcal");
		System.out.println("Para sua #FomeGeladinhadeMéqui nosso delicioso McFlurry Ovomaltine, com bebida láctea sabor baunilha, flocos de ovomaltine e cobertura de caramelo.");
		break;
	case 24:
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 9 --");
		System.out.println("");
		System.out.println("24 - McFlurry Trufa Lingua de Gato DUO Kopenhagen Chocolate");
		System.out.println("");
		System.out.println("319 kcal");
		System.out.println("O novo McFlurry promete toda qualidade que só o Méqui e a Kopenhagen podem oferecer! A sobremesa é composta por espetaculares trufas Língua de Gato DUO Kopenhagen, bebida láctea sabor baunilha e cobertura sabor chocolate.");
		break;
	case 25:
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 9 --");
		System.out.println("");
		System.out.println("25 - McFlurry Trufa Lingua de Gato DUO Kopenhagen Morango");
		System.out.println("");
		System.out.println("479 kcal");
		System.out.println("O novo McFlurry promete toda qualidade que só o Méqui e a Kopenhagen podem oferecer! A sobremesa é composta por espetaculares trufas Língua de Gato DUO Kopenhagen, bebida láctea sabor baunilha e cobertura de morango.");
		break;
	case 26:
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 9 --");
		System.out.println("");
		System.out.println("26 - McFlurry Trufa Lingua de Gato DUO Kopenhagen Caramelo");
		System.out.println("");
		System.out.println("325 kcal");
		System.out.println("O novo McFlurry promete toda qualidade que só o Méqui e a Kopenhagen podem oferecer! A sobremesa é composta por espetaculares trufas Língua de Gato DUO Kopenhagen, bebida láctea sabor baunilha e cobertura de caramelo.");
		break;
}
break;
        
                                 // 10ª OPÇÃO MENU = BEBIDAS FRIAS //    
        
case 10:

	    System.out.println("---VOCÊ SELECIONOU A OPÇÃO 10---");
	    System.out.println("");
	    System.out.println("*********Bebidas Frias**********");
	    System.out.println("");
	    System.out.println("1 - Coca-Cola 300ml");
	    System.out.println("2 - Coca-Cola 500ml");
	    System.out.println("3 - Coca-Cola 700ml");
	    System.out.println("4 - Coca-Cola Zero 300ml");
	    System.out.println("5 - Coca-Cola Zero 500ml");
	    System.out.println("6 - Coca-Cola Zero 700ml");
	    System.out.println("7 - Del Valle Laranja 300ml");
	    System.out.println("8 - Del Valle Laranja 500ml");
	    System.out.println("9 - Del Valle Laranja 700ml");
	    System.out.println("10 - Del Valle Uva 300ml");
	    System.out.println("11 - Del Valle Uva 500ml");
	    System.out.println("12 - Del Valle Uva 700ml");
	    System.out.println("13 - Fanta Laranja 300ml");
	    System.out.println("14 - Fanta Laranja 500ml");
	    System.out.println("15 - Fanta Laranja 700ml");
	    System.out.println("16 - Fanta Guaraná 300ml");
	    System.out.println("17 - Fanta Guaraná 500ml");
	    System.out.println("18 - Fanta Guaraná 700ml");
	    System.out.println("19 - Água Mineral");
	    System.out.println("20 - Del Valle 100% Uva(McLanche Feliz");
	    System.out.println("");
	    System.out.println("*********Cardápio**********");
	    System.out.println("");
	
	int opcaoMenuSubMenu10 = sc.nextInt();
	switch (opcaoMenuSubMenu10) {
	case 1:
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 10 --");
		System.out.println("");
		System.out.println("1 - Coca-Cola 300ml");
		System.out.println("");
		System.out.println("129 kcal");
		System.out.println("Refrescante e geladinho. Uma bebida assim refresca a vida. Você pode escolher entre Coca-Cola, Coca-Cola Zero, Fanta Guaraná e Fanta Laranja.");
		break;
	case 2:
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 10 --");
		System.out.println("");
		System.out.println("2 - Coca-Cola 500ml");
		System.out.println("");
		System.out.println("215 kcal");
		System.out.println("Refrescante e geladinho. Uma bebida assim refresca a vida. Você pode escolher entre Coca-Cola, Coca-Cola Zero, Fanta Guaraná e Fanta Laranja.");
		break;
	case 3:
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 10 --");
		System.out.println("");
		System.out.println("3 - Coca-Cola 700ml");
		System.out.println("");
		System.out.println("301 kcal");
		System.out.println("Refrescante e geladinho. Uma bebida assim refresca a vida. Você pode escolher entre Coca-Cola, Coca-Cola Zero, Fanta Guaraná e Fanta Laranja.");
	    break;
	case 4:
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 10 --");
		System.out.println("");
		System.out.println("4 - Coca-Cola Zero 300ml");
		System.out.println("");
		System.out.println("0 kcal");
		System.out.println("Refrescante e geladinho. Uma bebida assim refresca a vida. Você pode escolher entre Coca-Cola, Coca-Cola Zero, Fanta Guaraná e Fanta Laranja.");
	    break;
	case 5:
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 10 --");
		System.out.println("");
		System.out.println("5 - Coca-Cola Zero 500ml");
		System.out.println("");
		System.out.println("0 kcal");
		System.out.println("Refrescante e geladinho. Uma bebida assim refresca a vida. Você pode escolher entre Coca-Cola, Coca-Cola Zero, Fanta Guaraná e Fanta Laranja.");
	    break;
	case 6:
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 10 --");
		System.out.println("");
		System.out.println("6 - Coca-Cola Zero 700ml");
		System.out.println("");
		System.out.println("0 kcal");
		System.out.println("Refrescante e geladinho. Uma bebida assim refresca a vida. Você pode escolher entre Coca-Cola, Coca-Cola Zero, Fanta Guaraná e Fanta Laranja.");
	    break;
	case 7:
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 10 --");
		System.out.println("");
		System.out.println("7 - Del Valle Laranja 300ml");
		System.out.println("");
		System.out.println("120 kcal");
		System.out.println("Deliciosos sabores à sua escolha. Néctar de fruta nos sabores uva ou laranja.");
	    break;
	case 8:
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 10 --");
		System.out.println("");
		System.out.println("8 - Del Valle Laranja 500ml");
		System.out.println("");
		System.out.println("200 kcal");
		System.out.println("Deliciosos sabores à sua escolha. Néctar de fruta nos sabores uva ou laranja.");
	    break;
	case 9:
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 10 --");
		System.out.println("");
		System.out.println("9 - Del Valle Laranja 700ml");
		System.out.println("");
		System.out.println("287 kcal");
		System.out.println("Deliciosos sabores à sua escolha. Néctar de fruta nos sabores uva ou laranja.");
	    break;
	case 10:
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 10 --");
		System.out.println("");
		System.out.println("10 - Del Valle Uva 300ml");
		System.out.println("");
		System.out.println("120 kcal");
		System.out.println("Deliciosos sabores à sua escolha. Néctar de fruta nos sabores uva ou laranja.");
	    break;
	case 11:
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 10 --");
		System.out.println("");
		System.out.println("11 - Del Valle Uva 500ml");
		System.out.println("");
		System.out.println("200 kcal");
		System.out.println("Deliciosos sabores à sua escolha. Néctar de fruta nos sabores uva ou laranja.");
	    break;
	case 12:
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 10 --");
		System.out.println("");
		System.out.println("12 - Del Valle Uva 700ml");
		System.out.println("");
		System.out.println("287 kcal");
		System.out.println("Deliciosos sabores à sua escolha. Néctar de fruta nos sabores uva ou laranja.");
	    break;
	case 13:
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 10 --");
		System.out.println("");
		System.out.println("13 - Fanta Laranja 300ml");
		System.out.println("");
		System.out.println("93 kcal");
		System.out.println("Refrescante e geladinho. Uma bebida assim refresca a vida. Você pode escolher entre Coca-Cola, Coca-Cola Zero, Fanta Guaraná e Fanta Laranja.");
	    break;
	case 14:
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 10 --");
		System.out.println("");
		System.out.println("14 - Fanta Laranja 500ml");
		System.out.println("");
		System.out.println("155 kcal");
		System.out.println("Refrescante e geladinho. Uma bebida assim refresca a vida. Você pode escolher entre Coca-Cola, Coca-Cola Zero, Fanta Guaraná e Fanta Laranja.");
	    break;
	case 15:
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 10 --");
		System.out.println("");
		System.out.println("15 - Fanta Laranja 700ml");
		System.out.println("");
		System.out.println("217 kcal");
		System.out.println("Refrescante e geladinho. Uma bebida assim refresca a vida. Você pode escolher entre Coca-Cola, Coca-Cola Zero, Fanta Guaraná e Fanta Laranja.");
	    break;
	case 16:
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 10 --");
		System.out.println("");
		System.out.println("16 - Fanta Guaraná 300ml");
		System.out.println("");
		System.out.println("126 kcal");
		System.out.println("Refrescante e geladinho. Uma bebida assim refresca a vida. Você pode escolher entre Coca-Cola, Coca-Cola Zero, Fanta Guaraná e Fanta Laranja.");
	    break;
	case 17:
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 10 --");
		System.out.println("");
		System.out.println("17 - Fanta Guaraná 500ml");
		System.out.println("");
		System.out.println("210 kcal");
		System.out.println("Refrescante e geladinho. Uma bebida assim refresca a vida. Você pode escolher entre Coca-Cola, Coca-Cola Zero, Fanta Guaraná e Fanta Laranja.");
	    break;
	case 18:
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 10 --");
		System.out.println("");
		System.out.println("18 - Fanta Guaraná 700ml");
		System.out.println("");
		System.out.println("294 kcal");
		System.out.println("Refrescante e geladinho. Uma bebida assim refresca a vida. Você pode escolher entre Coca-Cola, Coca-Cola Zero, Fanta Guaraná e Fanta Laranja.");
	    break;
	case 19:
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 10 --");
		System.out.println("");
		System.out.println("19 - Água Mineral");
		System.out.println("");
		System.out.println("0 kcal");
		System.out.println("Água sem gás.");
	    break;
	case 20:
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 10 --");
		System.out.println("");
		System.out.println("20 - Del Valle 100% Uva(McLanche Feliz");
		System.out.println("");
		System.out.println("118 kcal");
		System.out.println("100% Suco de uva, sem açúcar adicionado, sem corante e sabores artificiais.");
		break;
}
break;
	
	                         // 11ª OPÇÃO MENU = CAFÉ DA MANHÃ // 
	  
case 11:
	
		System.out.println("---VOCÊ SELECIONOU A OPÇÃO 11---");
	    System.out.println("");
	    System.out.println("*********Café da Manhã**********");
	    System.out.println("");
	    System.out.println("1 - Queijo Quente");
	    System.out.println("2 - Croissant de Presunto e Queijo");
	    System.out.println("3 - Pão de Queijo");
	    System.out.println("4 - Capuccino 200ml");
	    System.out.println("5 - Capuccino 300ml");
	    System.out.println("6 - Café com Leite 200ml");
	    System.out.println("7 - Café com Leite 300ml");
	    System.out.println("8 - Café Premium 100ml");
	    System.out.println("9 - Café Premium 200ml");
	    System.out.println("10 - Café Premium 300ml");
	    System.out.println("11 - Chocolate Quente 200ml");
	    System.out.println("12 - Chocolate Quente 300ml");
	    System.out.println("");
	    System.out.println("*********Cardápio**********");
	    System.out.println("");
	
	int opcaoMenuSubMenu11 = sc.nextInt();
	switch (opcaoMenuSubMenu11) {
	case 1:
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 11 --");
		System.out.println("");
		System.out.println("1 - Queijo Quente");
		System.out.println("");
		System.out.println("247 kcal");
		System.out.println("Composto por pão sem gergelim e duas fatias do delicioso queijo sabor cheddar.");
	    break;
	case 2:
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 11 --");
		System.out.println("");
		System.out.println("2 - Croissant de Presunto e Queijo");
		System.out.println("");
		System.out.println("270 kcal");
		System.out.println("Nem tente resistir. Só de olhar a imagem já dá vontade de devorar. A massa é fresquinha, crocante e deliciosa. O recheio é de presunto quentinho com queijo derretido. Impossível resistir!");
		break;
	case 3:
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 11 --");
		System.out.println("");
		System.out.println("3 - Pão de Queijo");
		System.out.println("");
		System.out.println("132 kcal");
		System.out.println("Impossível de resistir. Pão de queijo quentinho e macio. Quem já provou sabe que não tem igual.");
		break;
	case 4:
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 11 --");
		System.out.println("");
		System.out.println("4 - Capuccino 200ml");
		System.out.println("");
		System.out.println("71 kcal");
		System.out.println("Feito com leite semidesnatado, café do Méqui e chocolate em pó.");
		break;
	case 5:
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 11 --");
		System.out.println("");
		System.out.println("5 - Capuccino 300ml");
		System.out.println("");
		System.out.println("114 kcal");
		System.out.println("Feito com leite semidesnatado, café do Méqui e chocolate em pó.");
		break;
	case 6:
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 11 --");
		System.out.println("");
		System.out.println("6 - Café com Leite 200ml");
		System.out.println("");
		System.out.println("50 kcal");
		System.out.println("O famoso sabor da manhã. Quem nunca sentiu esse sabor logo cedo? E os nossos grãos selecionados deixam esse clássico do café da manhã ainda mais especial.");
		break;
	case 7:
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 11 --");
		System.out.println("");
		System.out.println("7 - Café com Leite 300ml");
		System.out.println("");
		System.out.println("74 kcal");
		System.out.println("O famoso sabor da manhã. Quem nunca sentiu esse sabor logo cedo? E os nossos grãos selecionados deixam esse clássico do café da manhã ainda mais especial.");
		break;
	case 8:
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 11 --");
		System.out.println("");
		System.out.println("8 - Café Premium 100ml");
		System.out.println("");
		System.out.println("4 kcal");
		System.out.println("O dia só começa depois de um McCafé. A melhor maneira de começar o dia é tomando um cafezinho. Mas não dá para chamar um café de grãos selecionados de cafezinho.");
		break;
	case 9:
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 11 --");
		System.out.println("");
		System.out.println("9 - Café Premium 200ml");
		System.out.println("");
		System.out.println("8 kcal");
		System.out.println("O dia só começa depois de um McCafé. A melhor maneira de começar o dia é tomando um cafezinho. Mas não dá para chamar um café de grãos selecionados de cafezinho.");
		break;
	case 10:
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 11 --");
		System.out.println("");
		System.out.println("10 - Café Premium 300ml");
		System.out.println("");
		System.out.println("12 kcal");
		System.out.println("O dia só começa depois de um McCafé. A melhor maneira de começar o dia é tomando um cafezinho. Mas não dá para chamar um café de grãos selecionados de cafezinho.");
		break;
	case 11:
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 11 --");
		System.out.println("");
		System.out.println("11 - Chocolate Quente 200ml");
		System.out.println("");
		System.out.println("114 kcal");
		System.out.println("Feito com leite semidesnatado e chocolate em pó.");
		break;
	case 12:
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 11 --");
		System.out.println("");
		System.out.println("12 - Chocolate Quente 300ml");
		System.out.println("");
		System.out.println("173 kcal");
		System.out.println("Feito com leite semidesnatado e chocolate em pó.");
			break;
 }
 break;
	 
                                   // 12ª OPÇÃO MENU = BEBIDAS QUENTES //

case 12:

		System.out.println("---VOCÊ SELECIONOU A OPÇÃO 12---");
		System.out.println("");
		System.out.println("*********Bebidas Quentes**********");
		System.out.println("");
		System.out.println("1 - Capuccino 200ml");
	    System.out.println("2 - Capuccino 300ml");
	    System.out.println("3 - Café com Leite 200ml");
	    System.out.println("4 - Café com Leite 300ml");
	    System.out.println("5 - Café Premium 100ml");
	    System.out.println("6 - Café Premium 200ml");
	    System.out.println("7 - Café Premium 300ml");
	    System.out.println("8 - Chocolate Quente 200ml");
	    System.out.println("9 - Chocolate Quente 300ml");
	    System.out.println("");
	    System.out.println("*********Cardápio**********");
	    System.out.println("");
		
	int opcaoMenuSubMenu12 = sc.nextInt();
	switch (opcaoMenuSubMenu12) {
	case 1:
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 12 --");
		System.out.println("");
		System.out.println("1 - Capuccino 200ml");
		System.out.println("");
		System.out.println("71 kcal");
		System.out.println("Feito com leite semidesnatado, café do Méqui e chocolate em pó.");
		break;
	case 2:
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 12 --");
		System.out.println("");
		System.out.println("2 - Capuccino 300ml");
		System.out.println("");
		System.out.println("114 kcal");
		System.out.println("Feito com leite semidesnatado, café do Méqui e chocolate em pó.");
		break;
	case 3:
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 12 --");
		System.out.println("");
		System.out.println("3 - Café com Leite 200ml");
		System.out.println("");
		System.out.println("50 kcal");
		System.out.println("O famoso sabor da manhã. Quem nunca sentiu esse sabor logo cedo? E os nossos grãos selecionados deixam esse clássico do café da manhã ainda mais especial.");
		break;
	case 4:
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 12 --");
		System.out.println("");
		System.out.println("4 - Café com Leite 300ml");
		System.out.println("");
		System.out.println("74 kcal");
		System.out.println("O famoso sabor da manhã. Quem nunca sentiu esse sabor logo cedo? E os nossos grãos selecionados deixam esse clássico do café da manhã ainda mais especial.");
		break;
	case 5:
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 12 --");
		System.out.println("");
		System.out.println("5 - Café Premium 100ml");
		System.out.println("");
		System.out.println("4 kcal");
		System.out.println("O dia só começa depois de um McCafé. A melhor maneira de começar o dia é tomando um cafezinho. Mas não dá para chamar um café de grãos selecionados de cafezinho.");
		break;
	case 6:
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 12 --");
		System.out.println("");
		System.out.println("6 - Café Premium 200ml");
		System.out.println("");
		System.out.println("8 kcal");
		System.out.println("O dia só começa depois de um McCafé. A melhor maneira de começar o dia é tomando um cafezinho. Mas não dá para chamar um café de grãos selecionados de cafezinho.");
		break;
	case 7:
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 12 --");
		System.out.println("");
		System.out.println("7 - Café Premium 300ml");
		System.out.println("");
		System.out.println("12 kcal");
		System.out.println("O dia só começa depois de um McCafé. A melhor maneira de começar o dia é tomando um cafezinho. Mas não dá para chamar um café de grãos selecionados de cafezinho.");
		break;
	case 8:
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 12 --");
		System.out.println("");
		System.out.println("8 - Chocolate Quente 200ml");
		System.out.println("");
		System.out.println("114 kcal");
		System.out.println("Feito com leite semidesnatado e chocolate em pó.");
		break;
	case 9:
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 12 --");
		System.out.println("");
		System.out.println("9 - Chocolate Quente 300ml");
		System.out.println("");
		System.out.println("173 kcal");
		System.out.println("Feito com leite semidesnatado e chocolate em pó.");
			break;
	}
	break;
	 
	                         // 13ª OPÇÃO MENU = MCOFERTA //
	 
case 13:
	
		System.out.println("---VOCÊ SELECIONOU A OPÇÃO 13---");
	    System.out.println("");
	    System.out.println("*********McOferta**********");
	    System.out.println("");
		System.out.println("1 - McChicken");
		System.out.println("2 - Chicken McNuggets 10 unidades ");
		System.out.println("");
	    System.out.println("*********Cardápio**********");
	    System.out.println("");
	
	int opcaoMenuSubMenu13 = sc.nextInt();
	switch (opcaoMenuSubMenu13) {
	case 1:
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 13 --");
		System.out.println("");
		System.out.println("1 - McChicken");
		System.out.println("");
		System.out.println("396 kcal");
		System.out.println("Frango empanado, maionese, alface americana e pão com gergelim.");
	    break;
	case 2:
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 13 --");
		System.out.println("");
		System.out.println("2 - Chicken McNuggets 10 unidades ");
		System.out.println("");
		System.out.println("387 kcal");
		System.out.println("Crocantes, leves e deliciosos. Os frangos empanados mais irresistíveis do McDonald’s.");
		break;
}
break;
                               // 14ª OPÇÃO MENU = MÉQUIBOX //
      
case 14:
	
		System.out.println("---VOCÊ SELECIONOU A OPÇÃO 14---");
		System.out.println("");
		System.out.println("*********MéquiBox**********");
		System.out.println("");
		System.out.println("1 - Family Box para 2");
		System.out.println("2 - Family Box para 3");
		System.out.println("3 - MéquiBox Clássico para 3");
		System.out.println("4 - MéquiBox Clássico para 4");
		System.out.println("");
		System.out.println("*********Cardápio**********");
		System.out.println("");

	int opcaoMenuSubMenu14 = sc.nextInt();
	switch (opcaoMenuSubMenu14) {
	case 1:
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 14 --");
		System.out.println("");
		System.out.println("1 - Family Box para 2");
		System.out.println("");
		System.out.println("Composto por 01 McLanche Feliz e 01 McOferta média Big Mac, Quarterão, Cheddar McMelt ou McChicken.");
		break;
	case 2:
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 14 --");
		System.out.println("");
		System.out.println("2 - Family Box para 3");
		System.out.println("");
		System.out.println("Composto por 01 McLanche Feliz e 02 McOfertas médias Big Mac, Quarterão, Cheddar McMelt ou McChicken.");
		break;
	case 3:
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 14 --");
		System.out.println("");
		System.out.println("3 - MéquiBox Clássico para 3");
		System.out.println("");
		System.out.println("Méqui Box Clássico para 3 Composto por 03 McOfertas médias: Big Mac, Quarterão, Cheddar McMelt ou McChicken.");
		break;
	case 4:
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 14 --");
		System.out.println("");
		System.out.println("4 - MéquiBox Clássico para 4");
		System.out.println("");
		System.out.println("Méqui Box Clássico para 4 Composto por 04 McOfertas médias: Big Mac, Quarterão, Cheddar McMelt ou McChicken.");
		break;
}
break;
                          	// 15ª OPÇÃO MENU = MCCAFÉ //
	
case 15:
	
		System.out.println("---VOCÊ SELECIONOU A OPÇÃO 15---");
		System.out.println("");
		System.out.println("*********McCafé**********");
		System.out.println("");
		System.out.println("1 - Cookie de Baunilha com Gotas de Chocolate");
		System.out.println("2 - Croissant de Presunto e Queijo");
	    System.out.println("3 - Pão de Queijo");
	    System.out.println("4 - Mini Pão de Queijo");
	    System.out.println("5 - Quiche de Palmito");
	    System.out.println("6 - Tartelete de Cheesecake com Cobertura de Morango");
		System.out.println("7 - Muffin de Blueberry");
		System.out.println("8 - Bolo de Laranja");
		System.out.println("");
		System.out.println("*********Cardápio**********");
		System.out.println("");
		
	int opcaoMenuSubMenu15 = sc.nextInt();
	switch (opcaoMenuSubMenu15) {
	case 1:
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 15 --");
		System.out.println("");
		System.out.println("1 - Cookie de Baunilha com Gotas de Chocolate");
		System.out.println("");
		System.out.println("169 kcal");
		System.out.println("A combinação da massa de baunilha com gotas de chocolate é tudo o que você precisa junto ao cafézinho.");
		break;
	case 2:
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 15 --");
		System.out.println("");
		System.out.println("2 - Croissant de Presunto e Queijo");
		System.out.println("");
		System.out.println("270 kcal");
		System.out.println("Nem tente resistir. Só de olhar a imagem já dá vontade de devorar. A massa é fresquinha, crocante e deliciosa. O recheio é de presunto quentinho com queijo derretido. Impossível resistir!");
		break;
	case 3:
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 15 --");
		System.out.println("");
		System.out.println("3 - Pão de Queijo");
		System.out.println("");
		System.out.println("264 kcal");
		System.out.println("Impossível de resistir. Pão de queijo quentinho e macio. Quem já provou sabe que não tem igual.");
		break;
	case 4:
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 15 --");
		System.out.println("");
		System.out.println("4 - Mini Pão de Queijo");
		System.out.println("");
		System.out.println("132 kcal");
		System.out.println("Impossível de resistir. Pão de queijo quentinho e macio. Quem já provou sabe que não tem igual.");
		break;
	case 5:
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 15 --");
		System.out.println("");
		System.out.println("5 - Quiche de Palmito");
		System.out.println("");
		System.out.println("369 kcal");
		System.out.println("Uma deliciosa quiche de palmito.");
		break;
	case 6:
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 15 --");
		System.out.println("");
		System.out.println("6 - Tartelete de Cheesecake com Cobertura de Morango");
		System.out.println("");
		System.out.println("517 kcal");
		System.out.println("As tarteletes podem ser servidas com as coberturas sabor chocolate, morango e caramelo. Experimente!");
		break;
	case 7:
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 15 --");
		System.out.println("");
		System.out.println("7 - Muffin de Blueberry");
		System.out.println("");
		System.out.println("225 kcal");
		System.out.println("Sabor único e experiencia deliciosa que só o muffin de blueberry pode te proporcionar.");
		break;
	case 8:
		System.out.println("-- VOCÊ SELECIONOU A OPÇÃO 15 --");
		System.out.println("");
		System.out.println("8 - Bolo de Laranja");
		System.out.println("");
		System.out.println("172 kcal");
		System.out.println("Impossivel de recusar um pedaço generoso do bolo de laranja. Já tentou com um cafézinho?");
		break;
}
break;
		
	  
		default:
		    	System.out.println("Inválido!!!");
			break;
		    }
		sc.close();
	}
}
