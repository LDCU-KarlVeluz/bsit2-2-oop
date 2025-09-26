public class Student implements LibraryUser {
    private String name;
    private String studentId;
    private int maxBorrowLimit = 3;

    public Student(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    @Override
    public String getUserType() {
        return "Student";
    }

    @Override
    public void borrowMedia(Media media) {
        if (media.isAvailable()) {
            media.borrowItem();
            System.out.println(name + " (" + getUserType() + ") borrowed: " + media.getTitle());
        } else {
            System.out.println("Sorry, " + media.getTitle() + " is not available.");
        }
    }

    @Override
    public void borrowMedia(Media[] media) {
        for (Media m : media) {
            borrowMedia(m);
        }
    }

    @Override
    public void returnMedia(Media media) {
        media.returnItem();
        System.out.println(name + " returned: " + media.getTitle());
    }

    @Override
    public void returnMedia(Media[] media) {
        for (Media m : media) {
            returnMedia(m);
        }
    }

    @Override
    public int getMaxBorrowLimit() {
        return maxBorrowLimit;
    }
}
