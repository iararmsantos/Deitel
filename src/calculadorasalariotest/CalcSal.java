
package calculadorasalariotest;

/**
 *
 * @author Iara
 */
public class CalcSal {
    private String name;
    private double salH;
    private int horasTrab;

    //constructor
    public CalcSal(String name, double salH, int horasTrab) {
        this.name = name;
        this.salH = salH;
        this.horasTrab = horasTrab;
    }

    @Override
    public String toString() {
        return "name: " + name + ", salH=" + salH + ", horasTrab=" + horasTrab 
                + ", Week Salary: " + grossSalary();
    }
    

    //getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalH() {
        return salH;
    }

    public void setSalH(double salH) {
        this.salH = salH;
    }

    public int getHorasTrab() {
        return horasTrab;
    }

    public void setHorasTrab(int horasTrab) {
        this.horasTrab = horasTrab;
    }
    //custom methods]
    public double CalcSal(){
        double totSal = 0;
        if(this.horasTrab <= 40){
            totSal = this.horasTrab * this.salH; 
        }
        return totSal;
    }
    public double overtime(){  
        double overSal = 0;        
       if(this.horasTrab > 40){
           double sal40 = this.salH * 40;
           int overtime = this.horasTrab - 40;
           overSal = ((overtime * 0.5) * this.salH) + sal40;       
            
        }
        return overSal;    
    }
    public double grossSalary(){
        double grossSalary = 0;
        if(this.horasTrab <= 40){
            grossSalary = this.CalcSal();
        }else if(this.horasTrab > 40){
            grossSalary = this.overtime();
        }
        return grossSalary;
    }
}

