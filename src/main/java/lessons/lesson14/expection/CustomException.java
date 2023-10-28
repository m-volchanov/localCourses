package lessons.lesson14.expection;

public class CustomException extends Exception {

    private int details;

    public CustomException(int details, String massage) {
        super(massage);
        this.details = details;
    }

    @Override
    public String toString() {
        return "CustomException{" +
                "details=" + details + " " +
                getMessage() +
                '}';
    }
}
