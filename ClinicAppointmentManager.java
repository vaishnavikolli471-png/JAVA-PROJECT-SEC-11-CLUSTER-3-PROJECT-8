import java.util.Scanner;


import java.util.Scanner;

class ClinicManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        // Doctor details
        String[] doctors = {
            "Dr. Rahul Sharma", "Dr. Priya Reddy",
            "Dr. Arjun Rao", "Dr. Sneha Kapoor",
            "Dr. Kiran Verma", "Dr. Ananya Mehta",
            "Dr. Vikram Singh", "Dr. Neha Patel",
            "Dr. Aditya Kumar", "Dr. Meera Nair",
            "Dr. Suresh Reddy", "Dr. Pooja Sharma",
            "Dr. Rohan Gupta", "Dr. Divya Rao",
            "Dr. Sanjay Verma", "Dr. Kavya Iyer",
            "Dr. Aman Khan", "Dr. Swathi Reddy",
            "Dr. Nikhil Das", "Dr. Ishita Bose"
        };

        String[] specialization = {
            "General Physician", "Dentist", "Cardiologist",
            "Dermatologist", "Pediatrician", "Gynecologist",
            "Neurologist", "Ophthalmologist", "Orthopedic",
            "ENT Specialist", "Gastroenterologist", "Psychiatrist",
            "Pulmonologist", "Endocrinologist", "Urologist",
            "Oncologist", "Nephrologist", "Physiotherapist",
            "Rheumatologist", "Dietitian"
        };

        int[] fees = {
            500, 600, 800, 700, 600, 700, 900, 600, 800, 650,
            850, 800, 750, 850, 800, 1000, 900, 500, 850, 400
        };

        boolean[] available = {
            true, true, true, true, true,
            true, false, true, true, true,
            true, true, false, true, true,
            true, true, true, false, true
        };

        do {
            System.out.println("\n===== CLINIC MANAGEMENT SYSTEM =====");
            System.out.println("1. Website / Online Appointment Booking");
            System.out.println("2. Offline Clinic / Hospital");
            System.out.println("3. Doctor Details");
            System.out.println("4. Patient Details");
            System.out.println("5. Appointment Management");
            System.out.println("6. Payment Management");
            System.out.println("7. Prescription Management");
            System.out.println("8. Order / Track Medicines");
            System.out.println("9. Review");
            System.out.println("10. Feedback");
            System.out.println("11. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                // 1. Online appointment booking
                case 1:
                    System.out.println("\n--- ONLINE APPOINTMENT BOOKING ---");

                    for (int i = 0; i < doctors.length; i++) {
                        System.out.println(
                            (i + 1) + ". " + doctors[i]
                            + " | " + specialization[i]
                            + " | Fee: Rs." + fees[i]
                            + " | " + (available[i]
                                ? "Available" : "Unavailable")
                        );
                    }

                    System.out.print("Choose doctor number (1-20): ");
                    int doctorChoice = sc.nextInt();
                    sc.nextLine();

                    if (doctorChoice >= 1 &&
                        doctorChoice <= doctors.length) {

                        int index = doctorChoice - 1;

                        if (available[index]) {
                            System.out.println("Doctor: " + doctors[index]);
                            System.out.println("Specialization: "
                                               + specialization[index]);
                            System.out.println("Consultation Fee: Rs."
                                               + fees[index]);

                            System.out.print("Enter patient name: ");
                            String patientName = sc.nextLine();

                            System.out.print("Enter appointment date: ");
                            String date = sc.nextLine();

                            System.out.print("Enter appointment time: ");
                            String time = sc.nextLine();

                            System.out.println("\nAppointment details recorded!");
                            System.out.println("Patient: " + patientName);
                            System.out.println("Doctor: " + doctors[index]);
                            System.out.println("Date: " + date);
                            System.out.println("Time: " + time);
                            System.out.println("Fee: Rs." + fees[index]);
                        } else {
                            System.out.println(
                                "Doctor unavailable. Please select another."
                            );
                        }
                    } else {
                        System.out.println("Invalid doctor number!");
                    }
                    break;

                // 2. Offline clinic with four branches
                case 2:
                    System.out.println("\n--- OFFLINE CLINIC / HOSPITAL ---");
                    System.out.println("1. Kondapur");
                    System.out.println("2. Hyderabad");
                    System.out.println("3. Guntur");
                    System.out.println("4. KPHB");

                    System.out.print("Choose branch: ");
                    int branchChoice = sc.nextInt();
                    sc.nextLine();

                    String branch = "";

                    switch (branchChoice) {
                        case 1:
                            branch = "Kondapur";
                            break;
                        case 2:
                            branch = "Hyderabad";
                            break;
                        case 3:
                            branch = "Guntur";
                            break;
                        case 4:
                            branch = "KPHB";
                            break;
                        default:
                            System.out.println("Invalid branch choice!");
                    }

                    if (!branch.isEmpty()) {
                        System.out.println("Selected Branch: " + branch);

                        System.out.println("1. Walk-in Booking");
                        System.out.println("2. Advance Booking");

                        System.out.print("Choose booking type: ");
                        int bookingType = sc.nextInt();
                        sc.nextLine();

                        if (bookingType == 1) {
                            System.out.println("Walk-in booking selected.");
                        } else if (bookingType == 2) {
                            System.out.println("Advance booking selected.");
                            System.out.println("Advance booking fee: Rs.100");
                        } else {
                            System.out.println("Invalid booking type!");
                        }
                    }
                    break;

                // 3. Doctor details
                case 3:
                    System.out.println("\n--- DOCTOR DETAILS ---");

                    for (int i = 0; i < doctors.length; i++) {
                        System.out.println(
                            (i + 1) + ". " + doctors[i]
                            + " | " + specialization[i]
                            + " | Fee: Rs." + fees[i]
                            + " | Status: " + (available[i]
                                ? "Available" : "Unavailable")
                        );
                    }
                    break;

                // 4. Patient details
                case 4:
                    System.out.println("\n--- PATIENT DETAILS ---");

                    System.out.print("Enter patient ID: ");
                    int patientId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter patient name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter age: ");
                    int age = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter gender: ");
                    String gender = sc.nextLine();

                    System.out.print("Enter weight (kg): ");
                    double weight = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Enter health problem: ");
                    String disease = sc.nextLine();

                    System.out.print("Enter allergies: ");
                    String allergies = sc.nextLine();

                    System.out.print("Enter contact number: ");
                    String contact = sc.nextLine();

                    System.out.println("\n--- PATIENT SUMMARY ---");
                    System.out.println("Patient ID: " + patientId);
                    System.out.println("Name: " + name);
                    System.out.println("Age: " + age);
                    System.out.println("Gender: " + gender);
                    System.out.println("Weight: " + weight + " kg");
                    System.out.println("Health Problem: " + disease);
                    System.out.println("Allergies: " + allergies);
                    System.out.println("Contact: " + contact);
                    break;

                // 5. Appointment management
                case 5:
                    System.out.println("\n--- APPOINTMENT MANAGEMENT ---");
                    System.out.println("1. Book Appointment");
                    System.out.println("2. View Appointment");
                    System.out.println("3. Reschedule Appointment");
                    System.out.println("4. Cancel Appointment");
                    System.out.println(
                        "Use Option 1 for online booking or Option 2 for offline booking."
                    );
                    System.out.println(
                        "This menu displays appointment management options."
                    );
                    break;

                // 6. Payment management
                case 6:
                    System.out.println("\n--- PAYMENT MANAGEMENT ---");
                    System.out.println("1. UPI");
                    System.out.println("2. Cash");
                    System.out.println("3. Online Payment");

                    System.out.print("Choose payment method: ");
                    int payment = sc.nextInt();
                    sc.nextLine();

                    if (payment == 1) {
                        System.out.println("UPI selected.");
                    } else if (payment == 2) {
                        System.out.println("Cash selected.");
                    } else if (payment == 3) {
                        System.out.println("Online payment selected.");
                    } else {
                        System.out.println("Invalid payment method.");
                    }

                    System.out.println("Actual payment is not processed.");
                    break;

                // 7. Prescription management
                case 7:
                    System.out.println("\n--- PRESCRIPTION MANAGEMENT ---");

                    System.out.print("Enter patient ID: ");
                    int prescriptionPatientId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter patient name: ");
                    String prescriptionPatient = sc.nextLine();

                    System.out.print("Enter doctor name: ");
                    String doctor = sc.nextLine();

                    System.out.print("Enter diagnosis: ");
                    String diagnosis = sc.nextLine();

                    System.out.print("Enter prescribed medicine: ");
                    String medicine = sc.nextLine();

                    System.out.print("Enter dosage as prescribed: ");
                    String dosage = sc.nextLine();

                    System.out.print("Enter timing (morning/afternoon/night): ");
                    String timing = sc.nextLine();

                    System.out.print("Before or after food: ");
                    String foodTiming = sc.nextLine();

                    System.out.println("\n--- PRESCRIPTION ---");
                    System.out.println("Patient ID: " + prescriptionPatientId);
                    System.out.println("Patient: " + prescriptionPatient);
                    System.out.println("Doctor: " + doctor);
                    System.out.println("Diagnosis: " + diagnosis);
                    System.out.println("Medicine: " + medicine);
                    System.out.println("Dosage: " + dosage);
                    System.out.println("Timing: " + timing);
                    System.out.println("Food Instructions: " + foodTiming);
                    System.out.println("Status: Prescription details recorded.");
                    break;

            
                case 8:
                    System.out.println("\n--- ORDER / TRACK MEDICINES ---");
                    System.out.println("1. Order Medicines");
                    System.out.println("2. Track Order");

                    System.out.print("Choose option: ");
                    int order = sc.nextInt();
                    sc.nextLine();

                    if (order == 1) {
                        System.out.print("Enter medicine name: ");
                        String medicineName = sc.nextLine();

                        System.out.println("Medicine: " + medicineName);
                        System.out.println("Order request recorded.");
                        System.out.println(
                            "No pharmacy or delivery service is connected."
                        );
                    } else if (order == 2) {
                        System.out.println(
                            "Live order tracking is not connected."
                        );
                    } else {
                        System.out.println("Invalid option.");
                    }
                    break;

            
                case 9:
                    System.out.println("\n--- REVIEW ---");

                    System.out.print("Enter doctor / hospital review: ");
                    String review = sc.nextLine();

                    System.out.print("Give rating (1-5): ");
                    int rating = sc.nextInt();
                    sc.nextLine();

                    if (rating >= 1 && rating <= 5) {
                        System.out.println("Review recorded: " + review);
                        System.out.println("Rating: " + rating + "/5");
                    } else {
                        System.out.println("Invalid rating!");
                    }
                    break;

            
                case 10:
                    System.out.println("\n--- FEEDBACK ---");

                    System.out.print("Enter patient feedback: ");
                    String feedback = sc.nextLine();

                    System.out.print("Enter suggestions or complaints: ");
                    String suggestions = sc.nextLine();

                    System.out.println("Feedback recorded: " + feedback);
                    System.out.println("Suggestions: " + suggestions);
                    break;

                // 11. Exit
                case 11:
                    System.out.println(
                        "Thank you for using our Clinic Management System!"
                    );
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 11);

        sc.close();
    }
}