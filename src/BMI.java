import java.util.Scanner;
public class BMI {
    double bmi;
    public BMI(){
        double bmi_neu;
        bmi_neu = BmiBerechnen();
        BmiInterpretieren(bmi_neu);
    }
    public double BmiBerechnen(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Geben Sie Ihr Gewicht in kg ein.");

        double masse = scanner.nextDouble();
        System.out.println("Geben Sie Ihre Größe in m ein.");
        Double groesse = scanner.nextDouble();

        bmi=masse/(groesse * groesse);
        System.out.println(bmi);
        return bmi;
    }
    public void BmiInterpretieren(double bmi_neu){

            if (bmi_neu ==0) System.out.println("Der BMI wurde noch nicht berechnet");
            if(bmi_neu > 0 && bmi_neu < 18.5) {
                System.out.println("Sie haben Untergewicht.");
            }
            if(bmi_neu > 18.6 && bmi_neu < 25.0) {
                System.out.println("Sie haben Normalgewicht.");
            }
            if (bmi_neu > 25.1 && bmi_neu < 30.0) {
                System.out.println("Sie haben Übergewicht.");
            }
            if (bmi_neu > 30.1) {
            System.out.println("Sie haben wahrscheinlich Adipositas.");
        }

    }
}
