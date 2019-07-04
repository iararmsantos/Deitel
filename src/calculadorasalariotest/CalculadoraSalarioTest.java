/*
 * (Calculador de salários) Desenvolva um aplicativo Java que determina o 
salário bruto de cada um de três empregados. A empresa paga as horas normais 
pelas primeiras 40 horas trabalhadas por cada funcionário e 50% a mais por 
todas as horas trabalhadas além das 40 horas. Você recebe uma lista de 
empregados, o número de horas trabalhadas por eles na semana passada e o 
salário-hora de cada um. Seu programa deve aceitar a entrada dessas 
informações para cada empregado e, então, determinar e exibir o salário 
bruto do empregado. Utilize a classe Scanner para inserir os dados.

(Page 115). 
 */
package calculadorasalariotest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Iara
 */
public class CalculadoraSalarioTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner tec = new Scanner(System.in);
       String resp = "";
       do{
           
           System.out.print("Enter employee name: ");
           String name = tec.nextLine();
           
           System.out.print("Enter hour salary: ");
           double salary = tec.nextDouble();
           System.out.print("Hours worked: ");
           int hour = tec.nextInt();
           CalcSal p1 = new CalcSal(name, salary, hour);

           System.out.println(p1.toString());
           System.out.println("Do you want to continue? [y/n]");
           resp = tec.next();
           tec.nextLine();
       }while("y".equals(resp));
        
        
    }
    
}
