public class DoctorConsultation {

    public static String consult() {

        return "⚠️ Serious condition detected!\n"
                + "Connecting to doctor...\n"
                + "Doctor's Advice: Immediate checkup required.\n"
                + PharmacyModule.findMedicine("Emergency Kit");
    }
}
