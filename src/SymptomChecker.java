public class SymptomChecker {

    public static String check(String symptoms) {

        String input = symptoms.toLowerCase();

        if (input.contains("fever")) {
            return "Mild fever detected.\nAdvice: Take paracetamol and rest.\n"
                    + PharmacyModule.findMedicine("Paracetamol");
        }

        else if (input.contains("headache")) {
            return "Headache detected.\nAdvice: Stay hydrated and take rest.\n"
                    + PharmacyModule.findMedicine("Painkiller");
        }

        else if (input.contains("cold") || input.contains("cough")) {
            return "Cold/Cough detected.\nAdvice: Take warm fluids.\n"
                    + PharmacyModule.findMedicine("Cough Syrup");
        }

        else {
            return "Symptoms unclear.\nPlease consult a doctor.";
        }
    }
}
