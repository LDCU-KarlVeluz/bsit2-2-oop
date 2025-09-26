public class Teacher implements LibraryUser {
    private String name;
    private String employeeId;
    private int maxBorrowLimit = 5;

    public Teacher(String name, String employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    @Override
    public String getUserType() {
        return "Teacher";
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
