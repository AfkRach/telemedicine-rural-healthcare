public class TriageModule {

    public static String process(String symptoms) {

        String input = symptoms.toLowerCase();

        // Check for serious symptoms
        if (input.contains("chest pain") || input.contains("breathing problem") || input.contains("heart pain")) {
            return DoctorConsultation.consult();
        }

        // Otherwise go to symptom checker
        return SymptomChecker.check(symptoms);
    }
}
