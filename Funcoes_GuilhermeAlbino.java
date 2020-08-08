package albino;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.stream.Collectors;

import javax.swing.JOptionPane;

public class Funcoes {

	public static ArrayList<Double> numeros = new ArrayList<Double>();

	public static void main(String[] args) {

		Double a, b, resultado, numero;
		int controle = -1, quantidade;
		
		StringBuffer menu = new StringBuffer();
		menu.append("1 - SOMA");
		menu.append("\n");
		menu.append("2 - M�XIMO");
		menu.append("\n");
		menu.append("3 - M�NIMO");
		menu.append("\n");
		menu.append("4 - M�DIA");
		menu.append("\n");
		menu.append("0 - Sair");

		controle = Integer.parseInt(JOptionPane.showInputDialog(menu));

		while (controle != 0) {

			switch (controle) {
			case 1:
				//SOMA
				a = janelaDouble("SOMAR \n Digite o valor de A:");
				b = janelaDouble("SOMAR \n Digite o valor de B:");
				resultado = somar(a, b);
				JOptionPane.showMessageDialog(null, "Resultado da soma: "+resultado);
				break;

			case 2:
				//MAXIMO
			
				quantidade = Integer.parseInt(JOptionPane.showInputDialog("Quantos n�meros voc� deseja digitar?"));

				for (int i = 0; i < quantidade; i++) {
					numero = janelaDouble(i +" Digite um n�mero");
					numeros.add(numero);
				}
				JOptionPane.showMessageDialog(null, "Lista de n�meros digitados: "+numeros);



				DoubleSummaryStatistics summary = numeros.stream().collect(Collectors.summarizingDouble(Double::doubleValue));
				double maior = summary.getMax();
			
				JOptionPane.showMessageDialog(null, "Maior n�mero: " + maior);
				
				break;



			case 3:
				//MINIMO
				ArrayList<Double> numeros = new ArrayList<Double>();
				quantidade = Integer.parseInt(JOptionPane.showInputDialog("Quantos n�meros voc� deseja digitar?"));

				for (int i = 0; i < quantidade; i++) {
					numero = janelaDouble(i +" Digite um n�mero");
					numeros.add(numero);
				}
				JOptionPane.showMessageDialog(null, "Lista de n�meros digitados: "+numeros);



				DoubleSummaryStatistics summary2 = numeros.stream().collect(Collectors.summarizingDouble(Double::doubleValue));
			
				double menor = summary2.getMin();
				
				JOptionPane.showMessageDialog(null, "Menor n�mero: " + menor);



				break;

			case 4:
				//MEDIA
				a = janelaDouble("M�DIA \n Digite o valor de A:");
				b = janelaDouble("M�DIA \n Digite o valor de B:");
				resultado = media(a, b);
				JOptionPane.showMessageDialog(null, "Resultado da m�dia: "+resultado);
				break;
			default:

				break;
			}
			controle = Integer.parseInt(JOptionPane.showInputDialog(menu));
		}

	}

	public static Double somar (Double x, Double y) {

		Double r;
		r = x + y;

		return r;

	}
	public static Double media (Double x, Double y) {

		Double r;
		r = x + y / 2;

		return r;

	}

	public static Double janelaDouble(String msg) {

		Double x = 0.0;
		x = Double.parseDouble(JOptionPane.showInputDialog(msg));

		return x;
	} 

}




