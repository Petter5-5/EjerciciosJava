package ejercicio8_1_5;
public class Ejercicio8_1_5 
{
    public static void main(String[] args) 
    {
        Personal[] personalMedico = new Personal[5];
        
        personalMedico[0] = new Medico("Ana García", 101, 160, 45, "Cardiología");
        personalMedico[1] = new Medico("Carlos Ruiz", 102, 140, 50, "Pediatría");
        personalMedico[2] = new Enfermero("Laura Martín", 201, 180, 20, "Mañana");
        personalMedico[3] = new Enfermero("Pedro López", 202, 175, 20, "Noche");
        personalMedico[4] = new Administrativo("Marta Sanz", 301, 160, 15, "Admisión");
        
        System.out.println("==========================================");
        System.out.println("SISTEMA DE GESTIÓN HOSPITALARIA");
        System.out.println("==========================================");
        System.out.println("");
        
        double salarioTotal = 0;
        
        for(Personal p : personalMedico)
        {
            p.ficharEntrada();
            p.atenderPaciente();
            p.realizarTareaEspecifica();
            System.out.println("Salario del mes: " + p.calcularSalrio() + "€");
            System.out.println("-------------------------------------------------------");
            System.out.println("");
            salarioTotal += p.calcularSalrio();
        }
        
        System.out.println("CIRUGÍAS DEL DÍA:");
        for(Personal p : personalMedico)
        {
            if(p instanceof Medico medico)
                medico.realizarCirugia();
        }
        
        System.out.println("");
        System.out.println("==========================================");
        System.out.println("EESUMEN DEL MES:");
        System.out.println("==========================================");
        System.out.println("Total de empleados: " + personalMedico.length);
        System.out.println("Salario total a pagar: " + salarioTotal + "€");
        System.out.println("Salario promedio: " + (salarioTotal/personalMedico.length) + "€");
    }
}
