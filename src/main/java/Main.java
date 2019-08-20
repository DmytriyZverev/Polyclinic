import domain.*;
import service.*;
import service.impl.*;

public class Main {
    private final AidmanService aidmanService;
    private final AssistantService assistantService;
    private final DoctorService doctorService;
    private final NurseService nurseService;
    private final MedicamentService medicamentService;
    private final PatientService patientService;

    private Main () {
        this.aidmanService = AidmanServiceImpl.getInstance();
        this.assistantService = AssistantServiceImpl.getInstance();
        this.doctorService = DoctorServiceImpl.getInstance();
        this.nurseService = NurseServiceImpl.getInstance();
        this.medicamentService = MedicamentServiceImpl.getInstance();
        this.patientService = PatientServiceImpl.getInstance();
    }

    public static void main(String[] args) {
        final Main main = new Main();
        main.aidmanService.deleteAll();
        main.assistantService.deleteAll();
        main.doctorService.deleteAll();
        main.nurseService.deleteAll();
        main.medicamentService.deleteAll();
        main.patientService.deleteAll();
        main.aidmanService.save(new Aidman(1L,"Aidman",25,25,25));
        main.aidmanService.getAll().forEach(System.out::println);
        main.assistantService.save(new Assistant(1L,"Assistant",25,30,1));
        main.assistantService.getAll().forEach(System.out::println);
        main.doctorService.save(new Doctor(1L,"Doctor",35,40,"Therapist"));
        main.doctorService.getAll().forEach(System.out::println);
        main.nurseService.save(new Nurse(1L,"Nurse",40,35,"Head nurse"));
        main.nurseService.getAll().forEach(System.out::println);
        main.medicamentService.save(new Medicament(1L,"Medicament",100,2.5));
        main.medicamentService.getAll().forEach(System.out::println);
        main.patientService.save(new Patient(1L,"Patient",20,"Flu"));
        main.patientService.getAll().forEach(System.out::println);
    }
}
