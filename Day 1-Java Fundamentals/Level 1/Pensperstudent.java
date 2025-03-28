class Pensperstudent {
    public static void main(String[] args) {

        int pens = 14;
        int students = 3;

        int pensPerStudent = pens / students;  // Corrected: Pens distributed per student
        int remainingPens = pens % students;   // Corrected: Remaining pens after equal distribution

        System.out.println("Each student gets: " + pensPerStudent + " pens.");
        System.out.println("Remaining pens: " + remainingPens);
    }
}
