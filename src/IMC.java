
import java.util.Scanner;

public class IMC {
     public void calculo() {
         Scanner sc = new Scanner(System.in);

         System.out.println("Qual seu peso: ");
         double peso = sc.nextDouble();

         System.out.println("Qual sua altura: ");
         double altura = sc.nextDouble();


         double imc = peso / (altura * altura);
         System.out.printf("Seu IMC é: %.2f kg/m %n" ,imc);

         if (imc < 16.9) {
             System.out.println("Você está muito abaixo do peso!");
         } else if (17 < imc && imc < 18.4) {
             System.out.println("Você está abaixo do peso.");

         } else if (18.4 < imc && imc < 24.9) {
             System.out.println("Você está no peso ideal.");

         } else if (25 < imc && imc < 29.9) {
             System.out.println("Você está acima do peso.");

         } else if (30 < imc && imc < 34.9) {
             System.out.println("Seu grau de obesidade é o I.");

         } else if (35 < imc && imc < 40) {
             System.out.println("Seu grau de obesidade é o II.");

         } else {
             System.out.println("Seu grau de obesidade é o III.");

         }
     }
}
